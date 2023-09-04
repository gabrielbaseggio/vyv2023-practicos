package cal;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	 cal.CalTest.class
	,cal.CalNegTest.class
})
class AllTests {}