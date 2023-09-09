package stack;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test001"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    int i3 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str5 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str6);
    boolean b8 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.equals(obj9);
    int i11 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.size();
    java.lang.String str12 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test002"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b6 = concretestack_stack_stack_comparable_str5.isEmpty();
    boolean b7 = concretestack_stack_stack_comparable_str5.isEmpty();
    boolean b8 = concretestack_stack_stack_comparable_str5.isEmpty();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str9 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_stack_comparable_str9.equals(obj10);
    boolean b12 = concretestack_stack_comparable_str9.isEmpty();
    int i13 = concretestack_stack_comparable_str9.size();
    concretestack_stack_stack_comparable_str5.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str9);
    java.lang.String str15 = concretestack_stack_stack_comparable_str5.toString();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str17 = concretestack_stack_stack_comparable_str5.get(0);
    int i18 = concretestack_stack_stack_comparable_str5.size();
    concretestack_stack_stack_stack_comparable_str4.push((stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_stack_comparable_str5);
    boolean b20 = concretestack_stack_stack_stack_comparable_str4.isEmpty();
    boolean b21 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[[]]"+ "'", str15.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test003"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.toString();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.toString();
    int i6 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.get(0);
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
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test004"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str5.equals(obj6);
    boolean b8 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str5.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str4.push(concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str5);
    concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str4);
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str4.clear();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str4.equals(obj12);
    java.lang.String str14 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test005"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test006"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.push(concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2);
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.clear();
    boolean b5 = concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2);
    int i6 = concretestack_stack_stack_stack_stack_stack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test007"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
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
    concretestack_stack_stack_stack_comparable_str1.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str21 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i22 = concretestack_stack_concretestack_comparable_str21.size();
    int i23 = concretestack_stack_concretestack_comparable_str21.size();
    boolean b24 = concretestack_stack_concretestack_comparable_str21.isEmpty();
    boolean b25 = concretestack_stack_stack_stack_comparable_str1.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str21);
    concretestack_stack_concretestack_comparable_str21.clear();
    boolean b27 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str21);
    boolean b28 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.isEmpty();
    java.lang.String str29 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.toString();
    int i30 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.size();
    java.lang.Object obj31 = null;
    boolean b32 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.equals(obj31);
    int i33 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.size();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test008"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str1.clear();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_str1);
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b6 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str5.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str5.clear();
    boolean b8 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str5.isEmpty();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str5);
    int i10 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str5.size();
    int i11 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str5.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test009"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test010"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test011"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.clear();
    concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test012"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test013"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_stack_concretestack_concretestack_serializable0.clear();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_concretestack_serializable0.equals(obj3);
    concretestack_stack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test014"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test015"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test016"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    boolean b2 = concretestack_str0.isEmpty();
    concretestack_str0.clear();
    java.lang.String str4 = concretestack_str0.toString();
    concretestack_str0.clear();
    concretestack_str0.push("");
    java.lang.String str8 = concretestack_str0.pop();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i10 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.size();
    boolean b11 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_str12 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i13 = concretestack_stack_concretestack_concretestack_stack_concretestack_str12.size();
    concretestack_stack_concretestack_concretestack_stack_concretestack_str12.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_str12.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str16 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str16.clear();
    boolean b18 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str16.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str16.clear();
    boolean b20 = concretestack_stack_concretestack_concretestack_stack_concretestack_str12.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str16);
    int i21 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str16.size();
    boolean b22 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str16.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i24 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23.size();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23.clear();
    boolean b26 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23.isEmpty();
    int i27 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23.size();
    java.lang.String str28 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23.toString();
    int i29 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23.size();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str16.push(concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23);
    java.lang.String str31 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23.toString();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.push(concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test017"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    java.lang.String str3 = concretestack_stack_stack_concretestack_str0.toString();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_concretestack_str0.equals(obj4);
    boolean b6 = concretestack_stack_stack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test018"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b6 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.equals(obj7);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str10 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str11);
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str11);
    boolean b14 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1.equals(obj15);
    java.lang.String str17 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1.toString();
    boolean b18 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)str17);
    java.lang.String str19 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    int i20 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test019"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str1 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test020"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test021"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.clear();
    int i3 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.clear();
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>)concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test022"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test023"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_stack_concretestack_comparable_str3.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i6 = concretestack_stack_concretestack_comparable_str5.size();
    int i7 = concretestack_stack_concretestack_comparable_str5.size();
    concretestack_stack_stack_concretestack_comparable_str3.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_concretestack_comparable_str5);
    concretestack_stack_stack_concretestack_comparable_str3.clear();
    boolean b10 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_stack_stack_concretestack_comparable_str3);
    concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str12 = concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str13 = concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str12);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test024"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_str2 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test025"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    int i3 = concretestack_stack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test026"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_serializable0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_comparable_str4.equals(obj5);
    boolean b7 = concretestack_stack_comparable_str4.isEmpty();
    int i8 = concretestack_stack_comparable_str4.size();
    java.lang.String str9 = concretestack_stack_comparable_str4.toString();
    boolean b10 = concretestack_stack_concretestack_stack_stack_stack_stack_comparable_str3.equals((java.lang.Object)concretestack_stack_comparable_str4);
    boolean b11 = concretestack_stack_stack_stack_serializable0.equals((java.lang.Object)b10);
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_serializable0.push(stack_stack_stack_serializable12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test027"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str4 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.top();
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test028"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
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
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test029"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.toString();
    concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_concretestack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test030"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.equals(obj3);
    java.lang.String str5 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str7 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.get(0);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test031"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2.clear();
    boolean b4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2);
    java.lang.String str5 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str7 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test032"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_comparable_str0.clear();
    concretestack_concretestack_stack_stack_concretestack_comparable_str0.clear();
    int i3 = concretestack_concretestack_stack_stack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test033"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>> concretestack_concretestack_concretestack_obj1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_obj1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str4 = concretestack_stack_concretestack_serializable3.toString();
    boolean b5 = concretestack_stack_concretestack_serializable3.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b7 = concretestack_concretestack_serializable6.isEmpty();
    concretestack_stack_concretestack_serializable3.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable6);
    java.lang.String str9 = concretestack_stack_concretestack_serializable3.toString();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable3);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_stack_concretestack_serializable0.equals(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test034"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.size();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str6 = concretestack_stack_concretestack_serializable5.toString();
    boolean b7 = concretestack_stack_concretestack_serializable5.isEmpty();
    java.lang.String str8 = concretestack_stack_concretestack_serializable5.toString();
    concretestack_stack_concretestack_serializable5.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.String str11 = concretestack_concretestack_serializable10.toString();
    concretestack_concretestack_serializable10.clear();
    int i13 = concretestack_concretestack_serializable10.size();
    concretestack_stack_concretestack_serializable5.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable10);
    boolean b15 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3.equals((java.lang.Object)concretestack_stack_concretestack_serializable5);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16.clear();
    boolean b18 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable20 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b21 = concretestack_serializable20.isEmpty();
    java.lang.Object obj22 = null;
    boolean b23 = concretestack_serializable20.equals(obj22);
    java.lang.String str24 = concretestack_serializable20.toString();
    java.lang.String str25 = concretestack_serializable20.toString();
    boolean b26 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16.equals((java.lang.Object)str25);
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16);
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.push(concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str30 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test035"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test036"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b5 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    java.lang.String str6 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.push(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str7);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.equals(obj9);
    boolean b11 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.push(concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    int i13 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str14 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.top();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str17 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str17);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test037"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_concretestack_stack_concretestack_comparable_str3.size();
    concretestack_stack_concretestack_stack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_concretestack_stack_concretestack_comparable_str3);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str6 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_concretestack_comparable_str6);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test038"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str2 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str3.clear();
    boolean b5 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str3);
    concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str7 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    boolean b8 = concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str7.isEmpty();
    concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str7.clear();
    concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str7.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str11 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str7.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>)concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str11);
    boolean b13 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str11);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str15 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test039"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i4 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.size();
    boolean b5 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i7 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str6.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_comparable_str6);
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_comparable_str10 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_comparable_str12 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_concretestack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_concretestack_concretestack_comparable_str12);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test040"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str4 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test041"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str3.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str4);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str3.top();
    boolean b7 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str9 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str3.get(0);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str10 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str3.top();
    int i11 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_stack_stack_comparable_str13 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i14 = concretestack_stack_concretestack_stack_stack_stack_comparable_str13.size();
    java.lang.String str15 = concretestack_stack_concretestack_stack_stack_stack_comparable_str13.toString();
    java.lang.String str16 = concretestack_stack_concretestack_stack_stack_stack_comparable_str13.toString();
    int i17 = concretestack_stack_concretestack_stack_stack_stack_comparable_str13.size();
    boolean b18 = concretestack_stack_concretestack_stack_stack_stack_comparable_str13.isEmpty();
    boolean b19 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test042"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str1.toString();
    int i3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str1.size();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str1.clear();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str1);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj6);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str9 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str9);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test043"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.String str2 = concretestack_stack_serializable1.toString();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable4.clear();
    concretestack_stack_concretestack_serializable4.clear();
    boolean b7 = concretestack_stack_stack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_serializable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test044"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>)concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1);
    int i3 = concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b5 = concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test045"); }

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
    boolean b14 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str12.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str15 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str12.pop();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test046"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str9.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str9.equals(obj12);
    concretestack_comparable_str9.clear();
    boolean b15 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)concretestack_comparable_str9);
    boolean b16 = concretestack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_concretestack_comparable_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test047"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(100);
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
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test048"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> stack_concretestack_stack_concretestack_concretestack_stack_concretestack_str2 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test049"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i3 = concretestack_stack_concretestack_stack_concretestack_comparable_str2.size();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_concretestack_stack_concretestack_comparable_str2.equals(obj4);
    boolean b6 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)b5);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i8 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str7.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b10 = concretestack_concretestack_concretestack_comparable_str9.isEmpty();
    java.lang.String str11 = concretestack_concretestack_concretestack_comparable_str9.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str12 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b14 = concretestack_comparable_str12.equals((java.lang.Object)'a');
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str15 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_comparable_str15.equals(obj16);
    java.lang.Object obj18 = null;
    boolean b19 = concretestack_comparable_str15.equals(obj18);
    concretestack_comparable_str15.clear();
    boolean b21 = concretestack_comparable_str12.equals((java.lang.Object)concretestack_comparable_str15);
    boolean b22 = concretestack_concretestack_concretestack_comparable_str9.equals((java.lang.Object)concretestack_comparable_str15);
    boolean b23 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str7.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str9);
    boolean b24 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str9);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str26 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b27 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str26.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str26);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str26);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test050"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    int i4 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.clear();
    stack.ConcreteStack<java.lang.Object> concretestack_obj7 = new stack.ConcreteStack<java.lang.Object>();
    concretestack_obj7.push((java.lang.Object)(-1));
    concretestack_obj7.clear();
    boolean b11 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_obj7);
    java.lang.String str12 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
    boolean b14 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test051"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test052"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b3 = concretestack_stack_stack_stack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str9.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str9.equals(obj12);
    concretestack_comparable_str9.clear();
    boolean b15 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)concretestack_comparable_str9);
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    boolean b18 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)(short)-1);
    boolean b19 = concretestack_stack_stack_stack_comparable_str2.equals((java.lang.Object)(short)-1);
    java.lang.String str20 = concretestack_stack_stack_stack_comparable_str2.toString();
    concretestack_stack_stack_stack_comparable_str2.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str22 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i23 = concretestack_stack_concretestack_comparable_str22.size();
    int i24 = concretestack_stack_concretestack_comparable_str22.size();
    boolean b25 = concretestack_stack_concretestack_comparable_str22.isEmpty();
    boolean b26 = concretestack_stack_stack_stack_comparable_str2.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str22);
    concretestack_stack_concretestack_comparable_str22.clear();
    boolean b28 = concretestack_concretestack_concretestack_stack_stack_comparable_str1.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str22);
    java.lang.String str29 = concretestack_concretestack_concretestack_stack_stack_comparable_str1.toString();
    concretestack_concretestack_concretestack_concretestack_stack_stack_comparable_str0.push(concretestack_concretestack_concretestack_stack_stack_comparable_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_stack_comparable_str31 = concretestack_concretestack_concretestack_stack_stack_comparable_str1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test053"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test054"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test055"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str3 = concretestack_stack_concretestack_serializable2.toString();
    boolean b4 = concretestack_stack_concretestack_serializable2.isEmpty();
    java.lang.String str5 = concretestack_stack_concretestack_serializable2.toString();
    concretestack_stack_concretestack_serializable2.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable7 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.String str8 = concretestack_concretestack_serializable7.toString();
    concretestack_concretestack_serializable7.clear();
    int i10 = concretestack_concretestack_serializable7.size();
    concretestack_stack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable7);
    boolean b12 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str13 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str13.clear();
    boolean b15 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str13.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str13.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable17 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b18 = concretestack_serializable17.isEmpty();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_serializable17.equals(obj19);
    java.lang.String str21 = concretestack_serializable17.toString();
    java.lang.String str22 = concretestack_serializable17.toString();
    boolean b23 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str13.equals((java.lang.Object)str22);
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str13);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str25 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.top();
    boolean b26 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test056"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str8 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str7.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str8);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str10 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str7.top();
    boolean b11 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str7.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str13 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str7.get(0);
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(stack_concretestack_concretestack_concretestack_concretestack_comparable_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str13);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test057"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_stack_concretestack_str1.size();
    concretestack_stack_concretestack_concretestack_stack_concretestack_str1.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_str1.clear();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_stack_concretestack_str1.toString();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_str1);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> stack_stack_concretestack_concretestack_stack_concretestack_str7 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> stack_stack_concretestack_concretestack_stack_concretestack_str8 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_stack_concretestack_str7);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test058"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_comparable_str0.isEmpty();
    int i2 = concretestack_stack_concretestack_stack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    java.lang.String str4 = concretestack_concretestack_stack_comparable_str3.toString();
    java.lang.String str5 = concretestack_concretestack_stack_comparable_str3.toString();
    int i6 = concretestack_concretestack_stack_comparable_str3.size();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_stack_comparable_str3.equals(obj7);
    concretestack_stack_concretestack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>)concretestack_concretestack_stack_comparable_str3);
    concretestack_stack_concretestack_stack_comparable_str0.clear();
    java.lang.String str11 = concretestack_stack_concretestack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test059"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.clear();
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.clear();
    int i4 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test060"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str3 = concretestack_concretestack_concretestack_serializable2.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b5 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    java.lang.String str6 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    boolean b7 = concretestack_concretestack_concretestack_serializable2.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    boolean b8 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.clear();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>)concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9);
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test061"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    java.lang.String str3 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.toString();
    concretestack_stack_concretestack_stack_concretestack_comparable_str0.clear();
    int i5 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_concretestack_stack_concretestack_comparable_str6 = concretestack_stack_concretestack_stack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test062"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.size();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str6 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str5.toString();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str5.equals(obj7);
    java.lang.String str9 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test063"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    int i1 = concretestack_stack_stack_stack_stack_serializable0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_stack_serializable0.equals(obj2);
    concretestack_stack_stack_stack_stack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b6 = concretestack_stack_stack_stack_serializable5.isEmpty();
    java.lang.String str7 = concretestack_stack_stack_stack_serializable5.toString();
    boolean b8 = concretestack_stack_stack_stack_serializable5.isEmpty();
    java.lang.String str9 = concretestack_stack_stack_stack_serializable5.toString();
    int i10 = concretestack_stack_stack_stack_serializable5.size();
    concretestack_stack_stack_stack_stack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>)concretestack_stack_stack_stack_serializable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test064"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test065"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b3 = concretestack_stack_stack_stack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str9.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str9.equals(obj12);
    concretestack_comparable_str9.clear();
    boolean b15 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)concretestack_comparable_str9);
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    boolean b18 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)(short)-1);
    boolean b19 = concretestack_stack_stack_stack_comparable_str2.equals((java.lang.Object)(short)-1);
    java.lang.String str20 = concretestack_stack_stack_stack_comparable_str2.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str1.push(concretestack_stack_stack_stack_comparable_str2);
    boolean b22 = concretestack_concretestack_stack_stack_stack_comparable_str1.isEmpty();
    java.lang.String str23 = concretestack_concretestack_stack_stack_stack_comparable_str1.toString();
    concretestack_stack_concretestack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_stack_stack_stack_comparable_str1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str25 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str26 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b27 = concretestack_stack_stack_stack_comparable_str26.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str28 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b29 = concretestack_concretestack_concretestack_concretestack_comparable_str28.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str28.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str28.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str28.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str33 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj34 = null;
    boolean b35 = concretestack_comparable_str33.equals(obj34);
    java.lang.Object obj36 = null;
    boolean b37 = concretestack_comparable_str33.equals(obj36);
    concretestack_comparable_str33.clear();
    boolean b39 = concretestack_concretestack_concretestack_concretestack_comparable_str28.equals((java.lang.Object)concretestack_comparable_str33);
    concretestack_concretestack_concretestack_concretestack_comparable_str28.clear();
    boolean b42 = concretestack_concretestack_concretestack_concretestack_comparable_str28.equals((java.lang.Object)(short)-1);
    boolean b43 = concretestack_stack_stack_stack_comparable_str26.equals((java.lang.Object)(short)-1);
    java.lang.String str44 = concretestack_stack_stack_stack_comparable_str26.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str25.push(concretestack_stack_stack_stack_comparable_str26);
    concretestack_stack_concretestack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_stack_stack_stack_comparable_str25);
    int i47 = concretestack_concretestack_stack_stack_stack_comparable_str25.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[[]]"+ "'", str23.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]"+ "'", str44.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test066"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    int i2 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj3);
    int i5 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    int i6 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test067"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.toString();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.toString();
    int i4 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable5 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test068"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str3 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test069"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test070"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj2);
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_str0.clear();
    boolean b5 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test071"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test072"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>> concretestack_stack_stack_concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>>();
    concretestack_stack_stack_concretestack_concretestack_obj0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_concretestack_obj0.equals(obj2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_concretestack_concretestack_obj0.equals(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test073"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    stack.ConcreteStack<java.lang.Object> concretestack_obj1 = new stack.ConcreteStack<java.lang.Object>();
    boolean b2 = concretestack_obj1.isEmpty();
    int i3 = concretestack_obj1.size();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str4.clear();
    boolean b6 = concretestack_stack_comparable_str4.isEmpty();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_comparable_str4.equals(obj7);
    concretestack_obj1.push((java.lang.Object)b8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_obj1.equals(obj10);
    boolean b12 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_obj1);
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    int i14 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str15 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test074"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_stack_concretestack_comparable_str3.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i6 = concretestack_stack_concretestack_comparable_str5.size();
    int i7 = concretestack_stack_concretestack_comparable_str5.size();
    concretestack_stack_stack_concretestack_comparable_str3.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_concretestack_comparable_str5);
    concretestack_stack_stack_concretestack_comparable_str3.clear();
    boolean b10 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_stack_stack_concretestack_comparable_str3);
    concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    boolean b12 = concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str13 = concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str14 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str15 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str15.clear();
    int i17 = concretestack_stack_concretestack_comparable_str15.size();
    boolean b18 = concretestack_stack_concretestack_comparable_str15.isEmpty();
    java.lang.String str19 = concretestack_stack_concretestack_comparable_str15.toString();
    boolean b20 = concretestack_stack_concretestack_comparable_str15.isEmpty();
    concretestack_stack_concretestack_comparable_str15.clear();
    int i22 = concretestack_stack_concretestack_comparable_str15.size();
    concretestack_stack_concretestack_comparable_str15.clear();
    boolean b24 = concretestack_stack_concretestack_str14.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str15);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b26 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25.isEmpty();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25.clear();
    boolean b28 = concretestack_stack_concretestack_comparable_str15.equals((java.lang.Object)concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25);
    concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25.clear();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25);
    java.lang.Object obj31 = null;
    boolean b32 = concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test075"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str4 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str3.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str6.clear();
    java.lang.String str8 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str6.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.push(concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str6);
    boolean b10 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.isEmpty();
    stack.ConcreteStack<java.lang.Object> concretestack_obj11 = new stack.ConcreteStack<java.lang.Object>();
    boolean b12 = concretestack_obj11.isEmpty();
    int i13 = concretestack_obj11.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i15 = concretestack_stack_concretestack_concretestack_comparable_str14.size();
    java.lang.String str16 = concretestack_stack_concretestack_concretestack_comparable_str14.toString();
    boolean b17 = concretestack_obj11.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str14);
    boolean b18 = concretestack_stack_concretestack_concretestack_comparable_str14.isEmpty();
    boolean b19 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.equals((java.lang.Object)b18);
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.equals(obj20);
    boolean b22 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str23 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str5.top();
    concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str3.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str23);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_stack_concretestack_stack_stack_stack_comparable_str25 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str3.pop();
    boolean b26 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)stack_stack_stack_concretestack_stack_stack_stack_comparable_str25);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str27 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.pop();
    int i28 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    boolean b29 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    java.lang.String str30 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_stack_stack_stack_comparable_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test076"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_serializable0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_stack_serializable0.equals(obj3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_stack_serializable5.clear();
    int i7 = concretestack_concretestack_stack_serializable5.size();
    concretestack_concretestack_stack_serializable5.clear();
    java.lang.String str9 = concretestack_concretestack_stack_serializable5.toString();
    java.lang.String str10 = concretestack_concretestack_stack_serializable5.toString();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable5);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable12 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable12);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable15 = concretestack_concretestack_concretestack_stack_serializable0.get((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable15);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test077"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    int i2 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test078"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test079"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b3 = concretestack_stack_stack_comparable_str2.isEmpty();
    boolean b4 = concretestack_stack_stack_comparable_str2.isEmpty();
    boolean b5 = concretestack_stack_stack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str6 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_comparable_str6.equals(obj7);
    boolean b9 = concretestack_stack_comparable_str6.isEmpty();
    int i10 = concretestack_stack_comparable_str6.size();
    concretestack_stack_stack_comparable_str2.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str6);
    java.lang.String str12 = concretestack_stack_stack_comparable_str2.toString();
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str14 = concretestack_stack_stack_comparable_str2.get(0);
    stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>> stack_stack_comparable_str15 = concretestack_stack_stack_comparable_str2.top();
    boolean b16 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)stack_stack_comparable_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[[]]"+ "'", str12.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_comparable_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test080"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str2.clear();
    concretestack_concretestack_stack_concretestack_str2.clear();
    boolean b5 = concretestack_concretestack_stack_concretestack_str2.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_str2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str7 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str7.clear();
    concretestack_concretestack_stack_concretestack_str7.clear();
    boolean b10 = concretestack_concretestack_stack_concretestack_str7.isEmpty();
    int i11 = concretestack_concretestack_stack_concretestack_str7.size();
    java.lang.String str12 = concretestack_concretestack_stack_concretestack_str7.toString();
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_concretestack_stack_concretestack_str7.equals(obj13);
    concretestack_concretestack_concretestack_stack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_str7);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str17 = concretestack_concretestack_concretestack_stack_concretestack_str0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_str17);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test081"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    concretestack_stack_concretestack_str0.clear();
    int i2 = concretestack_stack_concretestack_str0.size();
    int i3 = concretestack_stack_concretestack_str0.size();
    int i4 = concretestack_stack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test082"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str3.clear();
    concretestack_concretestack_concretestack_comparable_str1.push(concretestack_concretestack_comparable_str3);
    boolean b6 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str7 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_comparable_str7.equals(obj8);
    java.lang.String str10 = concretestack_comparable_str7.toString();
    concretestack_comparable_str7.push((java.lang.Comparable<java.lang.String>)"");
    java.lang.Comparable<java.lang.String> comparable_str13 = concretestack_comparable_str7.pop();
    boolean b14 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)comparable_str13);
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str18 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + ""+ "'", comparable_str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test083"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test084"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_obj0.clear();

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test085"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_concretestack_str0.equals(obj1);
    int i3 = concretestack_stack_stack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> stack_stack_stack_concretestack_str4 = concretestack_stack_stack_stack_concretestack_str0.pop();
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test086"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str2 = concretestack_stack_concretestack_serializable1.toString();
    boolean b3 = concretestack_stack_concretestack_serializable1.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b5 = concretestack_concretestack_serializable4.isEmpty();
    concretestack_stack_concretestack_serializable1.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str8 = concretestack_stack_concretestack_serializable7.toString();
    boolean b9 = concretestack_stack_concretestack_serializable7.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b11 = concretestack_concretestack_serializable10.isEmpty();
    concretestack_stack_concretestack_serializable7.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable10);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable14 = concretestack_stack_concretestack_serializable7.get(0);
    concretestack_stack_concretestack_serializable1.push(stack_concretestack_serializable14);
    int i16 = concretestack_stack_concretestack_serializable1.size();
    boolean b17 = concretestack_stack_stack_stack_stack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_serializable1);
    int i18 = concretestack_stack_stack_stack_stack_concretestack_str0.size();
    java.lang.String str19 = concretestack_stack_stack_stack_stack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test087"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_str4.clear();
    int i6 = concretestack_concretestack_stack_concretestack_concretestack_str4.size();
    concretestack_stack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>)concretestack_concretestack_stack_concretestack_concretestack_str4);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> stack_concretestack_stack_concretestack_concretestack_str9 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_concretestack_concretestack_str9);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test088"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    int i1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(stack_stack_stack_concretestack_concretestack_concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test089"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    int i1 = concretestack_stack_stack_stack_stack_comparable_str0.size();
    stack.ConcreteStack<java.lang.String> concretestack_str2 = new stack.ConcreteStack<java.lang.String>();
    boolean b3 = concretestack_stack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_str2);
    java.lang.String str4 = concretestack_stack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test090"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str2 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str3.clear();
    boolean b5 = concretestack_stack_stack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str3);
    concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str3);
    boolean b7 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str9 = concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_stack_concretestack_concretestack_comparable_str9);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test091"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i6 = concretestack_stack_concretestack_stack_concretestack_comparable_str5.size();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_concretestack_stack_concretestack_comparable_str5.equals(obj7);
    boolean b9 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.equals((java.lang.Object)b8);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.clear();
    int i11 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.size();
    java.lang.String str12 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    int i13 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.size();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test092"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_serializable0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_serializable0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_stack_serializable0.equals(obj3);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_stack_serializable5.clear();
    int i7 = concretestack_concretestack_stack_serializable5.size();
    concretestack_concretestack_stack_serializable5.clear();
    java.lang.String str9 = concretestack_concretestack_stack_serializable5.toString();
    java.lang.String str10 = concretestack_concretestack_stack_serializable5.toString();
    concretestack_concretestack_concretestack_stack_serializable0.push(concretestack_concretestack_stack_serializable5);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable12 = concretestack_concretestack_concretestack_stack_serializable0.pop();
    java.lang.String str13 = concretestack_concretestack_concretestack_stack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test093"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str1.equals(obj2);
    boolean b4 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str1.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str6 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.top();
    java.lang.String str7 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test094"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test095"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str4.clear();
    java.lang.String str6 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str4.toString();
    concretestack_concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.push(concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test096"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    int i1 = concretestack_stack_serializable0.size();
    java.lang.String str2 = concretestack_stack_serializable0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_serializable0.equals(obj3);
    boolean b5 = concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b8 = concretestack_stack_stack_stack_comparable_str7.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b10 = concretestack_concretestack_concretestack_concretestack_comparable_str9.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str9.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str9.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str9.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str14 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_comparable_str14.equals(obj15);
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_comparable_str14.equals(obj17);
    concretestack_comparable_str14.clear();
    boolean b20 = concretestack_concretestack_concretestack_concretestack_comparable_str9.equals((java.lang.Object)concretestack_comparable_str14);
    concretestack_concretestack_concretestack_concretestack_comparable_str9.clear();
    boolean b23 = concretestack_concretestack_concretestack_concretestack_comparable_str9.equals((java.lang.Object)(short)-1);
    boolean b24 = concretestack_stack_stack_stack_comparable_str7.equals((java.lang.Object)(short)-1);
    java.lang.String str25 = concretestack_stack_stack_stack_comparable_str7.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str6.push(concretestack_stack_stack_stack_comparable_str7);
    boolean b27 = concretestack_concretestack_stack_stack_stack_comparable_str6.isEmpty();
    concretestack_concretestack_stack_stack_stack_comparable_str6.clear();
    java.lang.String str29 = concretestack_concretestack_stack_stack_stack_comparable_str6.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable30 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b31 = concretestack_concretestack_serializable30.isEmpty();
    boolean b32 = concretestack_concretestack_serializable30.isEmpty();
    boolean b33 = concretestack_concretestack_stack_stack_stack_comparable_str6.equals((java.lang.Object)concretestack_concretestack_serializable30);
    boolean b34 = concretestack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_stack_stack_stack_comparable_str6);
    java.lang.String str35 = concretestack_stack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable36 = concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test097"); }

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
    boolean b15 = concretestack_stack_comparable_str0.isEmpty();
    boolean b16 = concretestack_stack_comparable_str0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test098"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.pop();
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_stack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_comparable_str6.clear();
    boolean b8 = concretestack_concretestack_stack_stack_stack_stack_comparable_str6.isEmpty();
    concretestack_stack_concretestack_stack_stack_stack_stack_comparable_str5.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_concretestack_stack_stack_stack_stack_comparable_str6);
    boolean b10 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_stack_stack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test099"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test100"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b2 = concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str3.clear();
    concretestack_concretestack_concretestack_comparable_str1.push(concretestack_concretestack_comparable_str3);
    boolean b6 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str1);
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b8 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test101"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.size();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str6 = concretestack_stack_concretestack_serializable5.toString();
    boolean b7 = concretestack_stack_concretestack_serializable5.isEmpty();
    java.lang.String str8 = concretestack_stack_concretestack_serializable5.toString();
    concretestack_stack_concretestack_serializable5.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.String str11 = concretestack_concretestack_serializable10.toString();
    concretestack_concretestack_serializable10.clear();
    int i13 = concretestack_concretestack_serializable10.size();
    concretestack_stack_concretestack_serializable5.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable10);
    boolean b15 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3.equals((java.lang.Object)concretestack_stack_concretestack_serializable5);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16.clear();
    boolean b18 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable20 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b21 = concretestack_serializable20.isEmpty();
    java.lang.Object obj22 = null;
    boolean b23 = concretestack_serializable20.equals(obj22);
    java.lang.String str24 = concretestack_serializable20.toString();
    java.lang.String str25 = concretestack_serializable20.toString();
    boolean b26 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16.equals((java.lang.Object)str25);
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str16);
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.push(concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str3);
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.clear();
    java.lang.Object obj30 = null;
    boolean b31 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test102"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    java.lang.String str3 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b5 = concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str6.clear();
    concretestack_concretestack_concretestack_comparable_str4.push(concretestack_concretestack_comparable_str6);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_concretestack_comparable_str4.equals(obj9);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str12 = concretestack_concretestack_concretestack_comparable_str4.get((int)(byte)0);
    boolean b13 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str4);
    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_stack_comparable_str14 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    boolean b16 = concretestack_stack_stack_comparable_str14.equals((java.lang.Object)(short)1);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str17 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj18 = null;
    boolean b19 = concretestack_concretestack_comparable_str17.equals(obj18);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str20 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b22 = concretestack_comparable_str20.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str17.push(concretestack_comparable_str20);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str24 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    concretestack_comparable_str24.clear();
    concretestack_concretestack_comparable_str17.push(concretestack_comparable_str24);
    boolean b27 = concretestack_stack_stack_comparable_str14.equals((java.lang.Object)concretestack_concretestack_comparable_str17);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str29 = concretestack_concretestack_comparable_str17.get(0);
    boolean b30 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_comparable_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test103"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    boolean b3 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test104"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_serializable0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_stack_serializable0.equals(obj3);
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_serializable0.push(stack_stack_stack_serializable5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test105"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>>>();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test106"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test107"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i2 = concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_concretestack_concretestack_comparable_str0.equals(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test108"); }

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
    concretestack_str0.push("");
    
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
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test109"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    java.lang.String str3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test110"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b4 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.clear();
    concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.get(0);
    java.lang.String str9 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    boolean b10 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    boolean b11 = concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_serializable0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2);
    boolean b12 = concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> stack_stack_concretestack_concretestack_stack_stack_stack_stack_serializable13 = concretestack_stack_stack_concretestack_concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test111"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test112"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test113"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> stack_concretestack_concretestack_stack_concretestack_concretestack_str1 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test114"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str1.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    boolean b6 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_concretestack_comparable_str3);
    java.lang.String str7 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.toString();
    int i8 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.size();
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
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
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test115"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i3 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2.size();
    java.lang.String str4 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2.toString();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2);
    boolean b6 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    java.lang.String str7 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    boolean b8 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)str7);
    java.lang.String str9 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.toString();
    int i10 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.size();
    int i11 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test116"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2.toString();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2);
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b7 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.isEmpty();
    java.lang.String str8 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.push(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str9);
    boolean b11 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str12 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.top();
    boolean b13 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6);
    java.lang.String str14 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str15 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str16 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str17 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str18 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str17.toString();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str16.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_str17);
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str15.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str16);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str21 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b22 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str21.isEmpty();
    java.lang.String str23 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str21.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str24 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str21.push(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str24);
    boolean b26 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str21.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str27 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str21.top();
    boolean b28 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str15.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str21);
    java.lang.String str29 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str15.toString();
    int i30 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str15.size();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str31 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str15.pop();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push(stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str31);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str33 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.top();
    boolean b34 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[[[]]]"+ "'", str14.equals("[[[]]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[[[]]]"+ "'", str29.equals("[[[]]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test117"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    int i1 = concretestack_concretestack_stack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.equals(obj3);
    boolean b5 = concretestack_concretestack_stack_serializable0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable6 = concretestack_concretestack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test118"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.clear();
    java.lang.String str4 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str6 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str8 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str9.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str9.equals(obj12);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str14 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_comparable_str14.equals(obj15);
    boolean b17 = concretestack_comparable_str9.equals(obj15);
    boolean b18 = concretestack_concretestack_stack_concretestack_comparable_str8.equals(obj15);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str19 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str20 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str20.clear();
    int i22 = concretestack_stack_concretestack_comparable_str20.size();
    boolean b23 = concretestack_stack_concretestack_comparable_str20.isEmpty();
    java.lang.String str24 = concretestack_stack_concretestack_comparable_str20.toString();
    boolean b25 = concretestack_stack_concretestack_comparable_str20.isEmpty();
    concretestack_stack_concretestack_comparable_str20.clear();
    int i27 = concretestack_stack_concretestack_comparable_str20.size();
    concretestack_stack_concretestack_comparable_str20.clear();
    boolean b29 = concretestack_stack_concretestack_str19.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str20);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str30 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str31 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str32 = concretestack_concretestack_str31.toString();
    boolean b33 = concretestack_concretestack_str30.equals((java.lang.Object)str32);
    concretestack_concretestack_str30.clear();
    java.lang.Object obj35 = null;
    boolean b36 = concretestack_concretestack_str30.equals(obj35);
    int i37 = concretestack_concretestack_str30.size();
    concretestack_stack_concretestack_str19.push((stack.Stack<stack.ConcreteStack<java.lang.String>>)concretestack_concretestack_str30);
    boolean b39 = concretestack_concretestack_stack_concretestack_comparable_str8.equals((java.lang.Object)concretestack_stack_concretestack_str19);
    java.lang.String str40 = concretestack_stack_concretestack_str19.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str41 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i42 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str41.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str43 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj44 = null;
    boolean b45 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str43.equals(obj44);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str43.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str41.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str43);
    int i48 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str43.size();
    int i49 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str43.size();
    boolean b50 = concretestack_stack_concretestack_str19.equals((java.lang.Object)i49);
    boolean b51 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)i49);
    concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.push(concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
    java.lang.String str53 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str54 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.pop();
    boolean b55 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str54);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str56 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str56.clear();
    int i58 = concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str56.size();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str56);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> stack_concretestack_concretestack_stack_stack_stack_stack_comparable_str60 = concretestack_stack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[[]]"+ "'", str40.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[[]]"+ "'", str53.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_stack_stack_stack_stack_comparable_str60);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test119"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str2 = concretestack_stack_concretestack_serializable1.toString();
    boolean b3 = concretestack_stack_concretestack_serializable1.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_serializable1.toString();
    concretestack_stack_concretestack_serializable1.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.String str7 = concretestack_concretestack_serializable6.toString();
    concretestack_concretestack_serializable6.clear();
    int i9 = concretestack_concretestack_serializable6.size();
    concretestack_stack_concretestack_serializable1.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable6);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable11 = concretestack_stack_concretestack_serializable1.pop();
    boolean b12 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)stack_concretestack_serializable11);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str14 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.get((int)(byte)100);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test120"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
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
    concretestack_stack_stack_stack_comparable_str1.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str21 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i22 = concretestack_stack_concretestack_comparable_str21.size();
    int i23 = concretestack_stack_concretestack_comparable_str21.size();
    boolean b24 = concretestack_stack_concretestack_comparable_str21.isEmpty();
    boolean b25 = concretestack_stack_stack_stack_comparable_str1.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str21);
    concretestack_stack_concretestack_comparable_str21.clear();
    boolean b27 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str21);
    int i28 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str29 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    boolean b30 = concretestack_concretestack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str29);
    boolean b31 = concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str29.isEmpty();
    concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str29.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> stack_stack_stack_concretestack_stack_concretestack_concretestack_str33 = concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str29.top();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test121"); }

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
    concretestack_concretestack_str0.clear();
    
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

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test122"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>> concretestack_stack_concretestack_concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>>();

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test123"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test124"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test125"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b5 = concretestack_stack_stack_stack_comparable_str4.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b7 = concretestack_concretestack_concretestack_concretestack_comparable_str6.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str6.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str6.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str6.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str11 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str11.equals(obj12);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_comparable_str11.equals(obj14);
    concretestack_comparable_str11.clear();
    boolean b17 = concretestack_concretestack_concretestack_concretestack_comparable_str6.equals((java.lang.Object)concretestack_comparable_str11);
    concretestack_concretestack_concretestack_concretestack_comparable_str6.clear();
    boolean b20 = concretestack_concretestack_concretestack_concretestack_comparable_str6.equals((java.lang.Object)(short)-1);
    boolean b21 = concretestack_stack_stack_stack_comparable_str4.equals((java.lang.Object)(short)-1);
    java.lang.String str22 = concretestack_stack_stack_stack_comparable_str4.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str3.push(concretestack_stack_stack_stack_comparable_str4);
    boolean b24 = concretestack_concretestack_stack_stack_stack_comparable_str3.isEmpty();
    java.lang.String str25 = concretestack_concretestack_stack_stack_stack_comparable_str3.toString();
    java.lang.String str26 = concretestack_concretestack_stack_stack_stack_comparable_str3.toString();
    boolean b27 = concretestack_concretestack_stack_stack_stack_comparable_str3.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str28 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str28.clear();
    boolean b30 = concretestack_concretestack_stack_stack_stack_comparable_str3.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str28);
    java.lang.String str31 = concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str28.toString();
    concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str28);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34 = concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[[]]"+ "'", str25.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[[]]"+ "'", str26.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test126"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i2 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str3 = concretestack_stack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test127"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test128"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test129"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test130"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test131"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str2 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str3 = concretestack_comparable_str2.toString();
    boolean b4 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)str3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_stack_stack_stack_comparable_str6 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test132"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test133"); }

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
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str20 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i21 = concretestack_stack_concretestack_comparable_str20.size();
    int i22 = concretestack_stack_concretestack_comparable_str20.size();
    boolean b23 = concretestack_stack_concretestack_comparable_str20.isEmpty();
    boolean b24 = concretestack_stack_stack_stack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str20);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b26 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str25.isEmpty();
    boolean b27 = concretestack_stack_concretestack_comparable_str20.equals((java.lang.Object)b26);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str28 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str29 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str30 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str29.toString();
    boolean b31 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str28.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str29);
    int i32 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str29.size();
    boolean b33 = concretestack_stack_concretestack_comparable_str20.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str29);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i35 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.size();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.clear();
    boolean b37 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.isEmpty();
    int i38 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.size();
    java.lang.String str39 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.toString();
    boolean b40 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str29.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]"+ "'", str39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test134"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b3 = concretestack_stack_stack_stack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str9.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str9.equals(obj12);
    concretestack_comparable_str9.clear();
    boolean b15 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)concretestack_comparable_str9);
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    boolean b18 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)(short)-1);
    boolean b19 = concretestack_stack_stack_stack_comparable_str2.equals((java.lang.Object)(short)-1);
    java.lang.String str20 = concretestack_stack_stack_stack_comparable_str2.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str1.push(concretestack_stack_stack_stack_comparable_str2);
    boolean b22 = concretestack_concretestack_stack_stack_stack_comparable_str1.isEmpty();
    java.lang.String str23 = concretestack_concretestack_stack_stack_stack_comparable_str1.toString();
    concretestack_stack_concretestack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_stack_stack_stack_comparable_str1);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_stack_stack_stack_comparable_str25 = concretestack_stack_concretestack_stack_stack_stack_comparable_str0.top();
    boolean b26 = concretestack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_comparable_str27 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i28 = concretestack_concretestack_concretestack_stack_stack_stack_comparable_str27.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str29 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str30 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b31 = concretestack_stack_stack_stack_comparable_str30.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str32 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b33 = concretestack_concretestack_concretestack_concretestack_comparable_str32.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str32.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str32.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str32.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str37 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj38 = null;
    boolean b39 = concretestack_comparable_str37.equals(obj38);
    java.lang.Object obj40 = null;
    boolean b41 = concretestack_comparable_str37.equals(obj40);
    concretestack_comparable_str37.clear();
    boolean b43 = concretestack_concretestack_concretestack_concretestack_comparable_str32.equals((java.lang.Object)concretestack_comparable_str37);
    concretestack_concretestack_concretestack_concretestack_comparable_str32.clear();
    boolean b46 = concretestack_concretestack_concretestack_concretestack_comparable_str32.equals((java.lang.Object)(short)-1);
    boolean b47 = concretestack_stack_stack_stack_comparable_str30.equals((java.lang.Object)(short)-1);
    java.lang.String str48 = concretestack_stack_stack_stack_comparable_str30.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str29.push(concretestack_stack_stack_stack_comparable_str30);
    java.lang.Object obj50 = null;
    boolean b51 = concretestack_concretestack_stack_stack_stack_comparable_str29.equals(obj50);
    java.lang.String str52 = concretestack_concretestack_stack_stack_stack_comparable_str29.toString();
    concretestack_concretestack_concretestack_stack_stack_stack_comparable_str27.push(concretestack_concretestack_stack_stack_stack_comparable_str29);
    concretestack_stack_concretestack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_stack_stack_stack_comparable_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[[]]"+ "'", str23.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_stack_comparable_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[[]]"+ "'", str52.equals("[[]]"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test135"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_comparable_str0.clear();
    concretestack_concretestack_stack_stack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_comparable_str3.clear();
    int i5 = concretestack_stack_stack_concretestack_comparable_str3.size();
    boolean b6 = concretestack_stack_stack_concretestack_comparable_str3.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str8 = concretestack_concretestack_stack_stack_concretestack_comparable_str0.pop();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str10 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str11.clear();
    int i13 = concretestack_stack_concretestack_comparable_str11.size();
    boolean b14 = concretestack_stack_concretestack_comparable_str11.isEmpty();
    java.lang.String str15 = concretestack_stack_concretestack_comparable_str11.toString();
    boolean b16 = concretestack_stack_concretestack_comparable_str11.isEmpty();
    concretestack_stack_concretestack_comparable_str11.clear();
    int i18 = concretestack_stack_concretestack_comparable_str11.size();
    concretestack_stack_concretestack_comparable_str11.clear();
    boolean b20 = concretestack_stack_concretestack_str10.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str11);
    concretestack_concretestack_stack_concretestack_comparable_str9.push(concretestack_stack_concretestack_comparable_str11);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str22 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i23 = concretestack_stack_concretestack_comparable_str22.size();
    int i24 = concretestack_stack_concretestack_comparable_str22.size();
    concretestack_concretestack_stack_concretestack_comparable_str9.push(concretestack_stack_concretestack_comparable_str22);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str26 = concretestack_concretestack_stack_concretestack_comparable_str9.pop();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str27 = concretestack_concretestack_stack_concretestack_comparable_str9.top();
    concretestack_stack_stack_concretestack_comparable_str8.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_concretestack_comparable_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_comparable_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_comparable_str27);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test136"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    boolean b2 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)(byte)1);
    concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b5 = concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4);
    java.lang.String str6 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str4.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test137"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.clear();
    int i4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test138"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    int i3 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b6 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.top();
    java.lang.String str9 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    int i10 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.size();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str12 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.get((int)(byte)0);
    int i13 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test139"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    int i2 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str3 = concretestack_concretestack_stack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test140"); }

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
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b14 = concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str15 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_comparable_str15);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test141"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str4.clear();
    int i6 = concretestack_stack_concretestack_comparable_str4.size();
    boolean b7 = concretestack_stack_concretestack_comparable_str4.isEmpty();
    java.lang.String str8 = concretestack_stack_concretestack_comparable_str4.toString();
    boolean b9 = concretestack_stack_concretestack_comparable_str4.isEmpty();
    concretestack_stack_concretestack_comparable_str4.clear();
    int i11 = concretestack_stack_concretestack_comparable_str4.size();
    concretestack_stack_concretestack_comparable_str4.clear();
    boolean b13 = concretestack_stack_concretestack_str3.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str4);
    boolean b14 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test142"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_stack_concretestack_stack_stack_stack_comparable_str2 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test143"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str4.clear();
    int i6 = concretestack_stack_concretestack_comparable_str4.size();
    boolean b7 = concretestack_stack_concretestack_comparable_str4.isEmpty();
    java.lang.String str8 = concretestack_stack_concretestack_comparable_str4.toString();
    boolean b9 = concretestack_stack_concretestack_comparable_str4.isEmpty();
    concretestack_stack_concretestack_comparable_str4.clear();
    int i11 = concretestack_stack_concretestack_comparable_str4.size();
    concretestack_stack_concretestack_comparable_str4.clear();
    boolean b13 = concretestack_stack_concretestack_str3.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str4);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str14 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str15 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str16 = concretestack_concretestack_str15.toString();
    boolean b17 = concretestack_concretestack_str14.equals((java.lang.Object)str16);
    concretestack_concretestack_str14.clear();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_concretestack_str14.equals(obj19);
    int i21 = concretestack_concretestack_str14.size();
    concretestack_stack_concretestack_str3.push((stack.Stack<stack.ConcreteStack<java.lang.String>>)concretestack_concretestack_str14);
    concretestack_stack_stack_concretestack_str2.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>)concretestack_stack_concretestack_str3);
    boolean b24 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_str3);
    java.lang.Object obj25 = null;
    boolean b26 = concretestack_stack_concretestack_str3.equals(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test144"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> stack_concretestack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.pop();
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_comparable_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test145"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_comparable_str0.equals(obj1);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str3 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b5 = concretestack_comparable_str3.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str0.push(concretestack_comparable_str3);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_comparable_str0.equals(obj7);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = concretestack_concretestack_comparable_str0.top();
    int i10 = concretestack_comparable_str9.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test146"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test147"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test148"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1.toString();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str1);
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)(byte)0);
    boolean b6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    java.lang.String str8 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b9 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test149"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str2 = concretestack_stack_stack_stack_stack_comparable_str0.toString();
    concretestack_stack_stack_stack_stack_comparable_str0.clear();
    int i4 = concretestack_stack_stack_stack_stack_comparable_str0.size();
    java.lang.String str5 = concretestack_stack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test150"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    int i3 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    
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
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test151"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    concretestack_stack_stack_serializable1.clear();
    boolean b3 = concretestack_stack_stack_serializable1.isEmpty();
    boolean b4 = concretestack_stack_stack_serializable1.isEmpty();
    boolean b5 = concretestack_stack_stack_serializable1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6.clear();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6.equals(obj8);
    boolean b10 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6.isEmpty();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6.clear();
    boolean b12 = concretestack_stack_stack_serializable1.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6);
    boolean b13 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b15 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str14.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str16 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b17 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str14.equals((java.lang.Object)concretestack_stack_stack_stack_stack_stack_comparable_str16);
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str14);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str19 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str20 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str19.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str19);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str22 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str24 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.get(0);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str26 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.get((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str26);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test152"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2.clear();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2.toString();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2);
    boolean b6 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test153"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str3);
    java.lang.String str6 = concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[[]]"+ "'", str6.equals("[[]]"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test154"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test155"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test156"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    concretestack_stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>)concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1);
    int i3 = concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1.size();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1.equals(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test157"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.equals(obj3);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.clear();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_concretestack_str8 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test158"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_comparable_str1.size();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_comparable_str1);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj5);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i8 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str7.size();
    int i9 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str7.size();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str7.clear();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str7);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str13 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test159"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    boolean b2 = concretestack_stack_stack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str3 = concretestack_stack_stack_concretestack_str0.top();
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
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test160"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b3 = concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    concretestack_concretestack_concretestack_comparable_str2.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i6 = concretestack_concretestack_comparable_str5.size();
    boolean b7 = concretestack_concretestack_comparable_str5.isEmpty();
    boolean b8 = concretestack_concretestack_concretestack_comparable_str2.equals((java.lang.Object)concretestack_concretestack_comparable_str5);
    boolean b9 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str2);
    java.lang.String str10 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test161"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    java.lang.String str2 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b4 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str6 = concretestack_stack_concretestack_serializable5.toString();
    boolean b7 = concretestack_stack_concretestack_serializable5.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b9 = concretestack_concretestack_serializable8.isEmpty();
    concretestack_stack_concretestack_serializable5.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable8);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable11 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str12 = concretestack_stack_concretestack_serializable11.toString();
    boolean b13 = concretestack_stack_concretestack_serializable11.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable14 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b15 = concretestack_concretestack_serializable14.isEmpty();
    concretestack_stack_concretestack_serializable11.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable14);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable18 = concretestack_stack_concretestack_serializable11.get(0);
    concretestack_stack_concretestack_serializable5.push(stack_concretestack_serializable18);
    boolean b20 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_serializable5);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable21 = concretestack_stack_concretestack_serializable5.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable21);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test162"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    boolean b4 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    int i6 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.size();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.String str9 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8.toString();
    boolean b10 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str8);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str11 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.pop();
    boolean b12 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test163"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.clear();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    java.lang.String str6 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    boolean b7 = concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)str6);
    int i8 = concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test164"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test165"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i3 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2.size();
    java.lang.String str4 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2.toString();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2);
    boolean b6 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    java.lang.String str7 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    boolean b8 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)str7);
    java.lang.String str9 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.toString();
    boolean b10 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str12 = concretestack_stack_concretestack_concretestack_comparable_str11.toString();
    int i13 = concretestack_stack_concretestack_concretestack_comparable_str11.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b15 = concretestack_concretestack_concretestack_comparable_str14.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str16 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_comparable_str16.equals(obj17);
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_comparable_str16.equals(obj19);
    java.lang.String str21 = concretestack_comparable_str16.toString();
    java.lang.String str22 = concretestack_comparable_str16.toString();
    java.lang.String str23 = concretestack_comparable_str16.toString();
    boolean b24 = concretestack_concretestack_concretestack_comparable_str14.equals((java.lang.Object)concretestack_comparable_str16);
    java.lang.Object obj25 = null;
    boolean b26 = concretestack_concretestack_concretestack_comparable_str14.equals(obj25);
    int i27 = concretestack_concretestack_concretestack_comparable_str14.size();
    int i28 = concretestack_concretestack_concretestack_comparable_str14.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str29 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    int i30 = concretestack_concretestack_comparable_str29.size();
    boolean b31 = concretestack_concretestack_comparable_str29.isEmpty();
    concretestack_concretestack_concretestack_comparable_str14.push(concretestack_concretestack_comparable_str29);
    concretestack_stack_concretestack_concretestack_comparable_str11.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_concretestack_concretestack_comparable_str14);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj35 = null;
    boolean b36 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.equals(obj35);
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str38 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b39 = concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str38.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str40 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str41 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str40.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str38.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_comparable_str40);
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34.push(concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str38);
    boolean b44 = concretestack_stack_concretestack_concretestack_comparable_str11.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34);
    boolean b45 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str34);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_concretestack_comparable_str46 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_stack_stack_concretestack_comparable_str46.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str48 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_stack_stack_concretestack_comparable_str48.clear();
    concretestack_stack_stack_stack_concretestack_comparable_str46.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_stack_concretestack_comparable_str48);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> stack_stack_stack_concretestack_comparable_str51 = concretestack_stack_stack_stack_concretestack_comparable_str46.pop();
    int i52 = concretestack_stack_stack_stack_concretestack_comparable_str46.size();
    int i53 = concretestack_stack_stack_stack_concretestack_comparable_str46.size();
    boolean b54 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)i53);
    boolean b55 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]"+ "'", str41.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_comparable_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test166"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str3.toString();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str3.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str3);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str7);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test167"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1.toString();
    concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj4);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    int i7 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.size();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str8 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i10 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str9.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str11.clear();
    boolean b13 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str11.isEmpty();
    int i14 = concretestack_concretestack_concretestack_stack_concretestack_comparable_str11.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str15 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str16 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str17 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str17.clear();
    int i19 = concretestack_stack_concretestack_comparable_str17.size();
    boolean b20 = concretestack_stack_concretestack_comparable_str17.isEmpty();
    java.lang.String str21 = concretestack_stack_concretestack_comparable_str17.toString();
    boolean b22 = concretestack_stack_concretestack_comparable_str17.isEmpty();
    concretestack_stack_concretestack_comparable_str17.clear();
    int i24 = concretestack_stack_concretestack_comparable_str17.size();
    concretestack_stack_concretestack_comparable_str17.clear();
    boolean b26 = concretestack_stack_concretestack_str16.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str17);
    concretestack_concretestack_stack_concretestack_comparable_str15.push(concretestack_stack_concretestack_comparable_str17);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str28 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i29 = concretestack_stack_concretestack_comparable_str28.size();
    int i30 = concretestack_stack_concretestack_comparable_str28.size();
    concretestack_concretestack_stack_concretestack_comparable_str15.push(concretestack_stack_concretestack_comparable_str28);
    concretestack_concretestack_concretestack_stack_concretestack_comparable_str11.push(concretestack_concretestack_stack_concretestack_comparable_str15);
    concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str9.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_comparable_str11);
    boolean b34 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str9.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str8.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str9);
    boolean b36 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.equals((java.lang.Object)concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str8);
    boolean b37 = concretestack_concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str8);
    boolean b38 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test168"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test169"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test170"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_concretestack_comparable_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test171"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b2 = concretestack_stack_stack_concretestack_serializable1.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str4.clear();
    java.lang.String str6 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str4.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3.push(concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str4);
    boolean b8 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9.clear();
    concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9.clear();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str3.push(concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9);
    boolean b13 = concretestack_stack_stack_concretestack_serializable1.equals((java.lang.Object)concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9);
    java.lang.String str14 = concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9.toString();
    concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str9);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>> stack_stack_stack_concretestack_stack_stack_stack_comparable_str17 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test172"); }

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
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str14 = concretestack_stack_comparable_str0.get(0);
    boolean b15 = concretestack_stack_comparable_str0.isEmpty();
    concretestack_stack_comparable_str0.clear();
    boolean b17 = concretestack_stack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + ""+ "'", comparable_str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test173"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_str0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_str0.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_str0.clear();
    int i4 = concretestack_concretestack_concretestack_stack_concretestack_str0.size();
    concretestack_concretestack_concretestack_stack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test174"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    boolean b4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test175"); }

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
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str10 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_stack_comparable_str10.equals(obj11);
    boolean b13 = concretestack_stack_comparable_str10.isEmpty();
    int i14 = concretestack_stack_comparable_str10.size();
    java.lang.String str15 = concretestack_stack_comparable_str10.toString();
    concretestack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>)concretestack_stack_comparable_str10);
    
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test176"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.clear();
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.clear();
    concretestack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test177"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_stack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_comparable_str1.clear();
    concretestack_concretestack_stack_stack_stack_stack_comparable_str1.clear();
    java.lang.String str4 = concretestack_concretestack_stack_stack_stack_stack_comparable_str1.toString();
    boolean b5 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_stack_stack_stack_comparable_str1);
    java.lang.String str6 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test178"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str3 = concretestack_concretestack_concretestack_serializable2.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b5 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    java.lang.String str6 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    boolean b7 = concretestack_concretestack_concretestack_serializable2.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    boolean b8 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.clear();
    concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>)concretestack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9);
    boolean b12 = concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test179"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test180"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.clear();

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test181"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_stack_serializable0.clear();
    concretestack_concretestack_stack_serializable0.clear();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_stack_serializable0.equals(obj3);
    boolean b5 = concretestack_concretestack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable7 = concretestack_concretestack_stack_serializable0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test182"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b2 = concretestack_stack_stack_stack_concretestack_serializable1.isEmpty();
    boolean b3 = concretestack_stack_stack_stack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_stack_stack_stack_concretestack_serializable0.push(concretestack_stack_stack_stack_concretestack_serializable1);
    concretestack_concretestack_stack_stack_stack_concretestack_serializable0.clear();
    java.lang.String str6 = concretestack_concretestack_stack_stack_stack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable8 = concretestack_concretestack_stack_stack_stack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test183"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj4);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    java.lang.String str7 = concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str6.toString();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str6.equals(obj8);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b11 = concretestack_concretestack_concretestack_concretestack_comparable_str10.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str10.clear();
    boolean b13 = concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str6.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_comparable_str10);
    int i14 = concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str6.size();
    java.lang.String str15 = concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str6.toString();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.push(concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str6);
    boolean b17 = concretestack_concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test184"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str1.clear();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_str1);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.equals(obj4);
    concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str7 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test185"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.equals(obj3);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.clear();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_concretestack_str7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test186"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_str0.equals(obj1);
    boolean b3 = concretestack_stack_concretestack_concretestack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test187"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_comparable_str1.size();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b5 = concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    concretestack_concretestack_comparable_str6.clear();
    concretestack_concretestack_concretestack_comparable_str4.push(concretestack_concretestack_comparable_str6);
    concretestack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_concretestack_concretestack_comparable_str4);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> stack_concretestack_concretestack_comparable_str10 = concretestack_stack_concretestack_concretestack_comparable_str1.pop();
    boolean b11 = concretestack_concretestack_stack_stack_comparable_str0.equals((java.lang.Object)stack_concretestack_concretestack_comparable_str10);
    java.lang.String str12 = concretestack_concretestack_stack_stack_comparable_str0.toString();
    concretestack_concretestack_stack_stack_comparable_str0.clear();
    boolean b14 = concretestack_concretestack_stack_stack_comparable_str0.isEmpty();
    int i15 = concretestack_concretestack_stack_stack_comparable_str0.size();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_stack_stack_comparable_str0.equals(obj16);
    java.lang.String str18 = concretestack_concretestack_stack_stack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test188"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.clear();

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test189"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable3.size();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1.push(concretestack_stack_concretestack_stack_concretestack_concretestack_serializable3);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b7 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable3.equals((java.lang.Object)concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str6);
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_serializable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test190"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj5);
    boolean b7 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str8 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str8);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test191"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    int i3 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2.size();
    java.lang.String str4 = concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2.toString();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_comparable_str2);
    boolean b6 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.isEmpty();
    java.lang.String str7 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.toString();
    boolean b8 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)str7);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.equals(obj9);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_stack_stack_concretestack_comparable_str11 = concretestack_stack_stack_concretestack_stack_stack_concretestack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test192"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.toString();
    concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test193"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Object>>> concretestack_stack_concretestack_obj0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Object>>>();
    java.lang.String str1 = concretestack_stack_concretestack_obj0.toString();
    concretestack_stack_concretestack_obj0.clear();
    stack.Stack<stack.ConcreteStack<java.lang.Object>> stack_concretestack_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_obj0.push(stack_concretestack_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test194"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test195"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    int i1 = concretestack_concretestack_obj0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b4 = concretestack_stack_stack_stack_comparable_str3.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b6 = concretestack_concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str5.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str5.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str5.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str10 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_comparable_str10.equals(obj11);
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_comparable_str10.equals(obj13);
    concretestack_comparable_str10.clear();
    boolean b16 = concretestack_concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)concretestack_comparable_str10);
    concretestack_concretestack_concretestack_concretestack_comparable_str5.clear();
    boolean b19 = concretestack_concretestack_concretestack_concretestack_comparable_str5.equals((java.lang.Object)(short)-1);
    boolean b20 = concretestack_stack_stack_stack_comparable_str3.equals((java.lang.Object)(short)-1);
    java.lang.String str21 = concretestack_stack_stack_stack_comparable_str3.toString();
    concretestack_concretestack_stack_stack_stack_comparable_str2.push(concretestack_stack_stack_stack_comparable_str3);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str23 = concretestack_concretestack_stack_stack_stack_comparable_str2.pop();
    concretestack_concretestack_stack_stack_stack_comparable_str2.clear();
    int i25 = concretestack_concretestack_stack_stack_stack_comparable_str2.size();
    boolean b26 = concretestack_concretestack_obj0.equals((java.lang.Object)i25);
    java.lang.String str27 = concretestack_concretestack_obj0.toString();
    int i28 = concretestack_concretestack_obj0.size();
    int i29 = concretestack_concretestack_obj0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_comparable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test196"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_str0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    java.lang.String str3 = concretestack_concretestack_concretestack_concretestack_str2.toString();
    concretestack_concretestack_concretestack_concretestack_str2.clear();
    concretestack_concretestack_concretestack_concretestack_str2.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_str0.push(concretestack_concretestack_concretestack_concretestack_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test197"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str2 = concretestack_stack_concretestack_serializable1.toString();
    boolean b3 = concretestack_stack_concretestack_serializable1.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b5 = concretestack_concretestack_serializable4.isEmpty();
    concretestack_stack_concretestack_serializable1.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str8 = concretestack_stack_concretestack_serializable7.toString();
    boolean b9 = concretestack_stack_concretestack_serializable7.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b11 = concretestack_concretestack_serializable10.isEmpty();
    concretestack_stack_concretestack_serializable7.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable10);
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable14 = concretestack_stack_concretestack_serializable7.get(0);
    concretestack_stack_concretestack_serializable1.push(stack_concretestack_serializable14);
    int i16 = concretestack_stack_concretestack_serializable1.size();
    boolean b17 = concretestack_stack_stack_stack_stack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_str18 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    int i19 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_str18.size();
    int i20 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_str18.size();
    boolean b21 = concretestack_stack_stack_stack_stack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_serializable14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test198"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_str0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test199"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    int i5 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    int i6 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    boolean b7 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)i6);
    boolean b8 = concretestack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)b7);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable9 = concretestack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test200"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_comparable_str3.toString();
    int i5 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    int i6 = concretestack_stack_concretestack_concretestack_comparable_str3.size();
    boolean b7 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)i6);
    boolean b8 = concretestack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)b7);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    int i10 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.size();
    java.lang.String str11 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9.toString();
    boolean b12 = concretestack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)str11);
    boolean b13 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test201"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.clear();

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test202"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_comparable_str2 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_comparable_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test203"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.clear();
    concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>)concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
    java.lang.String str7 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    int i8 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str10 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    int i11 = concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str10.size();
    concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str10.clear();
    boolean b13 = concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test204"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    java.lang.String str6 = concretestack_stack_concretestack_concretestack_concretestack_comparable_str5.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str3.push(concretestack_stack_concretestack_concretestack_concretestack_comparable_str5);
    boolean b8 = concretestack_stack_stack_concretestack_concretestack_comparable_str2.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_concretestack_comparable_str5);
    concretestack_stack_stack_concretestack_concretestack_comparable_str2.clear();
    concretestack_stack_stack_concretestack_concretestack_comparable_str2.clear();
    concretestack_stack_stack_concretestack_concretestack_comparable_str2.clear();
    boolean b12 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_stack_stack_concretestack_concretestack_comparable_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test205"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    int i4 = concretestack_stack_stack_concretestack_comparable_str3.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i6 = concretestack_stack_concretestack_comparable_str5.size();
    int i7 = concretestack_stack_concretestack_comparable_str5.size();
    concretestack_stack_stack_concretestack_comparable_str3.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>)concretestack_stack_concretestack_comparable_str5);
    concretestack_stack_stack_concretestack_comparable_str3.clear();
    boolean b10 = concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_stack_stack_concretestack_comparable_str3);
    concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str13 = concretestack_concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str13);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test206"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test207"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.clear();

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test208"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.get(0);
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
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test209"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.equals(obj3);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2);
    int i7 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    int i8 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    boolean b9 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_comparable_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test210"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.toString();
    concretestack_concretestack_concretestack_stack_stack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test211"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str1 = concretestack_stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test212"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test213"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.isEmpty();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> stack_stack_concretestack_concretestack_stack_concretestack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_comparable_str0.push(stack_stack_concretestack_concretestack_stack_concretestack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test214"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_stack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>> concretestack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b3 = concretestack_stack_stack_stack_comparable_str2.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_comparable_str4.isEmpty();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str9 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_comparable_str9.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_comparable_str9.equals(obj12);
    concretestack_comparable_str9.clear();
    boolean b15 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)concretestack_comparable_str9);
    concretestack_concretestack_concretestack_concretestack_comparable_str4.clear();
    boolean b18 = concretestack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)(short)-1);
    boolean b19 = concretestack_stack_stack_stack_comparable_str2.equals((java.lang.Object)(short)-1);
    java.lang.String str20 = concretestack_stack_stack_stack_comparable_str2.toString();
    concretestack_stack_stack_stack_comparable_str2.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str22 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i23 = concretestack_stack_concretestack_comparable_str22.size();
    int i24 = concretestack_stack_concretestack_comparable_str22.size();
    boolean b25 = concretestack_stack_concretestack_comparable_str22.isEmpty();
    boolean b26 = concretestack_stack_stack_stack_comparable_str2.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str22);
    int i27 = concretestack_stack_stack_stack_comparable_str2.size();
    concretestack_stack_stack_stack_stack_comparable_str0.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>)concretestack_stack_stack_stack_comparable_str2);
    java.lang.String str29 = concretestack_stack_stack_stack_comparable_str2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test215"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str2.clear();
    boolean b4 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_str2);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1.equals(obj5);
    concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.push(concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str8 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_stack_stack_concretestack_stack_concretestack_concretestack_comparable_str8);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test216"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_concretestack_stack_stack_concretestack_serializable0.push(concretestack_stack_stack_concretestack_serializable1);
    concretestack_concretestack_stack_stack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_stack_concretestack_serializable4.equals(obj5);
    concretestack_concretestack_stack_stack_concretestack_serializable0.push(concretestack_stack_stack_concretestack_serializable4);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable8 = concretestack_stack_stack_concretestack_serializable4.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test217"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_str1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_stack_concretestack_str1.size();
    concretestack_stack_concretestack_concretestack_stack_concretestack_str1.clear();
    concretestack_stack_concretestack_concretestack_stack_concretestack_str1.clear();
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_stack_concretestack_str1.toString();
    concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>)concretestack_stack_concretestack_concretestack_stack_concretestack_str1);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> stack_stack_concretestack_concretestack_stack_concretestack_str7 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0.pop();
    int i8 = concretestack_stack_stack_concretestack_concretestack_stack_concretestack_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_stack_concretestack_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test218"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2.equals(obj3);
    boolean b5 = concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str1.push(concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str7 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str1.top();
    boolean b8 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_stack_concretestack_comparable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test219"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str1 = concretestack_stack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable3 = concretestack_stack_concretestack_serializable0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test220"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test221"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.size();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str0.push(stack_concretestack_stack_stack_concretestack_stack_stack_stack_comparable_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test222"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.toString();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    int i4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.size();
    int i5 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str6 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test223"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i3 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    int i4 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    int i5 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    int i6 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.size();
    concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>)concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2);
    stack.ConcreteStack<java.lang.String> concretestack_str8 = new stack.ConcreteStack<java.lang.String>();
    int i9 = concretestack_str8.size();
    java.lang.String str10 = concretestack_str8.toString();
    concretestack_str8.push("hi!");
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b14 = concretestack_concretestack_concretestack_comparable_str13.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str15 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_comparable_str15.equals(obj16);
    java.lang.Object obj18 = null;
    boolean b19 = concretestack_comparable_str15.equals(obj18);
    java.lang.String str20 = concretestack_comparable_str15.toString();
    java.lang.String str21 = concretestack_comparable_str15.toString();
    java.lang.String str22 = concretestack_comparable_str15.toString();
    boolean b23 = concretestack_concretestack_concretestack_comparable_str13.equals((java.lang.Object)concretestack_comparable_str15);
    java.lang.Object obj24 = null;
    boolean b25 = concretestack_concretestack_concretestack_comparable_str13.equals(obj24);
    int i26 = concretestack_concretestack_concretestack_comparable_str13.size();
    boolean b27 = concretestack_str8.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str13);
    java.lang.String str28 = concretestack_str8.toString();
    boolean b29 = concretestack_str8.isEmpty();
    concretestack_str8.push("[]");
    concretestack_str8.push("");
    java.lang.String str34 = concretestack_str8.toString();
    java.lang.String str35 = concretestack_str8.pop();
    boolean b36 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)str35);
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable37 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    int i38 = concretestack_stack_serializable37.size();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable39 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b40 = concretestack_serializable39.isEmpty();
    java.lang.Object obj41 = null;
    boolean b42 = concretestack_serializable39.equals(obj41);
    concretestack_serializable39.push((java.io.Serializable)(short)10);
    concretestack_stack_serializable37.push((stack.Stack<java.io.Serializable>)concretestack_serializable39);
    stack.Stack<java.io.Serializable> stack_serializable47 = concretestack_stack_serializable37.get(0);
    boolean b48 = concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)0);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str49 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(stack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str49);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[hi!]"+ "'", str28.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[, [], hi!]"+ "'", str34.equals("[, [], hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test224"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_str0.equals(obj1);
    concretestack_concretestack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test225"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.clear();
    java.lang.String str5 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3);
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.push(concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test226"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.pop();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test227"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>> concretestack_stack_concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_obj0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>> stack_concretestack_concretestack_obj2 = concretestack_stack_concretestack_concretestack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test228"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.clear();
    int i2 = concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>();
    java.lang.String str6 = concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.toString();
    boolean b7 = concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str3.push(concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
    concretestack_stack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>)concretestack_concretestack_stack_stack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test229"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.equals(obj6);
    boolean b8 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals(obj6);
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test230"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_concretestack_stack_stack_stack_comparable_str0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test231"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.size();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.clear();
    java.lang.String str3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i7 = concretestack_stack_concretestack_stack_concretestack_comparable_str6.size();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_stack_concretestack_stack_concretestack_comparable_str6.equals(obj8);
    boolean b10 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)b9);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>> concretestack_concretestack_stack_concretestack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>();
    int i12 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str11.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    boolean b14 = concretestack_concretestack_concretestack_comparable_str13.isEmpty();
    java.lang.String str15 = concretestack_concretestack_concretestack_comparable_str13.toString();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str16 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b18 = concretestack_comparable_str16.equals((java.lang.Object)'a');
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str19 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_comparable_str19.equals(obj20);
    java.lang.Object obj22 = null;
    boolean b23 = concretestack_comparable_str19.equals(obj22);
    concretestack_comparable_str19.clear();
    boolean b25 = concretestack_comparable_str16.equals((java.lang.Object)concretestack_comparable_str19);
    boolean b26 = concretestack_concretestack_concretestack_comparable_str13.equals((java.lang.Object)concretestack_comparable_str19);
    boolean b27 = concretestack_concretestack_stack_concretestack_concretestack_comparable_str11.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str13);
    boolean b28 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.equals((java.lang.Object)concretestack_concretestack_concretestack_comparable_str13);
    java.lang.String str29 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str4.toString();
    boolean b30 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.equals((java.lang.Object)str29);
    boolean b31 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.isEmpty();
    java.lang.Object obj32 = null;
    boolean b33 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.equals(obj32);
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str35 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    java.lang.Object obj36 = null;
    boolean b37 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str35.equals(obj36);
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str0.push(concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str35);
    java.lang.String str39 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_stack_stack_comparable_str35.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]"+ "'", str39.equals("[]"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test232"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i3 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2.size();
    concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.push(concretestack_stack_concretestack_stack_concretestack_concretestack_serializable2);
    java.lang.String str5 = concretestack_concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[[]]"+ "'", str5.equals("[[]]"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test233"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str5 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.get(2);
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
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test234"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>> concretestack_stack_concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> concretestack_concretestack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>();
    concretestack_concretestack_stack_serializable2.clear();
    int i4 = concretestack_concretestack_stack_serializable2.size();
    concretestack_concretestack_stack_serializable2.clear();
    java.lang.String str6 = concretestack_concretestack_stack_serializable2.toString();
    java.lang.String str7 = concretestack_concretestack_stack_serializable2.toString();
    concretestack_stack_concretestack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>>)concretestack_concretestack_stack_serializable2);
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable9 = concretestack_stack_concretestack_stack_serializable0.pop();
    concretestack_stack_concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<java.io.Serializable>>> stack_concretestack_stack_serializable11 = concretestack_stack_concretestack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_serializable9);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test235"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test236"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_stack_stack_stack_stack_stack_comparable_str2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>>();
    boolean b3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_stack_stack_stack_stack_stack_comparable_str2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>> concretestack_stack_stack_stack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>();
    concretestack_stack_stack_stack_stack_comparable_str4.clear();
    java.lang.String str6 = concretestack_stack_stack_stack_stack_comparable_str4.toString();
    concretestack_stack_stack_stack_stack_stack_comparable_str2.push((stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.lang.Comparable<java.lang.String>>>>>>)concretestack_stack_stack_stack_stack_comparable_str4);
    boolean b8 = concretestack_stack_stack_stack_stack_comparable_str4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test237"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.isEmpty();
    int i4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.size();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_comparable_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test238"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>>();
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.isEmpty();
    boolean b3 = concretestack_concretestack_stack_stack_stack_concretestack_comparable_str0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    int i4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.size();
    int i5 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test239"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b1 = concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_serializable0.equals(obj2);
    stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>> concretestack_stack_comparable_str4 = new stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>();
    concretestack_stack_comparable_str4.clear();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str6 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.String str7 = concretestack_comparable_str6.toString();
    concretestack_stack_comparable_str4.push((stack.Stack<java.lang.Comparable<java.lang.String>>)concretestack_comparable_str6);
    stack.Stack<java.lang.Comparable<java.lang.String>> stack_comparable_str9 = concretestack_stack_comparable_str4.pop();
    boolean b10 = concretestack_serializable0.equals((java.lang.Object)concretestack_stack_comparable_str4);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_comparable_str11 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str12 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str13 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    concretestack_stack_concretestack_comparable_str13.clear();
    int i15 = concretestack_stack_concretestack_comparable_str13.size();
    boolean b16 = concretestack_stack_concretestack_comparable_str13.isEmpty();
    java.lang.String str17 = concretestack_stack_concretestack_comparable_str13.toString();
    boolean b18 = concretestack_stack_concretestack_comparable_str13.isEmpty();
    concretestack_stack_concretestack_comparable_str13.clear();
    int i20 = concretestack_stack_concretestack_comparable_str13.size();
    concretestack_stack_concretestack_comparable_str13.clear();
    boolean b22 = concretestack_stack_concretestack_str12.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str13);
    concretestack_concretestack_stack_concretestack_comparable_str11.push(concretestack_stack_concretestack_comparable_str13);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>> concretestack_stack_concretestack_comparable_str24 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>();
    int i25 = concretestack_stack_concretestack_comparable_str24.size();
    int i26 = concretestack_stack_concretestack_comparable_str24.size();
    concretestack_concretestack_stack_concretestack_comparable_str11.push(concretestack_stack_concretestack_comparable_str24);
    boolean b28 = concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_comparable_str24);
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable30 = concretestack_serializable0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_comparable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test240"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>> concretestack_concretestack_stack_comparable_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.Comparable<java.lang.String>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_comparable_str0.toString();
    java.lang.String str2 = concretestack_concretestack_stack_comparable_str0.toString();
    int i3 = concretestack_concretestack_stack_comparable_str0.size();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_stack_comparable_str0.equals(obj4);
    boolean b6 = concretestack_concretestack_stack_comparable_str0.isEmpty();
    int i7 = concretestack_concretestack_stack_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test241"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2.toString();
    concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1.push(concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2);
    concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>>();
    boolean b7 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.isEmpty();
    java.lang.String str8 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.push(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str9);
    boolean b11 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str12 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6.top();
    boolean b13 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str6);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>> concretestack_concretestack_comparable_str14 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Comparable<java.lang.String>>>();
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_concretestack_comparable_str14.equals(obj15);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str17 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    boolean b19 = concretestack_comparable_str17.equals((java.lang.Object)'a');
    concretestack_concretestack_comparable_str14.push(concretestack_comparable_str17);
    boolean b21 = concretestack_concretestack_comparable_str14.isEmpty();
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str22 = new stack.ConcreteStack<java.lang.Comparable<java.lang.String>>();
    java.lang.Object obj23 = null;
    boolean b24 = concretestack_comparable_str22.equals(obj23);
    concretestack_concretestack_comparable_str14.push(concretestack_comparable_str22);
    java.lang.Object obj26 = null;
    boolean b27 = concretestack_concretestack_comparable_str14.equals(obj26);
    stack.ConcreteStack<java.lang.Comparable<java.lang.String>> concretestack_comparable_str29 = concretestack_concretestack_comparable_str14.get((int)(byte)1);
    boolean b30 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.equals((java.lang.Object)(byte)1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str31 = concretestack_stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_comparable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_comparable_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str31);

  }

}
