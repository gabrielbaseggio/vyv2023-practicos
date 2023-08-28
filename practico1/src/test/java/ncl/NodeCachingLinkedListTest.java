package ncl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import myexceptions.InvariantViolated;

public class NodeCachingLinkedListTest {
	@Test
	void
	testEmptyList() throws InvariantViolated 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		int res = list.size();
		assertEquals(0, res);
	}
	
	@Test
	void
	testSizeAfterAddAnElement() throws InvariantViolated 
	{
		NodeCachingLinkedList list = new NodeCachingLinkedList();
		list.addFirst(1);
		int res = list.size();
		assertEquals(1, res);
	}
}
