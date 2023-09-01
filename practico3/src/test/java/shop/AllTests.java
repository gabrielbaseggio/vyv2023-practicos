package shop;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	 shop.OrderAllTests.class
	,shop.OrderLineAllTests.class
})
class AllTests {}
