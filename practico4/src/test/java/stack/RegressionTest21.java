package stack;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test001"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0.size();
    int i2 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test002"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_concretestack_concretestack_comparable_str3);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str6 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.get(0);
    boolean b7 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str8 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b10 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str11 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str12 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str12.clear();
    boolean b14 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[[]]"+ "'", str11.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test003"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str2.isEmpty();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str2.isEmpty();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str2.equals(obj5);
    int i7 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str2.size();
    boolean b8 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str2);
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1.isEmpty();
    int i10 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1.size();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1);
    int i12 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test004"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>>> concretestack_concretestack_concretestack_concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_serializable1.equals(obj2);
    boolean b4 = concretestack_concretestack_concretestack_concretestack_stack_charSequence0.equals((java.lang.Object)b3);
    boolean b5 = concretestack_concretestack_concretestack_concretestack_stack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>> concretestack_concretestack_concretestack_stack_charSequence6 = concretestack_concretestack_concretestack_concretestack_stack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test005"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>)concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable1);
    java.lang.String str3 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.toString();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable4 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[[]]"+ "'", str3.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable4);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test006"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str2.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_str4.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_comparable_str6.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_comparable_str6.clear();
    concretestack_concretestack_stack_stack_concretestack_comparable_str6.clear();
    java.lang.String str10 = concretestack_concretestack_stack_stack_concretestack_comparable_str6.toString();
    boolean b11 = concretestack_stack_concretestack_concretestack_stack_stack_str4.equals((java.lang.Object)str10);
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str2.push(concretestack_stack_concretestack_concretestack_stack_stack_str4);
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.push(concretestack_stack_concretestack_concretestack_stack_stack_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test007"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test008"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str2.clear();
    int i4 = concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str2.size();
    concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str2);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str6 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.top();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.equals(obj7);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str9 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.pop();
    java.lang.String str10 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test009"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_stack_stack_str1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_str3.clear();
    boolean b5 = concretestack_stack_concretestack_concretestack_stack_stack_str3.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_str1.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_stack_stack_str3);
    java.lang.String str7 = concretestack_stack_stack_concretestack_concretestack_stack_stack_str1.toString();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_str0.push(concretestack_stack_stack_concretestack_concretestack_stack_stack_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_str9 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_concretestack_stack_stack_str9);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test010"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str4 = concretestack_stack_stack_concretestack_comparable_str3.toString();
    int i5 = concretestack_stack_stack_concretestack_comparable_str3.size();
    int i6 = concretestack_stack_stack_concretestack_comparable_str3.size();
    int i7 = concretestack_stack_stack_concretestack_comparable_str3.size();
    concretestack_stack_stack_concretestack_comparable_str3.clear();
    int i9 = concretestack_stack_stack_concretestack_comparable_str3.size();
    java.lang.String str10 = concretestack_stack_stack_concretestack_comparable_str3.toString();
    boolean b11 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str12 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>>();
    boolean b13 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str12.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str12.clear();
    boolean b15 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test011"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test012"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.clear();
    int i2 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str4 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test013"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.toString();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.toString();
    java.lang.String str6 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3);
    boolean b8 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test014"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_concretestack_concretestack_comparable_str4);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str7 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.get(0);
    boolean b8 = concretestack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)stack_stack_concretestack_concretestack_comparable_str7);
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence9 = new stack.ConcreteStack<java.lang.CharSequence>();
    concretestack_charSequence9.push((java.lang.CharSequence)"[[]]");
    boolean b12 = concretestack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_charSequence9);
    int i13 = concretestack_concretestack_stack_stack_stack_comparable_str0.size();
    java.lang.String str14 = concretestack_concretestack_stack_stack_stack_comparable_str0.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test015"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_stack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test016"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test017"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals(obj1);
    int i3 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    int i5 = concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str4.size();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str4);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str7 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str8 = concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str7.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str7);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test018"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.clear();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.equals(obj7);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4);
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test019"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i4 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str3.size();
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str3.isEmpty();
    boolean b6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_comparable_str3);
    java.lang.String str7 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test020"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable1.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable3.toString();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable3);
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test021"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b2 = concretestack_concretestack_str0.equals((java.lang.Object)(short)100);
    stack.ConcreteStack<java.lang.String> concretestack_str3 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str3.push("");
    concretestack_str3.clear();
    int i7 = concretestack_str3.size();
    concretestack_concretestack_str0.push(concretestack_str3);
    int i9 = concretestack_concretestack_str0.size();
    java.lang.String str10 = concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test022"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.push(concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test023"); }

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
    concretestack_concretestack_comparable_str0.clear();
    
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
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test024"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_concretestack_str0.size();
    int i2 = concretestack_stack_stack_concretestack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> stack_stack_concretestack_stack_concretestack_str4 = concretestack_stack_stack_concretestack_stack_concretestack_str0.get((-1));
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
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test025"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test026"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj3);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str8 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str7.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_comparable_str7);
    java.lang.String str10 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.clear();
    boolean b12 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test027"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_stack_str0.isEmpty();
    int i2 = concretestack_concretestack_stack_stack_concretestack_stack_stack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_stack_str3 = concretestack_concretestack_stack_stack_concretestack_stack_stack_str0.top();
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test028"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test029"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>> concretestack_stack_stack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_stack_stack_charSequence0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_stack_stack_charSequence0.equals(obj2);
    concretestack_stack_stack_stack_stack_stack_charSequence0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test030"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    int i3 = concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2.size();
    boolean b4 = concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>> concretestack_stack_concretestack_concretestack_obj6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>();
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_obj6);
    int i8 = concretestack_stack_concretestack_concretestack_obj6.size();
    boolean b9 = concretestack_stack_concretestack_concretestack_obj6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test031"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_stack_concretestack_comparable_str0.size();
    concretestack_concretestack_stack_stack_stack_concretestack_comparable_str0.clear();
    concretestack_concretestack_stack_stack_stack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_concretestack_comparable_str4 = concretestack_concretestack_stack_stack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test032"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test033"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str3 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test034"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_comparable_str0.equals(obj1);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_comparable_str0.clear();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test035"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test036"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test037"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_comparable_str0.equals(obj1);
    int i3 = concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test038"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str5 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4.clear();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4.clear();
    java.lang.String str8 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4.toString();
    java.lang.String str9 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4);
    boolean b13 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)(byte)-1);
    boolean b14 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str15 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str15);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test039"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals(obj2);
    boolean b4 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test040"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test041"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_str0.clear();
    java.lang.String str2 = concretestack_concretestack_stack_stack_stack_stack_str0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_stack_stack_stack_stack_str0.equals(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test042"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test043"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_stack_stack_concretestack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_str0.toString();
    java.lang.String str2 = concretestack_stack_stack_concretestack_stack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    int i4 = concretestack_concretestack_concretestack_str3.size();
    concretestack_concretestack_concretestack_str3.clear();
    int i6 = concretestack_concretestack_concretestack_str3.size();
    boolean b7 = concretestack_stack_stack_concretestack_stack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test044"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    int i4 = concretestack_concretestack_concretestack_str3.size();
    boolean b5 = concretestack_concretestack_concretestack_str3.isEmpty();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_concretestack_str3.equals(obj6);
    concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_concretestack_concretestack_str3);
    concretestack_concretestack_concretestack_concretestack_str0.clear();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_concretestack_concretestack_concretestack_str0.equals(obj10);
    int i12 = concretestack_concretestack_concretestack_concretestack_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str13 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_concretestack_concretestack_str13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test045"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str4 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3.toString();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3.equals(obj5);
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3.isEmpty();
    boolean b8 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable10 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test046"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> concretestack_stack_concretestack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_stack_str0.size();
    int i2 = concretestack_stack_concretestack_stack_str0.size();
    concretestack_stack_concretestack_stack_str0.clear();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_concretestack_stack_str0.equals(obj4);
    stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>> stack_concretestack_stack_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_str0.push(stack_concretestack_stack_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test047"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_stack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_comparable_str0.clear();
    int i3 = concretestack_concretestack_concretestack_concretestack_stack_stack_comparable_str0.size();
    int i4 = concretestack_concretestack_concretestack_concretestack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test048"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    int i3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.size();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test049"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    boolean b1 = concretestack_stack_stack_stack_charSequence0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_charSequence0.equals(obj2);
    boolean b4 = concretestack_stack_stack_stack_charSequence0.isEmpty();
    concretestack_stack_stack_stack_charSequence0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>> stack_stack_stack_charSequence6 = concretestack_stack_stack_stack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test050"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Object>>> concretestack_stack_concretestack_obj0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>();
    java.lang.String str1 = concretestack_stack_concretestack_obj0.toString();
    boolean b2 = concretestack_stack_concretestack_obj0.isEmpty();
    java.lang.String str3 = concretestack_stack_concretestack_obj0.toString();
    java.lang.String str4 = concretestack_stack_concretestack_obj0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj5 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    concretestack_concretestack_obj5.clear();
    concretestack_concretestack_obj5.clear();
    concretestack_stack_concretestack_obj0.push((stack.Stack<stack.ConcreteStack<java.lang.Object>>)concretestack_concretestack_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test051"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    int i2 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test052"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_stack_str0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_stack_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_stack_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>();
    int i4 = concretestack_concretestack_stack_concretestack_stack_str3.size();
    concretestack_concretestack_concretestack_stack_concretestack_stack_str0.push(concretestack_concretestack_stack_concretestack_stack_str3);
    boolean b6 = concretestack_concretestack_stack_concretestack_stack_str3.isEmpty();
    boolean b7 = concretestack_concretestack_stack_concretestack_stack_str3.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> concretestack_stack_concretestack_stack_str8 = concretestack_concretestack_stack_concretestack_stack_str3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test053"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.push(concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    java.lang.String str6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test054"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>> concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_str0.equals(obj2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_stack_str0.equals(obj4);
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>> concretestack_stack_stack_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>();
    concretestack_stack_stack_str6.clear();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_stack_stack_str6.equals(obj8);
    concretestack_stack_stack_stack_str0.push((stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>)concretestack_stack_stack_str6);
    int i11 = concretestack_stack_stack_str6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test055"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str1);
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str1.clear();

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test056"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test057"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    int i5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test058"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1.equals(obj2);
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str6 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.clear();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.clear();
    java.lang.String str9 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.toString();
    java.lang.String str10 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.clear();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1.push(concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5);
    concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1);
    boolean b14 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str15 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str17 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str15);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test059"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.clear();

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test060"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test061"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj2);
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test062"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str4.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.String str7 = concretestack_concretestack_serializable6.toString();
    boolean b8 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str4.equals((java.lang.Object)concretestack_concretestack_serializable6);
    boolean b9 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test063"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    int i1 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    boolean b2 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test064"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str1);
    boolean b3 = concretestack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_stack_stack_stack_stack_comparable_str0.isEmpty();
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_stack_comparable_str5 = concretestack_stack_stack_stack_stack_stack_comparable_str0.pop();
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_stack_comparable_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_stack_stack_comparable_str0.push(stack_stack_stack_stack_stack_comparable_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_stack_stack_comparable_str5);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test065"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_concretestack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_charSequence0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test066"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    boolean b3 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_stack_stack_concretestack_concretestack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.push(stack_stack_stack_stack_concretestack_concretestack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test067"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str3 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b5 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test068"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>)concretestack_concretestack_concretestack_concretestack_serializable1);
    concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_concretestack_concretestack_serializable7 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test069"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test070"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_stack_comparable_str1.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_stack_comparable_str1.equals(obj3);
    boolean b5 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_stack_comparable_str1);
    int i6 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable7 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test071"); }

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
    int i17 = concretestack_comparable_str1.size();
    concretestack_comparable_str1.clear();
    int i19 = concretestack_comparable_str1.size();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test072"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test073"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_serializable0.equals(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test074"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5 = concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test075"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.toString();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str4 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.get(0);
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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test076"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.size();
    int i3 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.size();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test077"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test078"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_serializable1.equals(obj2);
    int i4 = concretestack_concretestack_stack_serializable1.size();
    concretestack_stack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>)concretestack_concretestack_stack_serializable1);
    java.lang.String str6 = concretestack_concretestack_stack_serializable1.toString();
    concretestack_concretestack_stack_serializable1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test079"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>)concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str2);
    boolean b4 = concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1.isEmpty();
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i7 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6.size();
    java.lang.String str8 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6.toString();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test080"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.push(concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    boolean b8 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str7.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str7);
    int i10 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str7.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test081"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable4 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.get(0);
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test082"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>> concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_str0.equals(obj1);
    concretestack_concretestack_stack_stack_str0.clear();
    int i4 = concretestack_concretestack_stack_stack_str0.size();
    java.lang.String str5 = concretestack_concretestack_stack_stack_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>> concretestack_stack_stack_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>();
    java.lang.String str7 = concretestack_stack_stack_str6.toString();
    java.lang.String str8 = concretestack_stack_stack_str6.toString();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_stack_str6.equals(obj9);
    concretestack_concretestack_stack_stack_str0.push(concretestack_stack_stack_str6);
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>> concretestack_stack_stack_str13 = concretestack_concretestack_stack_stack_str0.get(0);
    java.lang.String str14 = concretestack_stack_stack_str13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test083"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test084"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str3 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test085"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_comparable_str1.clear();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_comparable_str1.equals(obj3);
    int i5 = concretestack_concretestack_concretestack_concretestack_comparable_str1.size();
    boolean b6 = concretestack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str1.clear();
    boolean b8 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_comparable_str1);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.equals(obj9);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable11 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test086"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_str1.equals(obj2);
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_str1.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_stack_concretestack_concretestack_concretestack_concretestack_str1);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj6);
    int i8 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.size();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_str10 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_stack_concretestack_concretestack_concretestack_concretestack_str10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test087"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i3 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.clear();
    int i5 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    java.lang.String str7 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    int i8 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    boolean b9 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test088"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.size();
    int i3 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.size();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1);
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test089"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    java.lang.String str3 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test090"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_comparable_str2.equals(obj3);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b7 = concretestack_comparable_str5.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str2.push(concretestack_comparable_str5);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_comparable_str2.equals(obj9);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str12 = concretestack_concretestack_comparable_str2.get(0);
    boolean b13 = concretestack_concretestack_comparable_str2.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str14 = concretestack_concretestack_comparable_str2.top();
    boolean b15 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_comparable_str2);
    boolean b16 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test091"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    int i3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test092"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_stack_stack_charSequence0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_stack_stack_stack_charSequence0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test093"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test094"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str2 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str2.push("");
    int i5 = concretestack_str2.size();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_str2.equals(obj6);
    boolean b8 = concretestack_str2.isEmpty();
    java.lang.String str9 = concretestack_str2.pop();
    concretestack_str2.clear();
    java.lang.String str11 = concretestack_str2.toString();
    boolean b12 = concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)str11);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_stack_stack_stack_concretestack_concretestack_comparable_str13 = concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test095"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.size();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.clear();
    java.lang.String str3 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test096"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    int i4 = concretestack_concretestack_concretestack_concretestack_concretestack_str3.size();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_concretestack_str3.isEmpty();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_str3);
    java.lang.String str7 = concretestack_concretestack_concretestack_concretestack_concretestack_str3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test097"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    java.lang.String str4 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str3.toString();
    java.lang.String str5 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str3.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str3);
    java.lang.String str7 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj8);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str10 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.pop();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj11);
    java.lang.String str13 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test098"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_comparable_str0.toString();
    concretestack_stack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_stack_comparable_str3.clear();
    concretestack_stack_stack_comparable_str3.clear();
    java.lang.String str6 = concretestack_stack_stack_comparable_str3.toString();
    concretestack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_stack_comparable_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str9 = concretestack_stack_stack_comparable_str3.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test099"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>> concretestack_concretestack_stack_stack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_str1.equals(obj2);
    concretestack_concretestack_stack_stack_str1.clear();
    int i5 = concretestack_concretestack_stack_stack_str1.size();
    concretestack_concretestack_concretestack_stack_stack_str0.push(concretestack_concretestack_stack_stack_str1);
    java.lang.String str7 = concretestack_concretestack_concretestack_stack_stack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>> concretestack_concretestack_stack_stack_str9 = concretestack_concretestack_concretestack_stack_stack_str0.get((int)(short)0);
    java.lang.String str10 = concretestack_concretestack_stack_stack_str9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test100"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test101"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    int i3 = concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2.size();
    boolean b4 = concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2);
    boolean b6 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals(obj7);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str10 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str10);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test102"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test103"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test104"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.equals(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test105"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test106"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_comparable_str6 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test107"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_serializable0.equals(obj1);
    int i3 = concretestack_concretestack_stack_serializable0.size();
    concretestack_concretestack_stack_serializable0.clear();
    concretestack_concretestack_stack_serializable0.clear();
    java.lang.String str6 = concretestack_concretestack_stack_serializable0.toString();
    boolean b7 = concretestack_concretestack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test108"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    int i3 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str2.size();
    concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>)concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str2);
    concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test109"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str2 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1.toString();
    boolean b3 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    boolean b4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1);
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str6 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test110"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str6 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.toString();
    int i7 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.clear();
    java.lang.String str9 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.toString();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str12 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test111"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.String str2 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str1.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str1.equals(obj3);
    concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str1.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str6.equals(obj7);
    concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str1.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str6);
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test112"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.toString();
    int i3 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    int i4 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals(obj5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_stack_comparable_str7 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test113"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> concretestack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_stack_str0.equals(obj1);
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_str0.toString();
    int i4 = concretestack_concretestack_concretestack_stack_str0.size();
    int i5 = concretestack_concretestack_concretestack_stack_str0.size();
    
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
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test114"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_str0.equals(obj1);
    int i3 = concretestack_concretestack_concretestack_concretestack_stack_str0.size();
    concretestack_concretestack_concretestack_concretestack_stack_str0.clear();
    concretestack_concretestack_concretestack_concretestack_stack_str0.clear();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_concretestack_concretestack_stack_str0.equals(obj6);
    concretestack_concretestack_concretestack_concretestack_stack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> concretestack_concretestack_concretestack_stack_str9 = concretestack_concretestack_concretestack_concretestack_stack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test115"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_concretestack_stack_serializable4.equals(obj5);
    java.lang.String str7 = concretestack_stack_concretestack_stack_serializable4.toString();
    boolean b8 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)str7);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj9);
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str12 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test116"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    int i2 = concretestack_concretestack_charSequence1.size();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence3 = new stack.ConcreteStack<java.lang.CharSequence>();
    int i4 = concretestack_charSequence3.size();
    boolean b5 = concretestack_charSequence3.isEmpty();
    java.lang.String str6 = concretestack_charSequence3.toString();
    concretestack_charSequence3.clear();
    concretestack_concretestack_charSequence1.push(concretestack_charSequence3);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_charSequence1.equals(obj9);
    concretestack_concretestack_charSequence1.clear();
    concretestack_concretestack_concretestack_charSequence0.push(concretestack_concretestack_charSequence1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence14 = concretestack_concretestack_charSequence1.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test117"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    int i3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str8 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str8.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str11 = concretestack_comparable_str10.toString();
    concretestack_stack_comparable_str8.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str10);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str13 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_comparable_str13.equals(obj14);
    java.lang.String str16 = concretestack_comparable_str13.toString();
    concretestack_comparable_str13.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str20 = concretestack_comparable_str13.get(0);
    concretestack_stack_comparable_str8.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str13);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str23 = concretestack_stack_comparable_str8.get(0);
    concretestack_stack_stack_comparable_str7.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str8);
    int i25 = concretestack_stack_stack_comparable_str7.size();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str26 = concretestack_stack_stack_comparable_str7.top();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str28 = concretestack_stack_stack_comparable_str7.get(0);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str30 = concretestack_stack_stack_comparable_str7.get(0);
    java.lang.Object obj31 = null;
    boolean b32 = concretestack_stack_stack_comparable_str7.equals(obj31);
    java.lang.String str33 = concretestack_stack_stack_comparable_str7.toString();
    concretestack_stack_stack_stack_comparable_str6.push((stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_stack_comparable_str7);
    boolean b35 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_stack_stack_comparable_str7);
    java.lang.String str36 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5.toString();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5);
    java.lang.Object obj38 = null;
    boolean b39 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5.equals(obj38);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str41 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str20 + "' != '" + ""+ "'", comparable_str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[[[], []]]"+ "'", str33.equals("[[[], []]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test118"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_concretestack_concretestack_comparable_str4);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str7 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.get(0);
    boolean b8 = concretestack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)stack_stack_concretestack_concretestack_comparable_str7);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str10 = concretestack_concretestack_stack_stack_stack_comparable_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test119"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    int i2 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.size();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.clear();
    int i4 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.size();
    java.lang.String str5 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test120"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.size();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable3 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test121"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.equals(obj1);
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test122"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.size();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    int i3 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable5 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test123"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    int i2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.size();
    java.lang.String str6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    boolean b7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    boolean b8 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str10 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str10);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test124"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_stack_stack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>> stack_stack_concretestack_stack_stack_stack_charSequence2 = concretestack_stack_stack_concretestack_stack_stack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test125"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test126"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i2 = concretestack_concretestack_concretestack_stack_comparable_str1.size();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_comparable_str1.toString();
    int i4 = concretestack_concretestack_concretestack_stack_comparable_str1.size();
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_comparable_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test127"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i2 = concretestack_concretestack_concretestack_stack_comparable_str1.size();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_stack_comparable_str1.equals(obj3);
    int i5 = concretestack_concretestack_concretestack_stack_comparable_str1.size();
    boolean b6 = concretestack_concretestack_concretestack_stack_comparable_str1.isEmpty();
    concretestack_concretestack_concretestack_concretestack_stack_comparable_str0.push(concretestack_concretestack_concretestack_stack_comparable_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test128"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i3 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2.size();
    int i4 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2.size();
    boolean b5 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2);
    int i6 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2.size();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2.equals(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test129"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str3.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str5 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str6 = concretestack_comparable_str5.toString();
    concretestack_stack_comparable_str3.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str5);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str8 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_comparable_str8.equals(obj9);
    java.lang.String str11 = concretestack_comparable_str8.toString();
    concretestack_comparable_str8.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str15 = concretestack_comparable_str8.get(0);
    concretestack_stack_comparable_str3.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str8);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str18 = concretestack_stack_comparable_str3.get(0);
    concretestack_stack_stack_comparable_str2.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str3);
    int i20 = concretestack_stack_stack_comparable_str2.size();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str21 = concretestack_stack_stack_comparable_str2.top();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str23 = concretestack_stack_stack_comparable_str2.get(0);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str25 = concretestack_stack_stack_comparable_str2.get(0);
    java.lang.Object obj26 = null;
    boolean b27 = concretestack_stack_stack_comparable_str2.equals(obj26);
    java.lang.String str28 = concretestack_stack_stack_comparable_str2.toString();
    concretestack_stack_stack_stack_comparable_str1.push((stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_stack_comparable_str2);
    boolean b30 = concretestack_stack_stack_stack_comparable_str1.isEmpty();
    concretestack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_stack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str32 = concretestack_concretestack_stack_stack_stack_comparable_str0.top();
    int i33 = concretestack_concretestack_stack_stack_stack_comparable_str0.size();
    boolean b34 = concretestack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str35 = concretestack_concretestack_stack_stack_stack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + ""+ "'", comparable_str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[[[], []]]"+ "'", str28.equals("[[[], []]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_comparable_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_comparable_str35);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test130"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    int i3 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_stack_serializable5.equals(obj6);
    int i8 = concretestack_concretestack_stack_serializable5.size();
    concretestack_stack_concretestack_stack_serializable4.push((stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>)concretestack_concretestack_stack_serializable5);
    boolean b10 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_serializable4);
    java.lang.String str11 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str12 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str12.equals(obj13);
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test131"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    boolean b3 = concretestack_concretestack_stack_concretestack_stack_concretestack_str2.isEmpty();
    concretestack_concretestack_stack_concretestack_stack_concretestack_str2.clear();
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_stack_concretestack_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test132"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test133"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>> concretestack_concretestack_concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_obj0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test134"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_stack_stack_concretestack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> stack_stack_concretestack_stack_str3 = concretestack_stack_stack_concretestack_stack_str0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test135"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_str0.toString();
    concretestack_concretestack_stack_concretestack_str0.clear();
    int i3 = concretestack_concretestack_stack_concretestack_str0.size();
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str6 = concretestack_concretestack_stack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test136"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals(obj1);
    int i3 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    int i4 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    java.lang.String str5 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.toString();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals(obj6);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    int i9 = concretestack_concretestack_stack_concretestack_concretestack_serializable8.size();
    int i10 = concretestack_concretestack_stack_concretestack_concretestack_serializable8.size();
    java.lang.String str11 = concretestack_concretestack_stack_concretestack_concretestack_serializable8.toString();
    int i12 = concretestack_concretestack_stack_concretestack_concretestack_serializable8.size();
    boolean b13 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)i12);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str14 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test137"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_stack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_stack_str3 = concretestack_concretestack_stack_stack_concretestack_stack_stack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test138"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i3 = concretestack_concretestack_concretestack_stack_comparable_str2.size();
    boolean b4 = concretestack_concretestack_concretestack_stack_comparable_str2.isEmpty();
    int i5 = concretestack_concretestack_concretestack_stack_comparable_str2.size();
    concretestack_concretestack_concretestack_concretestack_stack_comparable_str0.push(concretestack_concretestack_concretestack_stack_comparable_str2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_comparable_str2.push(concretestack_concretestack_stack_comparable_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test139"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(stack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test140"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_concretestack_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test141"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_stack_serializable1 = concretestack_stack_stack_stack_concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test142"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str3.clear();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str3.isEmpty();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str3.clear();
    java.lang.String str7 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str3.toString();
    java.lang.String str8 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str3.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str9.clear();
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str9.clear();
    int i12 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str9.size();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str3.push(concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str9);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str15 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str15);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test143"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>> concretestack_stack_concretestack_stack_stack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>();
    concretestack_stack_concretestack_stack_stack_str1.clear();
    int i3 = concretestack_stack_concretestack_stack_stack_str1.size();
    java.lang.String str4 = concretestack_stack_concretestack_stack_stack_str1.toString();
    concretestack_stack_stack_concretestack_stack_stack_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>)concretestack_stack_concretestack_stack_stack_str1);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>> stack_stack_concretestack_stack_stack_str7 = concretestack_stack_stack_concretestack_stack_stack_str0.get(0);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>> stack_stack_concretestack_stack_stack_str9 = concretestack_stack_stack_concretestack_stack_stack_str0.get(0);
    java.lang.String str10 = concretestack_stack_stack_concretestack_stack_stack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_stack_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_stack_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test144"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_comparable_str1);
    java.lang.String str3 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str5 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.get((int)(short)0);
    java.lang.String str6 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.toString();
    int i7 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.size();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.equals(obj8);
    boolean b10 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    java.lang.String str11 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.toString();
    java.lang.String str12 = concretestack_concretestack_stack_concretestack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[[]]"+ "'", str3.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_stack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[[]]"+ "'", str6.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[[]]"+ "'", str11.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[[]]"+ "'", str12.equals("[[]]"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test145"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.equals(obj2);
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test146"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test147"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_concretestack_comparable_str2);
    java.lang.String str4 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str5.size();
    java.lang.String str7 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test148"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0.equals(obj2);
    concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test149"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    stack.ConcreteStack<java.lang.String> concretestack_str1 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str1.push("");
    int i4 = concretestack_str1.size();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_str1.equals(obj5);
    boolean b7 = concretestack_str1.isEmpty();
    java.lang.String str8 = concretestack_str1.pop();
    boolean b9 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)str8);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str10 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test150"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_stack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_str2);
    int i4 = concretestack_stack_concretestack_concretestack_stack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> stack_concretestack_concretestack_stack_str6 = concretestack_stack_concretestack_concretestack_stack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test151"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str1 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test152"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test153"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test154"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    int i1 = concretestack_concretestack_charSequence0.size();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence2 = new stack.ConcreteStack<java.lang.CharSequence>();
    int i3 = concretestack_charSequence2.size();
    boolean b4 = concretestack_charSequence2.isEmpty();
    java.lang.String str5 = concretestack_charSequence2.toString();
    concretestack_charSequence2.clear();
    concretestack_concretestack_charSequence0.push(concretestack_charSequence2);
    boolean b8 = concretestack_concretestack_charSequence0.isEmpty();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence9 = concretestack_concretestack_charSequence0.pop();
    int i10 = concretestack_concretestack_charSequence0.size();
    int i11 = concretestack_concretestack_charSequence0.size();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_concretestack_charSequence0.equals(obj12);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence14 = concretestack_concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_charSequence9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test155"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals(obj2);
    concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_stack_concretestack_stack_stack_stack_comparable_str5 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test156"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    int i3 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test157"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.equals(obj2);
    java.lang.String str4 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.toString();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.equals(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test158"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_comparable_str0.clear();

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test159"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj3);
    boolean b5 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str7 = concretestack_stack_concretestack_concretestack_comparable_str6.toString();
    int i8 = concretestack_stack_concretestack_concretestack_comparable_str6.size();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_concretestack_concretestack_comparable_str6.equals(obj9);
    int i11 = concretestack_stack_concretestack_concretestack_comparable_str6.size();
    int i12 = concretestack_stack_concretestack_concretestack_comparable_str6.size();
    boolean b13 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test160"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str1.equals(obj2);
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str1.isEmpty();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str1);
    java.lang.String str6 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test161"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3.toString();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3.clear();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable3);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable7 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable2.top();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.push(stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable7);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test162"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_stack_stack_stack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    int i2 = concretestack_stack_stack_stack_stack_stack_concretestack_stack_serializable1.size();
    java.lang.String str3 = concretestack_stack_stack_stack_stack_stack_concretestack_stack_serializable1.toString();
    concretestack_stack_stack_stack_stack_stack_stack_concretestack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>)concretestack_stack_stack_stack_stack_stack_concretestack_stack_serializable1);
    boolean b5 = concretestack_stack_stack_stack_stack_stack_concretestack_stack_serializable1.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str6.clear();
    boolean b8 = concretestack_stack_stack_stack_stack_stack_concretestack_stack_serializable1.equals((java.lang.Object)concretestack_concretestack_comparable_str6);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_serializable9 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    int i10 = concretestack_stack_stack_stack_stack_concretestack_stack_serializable9.size();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_stack_stack_stack_stack_concretestack_stack_serializable9.equals(obj11);
    concretestack_stack_stack_stack_stack_stack_concretestack_stack_serializable1.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>)concretestack_stack_stack_stack_stack_concretestack_stack_serializable9);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> stack_stack_stack_stack_concretestack_stack_serializable14 = concretestack_stack_stack_stack_stack_concretestack_stack_serializable9.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test163"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj1);
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable4 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test164"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals(obj1);
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test165"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_concretestack_concretestack_comparable_str4);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str7 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.get(0);
    boolean b8 = concretestack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)stack_stack_concretestack_concretestack_comparable_str7);
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence9 = new stack.ConcreteStack<java.lang.CharSequence>();
    concretestack_charSequence9.push((java.lang.CharSequence)"[[]]");
    boolean b12 = concretestack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_charSequence9);
    int i13 = concretestack_concretestack_stack_stack_stack_comparable_str0.size();
    int i14 = concretestack_concretestack_stack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test166"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test167"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.isEmpty();
    int i2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.size();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str0.push(concretestack_concretestack_concretestack_concretestack_stack_stack_stack_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test168"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>> concretestack_stack_concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_stack_stack_charSequence0.size();
    java.lang.String str2 = concretestack_stack_concretestack_stack_stack_stack_charSequence0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_stack_stack_charSequence0.equals(obj3);
    concretestack_stack_concretestack_stack_stack_stack_charSequence0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test169"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str3 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test170"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_stack_str0.toString();
    concretestack_concretestack_concretestack_stack_stack_stack_str0.clear();
    int i3 = concretestack_concretestack_concretestack_stack_stack_stack_str0.size();
    concretestack_concretestack_concretestack_stack_stack_stack_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_stack_stack_stack_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>();
    boolean b6 = concretestack_concretestack_stack_stack_stack_str5.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_stack_str0.push(concretestack_concretestack_stack_stack_stack_str5);
    int i8 = concretestack_concretestack_concretestack_stack_stack_stack_str0.size();
    boolean b9 = concretestack_concretestack_concretestack_stack_stack_stack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test171"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_comparable_str0.isEmpty();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_comparable_str0.push(stack_stack_concretestack_stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test172"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.isEmpty();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test173"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable1.equals(obj2);
    java.lang.String str4 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable1.toString();
    concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.push(concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i7 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable6.size();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable1.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>)concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable6);
    java.lang.String str9 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test174"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str3 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2.toString();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2.equals(obj4);
    java.lang.String str6 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2.toString();
    boolean b7 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)str6);
    java.lang.String str8 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.toString();
    int i9 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test175"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>> concretestack_stack_concretestack_stack_stack_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_str2);
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str5 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test176"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_stack_concretestack_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_stack_concretestack_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_stack_concretestack_str0.push(concretestack_stack_concretestack_stack_concretestack_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test177"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    boolean b2 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    java.lang.String str3 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test178"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str2.isEmpty();
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str2.toString();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_concretestack_concretestack_comparable_str2);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test179"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    int i2 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.size();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    int i4 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_comparable_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(stack_concretestack_stack_stack_concretestack_concretestack_comparable_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test180"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test181"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str1 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test182"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_comparable_str1.equals(obj2);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str4 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b6 = concretestack_comparable_str4.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str1.push(concretestack_comparable_str4);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_comparable_str1.equals(obj8);
    boolean b10 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_comparable_str1);
    java.lang.String str11 = concretestack_concretestack_concretestack_serializable0.toString();
    concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.String str13 = concretestack_concretestack_concretestack_serializable0.toString();
    concretestack_concretestack_concretestack_serializable0.clear();
    int i15 = concretestack_concretestack_concretestack_serializable0.size();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_concretestack_serializable0.equals(obj16);
    java.lang.String str18 = concretestack_concretestack_concretestack_serializable0.toString();
    boolean b19 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable20 = concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test183"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test184"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_stack_concretestack_concretestack_comparable_str4.equals(obj5);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_concretestack_comparable_str4.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_concretestack_concretestack_comparable_str7);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str10 = concretestack_stack_stack_concretestack_concretestack_comparable_str4.get(0);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str11 = concretestack_stack_stack_concretestack_concretestack_comparable_str4.top();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_stack_stack_concretestack_concretestack_comparable_str4.equals(obj12);
    concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_concretestack_comparable_str4);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str16 = concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.get(0);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str17 = concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str18 = concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_concretestack_comparable_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_concretestack_comparable_str17);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test185"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>();
    boolean b3 = concretestack_concretestack_stack_str2.isEmpty();
    concretestack_concretestack_stack_str2.clear();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_str2);
    int i6 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    int i8 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b10 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str11.clear();
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str11.equals(obj13);
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test186"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0.size();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0.toString();
    int i3 = concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0.size();
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    java.lang.String str6 = concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test187"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    boolean b4 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test188"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.size();
    concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    int i4 = concretestack_concretestack_concretestack_stack_stack_comparable_str3.size();
    java.lang.String str5 = concretestack_concretestack_concretestack_stack_stack_comparable_str3.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i7 = concretestack_concretestack_stack_stack_comparable_str6.size();
    concretestack_concretestack_stack_stack_comparable_str6.clear();
    boolean b9 = concretestack_concretestack_stack_stack_comparable_str6.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_comparable_str3.push(concretestack_concretestack_stack_stack_comparable_str6);
    java.lang.String str11 = concretestack_concretestack_concretestack_stack_stack_comparable_str3.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_stack_comparable_str12 = concretestack_concretestack_concretestack_stack_stack_comparable_str3.top();
    java.lang.String str13 = concretestack_concretestack_concretestack_stack_stack_comparable_str3.toString();
    concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_stack_comparable_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[[]]"+ "'", str11.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[[]]"+ "'", str13.equals("[[]]"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test189"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test190"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str2 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_comparable_str0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test191"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test192"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test193"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test194"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b4 = concretestack_concretestack_serializable3.isEmpty();
    boolean b5 = concretestack_concretestack_serializable3.isEmpty();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_serializable3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable7 = concretestack_concretestack_serializable3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test195"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    boolean b3 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test196"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable3 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.top();
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
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test197"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.size();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i4 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str3.size();
    int i5 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str3.size();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str3.clear();
    int i7 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str3.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_comparable_str8 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i9 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str8.size();
    java.lang.String str10 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str8.toString();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str3.push(concretestack_stack_concretestack_stack_concretestack_stack_comparable_str8);
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_stack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test198"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_stack_stack_str0.toString();
    int i2 = concretestack_concretestack_stack_stack_stack_stack_str0.size();
    java.lang.String str3 = concretestack_concretestack_stack_stack_stack_stack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test199"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.get((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test200"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_stack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test201"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.size();
    java.lang.String str2 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    java.lang.String str3 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test202"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_concretestack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>> concretestack_stack_stack_charSequence1 = concretestack_concretestack_stack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test203"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    int i3 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    int i4 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test204"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str2 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test205"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    int i4 = concretestack_concretestack_concretestack_str3.size();
    boolean b5 = concretestack_concretestack_concretestack_str3.isEmpty();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_concretestack_str3.equals(obj6);
    concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_concretestack_concretestack_str3);
    java.lang.String str9 = concretestack_concretestack_concretestack_str3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test206"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test207"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str3.toString();
    java.lang.String str5 = concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str3.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_comparable_str6.isEmpty();
    int i8 = concretestack_concretestack_stack_stack_concretestack_comparable_str6.size();
    concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str3.push(concretestack_concretestack_stack_stack_concretestack_comparable_str6);
    concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_stack_stack_concretestack_comparable_str6);
    boolean b11 = concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test208"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.toString();
    int i3 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.size();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.equals(obj4);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_stack_concretestack_stack_comparable_str6 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.pop();
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
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test209"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    int i4 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str3.size();
    concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str3);
    boolean b6 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str7 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.pop();
    java.lang.String str8 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test210"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>> concretestack_stack_stack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_concretestack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> stack_stack_concretestack_concretestack_charSequence3 = concretestack_stack_stack_concretestack_concretestack_charSequence0.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test211"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_comparable_str5.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_concretestack_comparable_str5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str9 = concretestack_concretestack_concretestack_concretestack_comparable_str5.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test212"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test213"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i5 = concretestack_stack_concretestack_concretestack_comparable_str4.size();
    concretestack_stack_concretestack_concretestack_comparable_str4.clear();
    java.lang.String str7 = concretestack_stack_concretestack_concretestack_comparable_str4.toString();
    java.lang.String str8 = concretestack_stack_concretestack_concretestack_comparable_str4.toString();
    boolean b9 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str4);
    boolean b10 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test214"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.size();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str3 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.top();
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
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test215"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test216"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test217"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str2.isEmpty();
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str2.isEmpty();
    concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_comparable_str2);
    boolean b6 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    boolean b7 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str9 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str10 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i12 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str11.size();
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str11.equals(obj13);
    boolean b15 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test218"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.equals(obj1);
    int i3 = concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.size();
    int i4 = concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.size();
    int i5 = concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.size();
    boolean b6 = concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_serializable7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b8 = concretestack_stack_concretestack_stack_concretestack_stack_serializable7.isEmpty();
    int i9 = concretestack_stack_concretestack_stack_concretestack_stack_serializable7.size();
    concretestack_stack_concretestack_stack_concretestack_stack_serializable7.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_stack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>)concretestack_stack_concretestack_stack_concretestack_stack_serializable7);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_stack_concretestack_stack_concretestack_stack_serializable7.equals(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test219"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_str0.equals(obj1);
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_str0.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_str0.clear();
    int i5 = concretestack_concretestack_concretestack_stack_stack_str0.size();
    concretestack_concretestack_concretestack_stack_stack_str0.clear();
    boolean b7 = concretestack_concretestack_concretestack_stack_stack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test220"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test221"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    int i1 = concretestack_concretestack_obj0.size();
    boolean b3 = concretestack_concretestack_obj0.equals((java.lang.Object)100.0f);
    stack.ConcreteStack<java.lang.Object> concretestack_obj4 = new stack.ConcreteStack<java.lang.Object>();
    boolean b5 = concretestack_obj4.isEmpty();
    int i6 = concretestack_obj4.size();
    concretestack_concretestack_obj0.push(concretestack_obj4);
    stack.ConcreteStack<java.lang.Object> concretestack_obj9 = concretestack_concretestack_obj0.get(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj10 = concretestack_obj9.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_obj9);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test222"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_stack_stack_stack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test223"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str2 = concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test224"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str1.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str1.isEmpty();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str1.equals(obj4);
    int i6 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str1.size();
    boolean b7 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str1);
    int i8 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0.size();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj9);
    boolean b11 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test225"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.equals(obj2);
    java.lang.String str4 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_stack_concretestack_concretestack_serializable5.clear();
    int i7 = concretestack_stack_concretestack_concretestack_serializable5.size();
    boolean b8 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)i7);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9.clear();
    java.lang.String str11 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9.toString();
    boolean b12 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str14 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str15 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str14.toString();
    int i16 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str14.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str14.clear();
    java.lang.String str18 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str14.toString();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9.push(concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str14);
    boolean b20 = concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test226"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>>> stack_stack_stack_stack_stack_concretestack_concretestack_stack_str1 = concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_stack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test227"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i3 = concretestack_concretestack_stack_stack_comparable_str2.size();
    concretestack_concretestack_stack_stack_comparable_str2.clear();
    boolean b5 = concretestack_concretestack_stack_stack_comparable_str2.isEmpty();
    concretestack_stack_concretestack_stack_stack_comparable_str1.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>)concretestack_concretestack_stack_stack_comparable_str2);
    concretestack_concretestack_stack_stack_comparable_str2.clear();
    concretestack_concretestack_stack_stack_comparable_str2.clear();
    boolean b9 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_stack_comparable_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_comparable_str10 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test228"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_stack_serializable0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_stack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>)concretestack_stack_stack_concretestack_concretestack_stack_serializable3);
    concretestack_stack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test229"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_stack_concretestack_stack_serializable3.equals(obj4);
    concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable2.push(concretestack_stack_stack_stack_concretestack_stack_serializable3);
    int i7 = concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable2.size();
    java.lang.String str8 = concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable2.toString();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_stack_serializable11 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_stack_stack_stack_concretestack_stack_serializable11.equals(obj12);
    concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable10.push(concretestack_stack_stack_stack_concretestack_stack_serializable11);
    concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable2.push(concretestack_stack_stack_stack_concretestack_stack_serializable11);
    int i16 = concretestack_stack_stack_stack_concretestack_stack_serializable11.size();
    int i17 = concretestack_stack_stack_stack_concretestack_stack_serializable11.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[[]]"+ "'", str8.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test230"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i3 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2.size();
    int i4 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2.size();
    boolean b5 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_stack_concretestack_stack_comparable_str2);
    java.lang.String str6 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.push(stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test231"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    boolean b2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str4 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.get(0);
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test232"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable4 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_serializable1.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test233"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    int i2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    java.lang.String str3 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    int i4 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test234"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>> stack_stack_concretestack_stack_stack_stack_str1 = concretestack_stack_stack_concretestack_stack_stack_stack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test235"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3);
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
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test236"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    concretestack_stack_concretestack_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b4 = concretestack_concretestack_str2.equals((java.lang.Object)(short)100);
    stack.ConcreteStack<java.lang.String> concretestack_str5 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str5.push("");
    concretestack_str5.clear();
    int i9 = concretestack_str5.size();
    concretestack_concretestack_str2.push(concretestack_str5);
    int i11 = concretestack_concretestack_str2.size();
    concretestack_stack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<java.lang.String>>)concretestack_concretestack_str2);
    int i13 = concretestack_stack_concretestack_str0.size();
    boolean b14 = concretestack_stack_concretestack_str0.isEmpty();
    concretestack_stack_concretestack_str0.clear();
    boolean b16 = concretestack_stack_concretestack_str0.isEmpty();
    java.lang.String str17 = concretestack_stack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test237"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.size();
    boolean b2 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test238"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str1);
    boolean b3 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test239"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.size();
    int i2 = concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test240"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_str0.equals(obj1);
    int i3 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test241"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_stack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_stack_str2.equals(obj3);
    int i5 = concretestack_concretestack_concretestack_concretestack_stack_str2.size();
    concretestack_concretestack_concretestack_concretestack_stack_str2.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_str0.push(concretestack_concretestack_concretestack_concretestack_stack_str2);
    int i8 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_str0.size();
    java.lang.String str9 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_str0.toString();
    java.lang.String str10 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_str0.toString();
    java.lang.String str11 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_stack_str12 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_str0.top();
    int i13 = concretestack_concretestack_concretestack_concretestack_stack_str12.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> concretestack_concretestack_concretestack_stack_str14 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>();
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_concretestack_concretestack_stack_str14.equals(obj15);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str17 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>();
    concretestack_concretestack_concretestack_stack_str14.push(concretestack_concretestack_stack_str17);
    int i19 = concretestack_concretestack_concretestack_stack_str14.size();
    int i20 = concretestack_concretestack_concretestack_stack_str14.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str21 = concretestack_concretestack_concretestack_stack_str14.pop();
    concretestack_concretestack_concretestack_concretestack_stack_str12.push(concretestack_concretestack_concretestack_stack_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[[]]"+ "'", str11.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_concretestack_stack_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_str21);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test242"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.size();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.toString();
    int i3 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.size();
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.toString();
    
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
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test243"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.isEmpty();
    int i2 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.size();
    int i3 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.size();
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.toString();
    
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
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test244"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.equals(obj2);
    int i4 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.size();
    concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test245"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    int i2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str3.clear();
    boolean b6 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str3);
    boolean b7 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test246"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test247"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str2 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test248"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_str0.equals(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test249"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    int i3 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.size();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test250"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test251"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test252"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    int i2 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    int i3 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test253"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.toString();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test254"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.clear();
    java.lang.String str3 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.toString();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1);
    java.lang.String str5 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.toString();
    boolean b6 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test255"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.toString();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test256"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.toString();
    int i5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.size();
    java.lang.String str6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test257"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test258"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test259"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_stack_comparable_str2.push(concretestack_stack_concretestack_stack_comparable_str3);
    java.lang.String str5 = concretestack_concretestack_stack_concretestack_stack_comparable_str2.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str7 = concretestack_concretestack_stack_concretestack_stack_comparable_str2.get((int)(short)0);
    java.lang.String str8 = concretestack_concretestack_stack_concretestack_stack_comparable_str2.toString();
    int i9 = concretestack_concretestack_stack_concretestack_stack_comparable_str2.size();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_concretestack_stack_concretestack_stack_comparable_str2.equals(obj10);
    concretestack_concretestack_stack_concretestack_stack_comparable_str2.clear();
    concretestack_concretestack_concretestack_stack_concretestack_stack_comparable_str0.push(concretestack_concretestack_stack_concretestack_stack_comparable_str2);
    int i14 = concretestack_concretestack_stack_concretestack_stack_comparable_str2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[[]]"+ "'", str5.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_stack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[[]]"+ "'", str8.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test260"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test261"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_str0.isEmpty();
    concretestack_stack_concretestack_stack_concretestack_str0.clear();
    concretestack_stack_concretestack_stack_concretestack_str0.clear();
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test262"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>>();
    concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_stack_str0.clear();
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_stack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test263"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test264"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_charSequence0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_stack_stack_charSequence0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test265"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test266"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test267"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test268"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str1.clear();
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str1.isEmpty();
    boolean b4 = concretestack_stack_stack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_stack_stack_concretestack_comparable_str6 = concretestack_stack_stack_stack_stack_concretestack_comparable_str0.get(0);
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
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test269"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>> concretestack_concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    boolean b2 = concretestack_concretestack_stack_stack_stack_charSequence0.equals((java.lang.Object)concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_stack_stack_stack_charSequence0.equals(obj3);
    java.lang.String str5 = concretestack_concretestack_stack_stack_stack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_stack_stack_charSequence6 = concretestack_concretestack_stack_stack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test270"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.toString();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test271"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_stack_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_stack_stack_str0.equals(obj2);
    concretestack_concretestack_concretestack_stack_stack_stack_stack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test272"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>> concretestack_concretestack_stack_stack_stack_charSequence1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>();
    boolean b2 = concretestack_concretestack_stack_stack_stack_charSequence1.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_stack_charSequence0.push(concretestack_concretestack_stack_stack_stack_charSequence1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test273"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_str1.clear();
    java.lang.String str3 = concretestack_concretestack_stack_stack_stack_stack_concretestack_str1.toString();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_str1.clear();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_str0.push(concretestack_concretestack_stack_stack_stack_stack_concretestack_str1);
    int i6 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_str0.size();
    java.lang.String str7 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_str9 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_str0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_stack_stack_concretestack_str9);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test274"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test275"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_str0.toString();
    int i2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_str3 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_str0.pop();
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
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test276"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_str0.toString();
    int i3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test277"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals(obj2);
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str5 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b7 = concretestack_concretestack_str5.equals((java.lang.Object)(short)100);
    stack.ConcreteStack<java.lang.String> concretestack_str8 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str8.push("");
    concretestack_str8.clear();
    int i12 = concretestack_str8.size();
    concretestack_concretestack_str5.push(concretestack_str8);
    stack.ConcreteStack<java.lang.String> concretestack_str15 = concretestack_concretestack_str5.get(0);
    java.lang.String str16 = concretestack_str15.toString();
    boolean b17 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)str16);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str18 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test278"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    boolean b5 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str6 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_stack_concretestack_concretestack_concretestack_comparable_str7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_stack_concretestack_concretestack_concretestack_comparable_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[[]]"+ "'", str6.equals("[[]]"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test279"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.size();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test280"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test281"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test282"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test283"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test284"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_stack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_stack_str3 = concretestack_concretestack_stack_stack_concretestack_stack_stack_str0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test285"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_stack_stack_stack_comparable_str0.clear();
    concretestack_stack_stack_stack_stack_comparable_str0.clear();
    int i3 = concretestack_stack_stack_stack_stack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i5 = concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_comparable_str4.size();
    boolean b6 = concretestack_stack_stack_stack_stack_comparable_str0.equals((java.lang.Object)i5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> stack_stack_stack_stack_comparable_str7 = concretestack_stack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test286"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    int i2 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.size();
    int i3 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_concretestack_stack_concretestack_serializable4.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str7 = concretestack_stack_concretestack_serializable6.toString();
    int i8 = concretestack_stack_concretestack_serializable6.size();
    java.lang.String str9 = concretestack_stack_concretestack_serializable6.toString();
    concretestack_stack_concretestack_serializable6.clear();
    concretestack_concretestack_stack_concretestack_serializable4.push(concretestack_stack_concretestack_serializable6);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_concretestack_stack_concretestack_serializable4.equals(obj12);
    concretestack_concretestack_stack_concretestack_serializable4.clear();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable4);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable17 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.get((int)'a');
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test287"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test288"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1.equals(obj2);
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str6 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.clear();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.clear();
    java.lang.String str9 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.toString();
    java.lang.String str10 = concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5.clear();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1.push(concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str5);
    concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str14 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str16 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str14.get(0);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_comparable_str17 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_stack_stack_stack_concretestack_concretestack_comparable_str17.clear();
    boolean b19 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str17.isEmpty();
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str17.equals(obj20);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str22 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.Object obj23 = null;
    boolean b24 = concretestack_stack_stack_concretestack_concretestack_comparable_str22.equals(obj23);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str25 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_concretestack_comparable_str22.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_concretestack_concretestack_comparable_str25);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_concretestack_concretestack_comparable_str28 = concretestack_stack_stack_concretestack_concretestack_comparable_str22.get(0);
    concretestack_stack_stack_stack_concretestack_concretestack_comparable_str17.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_concretestack_concretestack_comparable_str22);
    java.lang.Object obj30 = null;
    boolean b31 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str17.equals(obj30);
    concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str16.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_stack_stack_concretestack_concretestack_comparable_str17);
    int i33 = concretestack_stack_stack_stack_concretestack_concretestack_comparable_str17.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_comparable_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test289"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1);
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1.clear();

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test290"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    int i3 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str2.size();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.push(concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.push(concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test291"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_comparable_str1 = concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test292"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    java.lang.String str6 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str7 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test293"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_comparable_str0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    boolean b5 = concretestack_concretestack_stack_comparable_str0.equals((java.lang.Object)b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test294"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>>>();

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test295"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_str0.push(concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test296"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str1.toString();
    int i3 = concretestack_stack_stack_concretestack_comparable_str1.size();
    int i4 = concretestack_stack_stack_concretestack_comparable_str1.size();
    int i5 = concretestack_stack_stack_concretestack_comparable_str1.size();
    int i6 = concretestack_stack_stack_concretestack_comparable_str1.size();
    int i7 = concretestack_stack_stack_concretestack_comparable_str1.size();
    concretestack_stack_stack_concretestack_comparable_str1.clear();
    boolean b9 = concretestack_stack_stack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_stack_concretestack_comparable_str1);
    int i10 = concretestack_stack_stack_concretestack_serializable0.size();
    int i11 = concretestack_stack_stack_concretestack_serializable0.size();
    int i12 = concretestack_stack_stack_concretestack_serializable0.size();
    concretestack_stack_stack_concretestack_serializable0.clear();
    java.lang.String str14 = concretestack_stack_stack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable15 = concretestack_stack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test297"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.size();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.clear();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str7 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
    java.lang.String str8 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[[]]"+ "'", str8.equals("[[]]"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test298"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.equals(obj1);
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test299"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test300"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str1);
    int i3 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.size();
    java.lang.String str4 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.toString();
    java.lang.String str5 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.toString();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.equals(obj6);
    boolean b8 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str9 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[[]]"+ "'", str4.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[[]]"+ "'", str5.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str9);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test301"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj2);
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj5);
    int i7 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str10 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable9.toString();
    concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable8.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable9);
    concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test302"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_stack_concretestack_stack_comparable_str4 = concretestack_stack_concretestack_stack_concretestack_stack_comparable_str0.get((int)'#');
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
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test303"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_stack_stack_stack_str0.equals(obj1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_stack_stack_stack_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>();
    java.lang.String str4 = concretestack_concretestack_stack_stack_stack_str3.toString();
    boolean b5 = concretestack_concretestack_stack_stack_stack_str3.isEmpty();
    int i6 = concretestack_concretestack_stack_stack_stack_str3.size();
    boolean b7 = concretestack_concretestack_stack_stack_stack_str3.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>> concretestack_stack_stack_stack_str8 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>();
    java.lang.String str9 = concretestack_stack_stack_stack_str8.toString();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_stack_stack_stack_str8.equals(obj10);
    int i12 = concretestack_stack_stack_stack_str8.size();
    concretestack_concretestack_stack_stack_stack_str3.push(concretestack_stack_stack_stack_str8);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_stack_stack_stack_str3.equals(obj14);
    concretestack_stack_concretestack_stack_stack_stack_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>)concretestack_concretestack_stack_stack_stack_str3);
    boolean b17 = concretestack_concretestack_stack_stack_stack_str3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test304"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test305"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_stack_str0.clear();
    concretestack_stack_concretestack_concretestack_concretestack_stack_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b4 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.isEmpty();
    int i5 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.size();
    boolean b6 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.isEmpty();
    int i7 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.size();
    boolean b8 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.isEmpty();
    boolean b9 = concretestack_stack_concretestack_concretestack_concretestack_stack_str0.equals((java.lang.Object)b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test306"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test307"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> stack_concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable2 = concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test308"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_concretestack_comparable_str0.push(stack_concretestack_stack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test309"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_charSequence0.clear();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_charSequence0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>>> concretestack_concretestack_stack_stack_stack_stack_charSequence3 = concretestack_concretestack_concretestack_stack_stack_stack_stack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test310"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_comparable_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_comparable_str0.equals(obj2);
    boolean b4 = concretestack_concretestack_concretestack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_stack_comparable_str0.clear();
    java.lang.String str6 = concretestack_concretestack_concretestack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test311"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_str0.equals(obj2);
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test312"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    int i3 = concretestack_concretestack_stack_stack_comparable_str2.size();
    concretestack_concretestack_stack_stack_comparable_str2.clear();
    boolean b5 = concretestack_concretestack_stack_stack_comparable_str2.isEmpty();
    concretestack_concretestack_stack_stack_comparable_str2.clear();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_stack_stack_comparable_str2.equals(obj7);
    concretestack_stack_concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>)concretestack_concretestack_stack_stack_comparable_str2);
    int i10 = concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    boolean b11 = concretestack_stack_concretestack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test313"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str2 = concretestack_stack_stack_concretestack_comparable_str1.toString();
    int i3 = concretestack_stack_stack_concretestack_comparable_str1.size();
    int i4 = concretestack_stack_stack_concretestack_comparable_str1.size();
    int i5 = concretestack_stack_stack_concretestack_comparable_str1.size();
    int i6 = concretestack_stack_stack_concretestack_comparable_str1.size();
    int i7 = concretestack_stack_stack_concretestack_comparable_str1.size();
    concretestack_stack_stack_concretestack_comparable_str1.clear();
    boolean b9 = concretestack_stack_stack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_stack_concretestack_comparable_str1);
    int i10 = concretestack_stack_stack_concretestack_serializable0.size();
    int i11 = concretestack_stack_stack_concretestack_serializable0.size();
    boolean b12 = concretestack_stack_stack_concretestack_serializable0.isEmpty();
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_stack_stack_concretestack_serializable0.equals(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test314"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_concretestack_comparable_str2);
    java.lang.String str4 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str7 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test315"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test316"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_serializable0.size();
    concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_serializable0.clear();
    boolean b3 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_serializable0.isEmpty();
    concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_serializable0.clear();
    concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test317"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_str3 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test318"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals(obj5);
    int i7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test319"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> concretestack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_stack_str0.equals(obj1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>();
    concretestack_concretestack_concretestack_stack_str0.push(concretestack_concretestack_stack_str3);
    boolean b5 = concretestack_concretestack_concretestack_stack_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str6 = concretestack_concretestack_concretestack_stack_str0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_str0.push(concretestack_concretestack_stack_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_str6);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test320"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>> concretestack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_stack_str0.equals(obj1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>();
    concretestack_concretestack_concretestack_stack_str0.push(concretestack_concretestack_stack_str3);
    int i5 = concretestack_concretestack_stack_str3.size();
    stack.ConcreteStack<stack.Stack<java.lang.String>> concretestack_stack_str6 = new stack.ConcreteStack<stack.Stack<java.lang.String>>();
    concretestack_stack_str6.clear();
    concretestack_stack_str6.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str9 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str9.clear();
    int i11 = concretestack_str9.size();
    concretestack_stack_str6.push((stack.Stack<java.lang.String>)concretestack_str9);
    boolean b13 = concretestack_stack_str6.isEmpty();
    stack.Stack<java.lang.String> stack_str14 = concretestack_stack_str6.top();
    concretestack_concretestack_stack_str3.push(concretestack_stack_str6);
    java.lang.String str16 = concretestack_concretestack_stack_str3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[[[]]]"+ "'", str16.equals("[[[]]]"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test321"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2.clear();
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_str5.equals(obj6);
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2.push(concretestack_stack_concretestack_concretestack_concretestack_concretestack_str5);
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_str10 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_concretestack_str10);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test322"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_serializable3 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test323"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_concretestack_str0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test324"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj5);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_str7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_str7.clear();
    boolean b9 = concretestack_stack_concretestack_concretestack_stack_stack_str7.isEmpty();
    boolean b10 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_stack_stack_str7);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str12 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test325"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    int i1 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    boolean b3 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test326"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_stack_stack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test327"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    boolean b1 = concretestack_stack_stack_stack_charSequence0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_charSequence0.equals(obj2);
    boolean b4 = concretestack_stack_stack_stack_charSequence0.isEmpty();
    boolean b5 = concretestack_stack_stack_stack_charSequence0.isEmpty();
    concretestack_stack_stack_stack_charSequence0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test328"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.toString();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.toString();
    int i4 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.size();
    java.lang.String str5 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.toString();
    boolean b6 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test329"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_concretestack_stack_serializable2.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_stack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_stack_concretestack_stack_serializable4.equals(obj5);
    java.lang.String str7 = concretestack_concretestack_stack_concretestack_stack_serializable4.toString();
    boolean b8 = concretestack_concretestack_stack_concretestack_stack_serializable4.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_stack_serializable2.push(concretestack_concretestack_stack_concretestack_stack_serializable4);
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_stack_serializable2);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_concretestack_stack_concretestack_stack_serializable11 = concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.top();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_concretestack_stack_serializable11);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test330"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.equals(obj3);
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    boolean b6 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    java.lang.String str7 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test331"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.toString();
    int i3 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    int i4 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    int i5 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    java.lang.String str6 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_stack_comparable_str7 = concretestack_concretestack_stack_concretestack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test332"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test333"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.toString();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_str6 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test334"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    int i2 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    int i3 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test335"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_concretestack_stack_stack_str0.equals(obj1);
    java.lang.String str3 = concretestack_concretestack_stack_concretestack_stack_stack_str0.toString();
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_stack_stack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test336"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals(obj1);
    int i3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str8 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str8.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str11 = concretestack_comparable_str10.toString();
    concretestack_stack_comparable_str8.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str10);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str13 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_comparable_str13.equals(obj14);
    java.lang.String str16 = concretestack_comparable_str13.toString();
    concretestack_comparable_str13.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str20 = concretestack_comparable_str13.get(0);
    concretestack_stack_comparable_str8.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str13);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str23 = concretestack_stack_comparable_str8.get(0);
    concretestack_stack_stack_comparable_str7.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str8);
    int i25 = concretestack_stack_stack_comparable_str7.size();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str26 = concretestack_stack_stack_comparable_str7.top();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str28 = concretestack_stack_stack_comparable_str7.get(0);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str30 = concretestack_stack_stack_comparable_str7.get(0);
    java.lang.Object obj31 = null;
    boolean b32 = concretestack_stack_stack_comparable_str7.equals(obj31);
    java.lang.String str33 = concretestack_stack_stack_comparable_str7.toString();
    concretestack_stack_stack_stack_comparable_str6.push((stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_stack_comparable_str7);
    boolean b35 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_stack_stack_comparable_str7);
    java.lang.String str36 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5.toString();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5);
    java.lang.Object obj38 = null;
    boolean b39 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5.equals(obj38);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str40 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str5.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str20 + "' != '" + ""+ "'", comparable_str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[[[], []]]"+ "'", str33.equals("[[[], []]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test337"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    int i4 = concretestack_concretestack_stack_stack_concretestack_stack_serializable3.size();
    concretestack_concretestack_concretestack_stack_stack_concretestack_stack_serializable2.push(concretestack_concretestack_stack_stack_concretestack_stack_serializable3);
    boolean b6 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_stack_concretestack_stack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str7 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test338"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1.clear();
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1.isEmpty();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>)concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str1);
    boolean b5 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    int i6 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test339"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>>> concretestack_stack_stack_concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>>>();
    concretestack_stack_stack_concretestack_stack_charSequence0.clear();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>> stack_stack_concretestack_stack_charSequence2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_charSequence0.push(stack_stack_concretestack_stack_charSequence2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test340"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.size();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test341"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    concretestack_str0.push("");
    java.lang.String str4 = concretestack_str0.get(0);
    int i5 = concretestack_str0.size();
    concretestack_str0.push("");
    java.lang.String str8 = concretestack_str0.pop();
    java.lang.String str9 = concretestack_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = concretestack_str0.get((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test342"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str4 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.get(0);
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
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test343"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test344"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test345"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.equals(obj3);
    boolean b5 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test346"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test347"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<java.lang.String> concretestack_str1 = new stack.ConcreteStack<java.lang.String>();
    int i2 = concretestack_str1.size();
    boolean b3 = concretestack_str1.isEmpty();
    concretestack_str1.clear();
    int i5 = concretestack_str1.size();
    concretestack_str1.clear();
    boolean b7 = concretestack_stack_stack_concretestack_stack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_str1);
    concretestack_stack_stack_concretestack_stack_stack_stack_stack_comparable_str0.clear();
    concretestack_stack_stack_concretestack_stack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str10 = concretestack_stack_stack_concretestack_stack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test348"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str5.clear();
    boolean b7 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str5.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str8 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str8.equals(obj9);
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str5.push(concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str8);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str12 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str5.pop();
    boolean b13 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test349"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str3.toString();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str7 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.get((int)(short)0);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str9 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str8);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test350"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str3 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test351"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.toString();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_stack_stack_concretestack_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test352"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.clear();
    boolean b2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    java.lang.String str4 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable3.toString();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable3.clear();
    boolean b7 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable3.equals((java.lang.Object)(short)100);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>();
    java.lang.String str9 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable8.toString();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable3.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_stack_serializable8);
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.push(concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable3);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_serializable0.equals(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test353"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test354"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test355"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test356"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test357"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0.size();
    int i2 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0.size();
    java.lang.String str3 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test358"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2.equals(obj3);
    concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2);
    int i6 = concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str8 = concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test359"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test360"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    int i3 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2.size();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_stack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test361"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.equals(obj3);
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.clear();
    boolean b6 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.isEmpty();
    boolean b7 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test362"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_str1);
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_str1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test363"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_str0.get((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test364"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_comparable_str3.isEmpty();
    concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_stack_concretestack_comparable_str3);
    java.lang.String str6 = concretestack_stack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[[]]"+ "'", str6.equals("[[]]"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test365"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    concretestack_concretestack_stack_stack_concretestack_str0.clear();
    int i2 = concretestack_concretestack_stack_stack_concretestack_str0.size();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_str0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_str0.clear();
    int i5 = concretestack_concretestack_stack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str6 = concretestack_concretestack_stack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test366"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    java.lang.String str3 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    java.lang.String str4 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b7 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str6.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str5.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str6);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str10 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str5.get(0);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str11 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str5.top();
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str5);
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str15 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str15);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test367"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    int i1 = concretestack_concretestack_stack_stack_concretestack_serializable0.size();
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_serializable0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_stack_stack_concretestack_serializable0.equals(obj3);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str7 = concretestack_stack_stack_concretestack_comparable_str6.toString();
    int i8 = concretestack_stack_stack_concretestack_comparable_str6.size();
    int i9 = concretestack_stack_stack_concretestack_comparable_str6.size();
    int i10 = concretestack_stack_stack_concretestack_comparable_str6.size();
    int i11 = concretestack_stack_stack_concretestack_comparable_str6.size();
    int i12 = concretestack_stack_stack_concretestack_comparable_str6.size();
    concretestack_stack_stack_concretestack_comparable_str6.clear();
    boolean b14 = concretestack_stack_stack_concretestack_serializable5.equals((java.lang.Object)concretestack_stack_stack_concretestack_comparable_str6);
    java.lang.String str15 = concretestack_stack_stack_concretestack_serializable5.toString();
    boolean b16 = concretestack_stack_stack_concretestack_serializable5.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_serializable0.push(concretestack_stack_stack_concretestack_serializable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test368"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test369"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_str0.toString();
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test370"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>> concretestack_stack_concretestack_stack_stack_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_str2);
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.clear();
    boolean b5 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.isEmpty();
    boolean b6 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test371"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>> concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>();
    int i1 = concretestack_concretestack_stack_str0.size();
    java.lang.String str2 = concretestack_concretestack_stack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test372"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test373"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    int i2 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test374"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable1 = new stack.ConcreteStack<java.io.Serializable>();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable1);
    boolean b3 = concretestack_stack_serializable0.isEmpty();
    boolean b4 = concretestack_stack_serializable0.isEmpty();
    stack.Stack<java.io.Serializable> stack_serializable5 = concretestack_stack_serializable0.top();
    stack.Stack<java.io.Serializable> stack_serializable7 = concretestack_stack_serializable0.get(0);
    stack.Stack<java.io.Serializable> stack_serializable8 = concretestack_stack_serializable0.top();
    concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable8);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test375"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_concretestack_str0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_stack_concretestack_str0.toString();
    concretestack_stack_stack_concretestack_stack_concretestack_str0.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> stack_stack_concretestack_stack_concretestack_str6 = concretestack_stack_stack_concretestack_stack_concretestack_str0.get(0);
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
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test376"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.equals(obj4);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str6 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test377"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str1.toString();
    concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.push(concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str4 = concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.top();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_stack_stack_comparable_str6 = concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str4.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_stack_concretestack_stack_stack_comparable_str4);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test378"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_stack_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>();
    concretestack_stack_concretestack_concretestack_stack_str2.clear();
    concretestack_stack_concretestack_concretestack_stack_str2.clear();
    concretestack_stack_stack_concretestack_concretestack_stack_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>)concretestack_stack_concretestack_concretestack_stack_str2);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> stack_stack_concretestack_concretestack_stack_str6 = concretestack_stack_stack_concretestack_concretestack_stack_str0.pop();
    java.lang.String str7 = concretestack_stack_stack_concretestack_concretestack_stack_str0.toString();
    boolean b8 = concretestack_stack_stack_concretestack_concretestack_stack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_stack_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test379"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b3 = concretestack_stack_stack_concretestack_stack_stack_comparable_str2.isEmpty();
    int i4 = concretestack_stack_stack_concretestack_stack_stack_comparable_str2.size();
    concretestack_stack_stack_concretestack_stack_stack_comparable_str2.clear();
    concretestack_stack_stack_stack_concretestack_stack_stack_comparable_str1.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_stack_concretestack_stack_stack_comparable_str2);
    boolean b7 = concretestack_stack_stack_concretestack_stack_stack_comparable_str2.isEmpty();
    boolean b8 = concretestack_concretestack_concretestack_stack_concretestack_stack_str0.equals((java.lang.Object)b7);
    java.lang.String str9 = concretestack_concretestack_concretestack_stack_concretestack_stack_str0.toString();
    concretestack_concretestack_concretestack_stack_concretestack_stack_str0.clear();
    int i11 = concretestack_concretestack_concretestack_stack_concretestack_stack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test380"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>>>();
    int i2 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str1.size();
    java.lang.String str3 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str1.toString();
    int i4 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str1.size();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str0.push(concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_str6 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_stack_str1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test381"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test382"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.String>>>>> stack_concretestack_concretestack_stack_stack_str2 = concretestack_stack_concretestack_concretestack_stack_stack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test383"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test384"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>>();
    int i5 = concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable4.size();
    concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable4.clear();
    boolean b7 = concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable4.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable8 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>();
    java.lang.String str9 = concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable8.toString();
    boolean b10 = concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable8.isEmpty();
    int i11 = concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable8.size();
    concretestack_stack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable4.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>>>)concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable8);
    java.lang.String str13 = concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_serializable8.toString();
    boolean b14 = concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)str13);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str15 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str0.push(stack_stack_stack_concretestack_stack_concretestack_stack_stack_comparable_str15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test385"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str3 = concretestack_concretestack_concretestack_concretestack_concretestack_serializable2.toString();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_serializable2.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_concretestack_concretestack_concretestack_serializable2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test386"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.pop();
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
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test387"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_concretestack_str0.isEmpty();
    java.lang.String str2 = concretestack_stack_stack_concretestack_stack_concretestack_str0.toString();
    concretestack_stack_stack_concretestack_stack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test388"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str2 = concretestack_stack_concretestack_charSequence1.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_charSequence1.equals(obj3);
    concretestack_stack_stack_concretestack_charSequence0.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>)concretestack_stack_concretestack_charSequence1);
    int i6 = concretestack_stack_stack_concretestack_charSequence0.size();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence7 = concretestack_stack_stack_concretestack_charSequence0.top();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence9 = concretestack_stack_stack_concretestack_charSequence0.get(0);
    boolean b10 = concretestack_stack_stack_concretestack_charSequence0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_charSequence7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_charSequence9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test389"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_stack_str0.equals(obj1);
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_concretestack_stack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_stack_str4 = concretestack_concretestack_concretestack_stack_concretestack_stack_str0.pop();
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
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test390"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_comparable_str1);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test391"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.push(concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.push(concretestack_stack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test392"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.equals(obj2);
    concretestack_concretestack_stack_stack_concretestack_stack_serializable0.clear();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_stack_stack_concretestack_stack_serializable0.equals(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test393"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test394"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    int i3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_charSequence4);
    int i6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test395"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str5 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.get(0);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str6 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str7 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str6);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test396"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_stack_stack_concretestack_stack_concretestack_concretestack_serializable2 = concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test397"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.equals(obj4);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b7 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_comparable_str6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_comparable_str0.equals(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test398"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>>> concretestack_stack_stack_concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_concretestack_stack_charSequence1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>>();
    concretestack_stack_stack_concretestack_stack_charSequence0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>>)concretestack_stack_concretestack_stack_charSequence1);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>> stack_stack_concretestack_stack_charSequence3 = concretestack_stack_stack_concretestack_stack_charSequence0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_charSequence3);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test399"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.toString();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test400"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.size();
    int i2 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.equals(obj8);
    int i10 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_comparable_str3.size();
    boolean b11 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)i10);
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    boolean b13 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    boolean b14 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test401"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    boolean b2 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str1);
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    boolean b5 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b6 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test402"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test403"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_stack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.String>>>>>>>>>();

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test404"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test405"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str1 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test406"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test407"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str3 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test408"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    int i3 = concretestack_concretestack_concretestack_concretestack_str2.size();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_str2.isEmpty();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_str2.isEmpty();
    int i6 = concretestack_concretestack_concretestack_concretestack_str2.size();
    concretestack_stack_concretestack_concretestack_concretestack_str1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>)concretestack_concretestack_concretestack_concretestack_str2);
    int i8 = concretestack_stack_concretestack_concretestack_concretestack_str1.size();
    java.lang.String str9 = concretestack_stack_concretestack_concretestack_concretestack_str1.toString();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> stack_concretestack_concretestack_concretestack_str10 = concretestack_stack_concretestack_concretestack_concretestack_str1.top();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.push(concretestack_stack_concretestack_concretestack_concretestack_str1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_concretestack_str12 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.top();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_concretestack_str13 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_str13);

  }

}
