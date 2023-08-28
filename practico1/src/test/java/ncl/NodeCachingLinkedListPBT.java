package ncl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;

import myexceptions.InvariantViolated;
import net.jqwik.api.*;

public class NodeCachingLinkedListPBT {
	
	private NodeCachingLinkedList list = null;
	
	private NodeCachingLinkedList generateList(int numElems) 
	{
		try {
			list = new NodeCachingLinkedList();
			
			Random random = new Random();
			for(int i = 0; i < numElems; i++) 
			{
				list.addFirst(random.nextInt());
			}
			
		} catch (InvariantViolated e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	@AfterEach
	void
	tearDown() throws InvariantViolated 
	{
		list.removeAll();
	}
	
	@Provide
	private Arbitrary<NodeCachingLinkedList> provider() 
	{
		return Arbitraries.create(() -> generateList(5));
	}
	
	@Property
	void
	AfterRemovingAnElementTheSizeOfTheCacheIsIncreasedByOne(@ForAll("provider") NodeCachingLinkedList list) throws InvariantViolated 
	{
		Assume.that(!list.isEmpty());
		int cacheSize = list.cacheSize();
		list.removeIndex(0);
		Assertions.assertThat(list.cacheSize()).isEqualTo(cacheSize + 1);
	}
	
	@Property
	void
	AfterAddingAnElementTheSizeOfTheListIsIncreasedByOne(@ForAll("provider") NodeCachingLinkedList list) throws InvariantViolated 
	{
		int size = list.size();
		list.addFirst(0);
		Assertions.assertThat(list.size()).isEqualTo(size + 1);
	}
	
	@Property
	void
	AfterAddingAnElementTheSizeOfTheCacheIsDecreasedByAtMostOne(@ForAll("provider") NodeCachingLinkedList list) throws InvariantViolated 
	{
		int cacheSize = list.cacheSize();
		list.addFirst(0);
		assertTrue(list.cacheSize() == cacheSize || list.cacheSize() == cacheSize + 1);
	}
	
	@Property
	void
	afterRemovingAnElementTheInvariantIsPreserved(@ForAll("provider") NodeCachingLinkedList list) throws InvariantViolated 
	{
		Assume.that(!list.isEmpty());
		list.removeIndex(0);
		assertTrue(list.repOK());
	}
}
