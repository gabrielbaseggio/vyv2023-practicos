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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.String str3 = concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str5 = concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.String str3 = concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str4 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    java.lang.Comparable<java.lang.String> comparable_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_comparable_str0.push(comparable_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str2 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str6 = concretestack_comparable_str0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b2 = concretestack_comparable_str0.equals((java.lang.Object)'a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str3 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    int i1 = concretestack_comparable_str0.size();
    java.lang.Comparable<java.lang.String> comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_comparable_str0.push(comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str6 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
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
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str11 = concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = concretestack_concretestack_comparable_str0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

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
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_comparable_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b2 = concretestack_comparable_str0.equals((java.lang.Object)'a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str4 = concretestack_comparable_str0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    int i6 = concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str11 = concretestack_comparable_str2.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str7 = concretestack_comparable_str3.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i4 = concretestack_concretestack_comparable_str3.size();
    boolean b5 = concretestack_concretestack_comparable_str3.isEmpty();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

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
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i2 = concretestack_concretestack_comparable_str1.size();
    boolean b3 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)i2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

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
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = concretestack_stack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str1 = concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str2 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_concretestack_comparable_str0.equals(obj11);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str13 = concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    java.lang.String str6 = concretestack_comparable_str0.toString();
    java.lang.String str7 = concretestack_comparable_str0.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str8.equals(obj11);
    concretestack_comparable_str8.clear();
    boolean b14 = concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str8);
    java.lang.Comparable<java.lang.String> comparable_str15 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_comparable_str8.push(comparable_str15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

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
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
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
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.String str3 = concretestack_comparable_str0.toString();
    concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str6 = concretestack_comparable_str0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_concretestack_comparable_str0.equals(obj11);
    int i13 = concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str14 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_comparable_str3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str3.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str3.toString();
    boolean b9 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str11 = concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_comparable_str0.equals(obj1);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_comparable_str0.push(stack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_comparable_str0.equals(obj1);
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str4 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str1 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_comparable_str1.equals(obj2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_comparable_str1.equals(obj4);
    java.lang.String str6 = concretestack_comparable_str1.toString();
    java.lang.String str7 = concretestack_comparable_str1.toString();
    java.lang.String str8 = concretestack_comparable_str1.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str9.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str9.equals(obj12);
    concretestack_comparable_str9.clear();
    boolean b15 = concretestack_comparable_str1.equals((java.lang.Object)concretestack_comparable_str9);
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str1);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str17 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_comparable_str0.push(stack_comparable_str17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str4 = concretestack_stack_concretestack_comparable_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str2 = concretestack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b2 = concretestack_comparable_str0.equals((java.lang.Object)'a');
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_comparable_str3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str3.equals(obj6);
    concretestack_comparable_str3.clear();
    boolean b9 = concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str3);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str10.equals(obj11);
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_comparable_str10.equals(obj13);
    java.lang.String str15 = concretestack_comparable_str10.toString();
    boolean b16 = concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    java.lang.String str6 = concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str7 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str4 = concretestack_stack_concretestack_comparable_str0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str3 = concretestack_comparable_str2.toString();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str5.toString();
    concretestack_comparable_str5.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str11 = concretestack_comparable_str5.pop();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str14 = concretestack_stack_comparable_str0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + ""+ "'", comparable_str11.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str20 = concretestack_str0.toString();
    boolean b22 = concretestack_str0.equals((java.lang.Object)'a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = concretestack_str0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_comparable_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str5 = concretestack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    boolean b2 = concretestack_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b4 = concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str5.equals(obj8);
    java.lang.String str10 = concretestack_comparable_str5.toString();
    java.lang.String str11 = concretestack_comparable_str5.toString();
    java.lang.String str12 = concretestack_comparable_str5.toString();
    boolean b13 = concretestack_concretestack_concretestack_comparable_str3.equals((java.lang.Object)concretestack_comparable_str5);
    boolean b14 = concretestack_str0.equals((java.lang.Object)b13);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = concretestack_str0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.String str3 = concretestack_comparable_str0.toString();
    concretestack_comparable_str0.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str6 = concretestack_comparable_str0.pop();
    concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + ""+ "'", comparable_str6.equals(""));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = concretestack_str0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    boolean b2 = concretestack_str0.isEmpty();
    boolean b3 = concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str5 = concretestack_stack_concretestack_comparable_str0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str5 = concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    int i3 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str2 = concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_concretestack_comparable_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str20 = concretestack_str0.toString();
    boolean b22 = concretestack_str0.equals((java.lang.Object)'a');
    java.lang.String str23 = concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[hi!]"+ "'", str23.equals("[hi!]"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.String str3 = concretestack_comparable_str0.toString();
    int i4 = concretestack_comparable_str0.size();
    int i5 = concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str7 = concretestack_comparable_str0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str1 = concretestack_comparable_str0.toString();
    concretestack_comparable_str0.clear();
    int i3 = concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str4 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_comparable_str0.equals(obj7);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = concretestack_concretestack_comparable_str0.get(0);
    concretestack_comparable_str10.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str10);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str4 = concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i2 = concretestack_concretestack_comparable_str1.size();
    boolean b3 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)i2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_comparable_str0.push(stack_concretestack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str7 = concretestack_comparable_str3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_comparable_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str20 = concretestack_str0.toString();
    concretestack_str0.push("");
    concretestack_str0.push("[[], []]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.clear();
    int i4 = concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str3 = concretestack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str3 = concretestack_comparable_str0.get((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    boolean b5 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str7 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str3 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    int i2 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.push("");
    concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str6 = concretestack_concretestack_str0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b2 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)(byte)1);
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str4 = new stack.ConcreteStack<java.lang.String>();
    int i5 = concretestack_str4.size();
    java.lang.String str6 = concretestack_str4.toString();
    concretestack_str4.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str9.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str11 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str11.equals(obj12);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_comparable_str11.equals(obj14);
    java.lang.String str16 = concretestack_comparable_str11.toString();
    java.lang.String str17 = concretestack_comparable_str11.toString();
    java.lang.String str18 = concretestack_comparable_str11.toString();
    boolean b19 = concretestack_concretestack_concretestack_comparable_str9.equals((java.lang.Object)concretestack_comparable_str11);
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_concretestack_concretestack_comparable_str9.equals(obj20);
    int i22 = concretestack_concretestack_concretestack_comparable_str9.size();
    boolean b23 = concretestack_str4.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str9);
    java.lang.String str24 = concretestack_concretestack_concretestack_comparable_str9.toString();
    boolean b25 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str9);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str26 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_comparable_str0.isEmpty();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_comparable_str0.push(stack_stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str2 = concretestack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    boolean b6 = concretestack_obj0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str8 = concretestack_stack_concretestack_concretestack_comparable_str3.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_comparable_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str6 = concretestack_stack_comparable_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_comparable_str3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str3.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str3.toString();
    boolean b9 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_comparable_str10.equals(obj11);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str13 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b15 = concretestack_comparable_str13.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str10.push(concretestack_comparable_str13);
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str13);
    concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b2 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)(byte)1);
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str4 = new stack.ConcreteStack<java.lang.String>();
    int i5 = concretestack_str4.size();
    java.lang.String str6 = concretestack_str4.toString();
    concretestack_str4.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str9.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str11 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str11.equals(obj12);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_comparable_str11.equals(obj14);
    java.lang.String str16 = concretestack_comparable_str11.toString();
    java.lang.String str17 = concretestack_comparable_str11.toString();
    java.lang.String str18 = concretestack_comparable_str11.toString();
    boolean b19 = concretestack_concretestack_concretestack_comparable_str9.equals((java.lang.Object)concretestack_comparable_str11);
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_concretestack_concretestack_comparable_str9.equals(obj20);
    int i22 = concretestack_concretestack_concretestack_comparable_str9.size();
    boolean b23 = concretestack_str4.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str9);
    java.lang.String str24 = concretestack_concretestack_concretestack_comparable_str9.toString();
    boolean b25 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str9);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str26 = concretestack_concretestack_concretestack_comparable_str9.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_comparable_str0.equals(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str1 = concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    boolean b6 = concretestack_obj0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str3);
    boolean b7 = concretestack_stack_concretestack_concretestack_comparable_str3.isEmpty();
    java.lang.String str8 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_concretestack_concretestack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str20 = concretestack_str0.toString();
    boolean b22 = concretestack_str0.equals((java.lang.Object)'a');
    concretestack_str0.clear();
    boolean b24 = concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_concretestack_str0.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_str0.push(concretestack_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

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
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.push("");
    java.lang.String str4 = concretestack_str0.get(0);
    java.lang.String str5 = concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    java.lang.String str2 = concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str3 = concretestack_stack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_comparable_str0.isEmpty();
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
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str2 = concretestack_stack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_comparable_str0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_comparable_str3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str3.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str3.toString();
    boolean b9 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str11 = concretestack_comparable_str3.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    boolean b6 = concretestack_obj0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = concretestack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)(short)1);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_comparable_str3.equals(obj4);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b8 = concretestack_comparable_str6.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str6);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str10.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str10);
    boolean b13 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str14.isEmpty();
    java.lang.String str16 = concretestack_concretestack_concretestack_comparable_str14.toString();
    boolean b17 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)str16);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str18 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_comparable_str0.push(stack_stack_comparable_str18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    java.lang.String str6 = concretestack_comparable_str0.toString();
    java.lang.String str7 = concretestack_comparable_str0.toString();
    concretestack_comparable_str0.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.String str10 = concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str3 = concretestack_stack_stack_stack_comparable_str0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str2 = concretestack_stack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
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

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    boolean b5 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i7 = concretestack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str8 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str10.equals(obj11);
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_comparable_str10.equals(obj13);
    concretestack_comparable_str10.clear();
    boolean b16 = concretestack_comparable_str2.equals((java.lang.Object)concretestack_comparable_str10);
    concretestack_comparable_str2.clear();
    boolean b18 = concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    boolean b19 = concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    boolean b6 = concretestack_obj0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str3);
    java.lang.Object obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_obj0.push(obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    int i3 = concretestack_obj0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = concretestack_obj0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_comparable_str0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_comparable_str0.equals(obj7);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = concretestack_concretestack_comparable_str0.get(0);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_comparable_str0.equals(obj11);
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_concretestack_comparable_str0.equals(obj13);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str15 = concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str16 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str15);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    java.lang.String str1 = concretestack_stack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str2 = concretestack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    int i3 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_comparable_str0.clear();
    java.lang.String str6 = concretestack_stack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b9 = concretestack_concretestack_comparable_str7.equals((java.lang.Object)(byte)1);
    concretestack_concretestack_comparable_str7.clear();
    concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>)concretestack_concretestack_comparable_str7);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str12 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_concretestack_comparable_str12.equals(obj13);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str15 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b17 = concretestack_comparable_str15.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str12.push(concretestack_comparable_str15);
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_concretestack_comparable_str12.equals(obj19);
    concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>)concretestack_concretestack_comparable_str12);
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str22 = concretestack_stack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_comparable_str22);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i4 = concretestack_concretestack_comparable_str3.size();
    boolean b5 = concretestack_concretestack_comparable_str3.isEmpty();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str3);
    boolean b7 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.isEmpty();
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
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    boolean b5 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i7 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str10 = concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    java.lang.String str6 = concretestack_comparable_str0.toString();
    java.lang.String str7 = concretestack_comparable_str0.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str8.equals(obj11);
    concretestack_comparable_str8.clear();
    boolean b14 = concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str8);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str15 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_comparable_str0.clear();
    boolean b3 = concretestack_concretestack_comparable_str0.isEmpty();
    int i4 = concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str3 = concretestack_stack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_comparable_str0.equals(obj1);
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    int i4 = concretestack_stack_comparable_str0.size();
    java.lang.String str5 = concretestack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str6 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b7 = concretestack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_str6);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str8 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    boolean b2 = concretestack_str0.isEmpty();
    concretestack_str0.clear();
    int i4 = concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str2.clear();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str2);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_concretestack_comparable_str0.equals(obj5);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_concretestack_concretestack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    boolean b5 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i7 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str9 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str20 = concretestack_str0.toString();
    boolean b21 = concretestack_str0.isEmpty();
    concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str5 = concretestack_stack_concretestack_comparable_str0.toString();
    concretestack_stack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    int i3 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_comparable_str0.clear();
    java.lang.String str6 = concretestack_stack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b9 = concretestack_concretestack_comparable_str7.equals((java.lang.Object)(byte)1);
    concretestack_concretestack_comparable_str7.clear();
    concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>)concretestack_concretestack_comparable_str7);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str12 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_concretestack_comparable_str12.equals(obj13);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str15 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b17 = concretestack_comparable_str15.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str12.push(concretestack_comparable_str15);
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_concretestack_comparable_str12.equals(obj19);
    concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>)concretestack_concretestack_comparable_str12);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str23 = concretestack_stack_concretestack_comparable_str0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_comparable_str3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str3.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str3.toString();
    boolean b9 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_comparable_str10.equals(obj11);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str13 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b15 = concretestack_comparable_str13.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str10.push(concretestack_comparable_str13);
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str13);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str18 = concretestack_comparable_str13.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_comparable_str0.push(stack_stack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str1 = concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str3 = concretestack_concretestack_str0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str4 = concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
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
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str5.equals(obj8);
    concretestack_comparable_str5.clear();
    boolean b11 = concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str5);
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str13 = concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_comparable_str0.toString();
    int i3 = concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_concretestack_str0.clear();
    java.lang.String str2 = concretestack_concretestack_str0.toString();
    boolean b3 = concretestack_concretestack_str0.isEmpty();
    java.lang.String str4 = concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str5 = concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

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
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str3 = concretestack_comparable_str2.toString();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str5.toString();
    concretestack_comparable_str5.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str11 = concretestack_comparable_str5.pop();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str5);
    java.lang.String str13 = concretestack_stack_comparable_str0.toString();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_stack_comparable_str0.equals(obj14);
    concretestack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + ""+ "'", comparable_str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[[], []]"+ "'", str13.equals("[[], []]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str2 = concretestack_concretestack_stack_stack_stack_comparable_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_concretestack_comparable_str0.equals(obj11);
    int i13 = concretestack_concretestack_concretestack_comparable_str0.size();
    int i14 = concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str15 = concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)(short)1);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_comparable_str3.equals(obj4);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b8 = concretestack_comparable_str6.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str6);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str10.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str10);
    boolean b13 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str14.isEmpty();
    java.lang.String str16 = concretestack_concretestack_concretestack_comparable_str14.toString();
    boolean b17 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)str16);
    java.lang.Object obj18 = null;
    boolean b19 = concretestack_stack_stack_comparable_str0.equals(obj18);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str20 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_comparable_str0.push(stack_stack_comparable_str20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    boolean b8 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)1.0d);
    concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_concretestack_comparable_str0.equals(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_comparable_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_comparable_str3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str3.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str3.toString();
    boolean b9 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_comparable_str10.equals(obj11);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str13 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b15 = concretestack_comparable_str13.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str10.push(concretestack_comparable_str13);
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str13);
    int i18 = concretestack_comparable_str13.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str19 = concretestack_comparable_str13.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable2 = concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str2 = concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    boolean b6 = concretestack_obj0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str3);
    int i7 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str8 = concretestack_stack_concretestack_concretestack_comparable_str3.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    boolean b7 = concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str8);
    java.lang.String str12 = concretestack_comparable_str8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    int i3 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    java.lang.String str5 = concretestack_stack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str6 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str20 = concretestack_concretestack_concretestack_comparable_str5.toString();
    java.lang.Object obj21 = null;
    boolean b22 = concretestack_concretestack_concretestack_comparable_str5.equals(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    concretestack_obj0.push((java.lang.Object)(-1));
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b4 = concretestack_obj0.equals((java.lang.Object)concretestack_concretestack_str3);
    stack.ConcreteStack<java.lang.String> concretestack_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_str3.push(concretestack_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable3 = concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_concretestack_comparable_str0.get((int)(short)0);
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_str0.equals(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_concretestack_comparable_str0.equals(obj11);
    int i13 = concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<java.lang.String> concretestack_str14 = new stack.ConcreteStack<java.lang.String>();
    int i15 = concretestack_str14.size();
    java.lang.String str16 = concretestack_str14.toString();
    concretestack_str14.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str19 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b20 = concretestack_concretestack_concretestack_comparable_str19.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str21 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj22 = null;
    boolean b23 = concretestack_comparable_str21.equals(obj22);
    java.lang.Object obj24 = null;
    boolean b25 = concretestack_comparable_str21.equals(obj24);
    java.lang.String str26 = concretestack_comparable_str21.toString();
    java.lang.String str27 = concretestack_comparable_str21.toString();
    java.lang.String str28 = concretestack_comparable_str21.toString();
    boolean b29 = concretestack_concretestack_concretestack_comparable_str19.equals((java.lang.Object)concretestack_comparable_str21);
    java.lang.Object obj30 = null;
    boolean b31 = concretestack_concretestack_concretestack_comparable_str19.equals(obj30);
    int i32 = concretestack_concretestack_concretestack_comparable_str19.size();
    boolean b33 = concretestack_str14.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str19);
    java.lang.String str34 = concretestack_concretestack_concretestack_comparable_str19.toString();
    boolean b35 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)str34);
    java.lang.String str36 = concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    int i2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str2 = concretestack_stack_stack_comparable_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    int i2 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<java.lang.String> concretestack_str3 = new stack.ConcreteStack<java.lang.String>();
    int i4 = concretestack_str3.size();
    java.lang.String str5 = concretestack_str3.toString();
    concretestack_str3.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str8 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b9 = concretestack_concretestack_concretestack_comparable_str8.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str10.equals(obj11);
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_comparable_str10.equals(obj13);
    java.lang.String str15 = concretestack_comparable_str10.toString();
    java.lang.String str16 = concretestack_comparable_str10.toString();
    java.lang.String str17 = concretestack_comparable_str10.toString();
    boolean b18 = concretestack_concretestack_concretestack_comparable_str8.equals((java.lang.Object)concretestack_comparable_str10);
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_concretestack_concretestack_comparable_str8.equals(obj19);
    int i21 = concretestack_concretestack_concretestack_comparable_str8.size();
    boolean b22 = concretestack_str3.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str8);
    java.lang.String str23 = concretestack_str3.toString();
    boolean b25 = concretestack_str3.equals((java.lang.Object)'a');
    int i26 = concretestack_str3.size();
    boolean b27 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)i26);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str28 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[hi!]"+ "'", str23.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_serializable0.equals(obj2);
    concretestack_serializable0.push((java.io.Serializable)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable7 = concretestack_serializable0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str1.clear();
    int i3 = concretestack_stack_concretestack_comparable_str1.size();
    boolean b4 = concretestack_stack_concretestack_comparable_str1.isEmpty();
    java.lang.String str5 = concretestack_stack_concretestack_comparable_str1.toString();
    boolean b6 = concretestack_stack_concretestack_comparable_str1.isEmpty();
    concretestack_stack_concretestack_comparable_str1.clear();
    int i8 = concretestack_stack_concretestack_comparable_str1.size();
    concretestack_stack_concretestack_comparable_str1.clear();
    boolean b10 = concretestack_stack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str11 = concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_comparable_str0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_comparable_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str5 = concretestack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
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
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    int i3 = concretestack_stack_stack_concretestack_comparable_str0.size();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_stack_concretestack_comparable_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_comparable_str0.push(stack_stack_concretestack_comparable_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    int i3 = concretestack_obj0.size();
    java.lang.String str4 = concretestack_obj0.toString();
    java.lang.Object obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_obj0.push(obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str5 = concretestack_stack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str6 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i3 = concretestack_stack_concretestack_comparable_str2.size();
    int i4 = concretestack_stack_concretestack_comparable_str2.size();
    concretestack_stack_stack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_concretestack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str6 = concretestack_stack_concretestack_comparable_str2.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    boolean b5 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i7 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str11 = concretestack_stack_concretestack_comparable_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str4 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)(short)1);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_comparable_str3.equals(obj4);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b8 = concretestack_comparable_str6.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str6);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str10.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str10);
    boolean b13 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str14.isEmpty();
    java.lang.String str16 = concretestack_concretestack_concretestack_comparable_str14.toString();
    boolean b17 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)str16);
    java.lang.Object obj18 = null;
    boolean b19 = concretestack_stack_stack_comparable_str0.equals(obj18);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str20 = concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    concretestack_concretestack_str0.clear();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_str0.equals(obj5);
    boolean b7 = concretestack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str9 = concretestack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str0.clear();
    int i2 = concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

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
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str2.clear();
    int i4 = concretestack_stack_concretestack_comparable_str2.size();
    boolean b5 = concretestack_stack_concretestack_comparable_str2.isEmpty();
    java.lang.String str6 = concretestack_stack_concretestack_comparable_str2.toString();
    boolean b7 = concretestack_stack_concretestack_comparable_str2.isEmpty();
    concretestack_stack_concretestack_comparable_str2.clear();
    int i9 = concretestack_stack_concretestack_comparable_str2.size();
    concretestack_stack_concretestack_comparable_str2.clear();
    boolean b11 = concretestack_stack_concretestack_str1.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str2);
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b14 = concretestack_concretestack_concretestack_concretestack_comparable_str13.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str13.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str13.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str13.clear();
    boolean b18 = concretestack_concretestack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_comparable_str13);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str19 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str20 = concretestack_str0.toString();
    boolean b21 = concretestack_str0.isEmpty();
    concretestack_str0.push("[]");
    java.lang.String str24 = concretestack_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)(short)1);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_comparable_str3.equals(obj4);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b8 = concretestack_comparable_str6.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str6);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str10.clear();
    concretestack_concretestack_comparable_str3.push(concretestack_comparable_str10);
    boolean b13 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str14.isEmpty();
    java.lang.String str16 = concretestack_concretestack_concretestack_comparable_str14.toString();
    boolean b17 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)str16);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str19 = concretestack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    int i1 = concretestack_comparable_str0.size();
    int i2 = concretestack_comparable_str0.size();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = concretestack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str3 = concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable2 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    int i2 = concretestack_serializable0.size();
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
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str3 = concretestack_comparable_str2.toString();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str5.toString();
    concretestack_comparable_str5.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str11 = concretestack_comparable_str5.pop();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str5);
    boolean b13 = concretestack_stack_comparable_str0.isEmpty();
    int i14 = concretestack_stack_comparable_str0.size();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str15 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_comparable_str15.equals(obj16);
    java.lang.String str18 = concretestack_comparable_str15.toString();
    concretestack_comparable_str15.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.String str21 = concretestack_comparable_str15.toString();
    java.lang.Comparable<java.lang.String> comparable_str22 = concretestack_comparable_str15.top();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str15);
    int i24 = concretestack_comparable_str15.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + ""+ "'", comparable_str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str22 + "' != '" + ""+ "'", comparable_str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b2 = concretestack_stack_stack_stack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str8.equals(obj11);
    concretestack_comparable_str8.clear();
    boolean b14 = concretestack_concretestack_concretestack_concretestack_comparable_str3.equals((java.lang.Object)concretestack_comparable_str8);
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    boolean b17 = concretestack_concretestack_concretestack_concretestack_comparable_str3.equals((java.lang.Object)(short)-1);
    boolean b18 = concretestack_stack_stack_stack_comparable_str1.equals((java.lang.Object)(short)-1);
    java.lang.String str19 = concretestack_stack_stack_stack_comparable_str1.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_stack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str22 = concretestack_stack_stack_stack_comparable_str1.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_stack_comparable_str0.toString();
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_comparable_str0.push(stack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_comparable_str0.toString();
    int i3 = concretestack_concretestack_comparable_str0.size();
    int i4 = concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    int i7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5.size();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str10 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    boolean b11 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str12 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b13 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_comparable_str12);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str14 = concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    int i3 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str4 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_stack_concretestack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_comparable_str0.push(stack_stack_concretestack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_serializable0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable4 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_stack_comparable_str0.isEmpty();
    int i3 = concretestack_stack_stack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str5 = concretestack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_concretestack_comparable_str0.equals(obj11);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_comparable_str13.equals(obj14);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str16 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b18 = concretestack_comparable_str16.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str13.push(concretestack_comparable_str16);
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_concretestack_comparable_str13.equals(obj20);
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str13);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str24 = concretestack_concretestack_concretestack_comparable_str0.get(0);
    java.lang.Object obj25 = null;
    boolean b26 = concretestack_concretestack_concretestack_comparable_str0.equals(obj25);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str27 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_comparable_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj1);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    int i3 = concretestack_stack_concretestack_concretestack_comparable_str1.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b5 = concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_comparable_str6.equals(obj7);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str6.equals(obj9);
    java.lang.String str11 = concretestack_comparable_str6.toString();
    java.lang.String str12 = concretestack_comparable_str6.toString();
    java.lang.String str13 = concretestack_comparable_str6.toString();
    boolean b14 = concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)concretestack_comparable_str6);
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_concretestack_concretestack_comparable_str4.equals(obj15);
    int i17 = concretestack_concretestack_concretestack_comparable_str4.size();
    int i18 = concretestack_concretestack_concretestack_comparable_str4.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str19 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i20 = concretestack_concretestack_comparable_str19.size();
    boolean b21 = concretestack_concretestack_comparable_str19.isEmpty();
    concretestack_concretestack_concretestack_comparable_str4.push(concretestack_concretestack_comparable_str19);
    concretestack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_concretestack_concretestack_comparable_str4);
    concretestack_stack_concretestack_concretestack_comparable_str1.clear();
    concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str26 = concretestack_stack_concretestack_concretestack_comparable_str1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    boolean b5 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str6 = concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    int i3 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str4 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_stack_concretestack_comparable_str5 = concretestack_stack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str2.clear();
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str2);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_concretestack_comparable_str0.equals(obj5);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_comparable_str0.get((int)(byte)0);
    java.lang.String str9 = concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str6 = concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    int i3 = concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.push("");
    int i3 = concretestack_str0.size();
    java.lang.String str4 = concretestack_str0.top();
    java.lang.String str5 = concretestack_str0.top();
    concretestack_str0.push("[[]]");
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_str0.equals(obj8);
    java.lang.String str10 = concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[[]], ]"+ "'", str10.equals("[[[]], ]"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_concretestack_comparable_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_stack_concretestack_comparable_str5 = concretestack_stack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
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
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str2 = concretestack_concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    boolean b5 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b9 = concretestack_concretestack_comparable_str7.equals((java.lang.Object)(byte)1);
    concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>)concretestack_concretestack_comparable_str7);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str11 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_comparable_str7.push(concretestack_comparable_str11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str6 = concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

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
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    int i7 = concretestack_comparable_str3.size();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str3.equals(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    int i3 = concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

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
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b1 = concretestack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str2 = concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b2 = concretestack_stack_stack_stack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str8.equals(obj11);
    concretestack_comparable_str8.clear();
    boolean b14 = concretestack_concretestack_concretestack_concretestack_comparable_str3.equals((java.lang.Object)concretestack_comparable_str8);
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    boolean b17 = concretestack_concretestack_concretestack_concretestack_comparable_str3.equals((java.lang.Object)(short)-1);
    boolean b18 = concretestack_stack_stack_stack_comparable_str1.equals((java.lang.Object)(short)-1);
    java.lang.String str19 = concretestack_stack_stack_stack_comparable_str1.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_stack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str21 = concretestack_stack_stack_stack_comparable_str1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    int i6 = concretestack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_concretestack_concretestack_concretestack_comparable_str3);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str10 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_comparable_str8);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str2.clear();
    int i4 = concretestack_stack_concretestack_comparable_str2.size();
    boolean b5 = concretestack_stack_concretestack_comparable_str2.isEmpty();
    java.lang.String str6 = concretestack_stack_concretestack_comparable_str2.toString();
    boolean b7 = concretestack_stack_concretestack_comparable_str2.isEmpty();
    concretestack_stack_concretestack_comparable_str2.clear();
    int i9 = concretestack_stack_concretestack_comparable_str2.size();
    concretestack_stack_concretestack_comparable_str2.clear();
    boolean b11 = concretestack_stack_concretestack_str1.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str2);
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str13.clear();
    int i15 = concretestack_stack_concretestack_comparable_str13.size();
    boolean b16 = concretestack_stack_concretestack_comparable_str13.isEmpty();
    java.lang.String str17 = concretestack_stack_concretestack_comparable_str13.toString();
    boolean b18 = concretestack_stack_concretestack_comparable_str13.isEmpty();
    concretestack_stack_concretestack_comparable_str13.clear();
    int i20 = concretestack_stack_concretestack_comparable_str13.size();
    concretestack_stack_concretestack_comparable_str13.clear();
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_stack_stack_stack_comparable_str1 = concretestack_stack_concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    int i3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.String str3 = concretestack_comparable_str0.toString();
    int i4 = concretestack_comparable_str0.size();
    concretestack_comparable_str0.clear();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str0.equals(obj6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str9 = concretestack_comparable_str0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    concretestack_comparable_str7.clear();
    boolean b13 = concretestack_concretestack_concretestack_concretestack_comparable_str2.equals((java.lang.Object)concretestack_comparable_str7);
    concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    boolean b16 = concretestack_concretestack_concretestack_concretestack_comparable_str2.equals((java.lang.Object)(short)-1);
    boolean b17 = concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)(short)-1);
    java.lang.String str18 = concretestack_stack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str20 = concretestack_stack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str3 = concretestack_concretestack_str2.toString();
    boolean b4 = concretestack_concretestack_str1.equals((java.lang.Object)str3);
    concretestack_concretestack_str1.clear();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_str1.equals(obj6);
    int i8 = concretestack_concretestack_str1.size();
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str10 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_serializable0.equals(obj2);
    concretestack_serializable0.push((java.io.Serializable)(short)10);
    java.io.Serializable serializable6 = concretestack_serializable0.pop();
    java.io.Serializable serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short)10+ "'", serializable6.equals((short)10));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_comparable_str4.equals(obj5);
    boolean b7 = concretestack_stack_comparable_str4.isEmpty();
    int i8 = concretestack_stack_comparable_str4.size();
    concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str4);
    boolean b10 = concretestack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str12 = concretestack_stack_stack_comparable_str0.get((int)(short)-1);
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str2 = concretestack_stack_stack_stack_comparable_str0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_comparable_str0.equals(obj3);
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_stack_comparable_str0.toString();
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    concretestack_stack_comparable_str0.clear();
    boolean b5 = concretestack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_stack_concretestack_comparable_str4 = concretestack_stack_stack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str3.clear();
    boolean b5 = concretestack_stack_comparable_str3.isEmpty();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_comparable_str3.equals(obj6);
    concretestack_obj0.push((java.lang.Object)b7);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_obj0.equals(obj9);
    concretestack_obj0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str3 = concretestack_comparable_str2.toString();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.String str8 = concretestack_comparable_str5.toString();
    concretestack_comparable_str5.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str11 = concretestack_comparable_str5.pop();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str5);
    java.lang.String str13 = concretestack_stack_comparable_str0.toString();
    boolean b14 = concretestack_stack_comparable_str0.isEmpty();
    int i15 = concretestack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + ""+ "'", comparable_str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[[], []]"+ "'", str13.equals("[[], []]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_comparable_str0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    java.lang.String str12 = concretestack_comparable_str7.toString();
    java.lang.String str13 = concretestack_comparable_str7.toString();
    java.lang.String str14 = concretestack_comparable_str7.toString();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str7);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_comparable_str5.equals(obj16);
    int i18 = concretestack_concretestack_concretestack_comparable_str5.size();
    boolean b19 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str20 = concretestack_str0.toString();
    boolean b21 = concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = concretestack_str0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[hi!]"+ "'", str20.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_comparable_str0.equals(obj1);
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    int i4 = concretestack_stack_comparable_str0.size();
    java.lang.String str5 = concretestack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str6 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b7 = concretestack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_str6);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str9 = concretestack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_concretestack_comparable_str0.equals(obj11);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_comparable_str13.equals(obj14);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str16 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b18 = concretestack_comparable_str16.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str13.push(concretestack_comparable_str16);
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_concretestack_comparable_str13.equals(obj20);
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str13);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str24 = concretestack_concretestack_concretestack_comparable_str0.get(0);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str26 = concretestack_concretestack_comparable_str24.get((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_comparable_str24);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str1 = concretestack_stack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_stack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_stack_comparable_str0.toString();
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_comparable_str0.push(stack_stack_stack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_serializable0.equals(obj2);
    concretestack_serializable0.push((java.io.Serializable)(short)10);
    java.io.Serializable serializable6 = concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable8 = concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short)10+ "'", serializable6.equals((short)10));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    int i2 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b4 = concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str5.equals(obj8);
    java.lang.String str10 = concretestack_comparable_str5.toString();
    java.lang.String str11 = concretestack_comparable_str5.toString();
    java.lang.String str12 = concretestack_comparable_str5.toString();
    boolean b13 = concretestack_concretestack_concretestack_comparable_str3.equals((java.lang.Object)concretestack_comparable_str5);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_concretestack_comparable_str3.equals(obj14);
    int i16 = concretestack_concretestack_concretestack_comparable_str3.size();
    int i17 = concretestack_concretestack_concretestack_comparable_str3.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str18 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i19 = concretestack_concretestack_comparable_str18.size();
    boolean b20 = concretestack_concretestack_comparable_str18.isEmpty();
    concretestack_concretestack_concretestack_comparable_str3.push(concretestack_concretestack_comparable_str18);
    concretestack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_concretestack_concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str24 = concretestack_stack_concretestack_concretestack_comparable_str0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.push("");
    java.lang.String str4 = concretestack_str0.get(0);
    int i5 = concretestack_str0.size();
    boolean b6 = concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    int i1 = concretestack_comparable_str0.size();
    int i2 = concretestack_comparable_str0.size();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str5 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
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
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    java.lang.String str1 = concretestack_stack_concretestack_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str3 = concretestack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_stack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_concretestack_concretestack_comparable_str1 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str4 = concretestack_stack_concretestack_comparable_str1.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_serializable0.equals(obj2);
    concretestack_serializable0.push((java.io.Serializable)(short)10);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_serializable0.equals(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str7.equals(obj10);
    concretestack_comparable_str7.clear();
    boolean b13 = concretestack_concretestack_concretestack_concretestack_comparable_str2.equals((java.lang.Object)concretestack_comparable_str7);
    concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    boolean b16 = concretestack_concretestack_concretestack_concretestack_comparable_str2.equals((java.lang.Object)(short)-1);
    boolean b17 = concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)(short)-1);
    java.lang.String str18 = concretestack_stack_stack_stack_comparable_str0.toString();
    concretestack_stack_stack_stack_comparable_str0.clear();
    concretestack_stack_stack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_stack_stack_comparable_str0.equals((java.lang.Object)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str3 = concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str5.equals(obj8);
    concretestack_comparable_str5.clear();
    boolean b11 = concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str5);
    boolean b12 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str13 = concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i3 = concretestack_stack_concretestack_comparable_str2.size();
    int i4 = concretestack_stack_concretestack_comparable_str2.size();
    concretestack_stack_stack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_concretestack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str7 = concretestack_stack_concretestack_comparable_str2.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str3 = concretestack_concretestack_str2.toString();
    boolean b4 = concretestack_concretestack_str1.equals((java.lang.Object)str3);
    concretestack_concretestack_str1.clear();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_str1.equals(obj6);
    int i8 = concretestack_concretestack_str1.size();
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str11 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str12 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str13 = concretestack_concretestack_str12.toString();
    boolean b14 = concretestack_concretestack_str11.equals((java.lang.Object)str13);
    concretestack_concretestack_str11.clear();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_str11.equals(obj16);
    int i18 = concretestack_concretestack_str11.size();
    boolean b19 = concretestack_stack_stack_concretestack_concretestack_comparable_str10.equals((java.lang.Object)concretestack_concretestack_str11);
    boolean b20 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)b19);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str21 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(stack_stack_concretestack_concretestack_comparable_str21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    int i1 = concretestack_stack_serializable0.size();
    java.lang.String str2 = concretestack_stack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable3 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_stack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> stack_stack_stack_comparable_str3 = concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    int i3 = concretestack_stack_concretestack_concretestack_comparable_str1.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b5 = concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_comparable_str6.equals(obj7);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str6.equals(obj9);
    java.lang.String str11 = concretestack_comparable_str6.toString();
    java.lang.String str12 = concretestack_comparable_str6.toString();
    java.lang.String str13 = concretestack_comparable_str6.toString();
    boolean b14 = concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)concretestack_comparable_str6);
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_concretestack_concretestack_comparable_str4.equals(obj15);
    int i17 = concretestack_concretestack_concretestack_comparable_str4.size();
    int i18 = concretestack_concretestack_concretestack_comparable_str4.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str19 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i20 = concretestack_concretestack_comparable_str19.size();
    boolean b21 = concretestack_concretestack_comparable_str19.isEmpty();
    concretestack_concretestack_concretestack_comparable_str4.push(concretestack_concretestack_comparable_str19);
    concretestack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_concretestack_concretestack_comparable_str4);
    concretestack_stack_concretestack_concretestack_comparable_str1.clear();
    concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_comparable_str1);
    concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str27 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    int i6 = concretestack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_concretestack_concretestack_concretestack_comparable_str3);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str10 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_comparable_str8);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_comparable_str5.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str5.equals(obj8);
    concretestack_comparable_str5.clear();
    boolean b11 = concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str5);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str12 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_comparable_str12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str7 = concretestack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    boolean b11 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str12 = concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_concretestack_comparable_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_stack_concretestack_comparable_str6 = concretestack_stack_stack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str2 = concretestack_concretestack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_concretestack_str0.clear();
    java.lang.String str2 = concretestack_concretestack_str0.toString();
    boolean b3 = concretestack_concretestack_str0.isEmpty();
    java.lang.String str4 = concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str5 = concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    boolean b5 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i7 = concretestack_stack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_concretestack_comparable_str0.equals(obj5);
    java.lang.String str7 = concretestack_stack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str8 = concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_concretestack_concretestack_comparable_str3 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str1.clear();
    int i3 = concretestack_stack_concretestack_comparable_str1.size();
    boolean b4 = concretestack_stack_concretestack_comparable_str1.isEmpty();
    java.lang.String str5 = concretestack_stack_concretestack_comparable_str1.toString();
    boolean b6 = concretestack_stack_concretestack_comparable_str1.isEmpty();
    concretestack_stack_concretestack_comparable_str1.clear();
    int i8 = concretestack_stack_concretestack_comparable_str1.size();
    concretestack_stack_concretestack_comparable_str1.clear();
    boolean b10 = concretestack_stack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str11 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str12 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str13 = concretestack_concretestack_str12.toString();
    boolean b14 = concretestack_concretestack_str11.equals((java.lang.Object)str13);
    concretestack_concretestack_str11.clear();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_str11.equals(obj16);
    int i18 = concretestack_concretestack_str11.size();
    concretestack_stack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<java.lang.String>>)concretestack_concretestack_str11);
    boolean b20 = concretestack_stack_concretestack_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str21 = concretestack_stack_concretestack_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str23 = concretestack_stack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_str21);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str3 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_stack_stack_stack_comparable_str2 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str3 = concretestack_concretestack_stack_concretestack_comparable_str0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

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
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str5 = concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    boolean b6 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str7 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str3 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str4);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    int i1 = concretestack_stack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str2 = concretestack_stack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str5 = concretestack_stack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str7 = concretestack_stack_concretestack_comparable_str0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(stack_stack_concretestack_concretestack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_str0.equals(obj4);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str6 = concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_str0.equals(obj4);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str6 = concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    concretestack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = concretestack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    concretestack_stack_concretestack_str0.clear();
    int i2 = concretestack_stack_concretestack_str0.size();
    int i3 = concretestack_stack_concretestack_str0.size();
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_str0.push(stack_concretestack_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj1);
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    java.lang.String str1 = concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    boolean b7 = concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str8);
    int i12 = concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i14 = concretestack_concretestack_comparable_str13.size();
    boolean b15 = concretestack_concretestack_comparable_str13.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str16 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_comparable_str16.equals(obj17);
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_comparable_str16.equals(obj19);
    java.lang.String str21 = concretestack_comparable_str16.toString();
    boolean b22 = concretestack_concretestack_comparable_str13.equals((java.lang.Object)concretestack_comparable_str16);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str23 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj24 = null;
    boolean b25 = concretestack_concretestack_comparable_str23.equals(obj24);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str26 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b28 = concretestack_comparable_str26.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str23.push(concretestack_comparable_str26);
    concretestack_concretestack_comparable_str13.push(concretestack_comparable_str26);
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str26);
    boolean b32 = concretestack_comparable_str26.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str7.clear();
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str7);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str11 = concretestack_comparable_str7.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    java.lang.String str6 = concretestack_comparable_str0.toString();
    boolean b7 = concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str2.clear();
    int i4 = concretestack_stack_concretestack_comparable_str2.size();
    boolean b5 = concretestack_stack_concretestack_comparable_str2.isEmpty();
    java.lang.String str6 = concretestack_stack_concretestack_comparable_str2.toString();
    boolean b7 = concretestack_stack_concretestack_comparable_str2.isEmpty();
    concretestack_stack_concretestack_comparable_str2.clear();
    int i9 = concretestack_stack_concretestack_comparable_str2.size();
    concretestack_stack_concretestack_comparable_str2.clear();
    boolean b11 = concretestack_stack_concretestack_str1.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str2);
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i14 = concretestack_stack_concretestack_comparable_str13.size();
    int i15 = concretestack_stack_concretestack_comparable_str13.size();
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str13);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str18 = concretestack_concretestack_stack_concretestack_comparable_str0.get(0);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str19 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str19.clear();
    int i21 = concretestack_stack_concretestack_comparable_str19.size();
    java.lang.Object obj22 = null;
    boolean b23 = concretestack_stack_concretestack_comparable_str19.equals(obj22);
    java.lang.String str24 = concretestack_stack_concretestack_comparable_str19.toString();
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str19);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str26 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_comparable_str26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_comparable_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_stack_stack_stack_comparable_str4 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = concretestack_concretestack_comparable_str0.get(0);
    concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str8);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_comparable_str0.toString();
    java.lang.String str6 = concretestack_comparable_str0.toString();
    java.lang.String str7 = concretestack_comparable_str0.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str8.equals(obj11);
    concretestack_comparable_str8.clear();
    boolean b14 = concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str8);
    concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Comparable<java.lang.String> comparable_str16 = concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i3 = concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str4 = concretestack_stack_stack_concretestack_str0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b3 = concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    java.lang.String str4 = concretestack_concretestack_concretestack_comparable_str2.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b7 = concretestack_comparable_str5.equals((java.lang.Object)'a');
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str8.equals(obj11);
    concretestack_comparable_str8.clear();
    boolean b14 = concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str8);
    boolean b15 = concretestack_concretestack_concretestack_comparable_str2.equals((java.lang.Object)concretestack_comparable_str8);
    boolean b16 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str17 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_comparable_str17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_str0.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_str0.equals(obj6);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str9 = concretestack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_stack_stack_stack_comparable_str3 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    int i3 = concretestack_comparable_str0.size();
    java.lang.Comparable<java.lang.String> comparable_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_comparable_str0.push(comparable_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_concretestack_concretestack_comparable_str1 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b2 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)(byte)1);
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str4 = new stack.ConcreteStack<java.lang.String>();
    int i5 = concretestack_str4.size();
    java.lang.String str6 = concretestack_str4.toString();
    concretestack_str4.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str9.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str11 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str11.equals(obj12);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_comparable_str11.equals(obj14);
    java.lang.String str16 = concretestack_comparable_str11.toString();
    java.lang.String str17 = concretestack_comparable_str11.toString();
    java.lang.String str18 = concretestack_comparable_str11.toString();
    boolean b19 = concretestack_concretestack_concretestack_comparable_str9.equals((java.lang.Object)concretestack_comparable_str11);
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_concretestack_concretestack_comparable_str9.equals(obj20);
    int i22 = concretestack_concretestack_concretestack_comparable_str9.size();
    boolean b23 = concretestack_str4.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str9);
    java.lang.String str24 = concretestack_concretestack_concretestack_comparable_str9.toString();
    boolean b25 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str9);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str27 = concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_stack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_stack_comparable_str0.toString();
    java.lang.String str3 = concretestack_stack_stack_stack_comparable_str0.toString();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_stack_comparable_str0.equals(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.clear();
    boolean b4 = concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_concretestack_concretestack_comparable_str3 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    boolean b2 = concretestack_stack_comparable_str0.isEmpty();
    int i3 = concretestack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    concretestack_concretestack_str0.clear();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_str0.equals(obj5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str8 = concretestack_concretestack_str0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_comparable_str0.push(stack_concretestack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str0 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_comparable_str0.equals(obj1);
    java.lang.String str3 = concretestack_comparable_str0.toString();
    concretestack_comparable_str0.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str7 = concretestack_comparable_str0.get(0);
    java.lang.Comparable<java.lang.String> comparable_str8 = concretestack_comparable_str0.top();
    java.lang.Comparable<java.lang.String> comparable_str9 = concretestack_comparable_str0.top();
    java.lang.Comparable<java.lang.String> comparable_str10 = concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + ""+ "'", comparable_str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + ""+ "'", comparable_str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + ""+ "'", comparable_str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + ""+ "'", comparable_str10.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str3 = concretestack_comparable_str2.toString();
    concretestack_stack_comparable_str0.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str2);
    java.lang.String str5 = concretestack_stack_comparable_str0.toString();
    boolean b6 = concretestack_stack_comparable_str0.isEmpty();
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str7 = concretestack_stack_comparable_str0.top();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable8 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b9 = concretestack_serializable8.isEmpty();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_serializable8.equals(obj10);
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str12 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str12.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str14 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str15 = concretestack_comparable_str14.toString();
    concretestack_stack_comparable_str12.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str14);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str17 = concretestack_stack_comparable_str12.pop();
    boolean b18 = concretestack_serializable8.equals((java.lang.Object)concretestack_stack_comparable_str12);
    concretestack_serializable8.push((java.io.Serializable)(short)100);
    boolean b21 = concretestack_stack_comparable_str0.equals((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[[]]"+ "'", str5.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj4);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_stack_stack_stack_comparable_str2 = concretestack_stack_concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

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
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str2 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_comparable_str2.toString();
    int i4 = concretestack_stack_concretestack_concretestack_comparable_str2.size();
    int i5 = concretestack_stack_concretestack_concretestack_comparable_str2.size();
    boolean b6 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)i5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_stack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    int i3 = concretestack_concretestack_stack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str1 = concretestack_concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    concretestack_obj0.push((java.lang.Object)(-1));
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b4 = concretestack_obj0.equals((java.lang.Object)concretestack_concretestack_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str5 = concretestack_concretestack_str3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

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
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_comparable_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    int i1 = concretestack_stack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable2 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj3);
    concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_stack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    int i1 = concretestack_stack_stack_concretestack_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_comparable_str2.equals(obj3);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b7 = concretestack_comparable_str5.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str5);
    boolean b9 = concretestack_concretestack_comparable_str2.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str10.equals(obj11);
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str10);
    int i14 = concretestack_concretestack_comparable_str2.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str15 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i16 = concretestack_concretestack_comparable_str15.size();
    boolean b17 = concretestack_concretestack_comparable_str15.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str18 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_comparable_str18.equals(obj19);
    java.lang.Object obj21 = null;
    boolean b22 = concretestack_comparable_str18.equals(obj21);
    java.lang.String str23 = concretestack_comparable_str18.toString();
    boolean b24 = concretestack_concretestack_comparable_str15.equals((java.lang.Object)concretestack_comparable_str18);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str25 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj26 = null;
    boolean b27 = concretestack_concretestack_comparable_str25.equals(obj26);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str28 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b30 = concretestack_comparable_str28.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str25.push(concretestack_comparable_str28);
    concretestack_concretestack_comparable_str15.push(concretestack_comparable_str28);
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str28);
    boolean b34 = concretestack_stack_stack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str2);
    int i35 = concretestack_concretestack_comparable_str2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 3);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_stack_stack_stack_comparable_str4 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str4 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    concretestack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str2 = concretestack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    boolean b6 = concretestack_obj0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str3);
    concretestack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = concretestack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_comparable_str0.equals(obj7);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = concretestack_concretestack_comparable_str0.get(0);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_comparable_str0.equals(obj11);
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_concretestack_comparable_str0.equals(obj13);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str16 = concretestack_concretestack_comparable_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str3 = concretestack_concretestack_str2.toString();
    boolean b4 = concretestack_concretestack_str1.equals((java.lang.Object)str3);
    concretestack_concretestack_str1.clear();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_str1.equals(obj6);
    int i8 = concretestack_concretestack_str1.size();
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str11 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str12 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str13 = concretestack_concretestack_str12.toString();
    boolean b14 = concretestack_concretestack_str11.equals((java.lang.Object)str13);
    concretestack_concretestack_str11.clear();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_str11.equals(obj16);
    int i18 = concretestack_concretestack_str11.size();
    boolean b19 = concretestack_stack_stack_concretestack_concretestack_comparable_str10.equals((java.lang.Object)concretestack_concretestack_str11);
    boolean b20 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)b19);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str21 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i4 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str7 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str3.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    int i3 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    boolean b4 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.equals(obj3);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    int i7 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_comparable_str0.equals(obj1);
    boolean b3 = concretestack_stack_comparable_str0.isEmpty();
    int i4 = concretestack_stack_comparable_str0.size();
    java.lang.String str5 = concretestack_stack_comparable_str0.toString();
    int i6 = concretestack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_concretestack_comparable_str0.equals(obj5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> stack_concretestack_comparable_str8 = concretestack_stack_concretestack_comparable_str0.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b1 = concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = concretestack_concretestack_serializable0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str3 = concretestack_concretestack_str0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str4);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str7 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str1 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_comparable_str1.equals(obj2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_comparable_str1.equals(obj4);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_comparable_str6.equals(obj7);
    boolean b9 = concretestack_comparable_str1.equals(obj7);
    boolean b10 = concretestack_concretestack_stack_concretestack_comparable_str0.equals(obj7);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str11 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str12 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str12.clear();
    int i14 = concretestack_stack_concretestack_comparable_str12.size();
    boolean b15 = concretestack_stack_concretestack_comparable_str12.isEmpty();
    java.lang.String str16 = concretestack_stack_concretestack_comparable_str12.toString();
    boolean b17 = concretestack_stack_concretestack_comparable_str12.isEmpty();
    concretestack_stack_concretestack_comparable_str12.clear();
    int i19 = concretestack_stack_concretestack_comparable_str12.size();
    concretestack_stack_concretestack_comparable_str12.clear();
    boolean b21 = concretestack_stack_concretestack_str11.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str12);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str22 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str23 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str24 = concretestack_concretestack_str23.toString();
    boolean b25 = concretestack_concretestack_str22.equals((java.lang.Object)str24);
    concretestack_concretestack_str22.clear();
    java.lang.Object obj27 = null;
    boolean b28 = concretestack_concretestack_str22.equals(obj27);
    int i29 = concretestack_concretestack_str22.size();
    concretestack_stack_concretestack_str11.push((stack.Stack<stack.ConcreteStack<java.lang.String>>)concretestack_concretestack_str22);
    boolean b31 = concretestack_concretestack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_str11);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str33 = concretestack_stack_concretestack_str11.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    int i5 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_concretestack_concretestack_concretestack_comparable_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_stack_concretestack_concretestack_concretestack_comparable_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_comparable_str4.equals(obj5);
    boolean b7 = concretestack_stack_comparable_str4.isEmpty();
    int i8 = concretestack_stack_comparable_str4.size();
    concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str4);
    java.lang.String str10 = concretestack_stack_stack_comparable_str0.toString();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str12 = concretestack_stack_stack_comparable_str0.get(0);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str13 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_comparable_str0.push(stack_stack_comparable_str13);
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str12);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str2 = concretestack_concretestack_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.equals(obj2);
    java.lang.String str4 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    int i1 = concretestack_stack_stack_concretestack_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_comparable_str2.equals(obj3);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b7 = concretestack_comparable_str5.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str5);
    boolean b9 = concretestack_concretestack_comparable_str2.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str10.equals(obj11);
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str10);
    int i14 = concretestack_concretestack_comparable_str2.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str15 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i16 = concretestack_concretestack_comparable_str15.size();
    boolean b17 = concretestack_concretestack_comparable_str15.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str18 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_comparable_str18.equals(obj19);
    java.lang.Object obj21 = null;
    boolean b22 = concretestack_comparable_str18.equals(obj21);
    java.lang.String str23 = concretestack_comparable_str18.toString();
    boolean b24 = concretestack_concretestack_comparable_str15.equals((java.lang.Object)concretestack_comparable_str18);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str25 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj26 = null;
    boolean b27 = concretestack_concretestack_comparable_str25.equals(obj26);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str28 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b30 = concretestack_comparable_str28.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str25.push(concretestack_comparable_str28);
    concretestack_concretestack_comparable_str15.push(concretestack_comparable_str28);
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str28);
    boolean b34 = concretestack_stack_stack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str35 = concretestack_stack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_concretestack_concretestack_comparable_str3 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str4 = concretestack_concretestack_stack_stack_stack_comparable_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    int i1 = concretestack_stack_stack_concretestack_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_comparable_str2.equals(obj3);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b7 = concretestack_comparable_str5.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str5);
    boolean b9 = concretestack_concretestack_comparable_str2.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str10.equals(obj11);
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str10);
    int i14 = concretestack_concretestack_comparable_str2.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str15 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i16 = concretestack_concretestack_comparable_str15.size();
    boolean b17 = concretestack_concretestack_comparable_str15.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str18 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_comparable_str18.equals(obj19);
    java.lang.Object obj21 = null;
    boolean b22 = concretestack_comparable_str18.equals(obj21);
    java.lang.String str23 = concretestack_comparable_str18.toString();
    boolean b24 = concretestack_concretestack_comparable_str15.equals((java.lang.Object)concretestack_comparable_str18);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str25 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj26 = null;
    boolean b27 = concretestack_concretestack_comparable_str25.equals(obj26);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str28 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b30 = concretestack_comparable_str28.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str25.push(concretestack_comparable_str28);
    concretestack_concretestack_comparable_str15.push(concretestack_comparable_str28);
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str28);
    boolean b34 = concretestack_stack_stack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_comparable_str2);
    java.lang.String str35 = concretestack_stack_stack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str36 = concretestack_stack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    boolean b2 = concretestack_str0.isEmpty();
    concretestack_str0.clear();
    java.lang.String str4 = concretestack_str0.toString();
    concretestack_str0.clear();
    concretestack_str0.push("");
    concretestack_str0.push("[, [], hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    concretestack_stack_stack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    java.lang.String str5 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj4);
    int i6 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    boolean b8 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)1.0d);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = concretestack_concretestack_comparable_str0.top();
    java.lang.String str10 = concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_concretestack_comparable_str0.equals(obj3);
    boolean b5 = concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable2 = concretestack_stack_concretestack_serializable0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str3 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    boolean b3 = concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str5 = concretestack_concretestack_stack_concretestack_comparable_str0.get(1);
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
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

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
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i2 = concretestack_concretestack_comparable_str1.size();
    boolean b3 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)i2);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_comparable_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_stack_concretestack_comparable_str2 = concretestack_stack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.equals(obj3);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str7 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str7);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b1 = concretestack_concretestack_serializable0.isEmpty();
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
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    int i3 = concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.equals(obj3);
    boolean b5 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj3);
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    int i2 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    int i3 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str4 = concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    concretestack_stack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str5 = concretestack_stack_stack_concretestack_str0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<java.lang.String> concretestack_str2 = new stack.ConcreteStack<java.lang.String>();
    int i3 = concretestack_str2.size();
    java.lang.String str4 = concretestack_str2.toString();
    concretestack_str2.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b8 = concretestack_concretestack_concretestack_comparable_str7.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str9.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str9.equals(obj12);
    java.lang.String str14 = concretestack_comparable_str9.toString();
    java.lang.String str15 = concretestack_comparable_str9.toString();
    java.lang.String str16 = concretestack_comparable_str9.toString();
    boolean b17 = concretestack_concretestack_concretestack_comparable_str7.equals((java.lang.Object)concretestack_comparable_str9);
    java.lang.Object obj18 = null;
    boolean b19 = concretestack_concretestack_concretestack_comparable_str7.equals(obj18);
    int i20 = concretestack_concretestack_concretestack_comparable_str7.size();
    boolean b21 = concretestack_str2.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str7);
    java.lang.String str22 = concretestack_str2.toString();
    boolean b23 = concretestack_str2.isEmpty();
    concretestack_str2.push("[]");
    concretestack_str2.push("");
    java.lang.String str28 = concretestack_str2.toString();
    boolean b29 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_str2);
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj31 = null;
    boolean b32 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj31);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str33 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[hi!]"+ "'", str22.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[, [], hi!]"+ "'", str28.equals("[, [], hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

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
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable0.clear();
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_serializable0.push(stack_concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_stack_stack_stack_comparable_str5 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str3 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str1 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str3 = concretestack_concretestack_str2.toString();
    boolean b4 = concretestack_concretestack_str1.equals((java.lang.Object)str3);
    concretestack_concretestack_str1.clear();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_str1.equals(obj6);
    int i8 = concretestack_concretestack_str1.size();
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_str1);
    java.lang.String str10 = concretestack_concretestack_str1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str6 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_stack_comparable_str0.clear();

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str2 = concretestack_concretestack_str1.toString();
    boolean b3 = concretestack_concretestack_str0.equals((java.lang.Object)str2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_str0.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_str0.equals(obj6);
    stack.ConcreteStack<java.lang.String> concretestack_str8 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str8.push("");
    int i11 = concretestack_str8.size();
    java.lang.String str12 = concretestack_str8.top();
    concretestack_concretestack_str0.push(concretestack_str8);
    int i14 = concretestack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1);
    boolean b5 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.push("");
    java.lang.String str4 = concretestack_str0.get(0);
    java.lang.String str5 = concretestack_str0.pop();
    boolean b6 = concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str4 = concretestack_stack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    boolean b8 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)1.0d);
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_concretestack_concretestack_concretestack_comparable_str3.clear();
    int i6 = concretestack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_concretestack_concretestack_concretestack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_concretestack_comparable_str3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b1 = concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_comparable_str2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_comparable_str2.equals(obj5);
    java.lang.String str7 = concretestack_comparable_str2.toString();
    java.lang.String str8 = concretestack_comparable_str2.toString();
    java.lang.String str9 = concretestack_comparable_str2.toString();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_comparable_str2);
    java.lang.String str11 = concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.Object obj12 = new java.lang.Object();
    boolean b13 = concretestack_concretestack_concretestack_comparable_str0.equals(obj12);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str15 = concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    boolean b4 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b5 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i1 = concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_comparable_str0.toString();
    int i3 = concretestack_concretestack_comparable_str0.size();
    int i4 = concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    boolean b6 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str10 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str1.clear();
    int i3 = concretestack_stack_concretestack_comparable_str1.size();
    boolean b4 = concretestack_stack_concretestack_comparable_str1.isEmpty();
    java.lang.String str5 = concretestack_stack_concretestack_comparable_str1.toString();
    boolean b6 = concretestack_stack_concretestack_comparable_str1.isEmpty();
    concretestack_stack_concretestack_comparable_str1.clear();
    int i8 = concretestack_stack_concretestack_comparable_str1.size();
    concretestack_stack_concretestack_comparable_str1.clear();
    boolean b10 = concretestack_stack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str11 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str12 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str13 = concretestack_concretestack_str12.toString();
    boolean b14 = concretestack_concretestack_str11.equals((java.lang.Object)str13);
    concretestack_concretestack_str11.clear();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_str11.equals(obj16);
    int i18 = concretestack_concretestack_str11.size();
    concretestack_stack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<java.lang.String>>)concretestack_concretestack_str11);
    boolean b20 = concretestack_stack_concretestack_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str21 = concretestack_stack_concretestack_str0.pop();
    boolean b22 = concretestack_stack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

}
