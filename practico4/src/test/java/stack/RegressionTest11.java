package stack;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test001"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable2.clear();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_serializable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable2.push(concretestack_concretestack_stack_concretestack_concretestack_stack_serializable5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test002"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_concretestack_stack_stack_serializable0.isEmpty();
    concretestack_concretestack_stack_concretestack_stack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test003"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.clear();
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b5 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable4.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b7 = concretestack_concretestack_stack_concretestack_stack_concretestack_serializable6.checkNulls();
    boolean b8 = concretestack_concretestack_stack_concretestack_stack_concretestack_serializable6.isEmpty();
    boolean b9 = concretestack_concretestack_stack_concretestack_stack_concretestack_serializable6.checkNulls();
    boolean b10 = concretestack_concretestack_stack_concretestack_stack_concretestack_serializable6.checkNulls();
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable4.push(concretestack_concretestack_stack_concretestack_stack_concretestack_serializable6);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_serializable12 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable4.top();
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable4.clear();
    boolean b14 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable4.isEmpty();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_stack_concretestack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test004"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable1.clear();
    boolean b3 = concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable1.isEmpty();
    concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>)concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable1);
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.push(stack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test005"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.clear();

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test006"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable1 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test007"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_serializable0.push(concretestack_stack_concretestack_concretestack_stack_stack_serializable2);
    boolean b4 = concretestack_stack_concretestack_concretestack_stack_stack_serializable2.isEmpty();
    boolean b5 = concretestack_stack_concretestack_concretestack_stack_stack_serializable2.checkNulls();
    boolean b6 = concretestack_stack_concretestack_concretestack_stack_stack_serializable2.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test008"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b3 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable2.checkNulls();
    boolean b4 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable2.checkNulls();
    boolean b5 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable2.isEmpty();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable2);
    
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
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test009"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>> concretestack_stack_stack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>> stack_stack_concretestack_stack_stack_obj1 = concretestack_stack_stack_concretestack_stack_stack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test010"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_concretestack_stack_comparable_str1.checkNulls();
    concretestack_concretestack_concretestack_stack_comparable_str0.push(concretestack_concretestack_stack_comparable_str1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str4 = concretestack_concretestack_concretestack_stack_comparable_str0.top();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str6 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b7 = concretestack_stack_comparable_str6.isEmpty();
    boolean b8 = concretestack_stack_comparable_str6.isEmpty();
    concretestack_stack_stack_comparable_str5.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str6);
    concretestack_stack_stack_comparable_str5.clear();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str11 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b12 = concretestack_stack_comparable_str11.isEmpty();
    boolean b13 = concretestack_stack_comparable_str11.isEmpty();
    boolean b14 = concretestack_stack_comparable_str11.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str15 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str15.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str17 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str17.clear();
    concretestack_concretestack_comparable_str15.push(concretestack_comparable_str17);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str20 = concretestack_concretestack_comparable_str15.pop();
    concretestack_stack_comparable_str11.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str20);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str22 = concretestack_stack_comparable_str11.top();
    concretestack_stack_stack_comparable_str5.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str11);
    concretestack_stack_comparable_str11.clear();
    concretestack_concretestack_stack_comparable_str4.push(concretestack_stack_comparable_str11);
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str26 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    boolean b27 = concretestack_stack_comparable_str26.isEmpty();
    boolean b28 = concretestack_stack_comparable_str26.isEmpty();
    boolean b29 = concretestack_stack_comparable_str26.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str30 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str30.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str32 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str32.clear();
    concretestack_concretestack_comparable_str30.push(concretestack_comparable_str32);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str35 = concretestack_concretestack_comparable_str30.pop();
    concretestack_stack_comparable_str26.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str35);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str37 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str37.clear();
    concretestack_comparable_str37.push((java.lang.Comparable<java.lang.String>)"");
    boolean b41 = concretestack_comparable_str37.isEmpty();
    concretestack_stack_comparable_str26.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str37);
    boolean b43 = concretestack_stack_comparable_str26.checkNulls();
    concretestack_concretestack_stack_comparable_str4.push(concretestack_stack_comparable_str26);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str45 = concretestack_stack_comparable_str26.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_comparable_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str45);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test011"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>> concretestack_concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>();
    boolean b1 = concretestack_concretestack_concretestack_obj0.isEmpty();
    concretestack_concretestack_concretestack_obj0.clear();
    boolean b3 = concretestack_concretestack_concretestack_obj0.isEmpty();
    boolean b4 = concretestack_concretestack_concretestack_obj0.checkNulls();
    boolean b5 = concretestack_concretestack_concretestack_obj0.checkNulls();
    boolean b6 = concretestack_concretestack_concretestack_obj0.checkNulls();
    boolean b7 = concretestack_concretestack_concretestack_obj0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj8 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    boolean b9 = concretestack_concretestack_obj8.checkNulls();
    boolean b10 = concretestack_concretestack_obj8.isEmpty();
    concretestack_concretestack_obj8.clear();
    concretestack_concretestack_concretestack_obj0.push(concretestack_concretestack_obj8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test012"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str3.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str4);
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str7.clear();
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str7.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str10.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str11);
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str7.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str10);
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str10);
    boolean b15 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str10.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str16 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str17 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str16.push(concretestack_concretestack_concretestack_stack_concretestack_comparable_str17);
    boolean b19 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str16.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str20 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str16.pop();
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str20.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str10.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str20);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_stack_concretestack_comparable_str23 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str10.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_concretestack_comparable_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_concretestack_comparable_str23);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test013"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2.clear();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.push(concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2);
    boolean b7 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test014"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test015"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.push(concretestack_concretestack_stack_concretestack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.pop();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str6 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_concretestack_comparable_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str6);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test016"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str2.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str2);
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.checkNulls();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str1);
    boolean b7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    boolean b8 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str9 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.top();
    boolean b10 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str11 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str11);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test017"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj4 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj5 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj6 = new stack.ConcreteStack<java.lang.Object>();
    boolean b7 = concretestack_obj6.isEmpty();
    concretestack_obj6.clear();
    concretestack_stack_obj5.push((stack.Stack<java.lang.Object>)concretestack_obj6);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable10 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable10.clear();
    concretestack_stack_serializable10.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable13 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable13.clear();
    concretestack_stack_serializable10.push((stack.Stack<java.io.Serializable>)concretestack_serializable13);
    boolean b16 = concretestack_serializable13.isEmpty();
    concretestack_obj6.push((java.lang.Object)b16);
    concretestack_stack_obj4.push((stack.Stack<java.lang.Object>)concretestack_obj6);
    boolean b19 = concretestack_obj6.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable20 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable21 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable21.clear();
    boolean b23 = concretestack_concretestack_serializable21.checkNulls();
    boolean b24 = concretestack_concretestack_serializable21.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable25 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable25.clear();
    concretestack_serializable25.clear();
    boolean b28 = concretestack_serializable25.isEmpty();
    boolean b29 = concretestack_serializable25.isEmpty();
    concretestack_concretestack_serializable21.push(concretestack_serializable25);
    boolean b31 = concretestack_concretestack_serializable21.checkNulls();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable32 = concretestack_concretestack_serializable21.top();
    concretestack_stack_concretestack_serializable20.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable21);
    concretestack_stack_concretestack_serializable20.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable35 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable35.clear();
    concretestack_stack_concretestack_serializable20.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable35);
    concretestack_obj6.push((java.lang.Object)concretestack_concretestack_serializable35);
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable35);
    concretestack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable32);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test018"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.push(stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test019"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str1 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test020"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b4 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str3.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str3.push(concretestack_concretestack_stack_concretestack_stack_comparable_str5);
    boolean b7 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str3.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str8 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str3.pop();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str3);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_concretestack_stack_concretestack_stack_comparable_str10 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.top();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_concretestack_stack_concretestack_stack_comparable_str11 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_stack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_concretestack_stack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_concretestack_stack_comparable_str11);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test021"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_charSequence0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test022"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>> concretestack_concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>();
    concretestack_concretestack_stack_charSequence0.clear();
    concretestack_concretestack_stack_charSequence0.clear();
    concretestack_concretestack_stack_charSequence0.clear();
    concretestack_concretestack_stack_charSequence0.clear();
    boolean b5 = concretestack_concretestack_stack_charSequence0.checkNulls();
    concretestack_concretestack_stack_charSequence0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test023"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b3 = concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str1.push(concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2);
    boolean b5 = concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b7 = concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str6.checkNulls();
    concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str6.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b10 = concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str9.checkNulls();
    boolean b11 = concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str9.checkNulls();
    concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str6.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str9);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str13 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str14 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b15 = concretestack_stack_stack_stack_stack_comparable_str14.checkNulls();
    concretestack_stack_stack_stack_stack_stack_comparable_str13.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str14);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str17 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str18 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b19 = concretestack_stack_stack_stack_stack_comparable_str18.checkNulls();
    concretestack_stack_stack_stack_stack_stack_comparable_str17.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str18);
    concretestack_stack_stack_stack_stack_stack_comparable_str13.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str18);
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_stack_comparable_str22 = concretestack_stack_stack_stack_stack_stack_comparable_str13.pop();
    boolean b23 = concretestack_stack_stack_stack_stack_stack_comparable_str13.checkNulls();
    concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str9.push(concretestack_stack_stack_stack_stack_stack_comparable_str13);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str25 = concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str9.top();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str1.push(concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str9);
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.push(concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str1);
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_stack_stack_comparable_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_stack_stack_comparable_str25);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test024"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b4 = concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.checkNulls();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3);
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_comparable_str7 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_concretestack_concretestack_comparable_str7);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test025"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable1 = concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test026"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test027"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test028"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b2 = concretestack_stack_stack_stack_stack_comparable_str1.checkNulls();
    concretestack_stack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b6 = concretestack_stack_stack_stack_stack_comparable_str5.checkNulls();
    concretestack_stack_stack_stack_stack_stack_comparable_str4.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str5);
    concretestack_stack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str5);
    boolean b9 = concretestack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    boolean b10 = concretestack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_stack_comparable_str11 = concretestack_stack_stack_stack_stack_stack_comparable_str0.top();
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_stack_comparable_str12 = concretestack_stack_stack_stack_stack_stack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_stack_stack_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_stack_stack_comparable_str12);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test029"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj1.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj2);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj4.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj5);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj7 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj4.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj7);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj9 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj4.top();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj2.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj9);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj11 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj2.pop();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj2);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj13 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj14 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj13.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj14);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj16 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj13.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj16);
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj13);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj19 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj20 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj19.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj20);
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj13.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj20);
    boolean b23 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj20.checkNulls();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj20.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test030"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_concretestack_stack_stack_stack_serializable2);
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test031"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_stack_comparable_str1 = concretestack_concretestack_stack_stack_concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test032"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b5 = concretestack_stack_concretestack_concretestack_stack_comparable_str4.checkNulls();
    concretestack_stack_concretestack_concretestack_stack_comparable_str4.clear();
    concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str3.push(concretestack_stack_concretestack_concretestack_stack_comparable_str4);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str8 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str3.top();
    boolean b9 = concretestack_stack_concretestack_concretestack_stack_comparable_str8.checkNulls();
    concretestack_stack_stack_concretestack_concretestack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_stack_comparable_str8);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str11.clear();
    boolean b13 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str11.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str14 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str15 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b16 = concretestack_stack_concretestack_concretestack_stack_comparable_str15.checkNulls();
    concretestack_stack_concretestack_concretestack_stack_comparable_str15.clear();
    concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str14.push(concretestack_stack_concretestack_concretestack_stack_comparable_str15);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str19 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str14.top();
    boolean b20 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str14.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str21 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str14.top();
    concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str11.push(concretestack_stack_concretestack_concretestack_stack_comparable_str21);
    concretestack_stack_stack_concretestack_concretestack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_stack_comparable_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_comparable_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_comparable_str21);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test033"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable4 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.pop();
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

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test034"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>> concretestack_stack_stack_concretestack_obj0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_obj0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Object>>> concretestack_stack_concretestack_obj2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>();
    boolean b3 = concretestack_stack_concretestack_obj2.checkNulls();
    boolean b4 = concretestack_stack_concretestack_obj2.checkNulls();
    boolean b5 = concretestack_stack_concretestack_obj2.isEmpty();
    concretestack_stack_stack_concretestack_obj0.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>)concretestack_stack_concretestack_obj2);
    boolean b7 = concretestack_stack_stack_concretestack_obj0.checkNulls();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Object>>> stack_stack_concretestack_obj8 = concretestack_stack_stack_concretestack_obj0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_obj8);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test035"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable2.isEmpty();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>)concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable2);
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable2.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable6 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_serializable2.top();
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
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test036"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.clear();
    boolean b3 = concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test037"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable2.checkNulls();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable2.isEmpty();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.push(concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable2);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.clear();
    boolean b8 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    boolean b9 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test038"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test039"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_serializable3.checkNulls();
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_serializable3.checkNulls();
    concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_concretestack_stack_concretestack_concretestack_serializable3);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable7 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2.top();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable8 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b10 = concretestack_concretestack_stack_concretestack_concretestack_serializable9.isEmpty();
    concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_concretestack_stack_concretestack_concretestack_serializable9);
    boolean b12 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2.isEmpty();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.push(concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2);
    boolean b14 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_concretestack_concretestack_serializable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_concretestack_concretestack_serializable8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test040"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str4 = concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.top();
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
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test041"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str2 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test042"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str2 = concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test043"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str3.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str4);
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str3);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_concretestack_stack_concretestack_comparable_str7 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_stack_concretestack_comparable_str7);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test044"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable1);
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test045"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable1.checkNulls();
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable1);
    boolean b6 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    boolean b8 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test046"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b3 = concretestack_stack_stack_stack_stack_comparable_str2.checkNulls();
    concretestack_stack_stack_stack_stack_stack_comparable_str1.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str2);
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_stack_comparable_str5 = concretestack_stack_stack_stack_stack_stack_comparable_str1.top();
    concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_stack_stack_stack_stack_comparable_str1);
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_stack_stack_stack_stack_comparable_str7 = concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.pop();
    boolean b8 = concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str9 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str10 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b11 = concretestack_stack_stack_stack_stack_comparable_str10.checkNulls();
    concretestack_stack_stack_stack_stack_stack_comparable_str9.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str10);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str13 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str14 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b15 = concretestack_stack_stack_stack_stack_comparable_str14.checkNulls();
    concretestack_stack_stack_stack_stack_stack_comparable_str13.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str14);
    concretestack_stack_stack_stack_stack_stack_comparable_str9.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str14);
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_stack_comparable_str18 = concretestack_stack_stack_stack_stack_stack_comparable_str9.pop();
    boolean b19 = concretestack_stack_stack_stack_stack_stack_comparable_str9.checkNulls();
    concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_stack_stack_stack_stack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_stack_stack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_stack_stack_stack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_stack_stack_comparable_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test047"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b3 = concretestack_stack_stack_stack_stack_concretestack_stack_serializable2.isEmpty();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable1.push(concretestack_stack_stack_stack_stack_concretestack_stack_serializable2);
    concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable6 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0.pop();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_serializable7 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable6.top();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_serializable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable6.push(concretestack_stack_stack_stack_stack_concretestack_stack_serializable8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_stack_concretestack_stack_serializable7);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test048"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_serializable1.checkNulls();
    concretestack_stack_stack_concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_stack_concretestack_stack_concretestack_serializable1);
    boolean b4 = concretestack_stack_stack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b5 = concretestack_stack_stack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b6 = concretestack_stack_stack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_concretestack_stack_concretestack_serializable7 = concretestack_stack_stack_concretestack_stack_concretestack_serializable0.top();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable8 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_stack_concretestack_stack_concretestack_serializable8);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_concretestack_stack_concretestack_serializable10 = concretestack_stack_stack_concretestack_stack_concretestack_serializable0.top();
    boolean b11 = concretestack_stack_stack_concretestack_stack_concretestack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_concretestack_serializable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_concretestack_serializable10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test049"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test050"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Object>>>> concretestack_stack_concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Object>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Object>>> concretestack_concretestack_stack_obj1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Object>>>();
    boolean b2 = concretestack_concretestack_stack_obj1.isEmpty();
    boolean b3 = concretestack_concretestack_stack_obj1.isEmpty();
    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj4 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj5 = new stack.ConcreteStack<java.lang.Object>();
    boolean b6 = concretestack_obj5.isEmpty();
    concretestack_stack_obj4.push((stack.Stack<java.lang.Object>)concretestack_obj5);
    boolean b8 = concretestack_stack_obj4.isEmpty();
    concretestack_concretestack_stack_obj1.push(concretestack_stack_obj4);
    concretestack_stack_concretestack_stack_obj0.push((stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Object>>>)concretestack_concretestack_stack_obj1);
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Object>>> stack_concretestack_stack_obj11 = concretestack_stack_concretestack_stack_obj0.top();
    concretestack_stack_concretestack_stack_obj0.clear();
    boolean b13 = concretestack_stack_concretestack_stack_obj0.checkNulls();
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Object>>> stack_concretestack_stack_obj14 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_obj0.push(stack_concretestack_stack_obj14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test051"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test052"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable2 = concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test053"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    concretestack_stack_concretestack_charSequence1.clear();
    boolean b3 = concretestack_stack_concretestack_charSequence1.checkNulls();
    concretestack_concretestack_stack_concretestack_charSequence0.push(concretestack_stack_concretestack_charSequence1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_concretestack_stack_concretestack_charSequence5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    concretestack_stack_concretestack_charSequence6.clear();
    boolean b8 = concretestack_stack_concretestack_charSequence6.checkNulls();
    concretestack_concretestack_stack_concretestack_charSequence5.push(concretestack_stack_concretestack_charSequence6);
    concretestack_concretestack_stack_concretestack_charSequence0.push(concretestack_stack_concretestack_charSequence6);
    boolean b11 = concretestack_concretestack_stack_concretestack_charSequence0.checkNulls();
    boolean b12 = concretestack_concretestack_stack_concretestack_charSequence0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test054"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str1.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str1.clear();
    concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str1);
    boolean b5 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b7 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str6.isEmpty();
    concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str6);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str9 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str10 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b11 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str10.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str10.clear();
    concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str9.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str10);
    boolean b14 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str9.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str15 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b16 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str15.isEmpty();
    concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str9.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str15);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str18 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str18.clear();
    boolean b20 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str18.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str21 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b22 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str21.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str23 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str21.push(concretestack_concretestack_stack_concretestack_stack_comparable_str23);
    boolean b25 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str21.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str26 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str21.pop();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str18.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str21);
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str18.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str18.clear();
    boolean b30 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str18.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str15.push(concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str18);
    concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_stack_comparable_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test055"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test056"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.clear();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str3);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str5 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str5);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test057"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.checkNulls();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable3.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable3.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable5);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable7 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable7.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable5.push(concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable7);
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test058"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>();

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test059"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str2.isEmpty();
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str2.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str5);
    concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str2);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str8 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str8);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test060"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_serializable0.clear();
    concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_serializable0.clear();
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test061"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable4 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.top();
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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test062"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b2 = concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable1.checkNulls();
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b6 = concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable5.checkNulls();
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable4.push(concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable5);
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable5);
    boolean b9 = concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable5.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_concretestack_stack_stack_stack_serializable10 = concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable5.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test063"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str1);
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str4.push(concretestack_concretestack_concretestack_stack_concretestack_comparable_str5);
    boolean b7 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str4.isEmpty();
    boolean b8 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str4.checkNulls();
    boolean b9 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str4.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str10 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str4.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str11 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str4.pop();
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str11);
    boolean b13 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_stack_concretestack_comparable_str14 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_concretestack_stack_concretestack_comparable_str14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_concretestack_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test064"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test065"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_stack_stack_comparable_str0.clear();
    concretestack_stack_concretestack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>)concretestack_concretestack_stack_stack_comparable_str3);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test066"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test067"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable3 = concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.top();
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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test068"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>();

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test069"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str1.clear();
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str1);
    boolean b5 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test070"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_concretestack_concretestack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test071"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_serializable4 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_serializable0.top();
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
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test072"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test073"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test074"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str4 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
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
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test075"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    boolean b4 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    
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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test076"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_stack_stack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>)concretestack_stack_stack_concretestack_serializable2);
    boolean b4 = concretestack_stack_stack_stack_concretestack_serializable0.isEmpty();
    boolean b5 = concretestack_stack_stack_stack_concretestack_serializable0.checkNulls();
    boolean b6 = concretestack_stack_stack_stack_concretestack_serializable0.checkNulls();
    concretestack_stack_stack_stack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test077"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test078"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.checkNulls();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test079"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test080"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<java.lang.String>> concretestack_stack_str1 = new stack.ConcreteStack<stack.Stack<java.lang.String>>();
    stack.ConcreteStack<java.lang.String> concretestack_str2 = new stack.ConcreteStack<java.lang.String>();
    boolean b3 = concretestack_str2.isEmpty();
    concretestack_stack_str1.push((stack.Stack<java.lang.String>)concretestack_str2);
    boolean b5 = concretestack_stack_str1.isEmpty();
    stack.Stack<java.lang.String> stack_str6 = concretestack_stack_str1.pop();
    concretestack_concretestack_stack_str0.push(concretestack_stack_str1);
    stack.ConcreteStack<stack.Stack<java.lang.String>> concretestack_stack_str8 = concretestack_concretestack_stack_str0.top();
    boolean b9 = concretestack_stack_str8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test081"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_charSequence0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> stack_concretestack_concretestack_charSequence2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_charSequence0.push(stack_concretestack_concretestack_charSequence2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test082"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    concretestack_concretestack_stack_stack_serializable0.clear();
    boolean b5 = concretestack_concretestack_stack_stack_serializable0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable6 = concretestack_concretestack_stack_stack_serializable0.pop();
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
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test083"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test084"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.checkNulls();
    concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.clear();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str5 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test085"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable1.clear();
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable1.isEmpty();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable1.clear();
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable6 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable6);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test086"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test087"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_serializable0.clear();
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_stack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test088"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.checkNulls();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.clear();
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b5 = concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str4.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b7 = concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str6.isEmpty();
    boolean b8 = concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str6.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str4.push(concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str6);
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str4);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str11 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str11);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test089"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test090"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_obj0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>>>>>();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>>>> stack_concretestack_concretestack_stack_stack_concretestack_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_obj0.push(stack_concretestack_concretestack_stack_stack_concretestack_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test091"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.clear();

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test092"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test093"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test094"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b2 = concretestack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    boolean b3 = concretestack_stack_concretestack_concretestack_comparable_str1.checkNulls();
    boolean b4 = concretestack_stack_concretestack_concretestack_comparable_str1.checkNulls();
    concretestack_stack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str6 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str6);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test095"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test096"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable2 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test097"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test098"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_serializable0.top();
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
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test099"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test100"); }

    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj0 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj1 = new stack.ConcreteStack<java.lang.Object>();
    boolean b2 = concretestack_obj1.isEmpty();
    concretestack_obj1.clear();
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj1);
    boolean b5 = concretestack_stack_obj0.checkNulls();
    boolean b6 = concretestack_stack_obj0.checkNulls();
    boolean b7 = concretestack_stack_obj0.checkNulls();
    concretestack_stack_obj0.clear();
    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj9 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj10 = new stack.ConcreteStack<java.lang.Object>();
    boolean b11 = concretestack_obj10.isEmpty();
    concretestack_obj10.clear();
    concretestack_stack_obj9.push((stack.Stack<java.lang.Object>)concretestack_obj10);
    boolean b14 = concretestack_stack_obj9.checkNulls();
    stack.Stack<java.lang.Object> stack_obj15 = concretestack_stack_obj9.top();
    boolean b16 = concretestack_stack_obj9.checkNulls();
    concretestack_stack_obj9.clear();
    concretestack_stack_obj9.clear();
    stack.ConcreteStack<stack.Stack<java.lang.Object>> concretestack_stack_obj19 = new stack.ConcreteStack<stack.Stack<java.lang.Object>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj20 = new stack.ConcreteStack<java.lang.Object>();
    boolean b21 = concretestack_obj20.isEmpty();
    concretestack_obj20.clear();
    concretestack_stack_obj19.push((stack.Stack<java.lang.Object>)concretestack_obj20);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable24 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable24.clear();
    concretestack_stack_serializable24.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable27 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_serializable27.clear();
    concretestack_stack_serializable24.push((stack.Stack<java.io.Serializable>)concretestack_serializable27);
    boolean b30 = concretestack_serializable27.isEmpty();
    concretestack_obj20.push((java.lang.Object)b30);
    concretestack_stack_obj9.push((stack.Stack<java.lang.Object>)concretestack_obj20);
    boolean b33 = concretestack_obj20.isEmpty();
    concretestack_stack_obj0.push((stack.Stack<java.lang.Object>)concretestack_obj20);
    boolean b35 = concretestack_obj20.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test101"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable1.checkNulls();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable1);
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.clear();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test102"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_stack_serializable1.clear();
    concretestack_concretestack_stack_concretestack_stack_stack_serializable1.clear();
    boolean b4 = concretestack_concretestack_stack_concretestack_stack_stack_serializable1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_stack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    concretestack_stack_concretestack_stack_stack_serializable5.clear();
    concretestack_stack_concretestack_stack_stack_serializable5.clear();
    boolean b8 = concretestack_stack_concretestack_stack_stack_serializable5.checkNulls();
    boolean b9 = concretestack_stack_concretestack_stack_stack_serializable5.isEmpty();
    boolean b10 = concretestack_stack_concretestack_stack_stack_serializable5.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_stack_serializable1.push(concretestack_stack_concretestack_stack_stack_serializable5);
    concretestack_stack_stack_concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>)concretestack_stack_concretestack_stack_stack_serializable5);
    boolean b13 = concretestack_stack_stack_concretestack_stack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test103"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str2.push(concretestack_concretestack_stack_concretestack_stack_comparable_str4);
    boolean b6 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str2.checkNulls();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.push(concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str2);
    concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str2.clear();
    boolean b9 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test104"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_stack_stack_stack_stack_stack_comparable_str0.clear();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test105"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test106"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    concretestack_concretestack_stack_stack_stack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    concretestack_stack_stack_stack_serializable2.clear();
    boolean b4 = concretestack_stack_stack_stack_serializable2.checkNulls();
    concretestack_stack_stack_stack_serializable2.clear();
    concretestack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_stack_serializable2);
    concretestack_concretestack_stack_stack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test107"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_stack_concretestack_stack_stack_stack_stack_stack_stack_comparable_str1 = concretestack_stack_stack_concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test108"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b4 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str3.checkNulls();
    boolean b5 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str3.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.push(concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str7 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str7);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test109"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_comparable_str4.clear();
    boolean b6 = concretestack_concretestack_stack_concretestack_comparable_str4.isEmpty();
    boolean b7 = concretestack_concretestack_stack_concretestack_comparable_str4.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str8 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str8.clear();
    concretestack_stack_concretestack_comparable_str8.clear();
    concretestack_concretestack_stack_concretestack_comparable_str4.push(concretestack_stack_concretestack_comparable_str8);
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str2.push(concretestack_concretestack_stack_concretestack_comparable_str4);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b14 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str13.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str13.clear();
    boolean b16 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str13.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str17 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_comparable_str17.clear();
    boolean b19 = concretestack_concretestack_stack_concretestack_comparable_str17.isEmpty();
    boolean b20 = concretestack_concretestack_stack_concretestack_comparable_str17.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str21 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str21.clear();
    concretestack_stack_concretestack_comparable_str21.clear();
    concretestack_concretestack_stack_concretestack_comparable_str17.push(concretestack_stack_concretestack_comparable_str21);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str25 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str25.clear();
    boolean b27 = concretestack_stack_concretestack_comparable_str25.checkNulls();
    boolean b28 = concretestack_stack_concretestack_comparable_str25.checkNulls();
    concretestack_concretestack_stack_concretestack_comparable_str17.push(concretestack_stack_concretestack_comparable_str25);
    concretestack_concretestack_stack_concretestack_comparable_str17.clear();
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str13.push(concretestack_concretestack_stack_concretestack_comparable_str17);
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str2.push(concretestack_concretestack_stack_concretestack_comparable_str17);
    boolean b33 = concretestack_concretestack_stack_concretestack_comparable_str17.checkNulls();
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_concretestack_stack_concretestack_comparable_str17);
    boolean b35 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test110"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str1);
    boolean b3 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test111"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.checkNulls();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test112"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test113"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_comparable_str1.clear();
    concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.push(concretestack_concretestack_stack_stack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_stack_concretestack_comparable_str1.push(concretestack_stack_stack_concretestack_comparable_str4);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_comparable_str6.clear();
    concretestack_concretestack_stack_stack_concretestack_comparable_str1.push(concretestack_stack_stack_concretestack_comparable_str6);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_comparable_str11.clear();
    concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str10.push(concretestack_concretestack_stack_stack_concretestack_comparable_str11);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_stack_concretestack_comparable_str11.push(concretestack_stack_stack_concretestack_comparable_str14);
    boolean b16 = concretestack_stack_stack_concretestack_comparable_str14.isEmpty();
    concretestack_stack_stack_stack_concretestack_comparable_str9.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_stack_concretestack_comparable_str14);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str18 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_concretestack_comparable_str19 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_comparable_str19.clear();
    concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str18.push(concretestack_concretestack_stack_stack_concretestack_comparable_str19);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str22 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_stack_concretestack_comparable_str19.push(concretestack_stack_stack_concretestack_comparable_str22);
    concretestack_stack_stack_stack_concretestack_comparable_str9.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_stack_concretestack_comparable_str22);
    concretestack_concretestack_stack_stack_concretestack_comparable_str1.push(concretestack_stack_stack_concretestack_comparable_str22);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str26 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_comparable_str26.clear();
    boolean b28 = concretestack_concretestack_stack_concretestack_comparable_str26.checkNulls();
    boolean b29 = concretestack_concretestack_stack_concretestack_comparable_str26.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str30 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str30.clear();
    concretestack_stack_concretestack_comparable_str30.clear();
    concretestack_concretestack_stack_concretestack_comparable_str26.push(concretestack_stack_concretestack_comparable_str30);
    boolean b34 = concretestack_concretestack_stack_concretestack_comparable_str26.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str35 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b36 = concretestack_stack_concretestack_comparable_str35.isEmpty();
    boolean b37 = concretestack_stack_concretestack_comparable_str35.isEmpty();
    concretestack_concretestack_stack_concretestack_comparable_str26.push(concretestack_stack_concretestack_comparable_str35);
    concretestack_stack_stack_concretestack_comparable_str22.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_concretestack_comparable_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test114"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test115"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str3 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.top();
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
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test116"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_comparable_str2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test117"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable2.clear();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable2.isEmpty();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable2.isEmpty();
    boolean b6 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable2.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    boolean b10 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable9.checkNulls();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable8.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable9);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable12 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable13 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    boolean b14 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable13.checkNulls();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable12.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable13);
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable8.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable13);
    boolean b17 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable8.isEmpty();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable2.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test118"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test119"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test120"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_stack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>)concretestack_concretestack_stack_serializable3);
    concretestack_concretestack_stack_serializable3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test121"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0.push(concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str1);
    boolean b3 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str4 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0.pop();
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str4);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test122"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test123"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.clear();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test124"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable1 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test125"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable0.checkNulls();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test126"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str3);
    boolean b5 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str6.push(concretestack_concretestack_concretestack_stack_concretestack_comparable_str7);
    boolean b9 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str6.isEmpty();
    boolean b10 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str6.checkNulls();
    boolean b11 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str6.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str12 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str6.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str13 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_comparable_str6.pop();
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str13);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_stack_concretestack_comparable_str15 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2.pop();
    boolean b16 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2.checkNulls();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_stack_concretestack_comparable_str17 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2.top();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str19 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_concretestack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_concretestack_comparable_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_concretestack_comparable_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_concretestack_comparable_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str19);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test127"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_stack_stack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test128"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_serializable3.clear();
    concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_stack_concretestack_concretestack_stack_concretestack_serializable3);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_serializable6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b7 = concretestack_stack_concretestack_concretestack_stack_concretestack_serializable6.isEmpty();
    concretestack_stack_concretestack_concretestack_stack_concretestack_serializable6.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_serializable6.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_serializable6.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_serializable6.clear();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_serializable3.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_serializable6);
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_serializable3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test129"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_serializable2 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test130"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str3 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test131"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test132"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.checkNulls();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test133"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.clear();
    boolean b3 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test134"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b5 = concretestack_stack_stack_concretestack_stack_comparable_str4.isEmpty();
    boolean b6 = concretestack_stack_stack_concretestack_stack_comparable_str4.checkNulls();
    concretestack_concretestack_stack_stack_concretestack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_comparable_str4);
    boolean b8 = concretestack_stack_stack_concretestack_stack_comparable_str4.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test135"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test136"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.checkNulls();
    concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.clear();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1);
    concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.clear();
    boolean b6 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str7 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_comparable_str1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test137"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>> stack_concretestack_stack_concretestack_concretestack_stack_stack_obj1 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test138"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable2.isEmpty();
    boolean b4 = concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable2.checkNulls();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable2.clear();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_stack_concretestack_stack_serializable2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test139"); }

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
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable21 = concretestack_concretestack_stack_concretestack_serializable0.top();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable22 = concretestack_concretestack_stack_concretestack_serializable0.pop();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_serializable22);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test140"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_serializable1.clear();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>)concretestack_stack_concretestack_concretestack_stack_stack_serializable1);
    boolean b4 = concretestack_stack_stack_concretestack_concretestack_stack_stack_serializable0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test141"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test142"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_stack_concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.checkNulls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test143"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test144"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.checkNulls();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable5 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.top();
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test145"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b4 = concretestack_stack_concretestack_concretestack_comparable_str3.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.checkNulls();
    boolean b7 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str8 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str8.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str10.clear();
    concretestack_concretestack_comparable_str8.push(concretestack_comparable_str10);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str13 = concretestack_concretestack_comparable_str8.pop();
    concretestack_concretestack_concretestack_comparable_str5.push(concretestack_concretestack_comparable_str8);
    concretestack_concretestack_concretestack_comparable_str5.clear();
    boolean b16 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    concretestack_stack_concretestack_concretestack_comparable_str3.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_concretestack_concretestack_comparable_str5);
    concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test146"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_comparable_str0.checkNulls();
    boolean b2 = concretestack_concretestack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test147"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj2);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Object>>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj4 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0.top();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_obj4);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test148"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str2 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test149"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b5 = concretestack_stack_concretestack_concretestack_stack_comparable_str4.checkNulls();
    concretestack_stack_concretestack_concretestack_stack_comparable_str4.clear();
    concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str3.push(concretestack_stack_concretestack_concretestack_stack_comparable_str4);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str8 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str3.top();
    boolean b9 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str3.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_comparable_str10 = concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str3.top();
    concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0.push(concretestack_stack_concretestack_concretestack_stack_comparable_str10);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_stack_comparable_str12 = concretestack_stack_concretestack_concretestack_stack_comparable_str10.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_comparable_str10);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test150"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test151"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.checkNulls();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_serializable2.checkNulls();
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_serializable2.isEmpty();
    boolean b5 = concretestack_stack_concretestack_stack_concretestack_serializable2.checkNulls();
    concretestack_concretestack_stack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_stack_concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable7 = concretestack_stack_concretestack_stack_concretestack_serializable2.pop();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test152"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.checkNulls();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str4 = concretestack_concretestack_concretestack_stack_stack_stack_stack_stack_comparable_str2.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test153"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test154"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    boolean b5 = concretestack_stack_stack_stack_concretestack_stack_comparable_str0.checkNulls();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_concretestack_stack_comparable_str6 = concretestack_stack_stack_stack_concretestack_stack_comparable_str0.top();
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

}
