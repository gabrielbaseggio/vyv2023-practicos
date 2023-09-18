package evosuite.listas;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        //ListaSobreArreglos_ESTest.class
        //,ListaSobreArreglos_Failed_ESTest.class
         ErrorTest.class
        ,RegressionTest.class
})
public class EvoSuiteListaSobreArreglosAllTests { }