package set;

import java.util.Random;

import org.assertj.core.api.Assertions;

import net.jqwik.api.*;

public class BitSetTest {
	
	private static BitSet generateBitSet(int numElems) 
	{
		BitSet set = new BitSet(numElems);
		Random random = new Random();
		for(int i = 0; i < numElems; i++) 
		{
			set.set(i, random.nextBoolean());
		}
		
		return set;
	}
	
	@Provide
	private Arbitrary<BitSet> provider() 
	{
		return Arbitraries.create(() -> generateBitSet(30));
	}
	
	@Property(tries = 100)
	void
	testCommutativityOfIntersection(@ForAll("provider") BitSet set1, @ForAll("provider") BitSet set2) 
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
}
