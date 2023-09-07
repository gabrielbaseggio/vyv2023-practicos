package ncl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NodeCachingLinkedListTest {
	@Test
	void
	testEmptyList() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		assertTrue(list.isEmpty());
	}
	
	@Test
	void
	testSizeAfterAddAnElement() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		list.addFirst(1);
		int res = list.size();
		assertEquals(1, res);
	}
	
	@Test
	void
	testGetAnElementAfterAddingIt() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		Integer expected = 1;
		list.addFirst(expected);
		Integer res = list.get(0);
		assertEquals(expected, res);
	}
	
	@Test
	void
	testSizeAfterRemovingByIndex() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		Integer value = 1;
		list.addFirst(value);
		list.removeIndex(0);
		int size = list.size();
		assertEquals(0, size);
	}
	
	@Test
	void
	testValueAfterRemovingByIndex() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		Integer expected = 1;
		list.addFirst(expected);
		Integer res = list.removeIndex(0);
		assertEquals(expected, res);
	}
	
	@Test
	void
	testAddingAndThenRemovingAnElementKeepsTheListIntact() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		NodeCachingLinkedList orig = new NodeCachingLinkedList();
		list.addFirst(1);
		list.removeIndex(0);
		assertEquals(orig, list);
	}
	
	@Test
	void
	testGet1() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		assertThrows(IllegalArgumentException.class, () -> list.get(-1));
	}
	
	@Test
	void
	testGet2() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		assertThrows(IllegalArgumentException.class, () -> list.get(0));
	}
	
	@Test
	void
	testRemoveIndex() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		assertEquals(null, list.removeIndex(-1));
	}
	
	@Test
	void
	cacheIsFullTest() 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		addNTimes(21, 0, list);
		removeFstNTimes(20, list);
		int cacheSize = list.cacheSize();
		list.removeIndex(0);
		assertEquals(cacheSize, list.cacheSize());
		assertTrue(list.isEmpty());
	}

	private void removeFstNTimes(int times, NodeCachingLinkedList list) {
		for(int i = 0; i < times; i++) 
		{
			list.removeIndex(0);
		}
	}

	private void 
	addNTimes(int times, int value, NodeCachingLinkedList list) {
		for(int i = 0; i < times; i++) 
		{
			list.addFirst(value);
		}
	}
}
