package evoMock;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }

    evoMock.EnvExample envExample0 = new evoMock.EnvExample();
    // during test generation this statement threw an exception of type randoop.util.TimeoutExceededException in error
    boolean b1 = envExample0.checkContent();

  }

}
