package set;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import net.jqwik.api.*;

public class BitSetTest {
	
	private static BitSet generateBitSet(int nElems) 
	{
		BitSet set = new BitSet(nElems);
		Random random = new Random();
		for(int i = 0; i < 64; i++) 
		{
			set.set(i, random.nextBoolean());
		}
		
		return set;
	}
	
	@Provide
	private Arbitrary<BitSet> provider() 
	{
		return Arbitraries.create(() -> generateBitSet(64));
	}
	
	@Property(tries = 100)
	void
	testCommutativityOfIntersection
			(@ForAll("provider") BitSet set1
			,@ForAll("provider") BitSet set2) 
	{
		BitSet temp = (BitSet) set1.clone();
		set1.and(set2);
		set2.and(temp);
		Assertions.assertThat(set1).isEqualTo(set2);
	}
	
	@Property
	void
	testCommutativityOfUnion(@ForAll("provider") BitSet set1, @ForAll("provider") BitSet set2) 
	{
		BitSet temp = (BitSet) set1.clone();
		set1.or(set2);
		set2.or(temp);
		Assertions.assertThat(set1).isEqualTo(set2);
	}
	
	@Property
	void
	inverseOfXORisXOR(@ForAll("provider") BitSet set1, @ForAll("provider") BitSet set2) 
	{
		BitSet temp = (BitSet) set1.clone();
		set1.xor(set2);
		set1.xor(set2);
		Assertions.assertThat(set1).isEqualTo(temp);
	}
	
	@Property
	void
	XORWithItself(@ForAll("provider") BitSet set1) 
	{
		BitSet emptySet = new BitSet();
		set1.xor(set1);
		Assertions.assertThat(set1).isEqualTo(emptySet);
	}
	
	@Property
	void
	distributivityOfIntersectionOverUnion
		(@ForAll("provider") BitSet a
		,@ForAll("provider") BitSet b
		,@ForAll("provider") BitSet c)
	{
		BitSet intersectionAB = (BitSet) a.clone();
		intersectionAB.and(b);
		BitSet intersectionAC = (BitSet) a.clone();
		intersectionAC.and(c);
		intersectionAB.or(intersectionAC);
		
		b.or(c);
		a.and(b);
		
		Assertions.assertThat(a).isEqualTo(intersectionAB);
	}
	
	@Property
	void
	absorption(@ForAll("provider") BitSet a, @ForAll("provider") BitSet b) 
	{
		BitSet originalA = (BitSet) a.clone();
		b.or(a);
		a.and(b);
		Assertions.assertThat(a).isEqualTo(originalA);
	}
	
	@Test
	void
	intersectionWithItself() 
	{
		BitSet set      = new BitSet();
		BitSet expected = (BitSet) set.clone();
		set.and(set);
		assertEquals(expected, set);
	}
	
	@Test
	void
	unionWithItself() 
	{
		BitSet set      = new BitSet();
		BitSet expected = (BitSet) set.clone();
		set.or(set);
		assertEquals(expected, set);
	}
	
	@Property
	void
	testDeMorgan1(@ForAll("provider") BitSet a, @ForAll("provider") BitSet b)
	{
		BitSet cloneA = (BitSet) a.clone();
		
		a.and(b);
		a.flip(0, 63);
		
		cloneA.flip(0, 63);
		b.flip(0, 63);
		cloneA.or(b);
		Assertions.assertThat(a).isEqualTo(cloneA);
	}
	
	@Property
	void
	testDeMorgan2(@ForAll("provider") BitSet a, @ForAll("provider") BitSet b)
	{
		BitSet cloneA = (BitSet) a.clone();
		
		a.or(b);
		a.flip(0, 63);
		
		cloneA.flip(0, 63);
		b.flip(0, 63);
		cloneA.and(b);
		Assertions.assertThat(a).isEqualTo(cloneA);
	}
}
