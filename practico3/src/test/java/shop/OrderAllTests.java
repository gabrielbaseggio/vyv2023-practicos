package shop;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	 shop.OrderTest.class
	,shop.OrderNegTest.class
})
class OrderAllTests {}
