package simpleRoutines;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({
	 simpleRoutines.PalindromeTest.class
	,simpleRoutines.LeapYearTest.class
	,simpleRoutines.LargestTest.class
	,simpleRoutines.OcurrencesCountTest.class
})
class AllTests {}
