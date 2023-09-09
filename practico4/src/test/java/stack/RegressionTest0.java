package stack;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable1 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable3 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable3 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable2 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable2 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable2 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable1 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable3 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable3 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable3 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable3.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable6 = concretestack_serializable3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable4 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_serializable0.isEmpty();
    boolean b3 = concretestack_serializable0.isEmpty();
    java.io.Serializable serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_serializable0.push(concretestack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    java.io.Serializable serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable1 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable4 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    java.io.Serializable serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable3 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_serializable0.push(concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    java.io.Serializable serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    stack.Stack<java.io.Serializable> stack_serializable7 = concretestack_stack_serializable0.pop();
    stack.Stack<java.io.Serializable> stack_serializable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_serializable0.push(stack_serializable8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable7);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_serializable0.push(concretestack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable3.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    java.io.Serializable serializable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable3.push(serializable6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable2 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable4 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_serializable0.isEmpty();
    java.io.Serializable serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable5 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable6 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable1 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.push((java.io.Serializable)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable3 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable3.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    boolean b6 = concretestack_serializable3.isEmpty();
    java.io.Serializable serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable3.push(serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable1 = concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable2 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    concretestack_stack_serializable0.clear();
    boolean b5 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable6 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable6.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable8 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b9 = concretestack_serializable8.checkNulls();
    concretestack_serializable8.clear();
    concretestack_stack_serializable6.push((stack.Stack<java.io.Serializable>)concretestack_serializable8);
    boolean b12 = concretestack_serializable8.checkNulls();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b3 = concretestack_serializable2.checkNulls();
    concretestack_serializable2.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b6 = concretestack_serializable2.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable7 = concretestack_serializable2.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.io.Serializable serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    stack.Stack<java.io.Serializable> stack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_serializable0.push(stack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b1 = concretestack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_serializable2.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable5 = concretestack_serializable2.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    boolean b4 = concretestack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    stack.Stack<java.io.Serializable> stack_serializable7 = concretestack_stack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable7);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str1 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    boolean b5 = concretestack_stack_serializable0.isEmpty();
    boolean b6 = concretestack_stack_serializable0.isEmpty();
    concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_serializable0.push(concretestack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable4 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_serializable0.isEmpty();
    boolean b3 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    boolean b5 = concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable6 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    stack.Stack<java.io.Serializable> stack_serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_serializable0.push(stack_serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Comparable<java.lang.String> comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_comparable_str0.push(comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str1 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable5 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_serializable0.isEmpty();
    boolean b3 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    boolean b5 = concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable6 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_serializable0.push(concretestack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b3 = concretestack_serializable2.checkNulls();
    concretestack_serializable2.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str0.clear();
    boolean b2 = concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str3 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b1 = concretestack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    boolean b5 = concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable6 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str1 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable6 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable5 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str1 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    concretestack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable7 = concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    boolean b7 = concretestack_serializable4.checkNulls();
    java.io.Serializable serializable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable4.push(serializable8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable1 = concretestack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_serializable4.clear();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable9 = concretestack_serializable4.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    stack.Stack<java.io.Serializable> stack_serializable7 = concretestack_stack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable8 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable7);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b1 = concretestack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_serializable0.push(concretestack_stack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_concretestack_comparable_str0.checkNulls();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    concretestack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable7 = concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable1 = concretestack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable6 = concretestack_stack_concretestack_serializable0.pop();
    boolean b7 = concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable8 = concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable3.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    boolean b6 = concretestack_serializable3.checkNulls();
    java.io.Serializable serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable3.push(serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable1 = concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    stack.Stack<java.io.Serializable> stack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_serializable0.push(stack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable6 = concretestack_stack_concretestack_serializable0.pop();
    boolean b7 = concretestack_stack_concretestack_serializable0.isEmpty();
    boolean b8 = concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable9 = concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable2 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    concretestack_stack_stack_serializable0.clear();
    boolean b3 = concretestack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable4 = concretestack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable1 = concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable4 = concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b1 = concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_comparable_str0.checkNulls();
    boolean b3 = concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str0.clear();
    boolean b2 = concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_comparable_str0.isEmpty();
    concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str5 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b1 = concretestack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str1 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b3 = concretestack_serializable2.checkNulls();
    concretestack_serializable2.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    concretestack_stack_serializable0.clear();
    boolean b7 = concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable8 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable3 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b4 = concretestack_stack_serializable3.isEmpty();
    boolean b5 = concretestack_stack_serializable3.checkNulls();
    boolean b6 = concretestack_stack_serializable3.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable7 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable7.clear();
    concretestack_serializable7.clear();
    concretestack_serializable7.clear();
    concretestack_stack_serializable3.push((stack.Stack<java.io.Serializable>)concretestack_serializable7);
    concretestack_concretestack_stack_serializable1.push(concretestack_stack_serializable3);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_serializable1.push(concretestack_stack_serializable13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable3 = concretestack_concretestack_stack_serializable1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b1 = concretestack_comparable_str0.checkNulls();
    java.lang.Comparable<java.lang.String> comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_comparable_str0.push(comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable6 = concretestack_stack_concretestack_serializable0.pop();
    boolean b7 = concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable8 = concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    java.lang.Object obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_obj0.push(obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_comparable_str0.push(stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    concretestack_stack_concretestack_serializable0.clear();
    boolean b7 = concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable8 = concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str1 = concretestack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    concretestack_concretestack_stack_serializable3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    boolean b4 = concretestack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable5 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b6 = concretestack_stack_serializable5.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable7 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable5.push((stack.Stack<java.io.Serializable>)concretestack_serializable7);
    concretestack_serializable7.push((java.io.Serializable)100L);
    concretestack_concretestack_serializable0.push(concretestack_serializable7);
    java.io.Serializable serializable12 = concretestack_serializable7.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable12 + "' != '" + 100L+ "'", serializable12.equals(100L));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable1 = concretestack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str1 = concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_serializable0.push(stack_concretestack_stack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_serializable3.push(concretestack_stack_serializable6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str2 = concretestack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str0.clear();
    concretestack_comparable_str0.push((java.lang.Comparable<java.lang.String>)"");
    boolean b4 = concretestack_comparable_str0.isEmpty();
    java.lang.Comparable<java.lang.String> comparable_str5 = concretestack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + ""+ "'", comparable_str5.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = concretestack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable6 = concretestack_stack_concretestack_serializable0.pop();
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_serializable0.push(stack_concretestack_serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable6);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable2.clear();
    concretestack_stack_serializable2.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable5.clear();
    concretestack_stack_serializable2.push((stack.Stack<java.io.Serializable>)concretestack_serializable5);
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable2);
    boolean b9 = concretestack_stack_serializable2.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    boolean b5 = concretestack_comparable_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_serializable4.clear();
    boolean b7 = concretestack_serializable4.isEmpty();
    boolean b8 = concretestack_serializable4.isEmpty();
    concretestack_concretestack_serializable0.push(concretestack_serializable4);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_serializable0.push(concretestack_serializable10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.push((java.io.Serializable)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b2 = concretestack_stack_serializable1.isEmpty();
    boolean b3 = concretestack_stack_serializable1.checkNulls();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable1);
    concretestack_stack_serializable1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable5 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable5 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_serializable0.checkNulls();
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_serializable0.push(stack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable4.clear();
    boolean b6 = concretestack_concretestack_serializable4.checkNulls();
    boolean b7 = concretestack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable8 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable8.clear();
    concretestack_serializable8.clear();
    boolean b11 = concretestack_serializable8.isEmpty();
    boolean b12 = concretestack_serializable8.isEmpty();
    concretestack_concretestack_serializable4.push(concretestack_serializable8);
    boolean b14 = concretestack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable15 = concretestack_concretestack_serializable4.top();
    concretestack_stack_concretestack_serializable3.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable4);
    concretestack_stack_concretestack_serializable3.clear();
    boolean b18 = concretestack_stack_concretestack_serializable3.isEmpty();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable3);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_serializable3.push(stack_concretestack_serializable20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str2 = concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_serializable0.isEmpty();
    boolean b3 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    boolean b5 = concretestack_serializable0.checkNulls();
    boolean b6 = concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable7 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str1 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b1 = concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_comparable_str0.checkNulls();
    concretestack_comparable_str0.push((java.lang.Comparable<java.lang.String>)"");
    boolean b5 = concretestack_comparable_str0.isEmpty();
    java.lang.Comparable<java.lang.String> comparable_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_comparable_str0.push(comparable_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str2 = concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj1 = concretestack_concretestack_stack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_stack_serializable1 = concretestack_stack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str1 = concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str4 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    java.io.Serializable serializable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>();
    concretestack_stack_stack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Object>> stack_stack_obj2 = concretestack_stack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str2 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str2 = concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    boolean b5 = concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable6 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str0.clear();
    boolean b2 = concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_comparable_str0.isEmpty();
    boolean b4 = concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str5 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj1 = concretestack_concretestack_stack_stack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    boolean b7 = concretestack_serializable4.isEmpty();
    boolean b8 = concretestack_serializable4.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_stack_serializable1 = concretestack_stack_stack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b3 = concretestack_serializable2.checkNulls();
    concretestack_serializable2.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b6 = concretestack_serializable2.checkNulls();
    boolean b7 = concretestack_serializable2.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable1 = concretestack_stack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable2 = concretestack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable1 = concretestack_concretestack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str6.clear();
    concretestack_comparable_str6.push((java.lang.Comparable<java.lang.String>)"");
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str6);
    boolean b11 = concretestack_concretestack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable6 = concretestack_stack_concretestack_serializable0.pop();
    boolean b7 = concretestack_stack_concretestack_serializable0.isEmpty();
    boolean b8 = concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable9 = concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b4 = concretestack_serializable3.checkNulls();
    concretestack_serializable3.clear();
    boolean b6 = concretestack_serializable3.isEmpty();
    boolean b7 = concretestack_serializable3.checkNulls();
    concretestack_serializable3.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable10 = concretestack_serializable3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    concretestack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = concretestack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_stack_serializable0.isEmpty();
    concretestack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable3 = concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_stack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(stack_stack_concretestack_concretestack_stack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(stack_stack_concretestack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str2 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str1 = concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = concretestack_concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable4 = concretestack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b7 = concretestack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Object> stack_obj1 = concretestack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str1 = concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable7 = concretestack_concretestack_concretestack_stack_serializable0.pop();
    concretestack_concretestack_stack_serializable7.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable7);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable4 = concretestack_concretestack_concretestack_stack_serializable0.pop();
    boolean b5 = concretestack_concretestack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = concretestack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable1.clear();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    boolean b4 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable5.clear();
    concretestack_serializable5.clear();
    boolean b8 = concretestack_serializable5.isEmpty();
    boolean b9 = concretestack_serializable5.isEmpty();
    concretestack_concretestack_serializable1.push(concretestack_serializable5);
    boolean b11 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = concretestack_concretestack_serializable1.top();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    concretestack_stack_concretestack_serializable0.clear();
    boolean b15 = concretestack_stack_concretestack_serializable0.isEmpty();
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_serializable0.push(stack_concretestack_serializable16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str1 = concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable6 = concretestack_concretestack_stack_serializable3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    boolean b3 = concretestack_concretestack_stack_serializable1.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable1.clear();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    boolean b4 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable5.clear();
    concretestack_serializable5.clear();
    boolean b8 = concretestack_serializable5.isEmpty();
    boolean b9 = concretestack_serializable5.isEmpty();
    concretestack_concretestack_serializable1.push(concretestack_serializable5);
    boolean b11 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = concretestack_concretestack_serializable1.top();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable14 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b15 = concretestack_concretestack_serializable14.checkNulls();
    boolean b16 = concretestack_concretestack_serializable14.checkNulls();
    concretestack_concretestack_serializable14.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable14);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable19 = concretestack_stack_concretestack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable19);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_stack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b3 = concretestack_stack_stack_serializable2.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable4.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable6 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b7 = concretestack_serializable6.checkNulls();
    concretestack_serializable6.clear();
    concretestack_stack_serializable4.push((stack.Stack<java.io.Serializable>)concretestack_serializable6);
    concretestack_stack_serializable4.clear();
    concretestack_stack_stack_serializable2.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable4);
    concretestack_stack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>)concretestack_stack_stack_serializable2);
    boolean b13 = concretestack_stack_stack_serializable2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable1.clear();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    boolean b4 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable5.clear();
    concretestack_serializable5.clear();
    boolean b8 = concretestack_serializable5.isEmpty();
    boolean b9 = concretestack_serializable5.isEmpty();
    concretestack_concretestack_serializable1.push(concretestack_serializable5);
    boolean b11 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = concretestack_concretestack_serializable1.top();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_serializable0.push(stack_concretestack_serializable14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable12);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str2 = concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_concretestack_stack_serializable0.clear();
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_serializable0.push(stack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = concretestack_concretestack_stack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    concretestack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str5 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b2 = concretestack_stack_concretestack_stack_serializable1.checkNulls();
    boolean b3 = concretestack_stack_concretestack_stack_serializable1.isEmpty();
    boolean b4 = concretestack_stack_concretestack_stack_serializable1.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable6 = concretestack_stack_concretestack_stack_serializable1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = concretestack_concretestack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    concretestack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = concretestack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable4.push(concretestack_concretestack_stack_serializable5);
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable5);
    concretestack_concretestack_stack_serializable5.clear();
    boolean b9 = concretestack_concretestack_stack_serializable5.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    concretestack_concretestack_stack_stack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = concretestack_concretestack_stack_stack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_concretestack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str3 = concretestack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_serializable0.isEmpty();
    concretestack_stack_concretestack_stack_serializable0.clear();
    boolean b3 = concretestack_stack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable4 = concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    boolean b5 = concretestack_concretestack_comparable_str0.checkNulls();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str7.clear();
    concretestack_concretestack_comparable_str7.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str10.clear();
    boolean b12 = concretestack_comparable_str10.isEmpty();
    boolean b13 = concretestack_comparable_str10.isEmpty();
    concretestack_concretestack_comparable_str7.push(concretestack_comparable_str10);
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str10);
    concretestack_comparable_str10.push((java.lang.Comparable<java.lang.String>)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str1 = concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_stack_comparable_str1 = concretestack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    stack.Stack<java.io.Serializable> stack_serializable4 = concretestack_stack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable4);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str6.clear();
    concretestack_comparable_str6.push((java.lang.Comparable<java.lang.String>)"");
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str6);
    concretestack_comparable_str6.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str12 = concretestack_comparable_str6.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str5);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    boolean b5 = concretestack_stack_serializable0.isEmpty();
    boolean b6 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable7 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable7);
    boolean b9 = concretestack_serializable7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b3 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str5.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str5);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = concretestack_concretestack_comparable_str3.pop();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str3);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str8);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str4 = concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    boolean b4 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = concretestack_concretestack_stack_stack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_stack_comparable_str1 = concretestack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    boolean b5 = concretestack_concretestack_comparable_str0.checkNulls();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_comparable_str0.push(stack_concretestack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    java.io.Serializable serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable2.push(serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_serializable0.isEmpty();
    boolean b3 = concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable5 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable4 = concretestack_concretestack_concretestack_stack_serializable1.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable5.push(concretestack_concretestack_stack_serializable6);
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable6);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable9.push(concretestack_concretestack_stack_serializable10);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable12 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b13 = concretestack_stack_serializable12.isEmpty();
    boolean b14 = concretestack_stack_serializable12.checkNulls();
    boolean b15 = concretestack_stack_serializable12.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable16.clear();
    concretestack_serializable16.clear();
    concretestack_serializable16.clear();
    concretestack_stack_serializable12.push((stack.Stack<java.io.Serializable>)concretestack_serializable16);
    concretestack_concretestack_stack_serializable10.push(concretestack_stack_serializable12);
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable10);
    concretestack_stack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>)concretestack_concretestack_concretestack_stack_serializable1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable24 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_stack_serializable0.push(stack_concretestack_concretestack_stack_serializable24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    concretestack_stack_concretestack_serializable0.clear();
    boolean b7 = concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b8 = concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable9 = concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable3.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    boolean b6 = concretestack_serializable3.isEmpty();
    concretestack_serializable3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj1 = new stack.ConcreteStack<java.lang.Object>();
    boolean b2 = concretestack_obj1.isEmpty();
    concretestack_obj1.clear();
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = concretestack_obj1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable4 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str5.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str5);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = concretestack_concretestack_comparable_str3.pop();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = concretestack_concretestack_comparable_str3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str8);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable6 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable6.clear();
    concretestack_serializable6.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable6);
    concretestack_serializable6.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_serializable2.clear();
    boolean b5 = concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable7 = concretestack_stack_concretestack_stack_serializable2.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable2.clear();
    concretestack_stack_serializable2.clear();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable2);
    boolean b6 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b7 = concretestack_stack_stack_serializable0.checkNulls();
    boolean b8 = concretestack_stack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str1 = concretestack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.clear();
    concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_stack_stack_concretestack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b2 = concretestack_stack_comparable_str1.isEmpty();
    boolean b3 = concretestack_stack_comparable_str1.isEmpty();
    concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str1);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_comparable_str1.push(stack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    java.lang.CharSequence charSequence1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_charSequence0.push(charSequence1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.CharSequence charSequence1 = concretestack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_stack_concretestack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_stack_concretestack_stack_serializable0.checkNulls();
    concretestack_stack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable5 = concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable4.push(concretestack_concretestack_stack_serializable5);
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable8 = concretestack_concretestack_stack_serializable5.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable3);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str6.clear();
    concretestack_comparable_str6.push((java.lang.Comparable<java.lang.String>)"");
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str6);
    concretestack_comparable_str6.clear();
    boolean b12 = concretestack_comparable_str6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable4 = concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str3 = concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj1 = new stack.ConcreteStack<java.lang.Object>();
    boolean b2 = concretestack_obj1.isEmpty();
    concretestack_obj1.clear();
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj1);
    boolean b5 = concretestack_stack_obj0.checkNulls();
    concretestack_stack_obj0.clear();
    concretestack_stack_obj0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_stack_concretestack_serializable0.clear();
    boolean b4 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b1 = concretestack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    boolean b4 = concretestack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable2 = concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str1 = concretestack_concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_serializable0.push(concretestack_stack_stack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable3.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable7 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable7 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_concretestack_stack_comparable_str0.clear();
    concretestack_concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_comparable_str0.push(concretestack_stack_comparable_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_serializable2.clear();
    boolean b5 = concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable2);
    concretestack_concretestack_stack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    concretestack_concretestack_stack_stack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = concretestack_concretestack_stack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_stack_comparable_str0.checkNulls();
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_comparable_str0.push(stack_stack_stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_stack_serializable3 = concretestack_stack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_stack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b3 = concretestack_stack_stack_serializable2.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable4.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable6 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b7 = concretestack_serializable6.checkNulls();
    concretestack_serializable6.clear();
    concretestack_stack_serializable4.push((stack.Stack<java.io.Serializable>)concretestack_serializable6);
    concretestack_stack_serializable4.clear();
    concretestack_stack_stack_serializable2.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable4);
    concretestack_stack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>)concretestack_stack_stack_serializable2);
    concretestack_stack_stack_stack_serializable0.clear();
    boolean b14 = concretestack_stack_stack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_stack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    boolean b7 = concretestack_concretestack_serializable5.checkNulls();
    boolean b8 = concretestack_concretestack_serializable5.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable9 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable9.clear();
    concretestack_serializable9.clear();
    boolean b12 = concretestack_serializable9.isEmpty();
    boolean b13 = concretestack_serializable9.isEmpty();
    concretestack_concretestack_serializable5.push(concretestack_serializable9);
    boolean b15 = concretestack_concretestack_serializable5.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = concretestack_concretestack_serializable5.top();
    concretestack_stack_concretestack_serializable4.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable5);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable18 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b19 = concretestack_concretestack_serializable18.checkNulls();
    boolean b20 = concretestack_concretestack_serializable18.checkNulls();
    concretestack_concretestack_serializable18.clear();
    concretestack_stack_concretestack_serializable4.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable18);
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable4);
    concretestack_stack_concretestack_serializable4.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b1 = concretestack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.CharSequence charSequence2 = concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = concretestack_concretestack_concretestack_stack_serializable0.top();
    boolean b7 = concretestack_concretestack_stack_serializable6.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str2 = concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_concretestack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_stack_comparable_str2 = concretestack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.push((java.io.Serializable)(byte)-1);
    concretestack_serializable0.clear();
    boolean b7 = concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_concretestack_stack_comparable_str0.clear();
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_comparable_str0.push(stack_concretestack_stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str5 = concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b1 = concretestack_charSequence0.isEmpty();
    boolean b2 = concretestack_charSequence0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.CharSequence charSequence3 = concretestack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_stack_concretestack_stack_serializable1 = concretestack_stack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_concretestack_stack_comparable_str0.clear();
    concretestack_concretestack_stack_comparable_str0.clear();
    boolean b4 = concretestack_concretestack_stack_comparable_str0.isEmpty();
    boolean b5 = concretestack_concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str6 = concretestack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable2 = concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_stack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b3 = concretestack_stack_stack_serializable2.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable4.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable6 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b7 = concretestack_serializable6.checkNulls();
    concretestack_serializable6.clear();
    concretestack_stack_serializable4.push((stack.Stack<java.io.Serializable>)concretestack_serializable6);
    concretestack_stack_serializable4.clear();
    concretestack_stack_stack_serializable2.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable4);
    concretestack_stack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>)concretestack_stack_stack_serializable2);
    boolean b13 = concretestack_stack_stack_stack_serializable0.isEmpty();
    boolean b14 = concretestack_stack_stack_stack_serializable0.isEmpty();
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable15 = concretestack_stack_stack_stack_serializable0.top();
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable16 = concretestack_stack_stack_stack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_serializable15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_serializable16);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable7 = concretestack_concretestack_concretestack_stack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable7);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable2 = concretestack_concretestack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable4 = concretestack_concretestack_concretestack_stack_serializable0.pop();
    boolean b5 = concretestack_concretestack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = concretestack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable1 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_serializable2.clear();
    boolean b5 = concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable2);
    boolean b7 = concretestack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.CharSequence charSequence1 = concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_comparable_str0.push(stack_stack_concretestack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    concretestack_stack_serializable0.clear();
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable6 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    concretestack_serializable0.clear();
    concretestack_serializable0.push((java.io.Serializable)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_stack_comparable_str1 = concretestack_stack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_comparable_str0.push(stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable4.push(concretestack_concretestack_stack_serializable5);
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable5);
    concretestack_concretestack_stack_serializable5.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable9 = concretestack_concretestack_stack_serializable5.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable3);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_serializable2.clear();
    boolean b5 = concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable2);
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_serializable2.push(stack_concretestack_stack_serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj1 = new stack.ConcreteStack<java.lang.Object>();
    boolean b2 = concretestack_obj1.isEmpty();
    concretestack_obj1.clear();
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj1);
    java.lang.Object obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_obj1.push(obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable1 = concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_serializable4.clear();
    boolean b7 = concretestack_serializable4.isEmpty();
    boolean b8 = concretestack_serializable4.isEmpty();
    concretestack_concretestack_serializable0.push(concretestack_serializable4);
    concretestack_concretestack_serializable0.clear();
    boolean b11 = concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_stack_concretestack_stack_serializable2 = concretestack_stack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str1 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str5.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str5);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = concretestack_concretestack_comparable_str3.pop();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str3);
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    boolean b11 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str3.clear();
    boolean b5 = concretestack_comparable_str3.isEmpty();
    boolean b6 = concretestack_comparable_str3.isEmpty();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    concretestack_comparable_str3.push((java.lang.Comparable<java.lang.String>)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b1 = concretestack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.CharSequence charSequence2 = concretestack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable2 = concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b1 = concretestack_charSequence0.isEmpty();
    boolean b2 = concretestack_charSequence0.checkNulls();
    java.lang.CharSequence charSequence3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_charSequence0.push(charSequence3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable4 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_serializable0.isEmpty();
    boolean b3 = concretestack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>();
    concretestack_stack_stack_obj2.clear();
    concretestack_stack_stack_obj2.clear();
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Object>> stack_stack_obj6 = concretestack_stack_stack_obj2.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_stack_comparable_str0.clear();
    concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str3 = concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    concretestack_stack_serializable0.clear();
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable2 = concretestack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj1 = new stack.ConcreteStack<java.lang.Object>();
    boolean b2 = concretestack_obj1.isEmpty();
    concretestack_obj1.clear();
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj1);
    boolean b5 = concretestack_stack_obj0.checkNulls();
    stack.Stack<java.lang.Object> stack_obj6 = concretestack_stack_obj0.top();
    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj7 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj8 = new stack.ConcreteStack<java.lang.Object>();
    boolean b9 = concretestack_obj8.isEmpty();
    concretestack_obj8.clear();
    concretestack_stack_obj7.push((stack.Stack<java.lang.Object>)concretestack_obj8);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable12 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable12.clear();
    concretestack_stack_serializable12.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable15 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable15.clear();
    concretestack_stack_serializable12.push((stack.Stack<java.io.Serializable>)concretestack_serializable15);
    boolean b18 = concretestack_serializable15.isEmpty();
    concretestack_obj8.push((java.lang.Object)b18);
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj8);
    boolean b21 = concretestack_obj8.checkNulls();
    java.lang.Object obj22 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_obj8.push(obj22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    boolean b2 = concretestack_obj0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = concretestack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_stack_concretestack_stack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_stack_serializable0.push(stack_stack_stack_concretestack_stack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_serializable2.clear();
    boolean b5 = concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable7);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable9 = concretestack_stack_concretestack_stack_serializable7.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_serializable2.clear();
    boolean b5 = concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable1 = concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>> concretestack_concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj1 = concretestack_concretestack_concretestack_stack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b4 = concretestack_stack_stack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str5 = concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable0.clear();
    concretestack_serializable0.push((java.io.Serializable)(short)-1);
    java.io.Serializable serializable4 = concretestack_serializable0.top();
    java.io.Serializable serializable5 = concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable6 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short)-1+ "'", serializable4.equals((short)-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short)-1+ "'", serializable5.equals((short)-1));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable4 = concretestack_concretestack_concretestack_stack_serializable1.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable5.push(concretestack_concretestack_stack_serializable6);
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable6);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable9.push(concretestack_concretestack_stack_serializable10);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable12 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b13 = concretestack_stack_serializable12.isEmpty();
    boolean b14 = concretestack_stack_serializable12.checkNulls();
    boolean b15 = concretestack_stack_serializable12.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable16.clear();
    concretestack_serializable16.clear();
    concretestack_serializable16.clear();
    concretestack_stack_serializable12.push((stack.Stack<java.io.Serializable>)concretestack_serializable16);
    concretestack_concretestack_stack_serializable10.push(concretestack_stack_serializable12);
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable10);
    concretestack_stack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>)concretestack_concretestack_concretestack_stack_serializable1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable24 = concretestack_stack_concretestack_concretestack_stack_serializable0.top();
    boolean b25 = concretestack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable26 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_stack_serializable0.push(stack_concretestack_concretestack_stack_serializable26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_serializable24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>)concretestack_stack_concretestack_concretestack_stack_serializable2);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_stack_serializable2.push(stack_concretestack_concretestack_stack_serializable5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    boolean b5 = concretestack_concretestack_comparable_str0.checkNulls();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str7.clear();
    concretestack_comparable_str7.push((java.lang.Comparable<java.lang.String>)"");
    boolean b11 = concretestack_comparable_str7.isEmpty();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str7);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str13 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_stack_comparable_str1 = concretestack_stack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_stack_concretestack_stack_serializable2 = concretestack_stack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_concretestack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_stack_comparable_str3 = concretestack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_stack_serializable1 = concretestack_stack_concretestack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_stack_serializable2 = concretestack_stack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b3 = concretestack_stack_comparable_str2.isEmpty();
    boolean b4 = concretestack_stack_comparable_str2.isEmpty();
    concretestack_stack_stack_comparable_str1.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str2);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str6 = concretestack_stack_stack_comparable_str1.pop();
    concretestack_stack_stack_comparable_str0.push(stack_stack_comparable_str6);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str8 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_comparable_str0.push(stack_stack_comparable_str8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str6);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable1.clear();
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_stack_serializable1.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_stack_stack_concretestack_concretestack_stack_serializable1);
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable6 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_stack_comparable_str2 = concretestack_stack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_concretestack_stack_comparable_str0.clear();
    concretestack_concretestack_stack_comparable_str0.clear();
    boolean b4 = concretestack_concretestack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str6 = concretestack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str1 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_stack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable3 = concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable2 = concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str5.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str5);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = concretestack_concretestack_comparable_str3.pop();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str3);
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str11.clear();
    concretestack_concretestack_comparable_str11.clear();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str11);
    boolean b15 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str16 = concretestack_concretestack_concretestack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_comparable_str16);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str1 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>();
    concretestack_stack_stack_obj2.clear();
    concretestack_stack_stack_obj2.clear();
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj2);
    boolean b6 = concretestack_stack_stack_obj2.isEmpty();
    concretestack_stack_stack_obj2.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Object>> stack_stack_obj8 = concretestack_stack_stack_obj2.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str1 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_stack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b3 = concretestack_stack_stack_serializable2.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable4.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable6 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b7 = concretestack_serializable6.checkNulls();
    concretestack_serializable6.clear();
    concretestack_stack_serializable4.push((stack.Stack<java.io.Serializable>)concretestack_serializable6);
    concretestack_stack_serializable4.clear();
    concretestack_stack_stack_serializable2.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable4);
    concretestack_stack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>)concretestack_stack_stack_serializable2);
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable13 = concretestack_stack_stack_serializable2.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_serializable13);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_concretestack_stack_comparable_str0.clear();
    concretestack_concretestack_stack_comparable_str0.clear();
    boolean b4 = concretestack_concretestack_stack_comparable_str0.isEmpty();
    boolean b5 = concretestack_concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str6 = concretestack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    boolean b7 = concretestack_serializable4.isEmpty();
    concretestack_serializable4.push((java.io.Serializable)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable1 = concretestack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = concretestack_concretestack_comparable_str0.pop();
    boolean b6 = concretestack_comparable_str5.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str7 = concretestack_comparable_str5.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    boolean b6 = concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable1 = concretestack_stack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable4 = concretestack_concretestack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    concretestack_stack_stack_serializable0.clear();
    boolean b3 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b4 = concretestack_stack_stack_serializable0.checkNulls();
    boolean b5 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b6 = concretestack_stack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    concretestack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    concretestack_stack_concretestack_serializable0.clear();
    boolean b7 = concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b8 = concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b9 = concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable10 = concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str3 = concretestack_concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable4 = concretestack_concretestack_concretestack_stack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable5 = concretestack_concretestack_stack_serializable4.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable4);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.checkNulls();
    stack.Stack<java.io.Serializable> stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_serializable0.push(stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_stack_concretestack_serializable0.clear();
    boolean b5 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable1.clear();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    boolean b4 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable5.clear();
    concretestack_serializable5.clear();
    boolean b8 = concretestack_serializable5.isEmpty();
    boolean b9 = concretestack_serializable5.isEmpty();
    concretestack_concretestack_serializable1.push(concretestack_serializable5);
    boolean b11 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = concretestack_concretestack_serializable1.top();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    concretestack_stack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable15 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable15.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable15);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable18 = concretestack_concretestack_serializable15.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable12);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable1 = concretestack_stack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_stack_stack_serializable0.clear();
    boolean b2 = concretestack_stack_stack_stack_serializable0.checkNulls();
    concretestack_stack_stack_stack_serializable0.clear();
    boolean b4 = concretestack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable5 = concretestack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.CharSequence> stack_charSequence1 = concretestack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    boolean b6 = concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_serializable0.isEmpty();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_stack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_serializable0.push(stack_stack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable2 = concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    boolean b2 = concretestack_stack_serializable0.isEmpty();
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable4 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable3 = concretestack_concretestack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>> concretestack_concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_obj0.push(concretestack_concretestack_stack_stack_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable1.clear();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    boolean b4 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable5.clear();
    concretestack_serializable5.clear();
    boolean b8 = concretestack_serializable5.isEmpty();
    boolean b9 = concretestack_serializable5.isEmpty();
    concretestack_concretestack_serializable1.push(concretestack_serializable5);
    boolean b11 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = concretestack_concretestack_serializable1.top();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable14 = concretestack_stack_concretestack_serializable0.top();
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable15 = concretestack_stack_concretestack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable15);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable4.clear();
    boolean b6 = concretestack_concretestack_serializable4.checkNulls();
    boolean b7 = concretestack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable8 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable8.clear();
    concretestack_serializable8.clear();
    boolean b11 = concretestack_serializable8.isEmpty();
    boolean b12 = concretestack_serializable8.isEmpty();
    concretestack_concretestack_serializable4.push(concretestack_serializable8);
    boolean b14 = concretestack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable15 = concretestack_concretestack_serializable4.top();
    concretestack_stack_concretestack_serializable3.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable4);
    concretestack_stack_concretestack_serializable3.clear();
    boolean b18 = concretestack_stack_concretestack_serializable3.isEmpty();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable3);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable20 = concretestack_concretestack_stack_concretestack_serializable0.top();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable21 = concretestack_concretestack_stack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable22 = concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_serializable20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_serializable21);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_stack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>)concretestack_stack_stack_stack_serializable1);
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_stack_serializable0.push(stack_stack_stack_stack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_serializable3 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    concretestack_serializable0.push((java.io.Serializable)0.0f);
    concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable2 = concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_concretestack_comparable_str0.checkNulls();
    concretestack_concretestack_comparable_str0.clear();
    boolean b3 = concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.clear();
    concretestack_str0.clear();
    boolean b3 = concretestack_str0.isEmpty();
    boolean b4 = concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_serializable1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_serializable4.clear();
    concretestack_serializable4.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    boolean b9 = concretestack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_stack_serializable2 = concretestack_stack_stack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_stack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_stack_comparable_str0.push(stack_stack_stack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    concretestack_obj0.clear();

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable4 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str2 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable1 = concretestack_stack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>();
    concretestack_stack_stack_obj2.clear();
    concretestack_stack_stack_obj2.clear();
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj2);
    boolean b6 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b2 = concretestack_stack_comparable_str1.isEmpty();
    boolean b3 = concretestack_stack_comparable_str1.isEmpty();
    concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str1);
    concretestack_stack_stack_comparable_str0.clear();
    boolean b6 = concretestack_stack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str7 = concretestack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_serializable0.checkNulls();
    boolean b3 = concretestack_stack_serializable0.checkNulls();
    boolean b4 = concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_comparable_str0.clear();
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_stack_concretestack_serializable2 = concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>> concretestack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.CharSequence>> stack_stack_charSequence1 = concretestack_stack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_stack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable2 = concretestack_stack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    boolean b3 = concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_serializable0.checkNulls();
    java.io.Serializable serializable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable1 = concretestack_stack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    concretestack_stack_stack_stack_stack_serializable0.clear();
    boolean b2 = concretestack_stack_stack_stack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable3 = concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_stack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable2 = concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_stack_concretestack_stack_serializable2 = concretestack_stack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_stack_comparable_str1 = concretestack_stack_concretestack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>> concretestack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.CharSequence>> stack_stack_charSequence1 = concretestack_stack_stack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_serializable0.checkNulls();
    boolean b4 = concretestack_concretestack_serializable0.isEmpty();
    boolean b5 = concretestack_concretestack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.push(concretestack_concretestack_stack_concretestack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_stack_stack_serializable0.clear();
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_serializable0.push(stack_stack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj1 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj2 = new stack.ConcreteStack<java.lang.Object>();
    boolean b3 = concretestack_obj2.isEmpty();
    concretestack_obj2.clear();
    concretestack_stack_obj1.push((stack.Stack<java.lang.Object>)concretestack_obj2);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable6 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable6.clear();
    concretestack_stack_serializable6.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable9 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable9.clear();
    concretestack_stack_serializable6.push((stack.Stack<java.io.Serializable>)concretestack_serializable9);
    boolean b12 = concretestack_serializable9.isEmpty();
    concretestack_obj2.push((java.lang.Object)b12);
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj2);
    concretestack_stack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Object> stack_obj16 = concretestack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str2 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str2 = concretestack_concretestack_stack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_serializable2.checkNulls();
    concretestack_serializable2.push((java.io.Serializable)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str1 = concretestack_concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable4.clear();
    boolean b6 = concretestack_concretestack_serializable4.checkNulls();
    boolean b7 = concretestack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable8 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable8.clear();
    concretestack_serializable8.clear();
    boolean b11 = concretestack_serializable8.isEmpty();
    boolean b12 = concretestack_serializable8.isEmpty();
    concretestack_concretestack_serializable4.push(concretestack_serializable8);
    boolean b14 = concretestack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable15 = concretestack_concretestack_serializable4.top();
    concretestack_stack_concretestack_serializable3.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable4);
    concretestack_stack_concretestack_serializable3.clear();
    boolean b18 = concretestack_stack_concretestack_serializable3.isEmpty();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable3);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable20 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable20.clear();
    boolean b22 = concretestack_concretestack_serializable20.checkNulls();
    concretestack_concretestack_serializable20.clear();
    concretestack_stack_concretestack_serializable3.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable20);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable25 = concretestack_concretestack_serializable20.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.checkNulls();
    concretestack_serializable0.clear();
    concretestack_serializable0.push((java.io.Serializable)(short)1);
    boolean b5 = concretestack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b4 = concretestack_stack_stack_stack_comparable_str0.checkNulls();
    concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str6 = concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b2 = concretestack_stack_comparable_str1.isEmpty();
    boolean b3 = concretestack_stack_comparable_str1.isEmpty();
    concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str1);
    concretestack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str6 = concretestack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_stack_serializable2 = concretestack_stack_concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    concretestack_stack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable2 = concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable1 = concretestack_concretestack_concretestack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_stack_serializable0.isEmpty();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_stack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_stack_serializable0.push(stack_stack_stack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str3 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b5 = concretestack_concretestack_serializable4.checkNulls();
    boolean b6 = concretestack_concretestack_serializable4.checkNulls();
    concretestack_concretestack_serializable4.clear();
    concretestack_stack_concretestack_serializable3.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable4);
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>();
    concretestack_stack_stack_obj0.clear();
    boolean b2 = concretestack_stack_stack_obj0.checkNulls();
    boolean b3 = concretestack_stack_stack_obj0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Object>> stack_stack_obj4 = concretestack_stack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence1 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b2 = concretestack_charSequence1.isEmpty();
    boolean b3 = concretestack_charSequence1.checkNulls();
    concretestack_stack_charSequence0.push((stack.Stack<java.lang.CharSequence>)concretestack_charSequence1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.CharSequence charSequence5 = concretestack_charSequence1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.checkNulls();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str4 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>();
    concretestack_stack_stack_obj2.clear();
    concretestack_stack_stack_obj2.clear();
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj2);
    boolean b6 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj7 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>();
    concretestack_stack_stack_obj7.clear();
    concretestack_stack_stack_obj7.clear();
    boolean b10 = concretestack_stack_stack_obj7.checkNulls();
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj7);
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj12 = concretestack_concretestack_stack_stack_obj0.pop();
    boolean b13 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_stack_stack_comparable_str1 = concretestack_stack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str5 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    concretestack_stack_comparable_str0.clear();

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str5.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str5);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = concretestack_concretestack_comparable_str3.pop();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str3);
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str11.clear();
    concretestack_concretestack_comparable_str11.clear();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str11);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str15 = concretestack_concretestack_comparable_str11.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_concretestack_stack_comparable_str0.checkNulls();
    boolean b3 = concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_stack_comparable_str4 = concretestack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_serializable0.push(stack_stack_stack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_stack_stack_serializable0.clear();
    boolean b2 = concretestack_stack_stack_stack_serializable0.checkNulls();
    concretestack_stack_stack_stack_serializable0.clear();
    concretestack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable5 = concretestack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b1 = concretestack_charSequence0.checkNulls();
    boolean b2 = concretestack_charSequence0.isEmpty();
    concretestack_charSequence0.push((java.lang.CharSequence)"hi!");
    boolean b5 = concretestack_charSequence0.checkNulls();
    java.lang.CharSequence charSequence6 = concretestack_charSequence0.top();
    concretestack_charSequence0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!"+ "'", charSequence6.equals("hi!"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    boolean b3 = concretestack_concretestack_stack_serializable1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable1.clear();
    boolean b3 = concretestack_concretestack_serializable1.checkNulls();
    boolean b4 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable5.clear();
    concretestack_serializable5.clear();
    boolean b8 = concretestack_serializable5.isEmpty();
    boolean b9 = concretestack_serializable5.isEmpty();
    concretestack_concretestack_serializable1.push(concretestack_serializable5);
    boolean b11 = concretestack_concretestack_serializable1.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = concretestack_concretestack_serializable1.top();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable14 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b15 = concretestack_concretestack_serializable14.checkNulls();
    boolean b16 = concretestack_concretestack_serializable14.checkNulls();
    concretestack_concretestack_serializable14.clear();
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable14);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_serializable0.push(stack_concretestack_serializable19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str0.clear();
    boolean b2 = concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_comparable_str0.isEmpty();
    boolean b4 = concretestack_comparable_str0.isEmpty();
    boolean b5 = concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable7 = concretestack_concretestack_concretestack_stack_serializable0.pop();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable8 = concretestack_concretestack_concretestack_stack_serializable0.top();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable9 = concretestack_concretestack_stack_serializable8.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable8);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_stack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable2 = concretestack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str2 = concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable4.clear();
    boolean b6 = concretestack_concretestack_serializable4.checkNulls();
    boolean b7 = concretestack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable8 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable8.clear();
    concretestack_serializable8.clear();
    boolean b11 = concretestack_serializable8.isEmpty();
    boolean b12 = concretestack_serializable8.isEmpty();
    concretestack_concretestack_serializable4.push(concretestack_serializable8);
    boolean b14 = concretestack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable15 = concretestack_concretestack_serializable4.top();
    concretestack_stack_concretestack_serializable3.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable4);
    concretestack_stack_concretestack_serializable3.clear();
    boolean b18 = concretestack_stack_concretestack_serializable3.isEmpty();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable3);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable20 = concretestack_concretestack_stack_concretestack_serializable0.top();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable21 = concretestack_concretestack_stack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable22 = concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_serializable20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_serializable21);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj1 = new stack.ConcreteStack<java.lang.Object>();
    boolean b2 = concretestack_obj1.isEmpty();
    concretestack_obj1.clear();
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj1);
    boolean b5 = concretestack_stack_obj0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable1 = concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable4 = concretestack_concretestack_concretestack_stack_serializable1.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable5.push(concretestack_concretestack_stack_serializable6);
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable6);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable9.push(concretestack_concretestack_stack_serializable10);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable12 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b13 = concretestack_stack_serializable12.isEmpty();
    boolean b14 = concretestack_stack_serializable12.checkNulls();
    boolean b15 = concretestack_stack_serializable12.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable16.clear();
    concretestack_serializable16.clear();
    concretestack_serializable16.clear();
    concretestack_stack_serializable12.push((stack.Stack<java.io.Serializable>)concretestack_serializable16);
    concretestack_concretestack_stack_serializable10.push(concretestack_stack_serializable12);
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable10);
    concretestack_stack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>)concretestack_concretestack_concretestack_stack_serializable1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable24 = concretestack_stack_concretestack_concretestack_stack_serializable0.top();
    boolean b25 = concretestack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable26 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable27 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable26.push(concretestack_concretestack_stack_serializable27);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable29 = concretestack_concretestack_concretestack_stack_serializable26.top();
    concretestack_stack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>)concretestack_concretestack_concretestack_stack_serializable26);
    concretestack_stack_concretestack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable32 = concretestack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_serializable24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable29);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.clear();
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_stack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>)concretestack_stack_stack_stack_serializable1);
    concretestack_stack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable4 = concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable2.clear();
    concretestack_stack_serializable2.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable5.clear();
    concretestack_stack_serializable2.push((stack.Stack<java.io.Serializable>)concretestack_serializable5);
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable2);
    boolean b9 = concretestack_stack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_serializable2.clear();
    boolean b5 = concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable2);
    boolean b7 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str1 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_serializable1.checkNulls();
    concretestack_stack_stack_concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_stack_concretestack_stack_concretestack_serializable1);
    concretestack_stack_concretestack_stack_concretestack_serializable1.clear();
    concretestack_stack_concretestack_stack_concretestack_serializable1.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable6 = concretestack_stack_concretestack_stack_concretestack_serializable1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_stack_serializable3 = concretestack_stack_concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable2 = concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable2.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable2.clear();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable1 = concretestack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable4.clear();
    concretestack_serializable4.clear();
    boolean b7 = concretestack_serializable4.isEmpty();
    boolean b8 = concretestack_serializable4.isEmpty();
    concretestack_concretestack_serializable0.push(concretestack_serializable4);
    boolean b10 = concretestack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable11 = concretestack_concretestack_serializable0.top();
    boolean b12 = concretestack_serializable11.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b1 = concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str2 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    boolean b5 = concretestack_stack_serializable0.checkNulls();
    stack.Stack<java.io.Serializable> stack_serializable6 = concretestack_stack_serializable0.pop();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable7 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b8 = concretestack_serializable7.checkNulls();
    concretestack_serializable7.clear();
    boolean b10 = concretestack_serializable7.isEmpty();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable7);
    boolean b12 = concretestack_serializable7.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    boolean b5 = concretestack_concretestack_comparable_str0.checkNulls();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str7.clear();
    concretestack_comparable_str7.push((java.lang.Comparable<java.lang.String>)"");
    boolean b11 = concretestack_comparable_str7.isEmpty();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str7);
    java.lang.Comparable<java.lang.String> comparable_str13 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_comparable_str7.push(comparable_str13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_stack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>)concretestack_stack_stack_stack_serializable1);
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable3 = concretestack_stack_stack_stack_stack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_stack_serializable3);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b2 = concretestack_stack_concretestack_concretestack_stack_serializable1.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_concretestack_stack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable4 = concretestack_stack_concretestack_concretestack_stack_serializable1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable2.clear();
    concretestack_stack_serializable2.clear();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable2);
    boolean b6 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b7 = concretestack_stack_stack_serializable0.checkNulls();
    boolean b8 = concretestack_stack_stack_serializable0.isEmpty();
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable9 = concretestack_stack_stack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_serializable9);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_serializable0.isEmpty();
    concretestack_stack_concretestack_stack_serializable0.clear();
    boolean b3 = concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_serializable0.push(stack_concretestack_stack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b1 = concretestack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b2 = concretestack_stack_concretestack_concretestack_stack_serializable1.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_concretestack_stack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable4 = concretestack_stack_concretestack_concretestack_stack_serializable1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_concretestack_stack_concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_serializable2.clear();
    boolean b5 = concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b8 = concretestack_stack_concretestack_stack_serializable7.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_serializable7);
    concretestack_concretestack_stack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b1 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable7 = concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_stack_stack_concretestack_serializable0.clear();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_serializable0.push(stack_stack_concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>> concretestack_concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_obj0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj2 = concretestack_concretestack_concretestack_stack_stack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>> concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>();
    concretestack_stack_stack_obj2.clear();
    concretestack_stack_stack_obj2.clear();
    concretestack_concretestack_stack_stack_obj0.push(concretestack_stack_stack_obj2);
    boolean b6 = concretestack_concretestack_stack_stack_obj0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>> concretestack_stack_stack_obj7 = concretestack_concretestack_stack_stack_obj0.top();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Object>> stack_stack_obj8 = concretestack_stack_stack_obj7.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_obj7);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = concretestack_concretestack_comparable_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str5);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable2 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_serializable0.push(stack_concretestack_concretestack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.checkNulls();
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str2.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str5 = concretestack_comparable_str2.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_stack_serializable2 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str4 = concretestack_concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_stack_serializable3 = concretestack_stack_stack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str2 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_stack_stack_comparable_str0.push(stack_stack_stack_stack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_stack_stack_concretestack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_stack_comparable_str3 = concretestack_stack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    boolean b4 = concretestack_concretestack_stack_stack_serializable0.isEmpty();
    boolean b5 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable6 = concretestack_concretestack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str2 = concretestack_concretestack_stack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable1.clear();
    concretestack_concretestack_stack_serializable0.push(concretestack_stack_serializable1);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_serializable0.push(concretestack_stack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable2.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b5 = concretestack_serializable4.checkNulls();
    concretestack_serializable4.clear();
    concretestack_stack_serializable2.push((stack.Stack<java.io.Serializable>)concretestack_serializable4);
    concretestack_stack_serializable2.clear();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable2);
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable10 = concretestack_stack_stack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_serializable10);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_comparable_str2.isEmpty();
    boolean b4 = concretestack_stack_concretestack_stack_comparable_str2.checkNulls();
    boolean b5 = concretestack_stack_concretestack_stack_comparable_str2.checkNulls();
    concretestack_stack_stack_concretestack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_concretestack_stack_comparable_str2);
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_stack_comparable_str7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_comparable_str2.push(stack_concretestack_stack_comparable_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    boolean b6 = concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable7 = concretestack_concretestack_concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable8 = concretestack_concretestack_concretestack_stack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable9 = concretestack_concretestack_stack_serializable8.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable8);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_stack_concretestack_stack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_serializable0.push(stack_stack_concretestack_stack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable4 = concretestack_concretestack_concretestack_stack_serializable1.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable5.push(concretestack_concretestack_stack_serializable6);
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable6);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable9.push(concretestack_concretestack_stack_serializable10);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable12 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    boolean b13 = concretestack_stack_serializable12.isEmpty();
    boolean b14 = concretestack_stack_serializable12.checkNulls();
    boolean b15 = concretestack_stack_serializable12.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable16.clear();
    concretestack_serializable16.clear();
    concretestack_serializable16.clear();
    concretestack_stack_serializable12.push((stack.Stack<java.io.Serializable>)concretestack_serializable16);
    concretestack_concretestack_stack_serializable10.push(concretestack_stack_serializable12);
    concretestack_concretestack_concretestack_stack_serializable1.push(concretestack_concretestack_stack_serializable10);
    concretestack_stack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>)concretestack_concretestack_concretestack_stack_serializable1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable24 = concretestack_stack_concretestack_concretestack_stack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> stack_concretestack_concretestack_stack_serializable25 = concretestack_stack_concretestack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_serializable24);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_stack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable6 = concretestack_concretestack_concretestack_stack_serializable0.top();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable7 = concretestack_concretestack_stack_serializable6.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable6);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_serializable1 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_serializable2 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b1 = concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str4.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str6.clear();
    concretestack_concretestack_comparable_str4.push(concretestack_comparable_str6);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = concretestack_concretestack_comparable_str4.pop();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str9);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str11 = concretestack_stack_comparable_str0.pop();
    boolean b12 = concretestack_stack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_stack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_stack_stack_concretestack_stack_serializable2 = concretestack_stack_stack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable3.clear();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    stack.Stack<java.io.Serializable> stack_serializable6 = concretestack_stack_serializable0.top();
    stack.Stack<java.io.Serializable> stack_serializable7 = concretestack_stack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable8 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable7);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str5.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str5);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = concretestack_concretestack_comparable_str3.pop();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str3);
    concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str12 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str12.clear();
    concretestack_comparable_str12.push((java.lang.Comparable<java.lang.String>)"");
    concretestack_concretestack_comparable_str11.push(concretestack_comparable_str12);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str17 = concretestack_concretestack_comparable_str11.top();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str11);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str19 = concretestack_concretestack_concretestack_comparable_str0.top();
    concretestack_concretestack_comparable_str19.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_comparable_str19);

  }

}
