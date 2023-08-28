package ncl;

import java.util.Random;

import org.assertj.core.api.Assertions;

import myexceptions.InvariantViolated;
import net.jqwik.api.*;

public class NodeCachingLinkedListPBT {
	
	private static NodeCachingLinkedList generateList(int numElems) 
	{
		NodeCachingLinkedList list = null;
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
		System.out.println(list);
		int cacheSize = list.cacheSize();
		System.out.println(cacheSize);
		list.removeIndex(0);
		System.out.println(list.cacheSize());
		Assertions.assertThat(list.cacheSize()).isEqualTo(cacheSize + 1);
	}
}
