package mcd;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({
	 mcd.McdPBT.class
	,mcd.McdMCDC.class
})
class AllTests {}