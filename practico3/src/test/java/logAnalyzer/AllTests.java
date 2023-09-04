package logAnalyzer;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	 logAnalyzer.LogAnalyzerTest.class
	,logAnalyzer.LogAnalyzerNegTest.class
})
class AllTests {}
