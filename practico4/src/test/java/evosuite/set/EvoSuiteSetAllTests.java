package evosuite.set;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
         ErrorTest.class
        ,RegressionTest.class
})
public class EvoSuiteSetAllTests { }
