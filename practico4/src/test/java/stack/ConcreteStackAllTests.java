package stack;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        RegressionTest.class
})
public class ConcreteStackAllTests { }
