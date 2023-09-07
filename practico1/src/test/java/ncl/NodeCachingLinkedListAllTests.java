package ncl;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	 ncl.NodeCachingLinkedListPBT.class
	,ncl.NodeCachingLinkedListTest.class
})
public class NodeCachingLinkedListAllTests {}