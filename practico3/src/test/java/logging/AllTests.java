package logging;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	 logging.FailedIPLoggerTest.class
	,logging.IPBlacklistTest.class
})
public class AllTests {}
