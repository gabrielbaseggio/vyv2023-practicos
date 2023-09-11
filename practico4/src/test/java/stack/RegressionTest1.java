package stack;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_serializable0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_serializable0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable6 = concretestack_stack_concretestack_stack_concretestack_serializable0.get((int)(short)-1);
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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i2 = concretestack_stack_concretestack_serializable1.size();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    int i4 = concretestack_stack_concretestack_serializable1.size();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str7 = concretestack_concretestack_concretestack_serializable6.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable8 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i9 = concretestack_stack_concretestack_serializable8.size();
    int i10 = concretestack_stack_concretestack_serializable8.size();
    boolean b11 = concretestack_stack_concretestack_serializable8.isEmpty();
    boolean b12 = concretestack_concretestack_concretestack_serializable6.equals((java.lang.Object)concretestack_stack_concretestack_serializable8);
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable8);
    concretestack_stack_concretestack_serializable8.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    concretestack_stack_stack_serializable0.clear();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i1 = concretestack_stack_concretestack_serializable0.size();
    concretestack_stack_concretestack_serializable0.clear();
    java.lang.String str3 = concretestack_stack_concretestack_serializable0.toString();
    int i4 = concretestack_stack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_serializable5.equals(obj7);
    concretestack_stack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable5);
    concretestack_stack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable1);
    boolean b5 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable7);
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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str3 = concretestack_serializable2.toString();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    java.lang.String str5 = concretestack_stack_serializable0.toString();
    boolean b6 = concretestack_stack_serializable0.isEmpty();
    stack.Stack<java.io.Serializable> stack_serializable7 = concretestack_stack_serializable0.top();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b9 = concretestack_concretestack_concretestack_concretestack_serializable8.isEmpty();
    concretestack_concretestack_concretestack_concretestack_serializable8.clear();
    concretestack_concretestack_concretestack_concretestack_serializable8.clear();
    int i12 = concretestack_concretestack_concretestack_concretestack_serializable8.size();
    boolean b13 = concretestack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_serializable8);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_concretestack_concretestack_serializable8.equals(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[[]]"+ "'", str5.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_serializable3.equals(obj4);
    java.lang.String str6 = concretestack_serializable3.toString();
    int i7 = concretestack_serializable3.size();
    concretestack_serializable3.clear();
    concretestack_concretestack_serializable0.push(concretestack_serializable3);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable10 = concretestack_concretestack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable10);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_serializable1.equals(obj2);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b6 = concretestack_serializable4.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable1.push(concretestack_serializable4);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_serializable1.equals(obj8);
    concretestack_concretestack_serializable1.clear();
    boolean b11 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable12 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i13 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable12.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14.equals(obj15);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable12.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14);
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14);
    java.lang.String str20 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[[]]"+ "'", str20.equals("[[]]"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable2 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str5 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b7 = concretestack_concretestack_str5.equals((java.lang.Object)(-1));
    boolean b8 = concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)b7);
    boolean b10 = concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)0.0d);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable11 = concretestack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    concretestack_obj0.push((java.lang.Object)(-1.0f));
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_obj0.equals(obj5);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable7 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_serializable7.equals(obj8);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable10 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b12 = concretestack_serializable10.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable7.push(concretestack_serializable10);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_serializable7.equals(obj14);
    concretestack_concretestack_serializable7.clear();
    concretestack_obj0.push((java.lang.Object)concretestack_concretestack_serializable7);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable18 = concretestack_concretestack_serializable7.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i5 = concretestack_concretestack_serializable4.size();
    boolean b6 = concretestack_concretestack_serializable4.isEmpty();
    boolean b7 = concretestack_concretestack_concretestack_serializable1.equals((java.lang.Object)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_serializable8.equals(obj9);
    concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_serializable8);
    boolean b12 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable8);
    concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_concretestack_concretestack_serializable16 = concretestack_stack_stack_concretestack_concretestack_serializable0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable5);
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
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable5 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_concretestack_concretestack_serializable5 = concretestack_stack_concretestack_concretestack_concretestack_serializable2.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    java.lang.String str1 = concretestack_concretestack_charSequence0.toString();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_charSequence0.push(concretestack_charSequence2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.equals(obj1);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_stack_concretestack_concretestack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_concretestack_serializable0.push(stack_stack_stack_concretestack_concretestack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b2 = concretestack_stack_stack_serializable0.equals((java.lang.Object)(byte)-1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i4 = concretestack_concretestack_concretestack_concretestack_serializable3.size();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_serializable3.isEmpty();
    boolean b6 = concretestack_stack_stack_serializable0.equals((java.lang.Object)b5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable8 = concretestack_stack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_stack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> stack_concretestack_stack_stack_stack_serializable3 = concretestack_stack_concretestack_stack_stack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_concretestack_stack_concretestack_serializable1.size();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable2 = concretestack_stack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable1.clear();
    java.lang.String str3 = concretestack_stack_serializable1.toString();
    boolean b4 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_serializable1);
    java.lang.String str5 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_serializable0.clear();
    java.lang.String str3 = concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b1 = concretestack_charSequence0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_charSequence0.equals(obj2);
    boolean b5 = concretestack_charSequence0.equals((java.lang.Object)1.0d);
    concretestack_charSequence0.push((java.lang.CharSequence)"");
    java.lang.CharSequence charSequence8 = concretestack_charSequence0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + ""+ "'", charSequence8.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i3 = concretestack_stack_concretestack_serializable2.size();
    int i4 = concretestack_stack_concretestack_serializable2.size();
    boolean b5 = concretestack_stack_concretestack_serializable2.isEmpty();
    boolean b6 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_serializable2);
    java.lang.String str7 = concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable0.equals(obj3);
    java.lang.String str5 = concretestack_serializable0.toString();
    java.lang.String str6 = concretestack_serializable0.toString();
    java.io.Serializable serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_serializable0.push(serializable7);
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

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_concretestack_concretestack_serializable2 = concretestack_stack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.get(2);
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
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
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
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence5 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_charSequence5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_concretestack_str0.clear();
    int i2 = concretestack_concretestack_str0.size();
    java.lang.String str3 = concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    int i3 = concretestack_obj0.size();
    java.lang.String str4 = concretestack_obj0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = concretestack_obj0.top();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b2 = concretestack_stack_stack_serializable0.equals((java.lang.Object)(byte)-1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i4 = concretestack_concretestack_concretestack_concretestack_serializable3.size();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_serializable3.isEmpty();
    boolean b6 = concretestack_stack_stack_serializable0.equals((java.lang.Object)b5);
    stack.ConcreteStack<java.lang.String> concretestack_str7 = new stack.ConcreteStack<java.lang.String>();
    int i8 = concretestack_str7.size();
    java.lang.String str9 = concretestack_str7.toString();
    concretestack_str7.push("[[]]");
    boolean b12 = concretestack_stack_stack_serializable0.equals((java.lang.Object)concretestack_str7);
    concretestack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable14 = concretestack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_stack_stack_serializable0.size();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable2.clear();
    boolean b4 = concretestack_stack_stack_stack_serializable0.equals((java.lang.Object)concretestack_stack_serializable2);
    int i5 = concretestack_stack_serializable2.size();
    stack.Stack<java.io.Serializable> stack_serializable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_serializable2.push(stack_serializable6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.push(concretestack_concretestack_stack_stack_stack_stack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    boolean b7 = concretestack_concretestack_serializable5.isEmpty();
    boolean b8 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_serializable5);
    java.lang.String str9 = concretestack_str0.toString();
    boolean b11 = concretestack_str0.equals((java.lang.Object)'a');
    concretestack_str0.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str13 = new stack.ConcreteStack<java.lang.String>();
    int i14 = concretestack_str13.size();
    java.lang.String str15 = concretestack_str13.toString();
    concretestack_str13.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable18 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable18.clear();
    boolean b20 = concretestack_concretestack_serializable18.isEmpty();
    boolean b21 = concretestack_str13.equals((java.lang.Object)concretestack_concretestack_serializable18);
    boolean b22 = concretestack_str0.equals((java.lang.Object)concretestack_str13);
    concretestack_str13.push("[[[]], []]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.equals(obj3);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.push(stack_concretestack_stack_concretestack_concretestack_concretestack_serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    int i4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable6 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    int i2 = concretestack_stack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_concretestack_serializable3.isEmpty();
    concretestack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_concretestack_concretestack_serializable3);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_concretestack_concretestack_serializable0.equals(obj6);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable8 = concretestack_stack_concretestack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
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
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_serializable8);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_stack_stack_stack_stack_serializable1 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj2);
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)'#');
    java.lang.String str6 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable7 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable3 = concretestack_stack_stack_stack_stack_serializable0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_serializable0.clear();
    java.lang.String str3 = concretestack_concretestack_serializable0.toString();
    concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b1 = concretestack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str2 = concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> stack_concretestack_concretestack_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_str0.push(stack_concretestack_concretestack_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    boolean b1 = concretestack_concretestack_concretestack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence2 = concretestack_concretestack_concretestack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_stack_stack_serializable4 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable2 = concretestack_concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.isEmpty();
    java.lang.String str4 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    concretestack_obj0.push((java.lang.Object)concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable6 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_serializable1.toString();
    int i3 = concretestack_stack_concretestack_concretestack_serializable1.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b5 = concretestack_concretestack_concretestack_serializable4.isEmpty();
    concretestack_stack_concretestack_concretestack_serializable1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_concretestack_concretestack_serializable4);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_concretestack_concretestack_serializable1.equals(obj7);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_concretestack_serializable1.pop();
    boolean b10 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)stack_concretestack_concretestack_serializable9);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_serializable9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable1);
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_stack_stack_serializable6 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_serializable0.equals(obj2);
    int i4 = concretestack_stack_concretestack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable2.equals(obj5);
    java.lang.String str7 = concretestack_serializable2.toString();
    java.lang.String str8 = concretestack_serializable2.toString();
    java.lang.String str9 = concretestack_serializable2.toString();
    boolean b10 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable2);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_concretestack_serializable0.equals(obj11);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable13 = concretestack_concretestack_concretestack_serializable0.pop();
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
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj6);
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_serializable1.equals(obj2);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b6 = concretestack_serializable4.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable1.push(concretestack_serializable4);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_serializable1.equals(obj8);
    concretestack_concretestack_serializable1.clear();
    boolean b11 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable1);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_serializable1.push(concretestack_serializable12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable2 = concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable2.equals(obj5);
    java.lang.String str7 = concretestack_serializable2.toString();
    java.lang.String str8 = concretestack_serializable2.toString();
    java.lang.String str9 = concretestack_serializable2.toString();
    boolean b10 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable2);
    java.lang.String str11 = concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable12 = concretestack_concretestack_concretestack_serializable0.top();
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

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_stack_stack_concretestack_serializable0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_concretestack_serializable0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable5 = concretestack_stack_stack_concretestack_serializable0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    boolean b7 = concretestack_concretestack_serializable5.isEmpty();
    boolean b8 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_serializable5);
    java.lang.String str9 = concretestack_str0.toString();
    concretestack_str0.push("[[[]], []]");
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_str0.equals(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence2 = concretestack_concretestack_concretestack_charSequence0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable5 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
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
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj1);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_stack_stack_serializable0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj6);
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable10 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_stack_concretestack_serializable0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_serializable0.toString();
    int i3 = concretestack_stack_stack_concretestack_serializable0.size();
    java.lang.String str4 = concretestack_stack_stack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable5 = concretestack_stack_stack_concretestack_serializable0.pop();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_serializable0.toString();
    int i4 = concretestack_serializable0.size();
    concretestack_serializable0.clear();
    concretestack_serializable0.push((java.io.Serializable)100L);
    int i8 = concretestack_serializable0.size();
    boolean b9 = concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable1);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_stack_stack_serializable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.push(stack_stack_concretestack_stack_stack_stack_serializable5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable6 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.get((int)(short)100);
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_concretestack_str0.clear();
    java.lang.String str2 = concretestack_concretestack_str0.toString();
    java.lang.String str3 = concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str5 = concretestack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i2 = concretestack_stack_concretestack_serializable1.size();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    int i4 = concretestack_stack_concretestack_serializable1.size();
    concretestack_stack_concretestack_serializable1.clear();
    concretestack_obj0.push((java.lang.Object)concretestack_stack_concretestack_serializable1);
    java.lang.Object obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_obj0.push(obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    concretestack_stack_stack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_stack_concretestack_concretestack_serializable2 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    java.lang.String str2 = concretestack_stack_serializable0.toString();
    boolean b3 = concretestack_stack_serializable0.isEmpty();
    concretestack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable6 = concretestack_stack_serializable0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_stack_concretestack_serializable0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_serializable0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_concretestack_serializable0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable5 = concretestack_stack_stack_concretestack_serializable0.pop();
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

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_serializable1.equals(obj2);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b6 = concretestack_serializable4.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable1.push(concretestack_serializable4);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_serializable1.equals(obj8);
    concretestack_concretestack_serializable1.clear();
    boolean b11 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable12 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i13 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable12.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.Object obj15 = null;
    boolean b16 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14.equals(obj15);
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14.clear();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable12.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14);
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable14);
    int i20 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    java.lang.String str1 = concretestack_stack_concretestack_str0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_str0.toString();
    int i3 = concretestack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str4 = concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    int i1 = concretestack_concretestack_concretestack_str0.size();
    int i2 = concretestack_concretestack_concretestack_str0.size();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_str0.push(concretestack_concretestack_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_serializable4.equals(obj5);
    boolean b7 = concretestack_stack_serializable4.isEmpty();
    int i8 = concretestack_stack_serializable4.size();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable4);
    boolean b10 = concretestack_stack_stack_serializable0.isEmpty();
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable11 = concretestack_stack_stack_serializable0.top();
    int i12 = concretestack_stack_stack_serializable0.size();
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_serializable0.push(stack_stack_serializable13);
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_serializable11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i3 = concretestack_stack_concretestack_serializable2.size();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable4.clear();
    concretestack_concretestack_serializable4.clear();
    java.lang.String str7 = concretestack_concretestack_serializable4.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_serializable8.equals(obj9);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable11 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b13 = concretestack_serializable11.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable8.push(concretestack_serializable11);
    concretestack_concretestack_serializable4.push(concretestack_serializable11);
    concretestack_concretestack_serializable4.clear();
    java.lang.String str17 = concretestack_concretestack_serializable4.toString();
    concretestack_stack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<java.io.Serializable>>)concretestack_concretestack_serializable4);
    int i19 = concretestack_concretestack_serializable4.size();
    boolean b20 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable4);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable22 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_charSequence0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_charSequence0.push(concretestack_concretestack_charSequence2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    int i1 = concretestack_stack_stack_concretestack_str0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable2.clear();
    boolean b4 = concretestack_stack_concretestack_serializable2.isEmpty();
    boolean b5 = concretestack_stack_stack_concretestack_str0.equals((java.lang.Object)b4);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str6 = concretestack_stack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_stack_concretestack_serializable0.clear();
    boolean b3 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
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
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_serializable1.size();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_serializable1.toString();
    concretestack_concretestack_stack_concretestack_concretestack_serializable0.push(concretestack_stack_concretestack_concretestack_serializable1);
    java.lang.String str5 = concretestack_stack_concretestack_concretestack_serializable1.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable6 = concretestack_stack_concretestack_concretestack_serializable1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str3 = concretestack_serializable2.toString();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    concretestack_concretestack_serializable5.clear();
    java.lang.String str8 = concretestack_concretestack_serializable5.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_concretestack_serializable9.equals(obj10);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b14 = concretestack_serializable12.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable9.push(concretestack_serializable12);
    concretestack_concretestack_serializable5.push(concretestack_serializable12);
    int i17 = concretestack_serializable12.size();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable12);
    concretestack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_serializable0.toString();
    concretestack_serializable0.push((java.io.Serializable)(byte)10);
    boolean b6 = concretestack_serializable0.isEmpty();
    int i7 = concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_concretestack_stack_concretestack_serializable1.size();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable1);
    int i4 = concretestack_concretestack_stack_concretestack_serializable1.size();
    boolean b5 = concretestack_concretestack_stack_concretestack_serializable1.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable6 = concretestack_concretestack_stack_concretestack_serializable1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.toString();
    int i3 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable4 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i1 = concretestack_concretestack_serializable0.size();
    boolean b2 = concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_serializable3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_serializable3.equals(obj6);
    java.lang.String str8 = concretestack_serializable3.toString();
    boolean b9 = concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable3);
    int i10 = concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable11 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_serializable11.equals(obj12);
    java.lang.String str14 = concretestack_serializable11.toString();
    int i15 = concretestack_serializable11.size();
    concretestack_serializable11.clear();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_serializable11.equals(obj17);
    concretestack_concretestack_serializable0.push(concretestack_serializable11);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable21 = concretestack_concretestack_serializable0.get(1);
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    boolean b7 = concretestack_concretestack_serializable5.isEmpty();
    boolean b8 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_serializable5);
    java.lang.String str9 = concretestack_str0.toString();
    boolean b11 = concretestack_str0.equals((java.lang.Object)'a');
    concretestack_str0.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str13 = new stack.ConcreteStack<java.lang.String>();
    int i14 = concretestack_str13.size();
    java.lang.String str15 = concretestack_str13.toString();
    concretestack_str13.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable18 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable18.clear();
    boolean b20 = concretestack_concretestack_serializable18.isEmpty();
    boolean b21 = concretestack_str13.equals((java.lang.Object)concretestack_concretestack_serializable18);
    boolean b22 = concretestack_str0.equals((java.lang.Object)concretestack_str13);
    concretestack_str13.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5.isEmpty();
    int i7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5.size();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.pop();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.equals(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_concretestack_concretestack_concretestack_serializable9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj6);
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable10 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i3 = concretestack_stack_concretestack_serializable2.size();
    int i4 = concretestack_stack_concretestack_serializable2.size();
    int i5 = concretestack_stack_concretestack_serializable2.size();
    concretestack_concretestack_stack_concretestack_serializable1.push(concretestack_stack_concretestack_serializable2);
    boolean b7 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_serializable2);
    int i8 = concretestack_stack_concretestack_serializable2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>> concretestack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>();
    concretestack_stack_stack_charSequence0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.CharSequence>> stack_stack_charSequence2 = concretestack_stack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<java.lang.String> concretestack_str1 = new stack.ConcreteStack<java.lang.String>();
    int i2 = concretestack_str1.size();
    java.lang.String str3 = concretestack_str1.toString();
    concretestack_str1.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable6.clear();
    boolean b8 = concretestack_concretestack_serializable6.isEmpty();
    boolean b9 = concretestack_str1.equals((java.lang.Object)concretestack_concretestack_serializable6);
    java.lang.String str10 = concretestack_str1.toString();
    boolean b12 = concretestack_str1.equals((java.lang.Object)'a');
    concretestack_str1.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str14 = new stack.ConcreteStack<java.lang.String>();
    int i15 = concretestack_str14.size();
    java.lang.String str16 = concretestack_str14.toString();
    concretestack_str14.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable19 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable19.clear();
    boolean b21 = concretestack_concretestack_serializable19.isEmpty();
    boolean b22 = concretestack_str14.equals((java.lang.Object)concretestack_concretestack_serializable19);
    boolean b23 = concretestack_str1.equals((java.lang.Object)concretestack_str14);
    boolean b24 = concretestack_concretestack_concretestack_str0.equals((java.lang.Object)b23);
    java.lang.String str25 = concretestack_concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    int i3 = concretestack_obj0.size();
    int i4 = concretestack_obj0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = concretestack_obj0.top();
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
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    int i4 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i1 = concretestack_stack_concretestack_serializable0.size();
    int i2 = concretestack_stack_concretestack_serializable0.size();
    int i3 = concretestack_stack_concretestack_serializable0.size();
    boolean b4 = concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable5 = concretestack_stack_concretestack_serializable0.top();
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
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj6);
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
    boolean b10 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<java.lang.String> concretestack_str1 = new stack.ConcreteStack<java.lang.String>();
    int i2 = concretestack_str1.size();
    java.lang.String str3 = concretestack_str1.toString();
    concretestack_str1.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable6.clear();
    boolean b8 = concretestack_concretestack_serializable6.isEmpty();
    boolean b9 = concretestack_str1.equals((java.lang.Object)concretestack_concretestack_serializable6);
    java.lang.String str10 = concretestack_str1.toString();
    boolean b12 = concretestack_str1.equals((java.lang.Object)'a');
    concretestack_str1.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str14 = new stack.ConcreteStack<java.lang.String>();
    int i15 = concretestack_str14.size();
    java.lang.String str16 = concretestack_str14.toString();
    concretestack_str14.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable19 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable19.clear();
    boolean b21 = concretestack_concretestack_serializable19.isEmpty();
    boolean b22 = concretestack_str14.equals((java.lang.Object)concretestack_concretestack_serializable19);
    boolean b23 = concretestack_str1.equals((java.lang.Object)concretestack_str14);
    boolean b24 = concretestack_concretestack_concretestack_str0.equals((java.lang.Object)b23);
    java.lang.Object obj25 = null;
    boolean b26 = concretestack_concretestack_concretestack_str0.equals(obj25);
    concretestack_concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str28 = concretestack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b3 = concretestack_stack_stack_stack_serializable2.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str5 = concretestack_serializable4.toString();
    boolean b6 = concretestack_stack_stack_stack_serializable2.equals((java.lang.Object)concretestack_serializable4);
    java.lang.String str7 = concretestack_stack_stack_stack_serializable2.toString();
    concretestack_concretestack_stack_stack_stack_serializable1.push(concretestack_stack_stack_stack_serializable2);
    boolean b9 = concretestack_concretestack_stack_stack_stack_serializable1.isEmpty();
    java.lang.String str10 = concretestack_concretestack_stack_stack_stack_serializable1.toString();
    concretestack_stack_concretestack_stack_stack_stack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>)concretestack_concretestack_stack_stack_stack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable13 = concretestack_concretestack_stack_stack_stack_serializable1.get((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable14 = concretestack_stack_stack_stack_serializable13.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_serializable13);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str3 = concretestack_serializable2.toString();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    concretestack_concretestack_serializable5.clear();
    java.lang.String str8 = concretestack_concretestack_serializable5.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_concretestack_serializable9.equals(obj10);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable12 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b14 = concretestack_serializable12.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable9.push(concretestack_serializable12);
    concretestack_concretestack_serializable5.push(concretestack_serializable12);
    int i17 = concretestack_serializable12.size();
    concretestack_stack_serializable0.push((stack.Stack<java.io.Serializable>)concretestack_serializable12);
    java.lang.String str19 = concretestack_stack_serializable0.toString();
    java.lang.Object obj20 = null;
    boolean b21 = concretestack_stack_serializable0.equals(obj20);
    stack.Stack<java.io.Serializable> stack_serializable23 = concretestack_stack_serializable0.get(0);
    boolean b24 = concretestack_stack_serializable0.isEmpty();
    java.lang.String str25 = concretestack_stack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[], []]"+ "'", str19.equals("[[], []]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_serializable23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[[], []]"+ "'", str25.equals("[[], []]"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_stack_concretestack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.CharSequence>> stack_concretestack_charSequence2 = concretestack_stack_concretestack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    boolean b2 = concretestack_concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable4 = concretestack_concretestack_stack_stack_stack_stack_serializable0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str1 = concretestack_concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(stack_stack_stack_concretestack_concretestack_concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str2 = concretestack_concretestack_stack_concretestack_concretestack_str0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str5 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b7 = concretestack_concretestack_str5.equals((java.lang.Object)(-1));
    boolean b8 = concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)b7);
    stack.ConcreteStack<java.lang.String> concretestack_str9 = new stack.ConcreteStack<java.lang.String>();
    int i10 = concretestack_str9.size();
    boolean b11 = concretestack_str9.isEmpty();
    boolean b12 = concretestack_str9.isEmpty();
    concretestack_str9.clear();
    boolean b14 = concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_str9);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable15 = concretestack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable1.clear();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    boolean b4 = concretestack_stack_concretestack_serializable1.isEmpty();
    java.lang.String str5 = concretestack_stack_concretestack_serializable1.toString();
    boolean b6 = concretestack_stack_concretestack_str0.equals((java.lang.Object)str5);
    concretestack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str8 = concretestack_stack_concretestack_str0.pop();
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
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i2 = concretestack_stack_concretestack_serializable1.size();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    int i4 = concretestack_stack_concretestack_serializable1.size();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable6.clear();
    java.lang.String str8 = concretestack_stack_concretestack_serializable6.toString();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable6);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable11 = concretestack_concretestack_stack_concretestack_serializable0.get(0);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_serializable11);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.clear();
    int i4 = concretestack_str0.size();
    boolean b5 = concretestack_str0.isEmpty();
    concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    int i4 = concretestack_concretestack_concretestack_concretestack_serializable0.size();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    int i6 = concretestack_concretestack_concretestack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    int i1 = concretestack_stack_charSequence0.size();
    java.lang.String str2 = concretestack_stack_charSequence0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_charSequence0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.CharSequence> stack_charSequence5 = concretestack_stack_charSequence0.pop();
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

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    concretestack_obj0.push((java.lang.Object)(-1.0f));
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_obj0.equals(obj5);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable7 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_serializable7.equals(obj8);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable10 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b12 = concretestack_serializable10.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable7.push(concretestack_serializable10);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_serializable7.equals(obj14);
    concretestack_concretestack_serializable7.clear();
    concretestack_obj0.push((java.lang.Object)concretestack_concretestack_serializable7);
    concretestack_obj0.clear();
    java.lang.String str19 = concretestack_obj0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_serializable0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    boolean b3 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
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
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1);
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.toString();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable7 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.get(10);
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

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    boolean b1 = concretestack_stack_charSequence0.isEmpty();
    java.lang.String str2 = concretestack_stack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.CharSequence> stack_charSequence3 = concretestack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i2 = concretestack_stack_concretestack_serializable1.size();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    int i4 = concretestack_stack_concretestack_serializable1.size();
    concretestack_stack_concretestack_serializable1.clear();
    concretestack_obj0.push((java.lang.Object)concretestack_stack_concretestack_serializable1);
    boolean b8 = concretestack_obj0.equals((java.lang.Object)10L);
    java.lang.Object obj9 = concretestack_obj0.pop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj10 = concretestack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_str0.push(concretestack_stack_concretestack_concretestack_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    concretestack_concretestack_stack_concretestack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str3 = concretestack_concretestack_stack_concretestack_concretestack_str0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    concretestack_stack_stack_concretestack_str0.clear();
    concretestack_stack_stack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_concretestack_concretestack_concretestack_serializable1.size();
    concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_concretestack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b2 = concretestack_stack_stack_stack_serializable1.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str4 = concretestack_serializable3.toString();
    boolean b5 = concretestack_stack_stack_stack_serializable1.equals((java.lang.Object)concretestack_serializable3);
    java.lang.String str6 = concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_stack_serializable1);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_stack_stack_stack_serializable0.equals(obj8);
    java.lang.String str10 = concretestack_concretestack_stack_stack_stack_serializable0.toString();
    int i11 = concretestack_concretestack_stack_stack_stack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_concretestack_serializable0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable5 = concretestack_stack_concretestack_concretestack_serializable0.pop();
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

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    concretestack_serializable0.clear();
    boolean b4 = concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable5 = concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_stack_concretestack_charSequence0.toString();
    boolean b2 = concretestack_stack_concretestack_charSequence0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    boolean b4 = concretestack_concretestack_charSequence3.isEmpty();
    concretestack_stack_concretestack_charSequence0.push((stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>)concretestack_concretestack_charSequence3);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_charSequence3.equals(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    concretestack_stack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable2 = concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_concretestack_serializable0.get((int)(short)100);
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
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    java.lang.String str1 = concretestack_concretestack_charSequence0.toString();
    concretestack_concretestack_charSequence0.clear();
    int i3 = concretestack_concretestack_charSequence0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence5 = concretestack_concretestack_charSequence0.get(0);
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
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_stack_stack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_stack_concretestack_serializable3 = concretestack_stack_stack_stack_concretestack_serializable0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    boolean b7 = concretestack_concretestack_serializable5.isEmpty();
    boolean b8 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_serializable5);
    java.lang.String str9 = concretestack_str0.toString();
    boolean b10 = concretestack_str0.isEmpty();
    concretestack_str0.push("hi!");
    concretestack_str0.push("");
    int i15 = concretestack_str0.size();
    java.lang.String str16 = concretestack_str0.pop();
    concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_serializable0.equals(obj2);
    concretestack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable5 = concretestack_stack_concretestack_concretestack_serializable0.top();
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
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable2 = concretestack_concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i5 = concretestack_concretestack_serializable4.size();
    boolean b6 = concretestack_concretestack_serializable4.isEmpty();
    boolean b7 = concretestack_concretestack_concretestack_serializable1.equals((java.lang.Object)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_serializable8.equals(obj9);
    concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_serializable8);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable13 = concretestack_concretestack_concretestack_serializable1.get(0);
    boolean b14 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_serializable1);
    boolean b15 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_serializable13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_concretestack_serializable5 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_concretestack_concretestack_serializable5);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    int i1 = concretestack_stack_stack_serializable0.size();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable2.clear();
    java.lang.String str4 = concretestack_stack_serializable2.toString();
    boolean b5 = concretestack_stack_serializable2.isEmpty();
    concretestack_stack_serializable2.clear();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable2);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_stack_serializable2.equals(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_charSequence0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence4 = concretestack_concretestack_concretestack_charSequence0.get(0);
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
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_stack_concretestack_serializable2 = concretestack_stack_stack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_stack_concretestack_serializable2 = concretestack_stack_stack_stack_concretestack_serializable0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_serializable0.equals(obj1);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b5 = concretestack_serializable3.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable0.push(concretestack_serializable3);
    concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable9 = concretestack_concretestack_serializable0.get((int)(short)1);
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
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable1.clear();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    boolean b4 = concretestack_stack_concretestack_serializable1.isEmpty();
    java.lang.String str5 = concretestack_stack_concretestack_serializable1.toString();
    boolean b6 = concretestack_stack_concretestack_str0.equals((java.lang.Object)str5);
    concretestack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str9 = concretestack_stack_concretestack_str0.get(3);
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
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_stack_stack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_stack_concretestack_serializable2 = concretestack_stack_stack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str1 = concretestack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    int i1 = concretestack_concretestack_obj0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Object> concretestack_obj3 = concretestack_concretestack_obj0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_serializable0.toString();
    int i4 = concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable5 = concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    int i1 = concretestack_concretestack_obj0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Object> concretestack_obj2 = concretestack_concretestack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    int i2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.size();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1);
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable5 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj1);
    concretestack_concretestack_stack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b1 = concretestack_charSequence0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_charSequence0.equals(obj2);
    boolean b5 = concretestack_charSequence0.equals((java.lang.Object)1.0d);
    concretestack_charSequence0.clear();
    concretestack_charSequence0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i4 = concretestack_concretestack_serializable3.size();
    boolean b5 = concretestack_concretestack_serializable3.isEmpty();
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable3);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable7 = concretestack_concretestack_concretestack_serializable0.top();
    concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable9 = concretestack_concretestack_concretestack_serializable0.top();
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
    org.junit.Assert.assertNotNull(concretestack_concretestack_serializable7);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i4 = concretestack_stack_concretestack_serializable3.size();
    int i5 = concretestack_stack_concretestack_serializable3.size();
    int i6 = concretestack_stack_concretestack_serializable3.size();
    concretestack_concretestack_stack_concretestack_serializable2.push(concretestack_stack_concretestack_serializable3);
    stack.ConcreteStack<java.lang.Object> concretestack_obj8 = new stack.ConcreteStack<java.lang.Object>();
    boolean b9 = concretestack_obj8.isEmpty();
    int i10 = concretestack_obj8.size();
    concretestack_obj8.push((java.lang.Object)(-1.0f));
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_obj8.equals(obj13);
    boolean b15 = concretestack_concretestack_stack_concretestack_serializable2.equals((java.lang.Object)concretestack_obj8);
    boolean b16 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)b15);
    int i17 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable18 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj6);
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
    boolean b10 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    int i11 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b2 = concretestack_stack_stack_stack_serializable1.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str4 = concretestack_serializable3.toString();
    boolean b5 = concretestack_stack_stack_stack_serializable1.equals((java.lang.Object)concretestack_serializable3);
    java.lang.String str6 = concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_stack_serializable1);
    boolean b8 = concretestack_concretestack_stack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str10 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9.toString();
    int i11 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9.size();
    boolean b12 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9.isEmpty();
    boolean b13 = concretestack_concretestack_stack_stack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable14 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    java.lang.String str1 = concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str3 = concretestack_concretestack_str0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    concretestack_stack_stack_concretestack_str0.clear();
    java.lang.String str4 = concretestack_stack_stack_concretestack_str0.toString();
    concretestack_stack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str6 = concretestack_stack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i3 = concretestack_stack_concretestack_serializable2.size();
    int i4 = concretestack_stack_concretestack_serializable2.size();
    int i5 = concretestack_stack_concretestack_serializable2.size();
    concretestack_concretestack_stack_concretestack_serializable1.push(concretestack_stack_concretestack_serializable2);
    boolean b7 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_concretestack_concretestack_serializable8 = concretestack_stack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str3 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_concretestack_concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_concretestack_serializable0.push(stack_concretestack_concretestack_concretestack_serializable4);
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
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_stack_concretestack_charSequence0.toString();
    boolean b2 = concretestack_stack_concretestack_charSequence0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    boolean b4 = concretestack_concretestack_charSequence3.isEmpty();
    concretestack_stack_concretestack_charSequence0.push((stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>)concretestack_concretestack_charSequence3);
    java.lang.String str6 = concretestack_stack_concretestack_charSequence0.toString();
    boolean b7 = concretestack_stack_concretestack_charSequence0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[[]]"+ "'", str6.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable1.clear();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    boolean b4 = concretestack_stack_concretestack_serializable1.isEmpty();
    java.lang.String str5 = concretestack_stack_concretestack_serializable1.toString();
    boolean b6 = concretestack_stack_concretestack_str0.equals((java.lang.Object)str5);
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str7 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_stack_concretestack_str0.push((stack.Stack<stack.ConcreteStack<java.lang.String>>)concretestack_concretestack_str7);
    boolean b9 = concretestack_stack_concretestack_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str10 = concretestack_stack_concretestack_str0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str12 = concretestack_stack_concretestack_str0.get((int)'4');
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_str10);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_stack_concretestack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_serializable0.push(stack_stack_stack_concretestack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_stack_stack_stack_stack_serializable1 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    int i2 = concretestack_stack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_concretestack_serializable3.isEmpty();
    concretestack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_concretestack_concretestack_serializable3);
    concretestack_stack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_concretestack_concretestack_serializable0.clear();
    boolean b8 = concretestack_stack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.clear();
    int i4 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.size();
    int i5 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.size();
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable7 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
    boolean b8 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_serializable0.equals(obj1);
    boolean b3 = concretestack_stack_serializable0.isEmpty();
    int i4 = concretestack_stack_serializable0.size();
    java.lang.String str5 = concretestack_stack_serializable0.toString();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_serializable0.equals(obj6);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.io.Serializable> stack_serializable8 = concretestack_stack_serializable0.top();
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
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_serializable1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i3 = concretestack_concretestack_serializable2.size();
    boolean b4 = concretestack_concretestack_serializable2.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_serializable5.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_serializable5.equals(obj8);
    java.lang.String str10 = concretestack_serializable5.toString();
    boolean b11 = concretestack_concretestack_serializable2.equals((java.lang.Object)concretestack_serializable5);
    int i12 = concretestack_concretestack_serializable2.size();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable13 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable13.equals(obj14);
    java.lang.String str16 = concretestack_serializable13.toString();
    int i17 = concretestack_serializable13.size();
    concretestack_serializable13.clear();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_serializable13.equals(obj19);
    concretestack_concretestack_serializable2.push(concretestack_serializable13);
    boolean b22 = concretestack_stack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable13);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable24 = concretestack_stack_concretestack_stack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_serializable3 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

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
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i4 = concretestack_stack_concretestack_serializable3.size();
    int i5 = concretestack_stack_concretestack_serializable3.size();
    int i6 = concretestack_stack_concretestack_serializable3.size();
    concretestack_concretestack_stack_concretestack_serializable2.push(concretestack_stack_concretestack_serializable3);
    stack.ConcreteStack<java.lang.Object> concretestack_obj8 = new stack.ConcreteStack<java.lang.Object>();
    boolean b9 = concretestack_obj8.isEmpty();
    int i10 = concretestack_obj8.size();
    concretestack_obj8.push((java.lang.Object)(-1.0f));
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_obj8.equals(obj13);
    boolean b15 = concretestack_concretestack_stack_concretestack_serializable2.equals((java.lang.Object)concretestack_obj8);
    boolean b16 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)b15);
    int i17 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_serializable1.equals(obj2);
    boolean b4 = concretestack_stack_serializable1.isEmpty();
    int i5 = concretestack_stack_serializable1.size();
    java.lang.String str6 = concretestack_stack_serializable1.toString();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable7 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_serializable7.equals(obj8);
    java.lang.String str10 = concretestack_serializable7.toString();
    int i11 = concretestack_serializable7.size();
    int i12 = concretestack_serializable7.size();
    boolean b13 = concretestack_stack_serializable1.equals((java.lang.Object)i12);
    boolean b14 = concretestack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)i12);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable15 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i16 = concretestack_stack_stack_concretestack_serializable15.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable17 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable17.clear();
    int i19 = concretestack_stack_concretestack_serializable17.size();
    boolean b20 = concretestack_stack_concretestack_serializable17.isEmpty();
    java.lang.String str21 = concretestack_stack_concretestack_serializable17.toString();
    boolean b22 = concretestack_stack_concretestack_serializable17.isEmpty();
    java.lang.Object obj23 = null;
    boolean b24 = concretestack_stack_concretestack_serializable17.equals(obj23);
    concretestack_stack_stack_concretestack_serializable15.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_stack_concretestack_serializable17);
    int i26 = concretestack_stack_stack_concretestack_serializable15.size();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable27 = concretestack_stack_stack_concretestack_serializable15.pop();
    boolean b28 = concretestack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)stack_stack_concretestack_serializable27);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable30 = concretestack_concretestack_stack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_serializable27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_serializable4.equals(obj5);
    boolean b7 = concretestack_stack_serializable4.isEmpty();
    int i8 = concretestack_stack_serializable4.size();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable4);
    java.lang.String str10 = concretestack_stack_stack_serializable0.toString();
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable12 = concretestack_stack_stack_serializable0.get(0);
    int i13 = concretestack_stack_stack_serializable0.size();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_stack_stack_serializable0.equals(obj14);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_stack_stack_serializable0.equals(obj16);
    
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
    org.junit.Assert.assertNotNull(stack_stack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
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
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable0.equals((java.lang.Object)(byte)1);
    boolean b3 = concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = concretestack_concretestack_serializable0.get((int)(byte)1);
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_concretestack_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable5 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable0.equals(obj3);
    java.lang.String str5 = concretestack_serializable0.toString();
    java.lang.String str6 = concretestack_serializable0.toString();
    java.lang.String str7 = concretestack_serializable0.toString();
    concretestack_serializable0.clear();
    concretestack_serializable0.clear();
    
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

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.CharSequence> stack_charSequence2 = concretestack_stack_charSequence0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str3 = concretestack_serializable2.toString();
    boolean b4 = concretestack_stack_stack_stack_serializable0.equals((java.lang.Object)concretestack_serializable2);
    java.lang.String str5 = concretestack_stack_stack_stack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable6 = concretestack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_concretestack_stack_concretestack_serializable1.size();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable4 = concretestack_concretestack_stack_concretestack_serializable1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_stack_stack_stack_stack_serializable3 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str2 = concretestack_concretestack_concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)'#');
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
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    concretestack_stack_concretestack_charSequence0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.CharSequence>> stack_concretestack_charSequence2 = concretestack_stack_concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    boolean b5 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>> concretestack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>();
    boolean b1 = concretestack_stack_stack_charSequence0.isEmpty();
    concretestack_stack_stack_charSequence0.clear();
    stack.Stack<stack.Stack<java.lang.CharSequence>> stack_stack_charSequence3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_charSequence0.push(stack_stack_charSequence3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    int i1 = concretestack_stack_charSequence0.size();
    boolean b2 = concretestack_stack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.CharSequence> stack_charSequence3 = concretestack_stack_charSequence0.top();
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
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_serializable1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable3 = concretestack_concretestack_stack_stack_stack_stack_serializable0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    java.lang.String str3 = concretestack_stack_stack_concretestack_str0.toString();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_concretestack_str0.equals(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b3 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_str2);
    boolean b4 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_stack_concretestack_concretestack_serializable5 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_concretestack_concretestack_serializable1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_concretestack_stack_concretestack_serializable1.size();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable4 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable5 = concretestack_concretestack_concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_stack_concretestack_serializable4);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    int i2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    java.lang.String str3 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj5);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_stack_stack_concretestack_concretestack_concretestack_serializable7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b3 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_str2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_stack_concretestack_concretestack_serializable5 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.get(0);
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
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_stack_concretestack_concretestack_serializable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_concretestack_serializable0.push(stack_stack_stack_concretestack_concretestack_serializable2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.push(concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable6 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i1 = concretestack_concretestack_serializable0.size();
    boolean b2 = concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_serializable3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_serializable3.equals(obj6);
    java.lang.String str8 = concretestack_serializable3.toString();
    boolean b9 = concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable3);
    boolean b11 = concretestack_concretestack_serializable0.equals((java.lang.Object)1);
    
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
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    int i2 = concretestack_stack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_concretestack_serializable3.isEmpty();
    concretestack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_concretestack_concretestack_serializable3);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_concretestack_concretestack_serializable0.equals(obj6);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_concretestack_serializable0.get((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_serializable9);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<java.lang.String> concretestack_str1 = new stack.ConcreteStack<java.lang.String>();
    int i2 = concretestack_str1.size();
    java.lang.String str3 = concretestack_str1.toString();
    concretestack_str1.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable6.clear();
    boolean b8 = concretestack_concretestack_serializable6.isEmpty();
    boolean b9 = concretestack_str1.equals((java.lang.Object)concretestack_concretestack_serializable6);
    java.lang.String str10 = concretestack_str1.toString();
    boolean b12 = concretestack_str1.equals((java.lang.Object)'a');
    concretestack_str1.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str14 = new stack.ConcreteStack<java.lang.String>();
    int i15 = concretestack_str14.size();
    java.lang.String str16 = concretestack_str14.toString();
    concretestack_str14.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable19 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable19.clear();
    boolean b21 = concretestack_concretestack_serializable19.isEmpty();
    boolean b22 = concretestack_str14.equals((java.lang.Object)concretestack_concretestack_serializable19);
    boolean b23 = concretestack_str1.equals((java.lang.Object)concretestack_str14);
    boolean b24 = concretestack_concretestack_concretestack_str0.equals((java.lang.Object)b23);
    java.lang.Object obj25 = null;
    boolean b26 = concretestack_concretestack_concretestack_str0.equals(obj25);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str27 = concretestack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    boolean b4 = concretestack_stack_stack_stack_charSequence0.equals((java.lang.Object)concretestack_concretestack_concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>> stack_stack_stack_charSequence6 = concretestack_stack_stack_stack_charSequence0.get((int)'#');
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
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i5 = concretestack_concretestack_serializable4.size();
    boolean b6 = concretestack_concretestack_serializable4.isEmpty();
    boolean b7 = concretestack_concretestack_concretestack_serializable1.equals((java.lang.Object)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_serializable8.equals(obj9);
    concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_serializable8);
    boolean b12 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable8);
    concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    boolean b15 = concretestack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_concretestack_concretestack_serializable16 = concretestack_stack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i2 = concretestack_stack_concretestack_serializable1.size();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    int i4 = concretestack_stack_concretestack_serializable1.size();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable6 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable6.clear();
    java.lang.String str8 = concretestack_stack_concretestack_serializable6.toString();
    concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_stack_concretestack_serializable6);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable10 = concretestack_stack_concretestack_serializable6.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    boolean b4 = concretestack_stack_stack_stack_charSequence0.equals((java.lang.Object)concretestack_concretestack_concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>> stack_stack_stack_charSequence5 = concretestack_stack_stack_stack_charSequence0.top();
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
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.push(concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable5 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable6 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable5);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str2 = concretestack_stack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_serializable3);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str5 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b7 = concretestack_concretestack_str5.equals((java.lang.Object)(-1));
    boolean b8 = concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)b7);
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable11 = concretestack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    int i2 = concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_stack_concretestack_charSequence0.toString();
    boolean b2 = concretestack_stack_concretestack_charSequence0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    boolean b4 = concretestack_concretestack_charSequence3.isEmpty();
    concretestack_stack_concretestack_charSequence0.push((stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>)concretestack_concretestack_charSequence3);
    java.lang.String str6 = concretestack_concretestack_charSequence3.toString();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence7 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_charSequence3.push(concretestack_charSequence7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i3 = concretestack_concretestack_serializable2.size();
    boolean b4 = concretestack_concretestack_serializable2.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_serializable5.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_serializable5.equals(obj8);
    java.lang.String str10 = concretestack_serializable5.toString();
    boolean b11 = concretestack_concretestack_serializable2.equals((java.lang.Object)concretestack_serializable5);
    int i12 = concretestack_concretestack_serializable2.size();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable13 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable13.equals(obj14);
    java.lang.String str16 = concretestack_serializable13.toString();
    int i17 = concretestack_serializable13.size();
    concretestack_serializable13.clear();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_serializable13.equals(obj19);
    concretestack_concretestack_serializable2.push(concretestack_serializable13);
    boolean b22 = concretestack_stack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable13);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable23 = concretestack_stack_concretestack_stack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    int i4 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b3 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_str2);
    boolean b4 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_stack_concretestack_concretestack_serializable6 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.pop();
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
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_stack_concretestack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.CharSequence>> stack_concretestack_charSequence2 = concretestack_stack_concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_stack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i3 = concretestack_stack_concretestack_serializable2.size();
    concretestack_stack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_stack_concretestack_serializable2);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_stack_concretestack_serializable0.equals(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable2.equals(obj5);
    java.lang.String str7 = concretestack_serializable2.toString();
    java.lang.String str8 = concretestack_serializable2.toString();
    java.lang.String str9 = concretestack_serializable2.toString();
    boolean b10 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable2);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable11 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_serializable11.equals(obj12);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable11.equals(obj14);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_serializable16.equals(obj17);
    boolean b19 = concretestack_serializable11.equals(obj17);
    boolean b20 = concretestack_concretestack_concretestack_serializable0.equals(obj17);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable21 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b22 = concretestack_concretestack_concretestack_serializable21.isEmpty();
    concretestack_concretestack_concretestack_serializable21.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable24 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i25 = concretestack_concretestack_serializable24.size();
    boolean b26 = concretestack_concretestack_serializable24.isEmpty();
    boolean b27 = concretestack_concretestack_concretestack_serializable21.equals((java.lang.Object)concretestack_concretestack_serializable24);
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable24);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable29 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable30 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b31 = concretestack_concretestack_concretestack_serializable30.isEmpty();
    concretestack_concretestack_concretestack_serializable30.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable33 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i34 = concretestack_concretestack_serializable33.size();
    boolean b35 = concretestack_concretestack_serializable33.isEmpty();
    boolean b36 = concretestack_concretestack_concretestack_serializable30.equals((java.lang.Object)concretestack_concretestack_serializable33);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable37 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj38 = null;
    boolean b39 = concretestack_concretestack_serializable37.equals(obj38);
    concretestack_concretestack_concretestack_serializable30.push(concretestack_concretestack_serializable37);
    boolean b41 = concretestack_stack_stack_concretestack_concretestack_serializable29.equals((java.lang.Object)concretestack_concretestack_serializable37);
    concretestack_stack_stack_concretestack_concretestack_serializable29.clear();
    concretestack_stack_stack_concretestack_concretestack_serializable29.clear();
    boolean b44 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_stack_concretestack_concretestack_serializable29);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_serializable45 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable46 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i47 = concretestack_stack_concretestack_concretestack_serializable46.size();
    java.lang.Object obj48 = null;
    boolean b49 = concretestack_stack_concretestack_concretestack_serializable46.equals(obj48);
    concretestack_stack_concretestack_concretestack_serializable46.clear();
    boolean b51 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable45.equals((java.lang.Object)concretestack_stack_concretestack_concretestack_serializable46);
    concretestack_stack_stack_concretestack_concretestack_serializable29.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>)concretestack_stack_concretestack_concretestack_serializable46);
    
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
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    java.lang.String str2 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(3);
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
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> stack_concretestack_concretestack_charSequence1 = concretestack_stack_concretestack_concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_stack_stack_stack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_stack_stack_serializable0.push(concretestack_stack_stack_stack_stack_serializable3);
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
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    boolean b4 = concretestack_stack_stack_stack_charSequence0.equals((java.lang.Object)concretestack_concretestack_concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>> stack_stack_stack_charSequence5 = concretestack_stack_stack_stack_charSequence0.pop();
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
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b2 = concretestack_stack_stack_stack_concretestack_concretestack_serializable1.isEmpty();
    boolean b3 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)b2);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push(stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str0.clear();
    concretestack_concretestack_stack_concretestack_str0.clear();
    boolean b3 = concretestack_concretestack_stack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str4 = concretestack_concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_stack_concretestack_concretestack_serializable2 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_serializable0.size();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_serializable0.equals(obj2);
    concretestack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable6 = concretestack_stack_concretestack_concretestack_serializable0.get((int)(short)1);
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
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable1.clear();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable1.equals(obj3);
    boolean b5 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable4 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable3 = concretestack_stack_concretestack_stack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b2 = concretestack_stack_stack_serializable0.equals((java.lang.Object)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable3 = concretestack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.size();
    boolean b5 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable7 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str2 = concretestack_concretestack_stack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_concretestack_serializable0.equals(obj2);
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_stack_concretestack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_stack_concretestack_serializable0.push(stack_stack_stack_concretestack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_concretestack_serializable6 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(byte)-1);
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
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    int i1 = concretestack_concretestack_stack_stack_stack_stack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable2 = concretestack_concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b2 = concretestack_stack_stack_serializable1.isEmpty();
    boolean b3 = concretestack_stack_stack_serializable1.isEmpty();
    boolean b4 = concretestack_stack_stack_serializable1.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable5 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_serializable5.equals(obj6);
    boolean b8 = concretestack_stack_serializable5.isEmpty();
    int i9 = concretestack_stack_serializable5.size();
    concretestack_stack_stack_serializable1.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable5);
    boolean b11 = concretestack_stack_stack_serializable1.isEmpty();
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable12 = concretestack_stack_stack_serializable1.pop();
    boolean b13 = concretestack_stack_stack_concretestack_charSequence0.equals((java.lang.Object)concretestack_stack_stack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence14 = concretestack_stack_stack_concretestack_charSequence0.top();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_str2 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_str2 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>> concretestack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.lang.CharSequence>>>();
    boolean b1 = concretestack_stack_stack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.lang.CharSequence>> stack_stack_charSequence2 = concretestack_stack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    int i2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b2 = concretestack_stack_stack_serializable1.isEmpty();
    boolean b3 = concretestack_stack_stack_serializable1.isEmpty();
    boolean b4 = concretestack_stack_stack_serializable1.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable5 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_serializable5.equals(obj6);
    boolean b8 = concretestack_stack_serializable5.isEmpty();
    int i9 = concretestack_stack_serializable5.size();
    concretestack_stack_stack_serializable1.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable5);
    boolean b11 = concretestack_stack_stack_serializable1.isEmpty();
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable12 = concretestack_stack_stack_serializable1.pop();
    boolean b13 = concretestack_stack_stack_concretestack_charSequence0.equals((java.lang.Object)concretestack_stack_stack_serializable1);
    java.lang.String str14 = concretestack_stack_stack_concretestack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence15 = concretestack_stack_stack_concretestack_charSequence0.pop();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_serializable12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i5 = concretestack_concretestack_serializable4.size();
    boolean b6 = concretestack_concretestack_serializable4.isEmpty();
    boolean b7 = concretestack_concretestack_concretestack_serializable1.equals((java.lang.Object)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_serializable8.equals(obj9);
    concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_serializable8);
    boolean b12 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable8);
    concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_concretestack_concretestack_serializable15 = concretestack_stack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_stack_stack_serializable0.equals(obj1);
    int i3 = concretestack_concretestack_stack_stack_stack_stack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable4 = concretestack_concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence1 = concretestack_concretestack_concretestack_concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> stack_concretestack_concretestack_str2 = concretestack_stack_concretestack_concretestack_str0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_concretestack_concretestack_concretestack_serializable1.size();
    concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_concretestack_concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable5 = concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.get(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    concretestack_obj0.push((java.lang.Object)(-1.0f));
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_obj0.equals(obj5);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable7 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_serializable7.equals(obj8);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable10 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b12 = concretestack_serializable10.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable7.push(concretestack_serializable10);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_serializable7.equals(obj14);
    concretestack_concretestack_serializable7.clear();
    concretestack_obj0.push((java.lang.Object)concretestack_concretestack_serializable7);
    int i18 = concretestack_obj0.size();
    java.lang.String str19 = concretestack_obj0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[], -1.0]"+ "'", str19.equals("[[], -1.0]"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable2.equals(obj5);
    java.lang.String str7 = concretestack_serializable2.toString();
    java.lang.String str8 = concretestack_serializable2.toString();
    java.lang.String str9 = concretestack_serializable2.toString();
    boolean b10 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable2);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable11 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_serializable11.equals(obj12);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable11.equals(obj14);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_serializable16.equals(obj17);
    boolean b19 = concretestack_serializable11.equals(obj17);
    boolean b20 = concretestack_concretestack_concretestack_serializable0.equals(obj17);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable21 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj22 = null;
    boolean b23 = concretestack_concretestack_serializable21.equals(obj22);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable24 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b26 = concretestack_serializable24.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable21.push(concretestack_serializable24);
    java.lang.Object obj28 = null;
    boolean b29 = concretestack_concretestack_serializable21.equals(obj28);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable31 = concretestack_concretestack_serializable21.get(0);
    int i32 = concretestack_concretestack_serializable21.size();
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable21);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable34 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable35 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b36 = concretestack_concretestack_stack_concretestack_serializable35.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_serializable34.push(concretestack_concretestack_stack_concretestack_serializable35);
    boolean b38 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_concretestack_serializable34);
    int i39 = concretestack_concretestack_concretestack_stack_concretestack_serializable34.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable40 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_serializable34.push(concretestack_concretestack_stack_concretestack_serializable40);
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
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    boolean b2 = concretestack_concretestack_str0.equals((java.lang.Object)(-1));
    concretestack_concretestack_str0.clear();
    boolean b4 = concretestack_concretestack_str0.isEmpty();
    java.lang.String str5 = concretestack_concretestack_str0.toString();
    java.lang.String str6 = concretestack_concretestack_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable8 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
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
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    concretestack_concretestack_stack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i3 = concretestack_stack_concretestack_serializable2.size();
    int i4 = concretestack_stack_concretestack_serializable2.size();
    int i5 = concretestack_stack_concretestack_serializable2.size();
    concretestack_concretestack_stack_concretestack_serializable1.push(concretestack_stack_concretestack_serializable2);
    boolean b7 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_concretestack_serializable2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b9 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable8.isEmpty();
    int i10 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable8.size();
    boolean b11 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_stack_concretestack_concretestack_concretestack_serializable8);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_concretestack_concretestack_serializable13 = concretestack_stack_stack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i5 = concretestack_concretestack_serializable4.size();
    boolean b6 = concretestack_concretestack_serializable4.isEmpty();
    boolean b7 = concretestack_concretestack_concretestack_serializable1.equals((java.lang.Object)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_serializable8.equals(obj9);
    concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_serializable8);
    boolean b12 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable8);
    java.lang.String str13 = concretestack_stack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_concretestack_concretestack_serializable14 = concretestack_stack_stack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_charSequence0.toString();
    java.lang.String str2 = concretestack_concretestack_concretestack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence3 = concretestack_concretestack_concretestack_charSequence0.top();
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
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_stack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_stack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> stack_concretestack_stack_stack_stack_serializable5 = concretestack_stack_concretestack_stack_stack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.top();
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.get(0);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable8 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_serializable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_serializable6);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_serializable0.equals(obj1);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b5 = concretestack_serializable3.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable0.push(concretestack_serializable3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable7 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b8 = concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_concretestack_serializable7);
    stack.ConcreteStack<java.lang.String> concretestack_str9 = new stack.ConcreteStack<java.lang.String>();
    int i10 = concretestack_str9.size();
    java.lang.String str11 = concretestack_str9.toString();
    concretestack_str9.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable14 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable14.clear();
    boolean b16 = concretestack_concretestack_serializable14.isEmpty();
    boolean b17 = concretestack_str9.equals((java.lang.Object)concretestack_concretestack_serializable14);
    java.lang.String str18 = concretestack_str9.toString();
    boolean b20 = concretestack_str9.equals((java.lang.Object)'a');
    concretestack_str9.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str22 = new stack.ConcreteStack<java.lang.String>();
    int i23 = concretestack_str22.size();
    java.lang.String str24 = concretestack_str22.toString();
    concretestack_str22.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable27 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable27.clear();
    boolean b29 = concretestack_concretestack_serializable27.isEmpty();
    boolean b30 = concretestack_str22.equals((java.lang.Object)concretestack_concretestack_serializable27);
    boolean b31 = concretestack_str9.equals((java.lang.Object)concretestack_str22);
    boolean b32 = concretestack_concretestack_concretestack_concretestack_serializable7.equals((java.lang.Object)b31);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable34 = concretestack_concretestack_concretestack_concretestack_serializable7.get(0);
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[[]]"+ "'", str18.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b1 = concretestack_stack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str3 = concretestack_serializable2.toString();
    boolean b4 = concretestack_stack_stack_stack_serializable0.equals((java.lang.Object)concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>> stack_stack_stack_serializable5 = concretestack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.push(concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable5 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    int i5 = concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_stack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i3 = concretestack_stack_concretestack_serializable2.size();
    concretestack_stack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_stack_concretestack_serializable2);
    boolean b5 = concretestack_stack_stack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    int i1 = concretestack_concretestack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str2 = concretestack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i5 = concretestack_concretestack_serializable4.size();
    boolean b6 = concretestack_concretestack_serializable4.isEmpty();
    boolean b7 = concretestack_concretestack_concretestack_serializable1.equals((java.lang.Object)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_serializable8.equals(obj9);
    concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_serializable8);
    boolean b12 = concretestack_stack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable8);
    concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_stack_concretestack_concretestack_serializable0.clear();
    boolean b15 = concretestack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_stack_concretestack_concretestack_serializable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_concretestack_serializable0.push(stack_stack_concretestack_concretestack_serializable16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_concretestack_serializable0.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b5 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.isEmpty();
    java.lang.String str6 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.toString();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj7);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj9);
    boolean b11 = concretestack_stack_stack_stack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable13 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> stack_concretestack_concretestack_stack_concretestack_str1 = concretestack_stack_concretestack_concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i1 = concretestack_concretestack_serializable0.size();
    boolean b2 = concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_serializable3.equals(obj4);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_serializable3.equals(obj6);
    java.lang.String str8 = concretestack_serializable3.toString();
    boolean b9 = concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable3);
    int i10 = concretestack_concretestack_serializable0.size();
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_concretestack_serializable0.equals(obj11);
    boolean b13 = concretestack_concretestack_serializable0.isEmpty();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    boolean b2 = concretestack_stack_serializable0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_serializable0.equals(obj3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b6 = concretestack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_concretestack_serializable5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable7 = concretestack_concretestack_concretestack_stack_concretestack_serializable5.pop();
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
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<java.lang.String> concretestack_str1 = new stack.ConcreteStack<java.lang.String>();
    int i2 = concretestack_str1.size();
    java.lang.String str3 = concretestack_str1.toString();
    concretestack_str1.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable6 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable6.clear();
    boolean b8 = concretestack_concretestack_serializable6.isEmpty();
    boolean b9 = concretestack_str1.equals((java.lang.Object)concretestack_concretestack_serializable6);
    java.lang.String str10 = concretestack_str1.toString();
    boolean b12 = concretestack_str1.equals((java.lang.Object)'a');
    concretestack_str1.clear();
    stack.ConcreteStack<java.lang.String> concretestack_str14 = new stack.ConcreteStack<java.lang.String>();
    int i15 = concretestack_str14.size();
    java.lang.String str16 = concretestack_str14.toString();
    concretestack_str14.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable19 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable19.clear();
    boolean b21 = concretestack_concretestack_serializable19.isEmpty();
    boolean b22 = concretestack_str14.equals((java.lang.Object)concretestack_concretestack_serializable19);
    boolean b23 = concretestack_str1.equals((java.lang.Object)concretestack_str14);
    boolean b24 = concretestack_concretestack_concretestack_str0.equals((java.lang.Object)b23);
    java.lang.Object obj25 = null;
    boolean b26 = concretestack_concretestack_concretestack_str0.equals(obj25);
    java.lang.String str27 = concretestack_concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str29 = concretestack_concretestack_concretestack_str0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Object> concretestack_obj1 = concretestack_concretestack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_concretestack_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable2.equals(obj5);
    java.lang.String str7 = concretestack_serializable2.toString();
    java.lang.String str8 = concretestack_serializable2.toString();
    java.lang.String str9 = concretestack_serializable2.toString();
    boolean b10 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable2);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable11 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_serializable11.equals(obj12);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable11.equals(obj14);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_serializable16.equals(obj17);
    boolean b19 = concretestack_serializable11.equals(obj17);
    boolean b20 = concretestack_concretestack_concretestack_serializable0.equals(obj17);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable21 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str22 = concretestack_serializable21.toString();
    boolean b23 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable21);
    concretestack_concretestack_concretestack_serializable0.clear();
    
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
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[]"+ "'", str22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    boolean b1 = concretestack_concretestack_charSequence0.isEmpty();
    concretestack_concretestack_charSequence0.clear();
    java.lang.String str3 = concretestack_concretestack_charSequence0.toString();
    java.lang.String str4 = concretestack_concretestack_charSequence0.toString();
    int i5 = concretestack_concretestack_charSequence0.size();
    boolean b6 = concretestack_concretestack_charSequence0.isEmpty();
    boolean b7 = concretestack_concretestack_charSequence0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable2 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable2.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable2.equals(obj5);
    java.lang.String str7 = concretestack_serializable2.toString();
    java.lang.String str8 = concretestack_serializable2.toString();
    java.lang.String str9 = concretestack_serializable2.toString();
    boolean b10 = concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable2);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable11 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_serializable11.equals(obj12);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable11.equals(obj14);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_serializable16.equals(obj17);
    boolean b19 = concretestack_serializable11.equals(obj17);
    boolean b20 = concretestack_concretestack_concretestack_serializable0.equals(obj17);
    java.lang.String str21 = concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable22);
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
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>> stack_stack_stack_charSequence1 = concretestack_stack_stack_stack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_charSequence0.isEmpty();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_charSequence0.push(stack_stack_concretestack_charSequence2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    concretestack_stack_stack_concretestack_str0.clear();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_str0.push(stack_stack_concretestack_str4);
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
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_stack_stack_concretestack_serializable0.equals(obj2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b5 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.isEmpty();
    java.lang.String str6 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.toString();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj7);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals(obj9);
    boolean b11 = concretestack_stack_stack_stack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable12 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable4.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_stack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable2.clear();
    int i4 = concretestack_stack_concretestack_serializable2.size();
    boolean b5 = concretestack_stack_concretestack_serializable2.isEmpty();
    java.lang.String str6 = concretestack_stack_concretestack_serializable2.toString();
    boolean b7 = concretestack_stack_concretestack_serializable2.isEmpty();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_stack_concretestack_serializable2.equals(obj8);
    concretestack_stack_stack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_stack_concretestack_serializable2);
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable11 = concretestack_stack_stack_concretestack_serializable0.pop();
    int i12 = concretestack_stack_stack_concretestack_serializable0.size();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_serializable0.push(stack_stack_concretestack_serializable13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_serializable11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    boolean b3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.toString();
    stack.ConcreteStack<java.lang.String> concretestack_str6 = new stack.ConcreteStack<java.lang.String>();
    int i7 = concretestack_str6.size();
    java.lang.String str8 = concretestack_str6.toString();
    concretestack_str6.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable11 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable11.clear();
    boolean b13 = concretestack_concretestack_serializable11.isEmpty();
    boolean b14 = concretestack_str6.equals((java.lang.Object)concretestack_concretestack_serializable11);
    boolean b15 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals((java.lang.Object)b14);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable16 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_concretestack_serializable16.equals(obj17);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable19 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b21 = concretestack_serializable19.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable16.push(concretestack_serializable19);
    java.lang.Object obj23 = null;
    boolean b24 = concretestack_concretestack_serializable16.equals(obj23);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable26 = concretestack_concretestack_serializable16.get(0);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable27 = concretestack_concretestack_serializable16.top();
    int i28 = concretestack_concretestack_serializable16.size();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable29 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj30 = null;
    boolean b31 = concretestack_serializable29.equals(obj30);
    java.lang.Object obj32 = null;
    boolean b33 = concretestack_serializable29.equals(obj32);
    java.lang.String str34 = concretestack_serializable29.toString();
    java.lang.String str35 = concretestack_serializable29.toString();
    java.lang.String str36 = concretestack_serializable29.toString();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable37 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj38 = null;
    boolean b39 = concretestack_serializable37.equals(obj38);
    java.lang.Object obj40 = null;
    boolean b41 = concretestack_serializable37.equals(obj40);
    concretestack_serializable37.clear();
    boolean b43 = concretestack_serializable29.equals((java.lang.Object)concretestack_serializable37);
    concretestack_concretestack_serializable16.push(concretestack_serializable37);
    boolean b45 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals((java.lang.Object)concretestack_serializable37);
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable47 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable49 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable47);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b2 = concretestack_concretestack_stack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_serializable0.push(concretestack_concretestack_stack_concretestack_serializable1);
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_serializable1.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i6 = concretestack_stack_concretestack_serializable5.size();
    int i7 = concretestack_stack_concretestack_serializable5.size();
    int i8 = concretestack_stack_concretestack_serializable5.size();
    concretestack_stack_concretestack_serializable5.clear();
    concretestack_stack_concretestack_serializable5.clear();
    java.lang.String str11 = concretestack_stack_concretestack_serializable5.toString();
    concretestack_concretestack_stack_concretestack_serializable1.push(concretestack_stack_concretestack_serializable5);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable14 = concretestack_concretestack_stack_concretestack_serializable1.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_serializable1.size();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_serializable1.toString();
    concretestack_concretestack_stack_concretestack_concretestack_serializable0.push(concretestack_stack_concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable5 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable6 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_serializable5);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    int i1 = concretestack_stack_charSequence0.size();
    java.lang.String str2 = concretestack_stack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.CharSequence> stack_charSequence3 = concretestack_stack_charSequence0.top();
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
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable1);
    boolean b5 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable7 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.String str8 = concretestack_stack_concretestack_concretestack_serializable7.toString();
    int i9 = concretestack_stack_concretestack_concretestack_serializable7.size();
    boolean b10 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.equals((java.lang.Object)i9);
    int i11 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable13 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    boolean b3 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b5 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.isEmpty();
    java.lang.String str6 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.toString();
    concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>)concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    int i8 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_stack_concretestack_concretestack_concretestack_serializable9);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable3 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable3.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str6 = concretestack_serializable5.toString();
    concretestack_stack_serializable3.push((stack.Stack<java.io.Serializable>)concretestack_serializable5);
    concretestack_stack_stack_serializable2.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable3);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_serializable3.equals(obj9);
    boolean b11 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("[[]]");
    java.lang.String str5 = concretestack_str0.pop();
    concretestack_str0.push("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[[]]"+ "'", str5.equals("[[]]"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> stack_concretestack_concretestack_stack_concretestack_str2 = concretestack_stack_concretestack_concretestack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_str0.toString();
    boolean b2 = concretestack_stack_concretestack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> stack_concretestack_concretestack_str3 = concretestack_stack_concretestack_concretestack_str0.top();
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
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b2 = concretestack_stack_stack_stack_serializable1.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str4 = concretestack_serializable3.toString();
    boolean b5 = concretestack_stack_stack_stack_serializable1.equals((java.lang.Object)concretestack_serializable3);
    java.lang.String str6 = concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_stack_serializable1);
    boolean b8 = concretestack_concretestack_stack_stack_stack_serializable0.isEmpty();
    java.lang.String str9 = concretestack_concretestack_stack_stack_stack_serializable0.toString();
    java.lang.String str10 = concretestack_concretestack_stack_stack_stack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_stack_serializable11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[[]]"+ "'", str10.equals("[[]]"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.toString();
    concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.push(concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_serializable5.clear();
    boolean b7 = concretestack_concretestack_stack_stack_stack_stack_serializable5.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.push(concretestack_concretestack_stack_stack_stack_stack_serializable5);
    int i9 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable1);
    boolean b5 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    java.lang.String str8 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable11 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable11.clear();
    java.lang.String str13 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable11.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable10.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable11);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable15 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable10.top();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable16 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable10.top();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable16);
    int i18 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_stack_serializable15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_stack_serializable16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_stack_serializable0.isEmpty();
    int i3 = concretestack_stack_stack_serializable0.size();
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_serializable0.push(stack_stack_serializable4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    int i1 = concretestack_concretestack_obj0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b3 = concretestack_concretestack_concretestack_serializable2.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable4.equals(obj5);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_serializable4.equals(obj7);
    java.lang.String str9 = concretestack_serializable4.toString();
    java.lang.String str10 = concretestack_serializable4.toString();
    java.lang.String str11 = concretestack_serializable4.toString();
    boolean b12 = concretestack_concretestack_concretestack_serializable2.equals((java.lang.Object)concretestack_serializable4);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable13 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable13.equals(obj14);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_serializable13.equals(obj16);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable18 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_serializable18.equals(obj19);
    boolean b21 = concretestack_serializable13.equals(obj19);
    boolean b22 = concretestack_concretestack_concretestack_serializable2.equals(obj19);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable23 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b24 = concretestack_concretestack_concretestack_serializable23.isEmpty();
    concretestack_concretestack_concretestack_serializable23.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable26 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i27 = concretestack_concretestack_serializable26.size();
    boolean b28 = concretestack_concretestack_serializable26.isEmpty();
    boolean b29 = concretestack_concretestack_concretestack_serializable23.equals((java.lang.Object)concretestack_concretestack_serializable26);
    concretestack_concretestack_concretestack_serializable2.push(concretestack_concretestack_serializable26);
    boolean b31 = concretestack_concretestack_obj0.equals((java.lang.Object)concretestack_concretestack_concretestack_serializable2);
    java.lang.String str32 = concretestack_concretestack_obj0.toString();
    stack.ConcreteStack<java.lang.Object> concretestack_obj33 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_obj0.push(concretestack_obj33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    int i3 = concretestack_concretestack_stack_concretestack_concretestack_serializable2.size();
    concretestack_concretestack_stack_concretestack_concretestack_serializable2.clear();
    concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_concretestack_stack_concretestack_concretestack_serializable2);
    int i6 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1.size();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_serializable1);
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_serializable8 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_serializable10 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_serializable0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_stack_concretestack_stack_concretestack_concretestack_serializable8);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> stack_concretestack_concretestack_str1 = concretestack_stack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_serializable0.push(concretestack_stack_concretestack_concretestack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str2 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i1 = concretestack_stack_concretestack_serializable0.size();
    int i2 = concretestack_stack_concretestack_serializable0.size();
    boolean b3 = concretestack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable4 = concretestack_stack_concretestack_serializable0.pop();
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
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_stack_stack_serializable0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> stack_stack_stack_stack_serializable2 = concretestack_stack_stack_stack_stack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable5 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.top();
    boolean b6 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable5.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_stack_serializable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str1 = concretestack_serializable0.toString();
    boolean b2 = concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str2.clear();
    concretestack_concretestack_stack_concretestack_str2.clear();
    boolean b5 = concretestack_concretestack_stack_concretestack_str2.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_str2);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_stack_concretestack_str2.equals(obj7);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str10 = concretestack_concretestack_stack_concretestack_str2.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_str3 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_stack_concretestack_concretestack_serializable1 = concretestack_stack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    boolean b2 = concretestack_concretestack_serializable0.equals((java.lang.Object)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    int i2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    int i3 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
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
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str0.clear();
    concretestack_concretestack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str3 = concretestack_concretestack_stack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2);
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.equals(obj4);
    boolean b6 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.isEmpty();
    boolean b7 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    boolean b2 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
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
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_concretestack_stack_stack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable2 = concretestack_concretestack_stack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    boolean b3 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    int i4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable7 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b4 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.clear();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.clear();
    boolean b7 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.isEmpty();
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_serializable0.toString();
    int i4 = concretestack_serializable0.size();
    concretestack_serializable0.clear();
    concretestack_serializable0.push((java.io.Serializable)100L);
    int i8 = concretestack_serializable0.size();
    java.io.Serializable serializable10 = concretestack_serializable0.get((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable10 + "' != '" + 100L+ "'", serializable10.equals(100L));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable2 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> stack_stack_concretestack_stack_concretestack_concretestack_str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_stack_concretestack_concretestack_str1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_charSequence0.push(concretestack_concretestack_concretestack_charSequence1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i1 = concretestack_stack_concretestack_serializable0.size();
    int i2 = concretestack_stack_concretestack_serializable0.size();
    boolean b3 = concretestack_stack_concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_stack_concretestack_serializable0.isEmpty();
    
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
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> stack_concretestack_stack_concretestack_concretestack_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_concretestack_concretestack_str0.push(stack_concretestack_stack_concretestack_concretestack_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    concretestack_stack_concretestack_concretestack_charSequence0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> stack_concretestack_concretestack_charSequence3 = concretestack_stack_concretestack_concretestack_charSequence0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    concretestack_obj0.push((java.lang.Object)(-1.0f));
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_obj0.equals(obj5);
    java.lang.Object obj7 = concretestack_obj0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1.0f)+ "'", obj7.equals((-1.0f)));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }

    stack.ConcreteStack<java.lang.Object> concretestack_obj0 = new stack.ConcreteStack<java.lang.Object>();
    boolean b1 = concretestack_obj0.isEmpty();
    int i2 = concretestack_obj0.size();
    concretestack_obj0.push((java.lang.Object)(-1.0f));
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_obj0.equals(obj5);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable7 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_concretestack_serializable7.equals(obj8);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable10 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b12 = concretestack_serializable10.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable7.push(concretestack_serializable10);
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_concretestack_serializable7.equals(obj14);
    concretestack_concretestack_serializable7.clear();
    concretestack_obj0.push((java.lang.Object)concretestack_concretestack_serializable7);
    concretestack_obj0.clear();
    int i19 = concretestack_obj0.size();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj20 = concretestack_obj0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    int i4 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5.isEmpty();
    int i7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5.size();
    concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>)concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5);
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable9 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.pop();
    java.lang.String str10 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    java.lang.String str11 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_stack_concretestack_concretestack_concretestack_serializable9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    int i4 = concretestack_concretestack_concretestack_concretestack_serializable0.size();
    boolean b5 = concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    boolean b6 = concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable9 = concretestack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_str0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_str0.isEmpty();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence3 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b4 = concretestack_charSequence3.isEmpty();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_charSequence3.equals(obj5);
    boolean b8 = concretestack_charSequence3.equals((java.lang.Object)1.0d);
    concretestack_charSequence3.push((java.lang.CharSequence)"hi!");
    boolean b11 = concretestack_concretestack_concretestack_stack_concretestack_str0.equals((java.lang.Object)concretestack_charSequence3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str12 = concretestack_concretestack_concretestack_stack_concretestack_str0.top();
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    concretestack_concretestack_str0.clear();
    java.lang.String str2 = concretestack_concretestack_str0.toString();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable3 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_serializable3.equals(obj4);
    boolean b6 = concretestack_stack_serializable3.isEmpty();
    int i7 = concretestack_stack_serializable3.size();
    java.lang.String str8 = concretestack_stack_serializable3.toString();
    boolean b9 = concretestack_concretestack_str0.equals((java.lang.Object)str8);
    java.lang.Object obj10 = null;
    boolean b11 = concretestack_concretestack_str0.equals(obj10);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_concretestack_str0.equals(obj12);
    boolean b14 = concretestack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str15 = concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable3 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_stack_concretestack_charSequence0.toString();
    boolean b2 = concretestack_stack_concretestack_charSequence0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    boolean b4 = concretestack_concretestack_charSequence3.isEmpty();
    concretestack_stack_concretestack_charSequence0.push((stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>)concretestack_concretestack_charSequence3);
    java.lang.String str6 = concretestack_concretestack_charSequence3.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence8 = concretestack_concretestack_charSequence3.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_stack_concretestack_charSequence0.toString();
    boolean b2 = concretestack_stack_concretestack_charSequence0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence3 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    boolean b4 = concretestack_concretestack_charSequence3.isEmpty();
    concretestack_stack_concretestack_charSequence0.push((stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>)concretestack_concretestack_charSequence3);
    stack.Stack<stack.ConcreteStack<java.lang.CharSequence>> stack_concretestack_charSequence7 = concretestack_stack_concretestack_charSequence0.get(0);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_stack_concretestack_charSequence0.equals(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_charSequence7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> concretestack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str2 = concretestack_concretestack_concretestack_str0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    int i1 = concretestack_stack_concretestack_stack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable3 = concretestack_stack_concretestack_stack_concretestack_serializable0.get((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b2 = concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_concretestack_concretestack_serializable1.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i5 = concretestack_concretestack_serializable4.size();
    boolean b6 = concretestack_concretestack_serializable4.isEmpty();
    boolean b7 = concretestack_concretestack_concretestack_serializable1.equals((java.lang.Object)concretestack_concretestack_serializable4);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_serializable8.equals(obj9);
    concretestack_concretestack_concretestack_serializable1.push(concretestack_concretestack_serializable8);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable13 = concretestack_concretestack_concretestack_serializable1.get(0);
    boolean b14 = concretestack_stack_stack_stack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_serializable13);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable15 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str16 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable15.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable17 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable15.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable17);
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable17.equals(obj19);
    boolean b21 = concretestack_concretestack_serializable13.equals((java.lang.Object)b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_serializable13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable4 = concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_serializable0.toString();
    concretestack_serializable0.push((java.io.Serializable)(byte)10);
    java.io.Serializable serializable7 = concretestack_serializable0.get(0);
    java.io.Serializable serializable8 = concretestack_serializable0.top();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_serializable0.equals(obj9);
    java.io.Serializable serializable11 = concretestack_serializable0.top();
    concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (byte)10+ "'", serializable7.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (byte)10+ "'", serializable8.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable11 + "' != '" + (byte)10+ "'", serializable11.equals((byte)10));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_stack_stack_stack_stack_serializable2 = concretestack_concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    int i1 = concretestack_stack_charSequence0.size();
    java.lang.String str2 = concretestack_stack_charSequence0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_charSequence0.equals(obj3);
    java.lang.String str5 = concretestack_stack_charSequence0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> stack_concretestack_stack_concretestack_concretestack_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_concretestack_concretestack_str0.push(stack_concretestack_stack_concretestack_concretestack_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i2 = concretestack_stack_concretestack_concretestack_serializable1.size();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_serializable1.toString();
    concretestack_concretestack_stack_concretestack_concretestack_serializable0.push(concretestack_stack_concretestack_concretestack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable5 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.pop();
    boolean b6 = concretestack_stack_concretestack_concretestack_serializable5.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> stack_concretestack_concretestack_serializable7 = concretestack_stack_concretestack_concretestack_serializable5.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_concretestack_concretestack_serializable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_charSequence0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> stack_concretestack_concretestack_charSequence2 = concretestack_stack_concretestack_concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_concretestack_serializable0.toString();
    concretestack_stack_stack_stack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.size();
    concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_serializable0.toString();
    concretestack_serializable0.push((java.io.Serializable)(byte)10);
    java.io.Serializable serializable7 = concretestack_serializable0.get(0);
    java.lang.Object obj8 = null;
    boolean b9 = concretestack_serializable0.equals(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (byte)10+ "'", serializable7.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }

    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable0.clear();
    boolean b2 = concretestack_stack_serializable0.isEmpty();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_serializable0.equals(obj3);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_stack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b6 = concretestack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_concretestack_serializable5);
    int i7 = concretestack_concretestack_concretestack_stack_concretestack_serializable5.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable9 = concretestack_concretestack_concretestack_stack_concretestack_serializable5.get((int)(byte)100);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    concretestack_stack_serializable1.clear();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str4 = concretestack_serializable3.toString();
    concretestack_stack_serializable1.push((stack.Stack<java.io.Serializable>)concretestack_serializable3);
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable1);
    int i7 = concretestack_stack_stack_serializable0.size();
    concretestack_stack_stack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    concretestack_concretestack_stack_stack_stack_serializable0.clear();
    boolean b2 = concretestack_concretestack_stack_stack_stack_serializable0.isEmpty();
    java.lang.String str3 = concretestack_concretestack_stack_stack_stack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>> concretestack_concretestack_stack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_stack_concretestack_charSequence1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    concretestack_concretestack_stack_stack_concretestack_charSequence0.push(concretestack_stack_stack_concretestack_charSequence1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence3 = concretestack_stack_stack_concretestack_charSequence1.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    concretestack_str0.push("[[[]], []]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    concretestack_concretestack_stack_concretestack_serializable0.clear();
    boolean b3 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_concretestack_stack_concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }

    stack.ConcreteStack<java.lang.String> concretestack_str0 = new stack.ConcreteStack<java.lang.String>();
    int i1 = concretestack_str0.size();
    java.lang.String str2 = concretestack_str0.toString();
    concretestack_str0.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable5.clear();
    boolean b7 = concretestack_concretestack_serializable5.isEmpty();
    boolean b8 = concretestack_str0.equals((java.lang.Object)concretestack_concretestack_serializable5);
    java.lang.String str9 = concretestack_str0.toString();
    concretestack_str0.push("");
    concretestack_str0.push("[[], []]");
    java.lang.String str14 = concretestack_str0.top();
    concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = concretestack_str0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[[]]"+ "'", str9.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[[], []]"+ "'", str14.equals("[[], []]"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable2 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    int i1 = concretestack_stack_charSequence0.size();
    boolean b2 = concretestack_stack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.CharSequence> stack_charSequence3 = concretestack_stack_charSequence0.pop();
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
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals(obj2);
    boolean b5 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.equals((java.lang.Object)'#');
    concretestack_concretestack_stack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable7 = concretestack_concretestack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_concretestack_concretestack_stack_concretestack_concretestack_str2 = concretestack_concretestack_concretestack_concretestack_stack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_charSequence0.isEmpty();
    concretestack_stack_stack_concretestack_charSequence0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence3 = concretestack_stack_stack_concretestack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }

    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence0 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b1 = concretestack_charSequence0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_charSequence0.equals(obj2);
    boolean b5 = concretestack_charSequence0.equals((java.lang.Object)1.0d);
    concretestack_charSequence0.clear();
    boolean b7 = concretestack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.CharSequence charSequence9 = concretestack_charSequence0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.toString();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_stack_stack_stack_stack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.push(stack_concretestack_stack_stack_stack_stack_serializable3);
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
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_stack_concretestack_charSequence0.push(stack_stack_concretestack_charSequence1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence3 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    int i4 = concretestack_stack_charSequence3.size();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence5 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b6 = concretestack_charSequence5.isEmpty();
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_charSequence5.equals(obj7);
    concretestack_charSequence5.push((java.lang.CharSequence)"[10]");
    concretestack_stack_charSequence3.push((stack.Stack<java.lang.CharSequence>)concretestack_charSequence5);
    java.lang.CharSequence charSequence12 = concretestack_charSequence5.top();
    java.lang.Object obj13 = null;
    boolean b14 = concretestack_charSequence5.equals(obj13);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable15 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str16 = concretestack_serializable15.toString();
    boolean b17 = concretestack_charSequence5.equals((java.lang.Object)str16);
    boolean b18 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)str16);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable19 = concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + charSequence12 + "' != '" + "[10]"+ "'", charSequence12.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    concretestack_stack_concretestack_concretestack_charSequence0.clear();
    concretestack_stack_concretestack_concretestack_charSequence0.clear();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> stack_concretestack_concretestack_charSequence3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_charSequence0.push(stack_concretestack_concretestack_charSequence3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str3 = concretestack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_serializable2.toString();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_stack_concretestack_concretestack_concretestack_serializable2.equals(obj6);
    concretestack_stack_concretestack_concretestack_concretestack_serializable2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str2 = concretestack_concretestack_concretestack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    concretestack_stack_stack_concretestack_str0.clear();
    java.lang.String str4 = concretestack_stack_stack_concretestack_str0.toString();
    concretestack_stack_stack_concretestack_str0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str7 = concretestack_stack_stack_concretestack_str0.get(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_str0.toString();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> stack_concretestack_concretestack_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_str0.push(stack_concretestack_concretestack_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.String>> concretestack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.String> concretestack_str1 = concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence1 = concretestack_concretestack_concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_concretestack_stack_stack_concretestack_serializable0.clear();
    concretestack_concretestack_stack_stack_concretestack_serializable0.clear();
    boolean b3 = concretestack_concretestack_stack_stack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable4 = concretestack_concretestack_stack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.String str2 = concretestack_stack_concretestack_concretestack_serializable1.toString();
    int i3 = concretestack_stack_concretestack_concretestack_serializable1.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b5 = concretestack_concretestack_concretestack_serializable4.isEmpty();
    concretestack_stack_concretestack_concretestack_serializable1.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_concretestack_concretestack_serializable4);
    concretestack_concretestack_concretestack_serializable4.clear();
    boolean b8 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_serializable4);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> stack_concretestack_stack_concretestack_concretestack_concretestack_serializable10 = concretestack_stack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.get(0);
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
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_str0.isEmpty();
    int i2 = concretestack_stack_stack_concretestack_str0.size();
    concretestack_stack_stack_concretestack_str0.clear();
    java.lang.String str4 = concretestack_stack_stack_concretestack_str0.toString();
    concretestack_stack_stack_concretestack_str0.clear();
    int i6 = concretestack_stack_stack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.String>>> stack_stack_concretestack_str7 = concretestack_stack_stack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b2 = concretestack_stack_stack_stack_serializable1.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable3 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str4 = concretestack_serializable3.toString();
    boolean b5 = concretestack_stack_stack_stack_serializable1.equals((java.lang.Object)concretestack_serializable3);
    java.lang.String str6 = concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_stack_serializable1);
    boolean b8 = concretestack_concretestack_stack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    java.lang.String str10 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9.toString();
    int i11 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9.size();
    boolean b12 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9.isEmpty();
    boolean b13 = concretestack_concretestack_stack_stack_stack_serializable0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9);
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable9.push(concretestack_stack_concretestack_concretestack_concretestack_serializable14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    boolean b3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    java.lang.String str5 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.toString();
    stack.ConcreteStack<java.lang.String> concretestack_str6 = new stack.ConcreteStack<java.lang.String>();
    int i7 = concretestack_str6.size();
    java.lang.String str8 = concretestack_str6.toString();
    concretestack_str6.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable11 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable11.clear();
    boolean b13 = concretestack_concretestack_serializable11.isEmpty();
    boolean b14 = concretestack_str6.equals((java.lang.Object)concretestack_concretestack_serializable11);
    boolean b15 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals((java.lang.Object)b14);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable16 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj17 = null;
    boolean b18 = concretestack_concretestack_serializable16.equals(obj17);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable19 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b21 = concretestack_serializable19.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable16.push(concretestack_serializable19);
    java.lang.Object obj23 = null;
    boolean b24 = concretestack_concretestack_serializable16.equals(obj23);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable26 = concretestack_concretestack_serializable16.get(0);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable27 = concretestack_concretestack_serializable16.top();
    int i28 = concretestack_concretestack_serializable16.size();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable29 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj30 = null;
    boolean b31 = concretestack_serializable29.equals(obj30);
    java.lang.Object obj32 = null;
    boolean b33 = concretestack_serializable29.equals(obj32);
    java.lang.String str34 = concretestack_serializable29.toString();
    java.lang.String str35 = concretestack_serializable29.toString();
    java.lang.String str36 = concretestack_serializable29.toString();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable37 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj38 = null;
    boolean b39 = concretestack_serializable37.equals(obj38);
    java.lang.Object obj40 = null;
    boolean b41 = concretestack_serializable37.equals(obj40);
    concretestack_serializable37.clear();
    boolean b43 = concretestack_serializable29.equals((java.lang.Object)concretestack_serializable37);
    concretestack_concretestack_serializable16.push(concretestack_serializable37);
    boolean b45 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4.equals((java.lang.Object)concretestack_serializable37);
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4);
    java.lang.String str47 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable48 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[[]]"+ "'", str47.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable48);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>();
    boolean b1 = concretestack_concretestack_concretestack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence2 = concretestack_concretestack_concretestack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>> concretestack_concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>();
    concretestack_concretestack_stack_charSequence0.clear();
    int i2 = concretestack_concretestack_stack_charSequence0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence3 = concretestack_concretestack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.toString();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.equals(obj4);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_stack_stack_serializable6 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>> concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>();
    boolean b1 = concretestack_concretestack_charSequence0.isEmpty();
    concretestack_concretestack_charSequence0.clear();
    concretestack_concretestack_charSequence0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    concretestack_stack_concretestack_serializable1.clear();
    int i3 = concretestack_stack_concretestack_serializable1.size();
    boolean b4 = concretestack_stack_concretestack_serializable1.isEmpty();
    java.lang.String str5 = concretestack_stack_concretestack_serializable1.toString();
    boolean b6 = concretestack_stack_concretestack_str0.equals((java.lang.Object)str5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.String>> stack_concretestack_str7 = concretestack_stack_concretestack_str0.top();
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
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable3 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>();
    boolean b4 = concretestack_stack_stack_stack_serializable3.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable5 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.String str6 = concretestack_serializable5.toString();
    boolean b7 = concretestack_stack_stack_stack_serializable3.equals((java.lang.Object)concretestack_serializable5);
    java.lang.String str8 = concretestack_stack_stack_stack_serializable3.toString();
    concretestack_concretestack_stack_stack_stack_serializable2.push(concretestack_stack_stack_stack_serializable3);
    boolean b10 = concretestack_concretestack_stack_stack_stack_serializable2.isEmpty();
    java.lang.String str11 = concretestack_concretestack_stack_stack_stack_serializable2.toString();
    concretestack_stack_concretestack_stack_stack_stack_serializable1.push((stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>)concretestack_concretestack_stack_stack_stack_serializable2);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable14 = concretestack_concretestack_stack_stack_stack_serializable2.get((int)(byte)0);
    boolean b15 = concretestack_stack_concretestack_charSequence0.equals((java.lang.Object)concretestack_concretestack_stack_stack_stack_serializable2);
    int i16 = concretestack_stack_concretestack_charSequence0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.lang.CharSequence>> stack_concretestack_charSequence18 = concretestack_stack_concretestack_charSequence0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[[]]"+ "'", str11.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_stack_serializable14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>();
    int i1 = concretestack_stack_stack_concretestack_serializable0.size();
    java.lang.String str2 = concretestack_stack_stack_concretestack_serializable0.toString();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_stack_stack_concretestack_serializable0.equals(obj3);
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_stack_concretestack_serializable0.equals(obj5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> stack_stack_concretestack_serializable8 = concretestack_stack_stack_concretestack_serializable0.get(10);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b3 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable2);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable4 = concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    int i1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    boolean b2 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable3.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str6 = concretestack_stack_concretestack_concretestack_concretestack_serializable5.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable3.push(concretestack_stack_concretestack_concretestack_concretestack_serializable5);
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_stack_concretestack_concretestack_concretestack_serializable5);
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }

    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    int i1 = concretestack_stack_charSequence0.size();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence2 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b3 = concretestack_charSequence2.isEmpty();
    java.lang.Object obj4 = null;
    boolean b5 = concretestack_charSequence2.equals(obj4);
    concretestack_charSequence2.push((java.lang.CharSequence)"[10]");
    concretestack_stack_charSequence0.push((stack.Stack<java.lang.CharSequence>)concretestack_charSequence2);
    stack.Stack<java.lang.CharSequence> stack_charSequence9 = concretestack_stack_charSequence0.pop();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<java.lang.CharSequence> stack_charSequence10 = concretestack_stack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_charSequence9);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_stack_stack_concretestack_concretestack_serializable3 = concretestack_stack_stack_stack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> stack_concretestack_stack_concretestack_concretestack_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_concretestack_concretestack_str0.push(stack_concretestack_stack_concretestack_concretestack_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>> concretestack_stack_stack_stack_charSequence0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>>>();
    boolean b1 = concretestack_stack_stack_stack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<java.lang.CharSequence>>> stack_stack_stack_charSequence2 = concretestack_stack_stack_stack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>> concretestack_concretestack_stack_stack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_stack_stack_concretestack_charSequence1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    concretestack_concretestack_stack_stack_concretestack_charSequence0.push(concretestack_stack_stack_concretestack_charSequence1);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<java.lang.CharSequence>>> stack_stack_concretestack_charSequence3 = concretestack_stack_stack_concretestack_charSequence1.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    java.lang.String str1 = concretestack_concretestack_concretestack_stack_concretestack_str0.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str2 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>();
    concretestack_concretestack_stack_concretestack_str2.clear();
    concretestack_concretestack_stack_concretestack_str2.clear();
    boolean b5 = concretestack_concretestack_stack_concretestack_str2.isEmpty();
    concretestack_concretestack_concretestack_stack_concretestack_str0.push(concretestack_concretestack_stack_concretestack_str2);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_concretestack_stack_concretestack_str2.equals(obj7);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>> concretestack_stack_concretestack_str9 = concretestack_concretestack_stack_concretestack_str2.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    int i1 = concretestack_concretestack_obj0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b3 = concretestack_concretestack_concretestack_serializable2.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable4.equals(obj5);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_serializable4.equals(obj7);
    java.lang.String str9 = concretestack_serializable4.toString();
    java.lang.String str10 = concretestack_serializable4.toString();
    java.lang.String str11 = concretestack_serializable4.toString();
    boolean b12 = concretestack_concretestack_concretestack_serializable2.equals((java.lang.Object)concretestack_serializable4);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable13 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable13.equals(obj14);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_serializable13.equals(obj16);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable18 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_serializable18.equals(obj19);
    boolean b21 = concretestack_serializable13.equals(obj19);
    boolean b22 = concretestack_concretestack_concretestack_serializable2.equals(obj19);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable23 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b24 = concretestack_concretestack_concretestack_serializable23.isEmpty();
    concretestack_concretestack_concretestack_serializable23.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable26 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i27 = concretestack_concretestack_serializable26.size();
    boolean b28 = concretestack_concretestack_serializable26.isEmpty();
    boolean b29 = concretestack_concretestack_concretestack_serializable23.equals((java.lang.Object)concretestack_concretestack_serializable26);
    concretestack_concretestack_concretestack_serializable2.push(concretestack_concretestack_serializable26);
    boolean b31 = concretestack_concretestack_obj0.equals((java.lang.Object)concretestack_concretestack_concretestack_serializable2);
    stack.ConcreteStack<java.lang.Object> concretestack_obj32 = new stack.ConcreteStack<java.lang.Object>();
    boolean b33 = concretestack_obj32.isEmpty();
    int i34 = concretestack_obj32.size();
    concretestack_obj32.push((java.lang.Object)(-1.0f));
    java.lang.Object obj37 = null;
    boolean b38 = concretestack_obj32.equals(obj37);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable39 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj40 = null;
    boolean b41 = concretestack_concretestack_serializable39.equals(obj40);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable42 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b44 = concretestack_serializable42.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable39.push(concretestack_serializable42);
    java.lang.Object obj46 = null;
    boolean b47 = concretestack_concretestack_serializable39.equals(obj46);
    concretestack_concretestack_serializable39.clear();
    concretestack_obj32.push((java.lang.Object)concretestack_concretestack_serializable39);
    concretestack_obj32.clear();
    concretestack_concretestack_obj0.push(concretestack_obj32);
    concretestack_concretestack_obj0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Object> concretestack_obj54 = concretestack_concretestack_obj0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    int i1 = concretestack_concretestack_obj0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b3 = concretestack_concretestack_concretestack_serializable2.isEmpty();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable4 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_serializable4.equals(obj5);
    java.lang.Object obj7 = null;
    boolean b8 = concretestack_serializable4.equals(obj7);
    java.lang.String str9 = concretestack_serializable4.toString();
    java.lang.String str10 = concretestack_serializable4.toString();
    java.lang.String str11 = concretestack_serializable4.toString();
    boolean b12 = concretestack_concretestack_concretestack_serializable2.equals((java.lang.Object)concretestack_serializable4);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable13 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj14 = null;
    boolean b15 = concretestack_serializable13.equals(obj14);
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_serializable13.equals(obj16);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable18 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_serializable18.equals(obj19);
    boolean b21 = concretestack_serializable13.equals(obj19);
    boolean b22 = concretestack_concretestack_concretestack_serializable2.equals(obj19);
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable23 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b24 = concretestack_concretestack_concretestack_serializable23.isEmpty();
    concretestack_concretestack_concretestack_serializable23.clear();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable26 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    int i27 = concretestack_concretestack_serializable26.size();
    boolean b28 = concretestack_concretestack_serializable26.isEmpty();
    boolean b29 = concretestack_concretestack_concretestack_serializable23.equals((java.lang.Object)concretestack_concretestack_serializable26);
    concretestack_concretestack_concretestack_serializable2.push(concretestack_concretestack_serializable26);
    boolean b31 = concretestack_concretestack_obj0.equals((java.lang.Object)concretestack_concretestack_concretestack_serializable2);
    java.lang.String str32 = concretestack_concretestack_obj0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Object> concretestack_obj33 = concretestack_concretestack_obj0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_serializable0.toString();
    java.lang.String str2 = concretestack_stack_concretestack_stack_concretestack_serializable0.toString();
    int i3 = concretestack_stack_concretestack_stack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable4 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable5.clear();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable5.clear();
    concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable4.push(concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable5);
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable9 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_serializable9.clear();
    boolean b11 = concretestack_concretestack_stack_stack_stack_stack_serializable9.isEmpty();
    concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable5.push(concretestack_concretestack_stack_stack_stack_stack_serializable9);
    boolean b13 = concretestack_stack_concretestack_stack_concretestack_serializable0.equals((java.lang.Object)concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable5);
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>> stack_concretestack_stack_concretestack_serializable15 = concretestack_stack_concretestack_stack_concretestack_serializable0.get(0);
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
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = concretestack_concretestack_stack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }

    stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>> concretestack_concretestack_obj0 = new stack.ConcreteStack<stack.ConcreteStack<java.lang.Object>>();
    int i1 = concretestack_concretestack_obj0.size();
    concretestack_concretestack_obj0.clear();
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_concretestack_obj0.equals(obj3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.lang.Object> concretestack_obj6 = concretestack_concretestack_obj0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_str0.toString();
    boolean b2 = concretestack_stack_concretestack_concretestack_str0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> stack_concretestack_concretestack_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_str0.push(stack_concretestack_concretestack_str3);
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
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable2 = concretestack_stack_stack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable1 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_serializable1.equals(obj2);
    java.lang.String str4 = concretestack_serializable1.toString();
    int i5 = concretestack_serializable1.size();
    concretestack_serializable1.clear();
    java.lang.String str7 = concretestack_serializable1.toString();
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable8 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable8.equals(obj9);
    concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable8.clear();
    boolean b12 = concretestack_serializable1.equals((java.lang.Object)concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable8);
    boolean b13 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_serializable1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable15 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_serializable0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable1 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.clear();
    java.lang.String str3 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable1.toString();
    concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.push(concretestack_stack_stack_concretestack_stack_stack_stack_serializable1);
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable5 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.top();
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_stack_concretestack_stack_stack_stack_serializable6 = concretestack_concretestack_stack_stack_concretestack_stack_stack_stack_serializable0.top();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_stack_concretestack_stack_stack_stack_serializable7 = concretestack_stack_stack_concretestack_stack_stack_stack_serializable6.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_stack_serializable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_stack_stack_concretestack_stack_stack_stack_serializable6);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    java.lang.String str4 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.toString();
    stack.ConcreteStack<java.lang.String> concretestack_str5 = new stack.ConcreteStack<java.lang.String>();
    int i6 = concretestack_str5.size();
    java.lang.String str7 = concretestack_str5.toString();
    concretestack_str5.push("[]");
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable10 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable10.clear();
    boolean b12 = concretestack_concretestack_serializable10.isEmpty();
    boolean b13 = concretestack_str5.equals((java.lang.Object)concretestack_concretestack_serializable10);
    boolean b14 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.equals((java.lang.Object)b13);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable15 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj16 = null;
    boolean b17 = concretestack_concretestack_serializable15.equals(obj16);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable18 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b20 = concretestack_serializable18.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable15.push(concretestack_serializable18);
    java.lang.Object obj22 = null;
    boolean b23 = concretestack_concretestack_serializable15.equals(obj22);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable25 = concretestack_concretestack_serializable15.get(0);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable26 = concretestack_concretestack_serializable15.top();
    int i27 = concretestack_concretestack_serializable15.size();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable28 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj29 = null;
    boolean b30 = concretestack_serializable28.equals(obj29);
    java.lang.Object obj31 = null;
    boolean b32 = concretestack_serializable28.equals(obj31);
    java.lang.String str33 = concretestack_serializable28.toString();
    java.lang.String str34 = concretestack_serializable28.toString();
    java.lang.String str35 = concretestack_serializable28.toString();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable36 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj37 = null;
    boolean b38 = concretestack_serializable36.equals(obj37);
    java.lang.Object obj39 = null;
    boolean b40 = concretestack_serializable36.equals(obj39);
    concretestack_serializable36.clear();
    boolean b42 = concretestack_serializable28.equals((java.lang.Object)concretestack_serializable36);
    concretestack_concretestack_serializable15.push(concretestack_serializable36);
    boolean b44 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.equals((java.lang.Object)concretestack_serializable36);
    concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable47 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]"+ "'", str33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[]"+ "'", str35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_stack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    int i1 = concretestack_stack_concretestack_stack_stack_stack_serializable0.size();
    java.lang.String str2 = concretestack_stack_concretestack_stack_stack_stack_serializable0.toString();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> stack_concretestack_stack_stack_stack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_stack_stack_serializable0.push(stack_concretestack_stack_stack_stack_serializable3);
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
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.toString();
    int i2 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.size();
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_stack_stack_stack_stack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.push(stack_concretestack_stack_stack_stack_stack_serializable3);
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
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    boolean b2 = concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1.isEmpty();
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>)concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable1);
    java.lang.String str4 = concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(stack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[[]]"+ "'", str4.equals("[[]]"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>> concretestack_stack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_concretestack_serializable0.toString();
    int i2 = concretestack_stack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable3 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b4 = concretestack_concretestack_concretestack_serializable3.isEmpty();
    concretestack_stack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>)concretestack_concretestack_concretestack_serializable3);
    int i6 = concretestack_stack_concretestack_concretestack_serializable0.size();
    concretestack_stack_concretestack_concretestack_serializable0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.String str3 = concretestack_serializable0.toString();
    concretestack_serializable0.push((java.io.Serializable)(byte)10);
    java.io.Serializable serializable7 = concretestack_serializable0.get(0);
    java.io.Serializable serializable8 = concretestack_serializable0.top();
    boolean b9 = concretestack_serializable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (byte)10+ "'", serializable7.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (byte)10+ "'", serializable8.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_serializable1 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.push((stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>)concretestack_concretestack_concretestack_concretestack_concretestack_serializable1);
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable3 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.top();
    boolean b4 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> stack_concretestack_concretestack_concretestack_concretestack_serializable6 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.get(0);
    java.lang.String str7 = concretestack_stack_concretestack_concretestack_concretestack_concretestack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_serializable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stack_concretestack_concretestack_concretestack_concretestack_serializable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[[]]"+ "'", str7.equals("[[]]"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence1 = concretestack_concretestack_concretestack_concretestack_charSequence0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>> concretestack_concretestack_stack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>>();
    java.lang.String str1 = concretestack_concretestack_stack_charSequence0.toString();
    boolean b2 = concretestack_concretestack_stack_charSequence0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence3 = concretestack_concretestack_stack_charSequence0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>> concretestack_concretestack_concretestack_concretestack_charSequence0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>>>();
    concretestack_concretestack_concretestack_concretestack_charSequence0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.lang.CharSequence>>> concretestack_concretestack_concretestack_charSequence3 = concretestack_concretestack_concretestack_concretestack_charSequence0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_str0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_str0.isEmpty();
    stack.ConcreteStack<java.lang.CharSequence> concretestack_charSequence3 = new stack.ConcreteStack<java.lang.CharSequence>();
    boolean b4 = concretestack_charSequence3.isEmpty();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_charSequence3.equals(obj5);
    boolean b8 = concretestack_charSequence3.equals((java.lang.Object)1.0d);
    concretestack_charSequence3.push((java.lang.CharSequence)"hi!");
    boolean b11 = concretestack_concretestack_concretestack_stack_concretestack_str0.equals((java.lang.Object)concretestack_charSequence3);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>> concretestack_concretestack_stack_concretestack_str13 = concretestack_concretestack_concretestack_stack_concretestack_str0.get(0);
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    int i4 = concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_stack_stack_stack_stack_serializable3 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>();
    concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.clear();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    boolean b4 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>> stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable5 = concretestack_stack_concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj1);
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>> concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>>();
    int i1 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    int i2 = concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.size();
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3 = null;
    // The following exception was thrown during execution in test generation
    try {
    concretestack_concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_concretestack_concretestack_stack_stack_concretestack_concretestack_concretestack_serializable3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_stack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>();
    boolean b1 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.isEmpty();
    concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> stack_concretestack_stack_stack_stack_stack_serializable4 = concretestack_stack_concretestack_stack_stack_stack_stack_serializable0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>> concretestack_stack_stack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.Stack<java.io.Serializable>>>();
    boolean b1 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b2 = concretestack_stack_stack_serializable0.isEmpty();
    boolean b3 = concretestack_stack_stack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<java.io.Serializable>> concretestack_stack_serializable4 = new stack.ConcreteStack<stack.Stack<java.io.Serializable>>();
    java.lang.Object obj5 = null;
    boolean b6 = concretestack_stack_serializable4.equals(obj5);
    boolean b7 = concretestack_stack_serializable4.isEmpty();
    int i8 = concretestack_stack_serializable4.size();
    concretestack_stack_stack_serializable0.push((stack.Stack<stack.Stack<java.io.Serializable>>)concretestack_stack_serializable4);
    boolean b10 = concretestack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<java.io.Serializable>> stack_stack_serializable12 = concretestack_stack_stack_serializable0.get((int)'4');
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
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>> concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable2 = concretestack_concretestack_concretestack_concretestack_stack_stack_stack_stack_serializable0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    boolean b1 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_concretestack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.top();
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
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>> concretestack_concretestack_concretestack_stack_concretestack_str0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.lang.String>>>>>();
    int i1 = concretestack_concretestack_concretestack_stack_concretestack_str0.size();
    boolean b2 = concretestack_concretestack_concretestack_stack_concretestack_str0.isEmpty();
    boolean b3 = concretestack_concretestack_concretestack_stack_concretestack_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>> concretestack_stack_concretestack_serializable0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<java.io.Serializable>>>();
    int i1 = concretestack_stack_concretestack_serializable0.size();
    concretestack_stack_concretestack_serializable0.clear();
    int i3 = concretestack_stack_concretestack_serializable0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<java.io.Serializable>> stack_concretestack_serializable4 = concretestack_stack_concretestack_serializable0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }

    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>> concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>> stack_stack_stack_concretestack_stack_concretestack_concretestack_str1 = concretestack_stack_stack_stack_concretestack_stack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>> concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>();
    int i1 = concretestack_stack_concretestack_concretestack_str0.size();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>> stack_concretestack_concretestack_str2 = concretestack_stack_concretestack_concretestack_str0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>> concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>();
    boolean b1 = concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable2 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    concretestack_concretestack_serializable2.clear();
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable2);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    java.lang.Object obj6 = null;
    boolean b7 = concretestack_concretestack_serializable5.equals(obj6);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable8 = new stack.ConcreteStack<java.io.Serializable>();
    boolean b10 = concretestack_serializable8.equals((java.lang.Object)'a');
    concretestack_concretestack_serializable5.push(concretestack_serializable8);
    java.lang.Object obj12 = null;
    boolean b13 = concretestack_concretestack_serializable5.equals(obj12);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable15 = concretestack_concretestack_serializable5.get(0);
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable16 = concretestack_concretestack_serializable5.top();
    int i17 = concretestack_concretestack_serializable5.size();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable18 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj19 = null;
    boolean b20 = concretestack_serializable18.equals(obj19);
    java.lang.Object obj21 = null;
    boolean b22 = concretestack_serializable18.equals(obj21);
    java.lang.String str23 = concretestack_serializable18.toString();
    java.lang.String str24 = concretestack_serializable18.toString();
    java.lang.String str25 = concretestack_serializable18.toString();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable26 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj27 = null;
    boolean b28 = concretestack_serializable26.equals(obj27);
    java.lang.Object obj29 = null;
    boolean b30 = concretestack_serializable26.equals(obj29);
    concretestack_serializable26.clear();
    boolean b32 = concretestack_serializable18.equals((java.lang.Object)concretestack_serializable26);
    concretestack_concretestack_serializable5.push(concretestack_serializable26);
    concretestack_concretestack_concretestack_serializable0.push(concretestack_concretestack_serializable5);
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable35 = concretestack_concretestack_concretestack_serializable0.pop();
    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable36 = concretestack_concretestack_concretestack_serializable0.top();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_serializable16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_serializable35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(concretestack_concretestack_serializable36);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.String str2 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    boolean b4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable5 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>();
    java.lang.String str6 = concretestack_stack_concretestack_concretestack_concretestack_serializable5.toString();
    java.lang.String str7 = concretestack_stack_concretestack_concretestack_concretestack_serializable5.toString();
    concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.push(concretestack_stack_concretestack_concretestack_concretestack_serializable5);
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_stack_concretestack_concretestack_concretestack_serializable5.equals(obj9);
    concretestack_stack_concretestack_concretestack_concretestack_serializable5.clear();
    java.lang.String str12 = concretestack_stack_concretestack_concretestack_concretestack_serializable5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }

    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>> concretestack_stack_concretestack_stack_concretestack_concretestack_str0 = new stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>>>();
    java.lang.String str1 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.Stack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<java.lang.String>>>>> stack_concretestack_stack_concretestack_concretestack_str2 = concretestack_stack_concretestack_stack_concretestack_concretestack_str0.top();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>> concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>>>();
    java.lang.String str1 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>>> concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable3 = concretestack_concretestack_stack_stack_stack_stack_concretestack_concretestack_concretestack_serializable0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>> concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>>>();
    boolean b1 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    java.lang.Object obj2 = null;
    boolean b3 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals(obj2);
    java.lang.String str4 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.toString();
    stack.ConcreteStack<stack.Stack<java.lang.CharSequence>> concretestack_stack_charSequence5 = new stack.ConcreteStack<stack.Stack<java.lang.CharSequence>>();
    boolean b6 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.equals((java.lang.Object)concretestack_stack_charSequence5);
    boolean b7 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.ConcreteStack<stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>>>> concretestack_stack_concretestack_concretestack_concretestack_serializable8 = concretestack_concretestack_stack_concretestack_concretestack_concretestack_serializable0.top();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>> concretestack_concretestack_stack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>>();
    concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    concretestack_concretestack_stack_stack_stack_stack_serializable0.clear();
    java.lang.String str3 = concretestack_concretestack_stack_stack_stack_stack_serializable0.toString();
    java.lang.String str4 = concretestack_concretestack_stack_stack_stack_stack_serializable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }

    stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>> concretestack_concretestack_stack_stack_stack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>>>();
    boolean b1 = concretestack_concretestack_stack_stack_stack_serializable0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<stack.Stack<stack.Stack<stack.Stack<java.io.Serializable>>>> concretestack_stack_stack_stack_serializable3 = concretestack_concretestack_stack_stack_stack_serializable0.get(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }

    stack.ConcreteStack<java.io.Serializable> concretestack_serializable0 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj1 = null;
    boolean b2 = concretestack_serializable0.equals(obj1);
    java.lang.Object obj3 = null;
    boolean b4 = concretestack_serializable0.equals(obj3);
    java.lang.String str5 = concretestack_serializable0.toString();
    java.lang.String str6 = concretestack_serializable0.toString();
    java.lang.String str7 = concretestack_serializable0.toString();
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable8 = new stack.ConcreteStack<java.io.Serializable>();
    java.lang.Object obj9 = null;
    boolean b10 = concretestack_serializable8.equals(obj9);
    java.lang.Object obj11 = null;
    boolean b12 = concretestack_serializable8.equals(obj11);
    concretestack_serializable8.clear();
    boolean b14 = concretestack_serializable0.equals((java.lang.Object)concretestack_serializable8);
    concretestack_serializable0.clear();
    // The following exception was thrown during execution in test generation
    try {
    java.io.Serializable serializable17 = concretestack_serializable0.get(0);
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
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }

    stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>> concretestack_concretestack_serializable0 = new stack.ConcreteStack<stack.ConcreteStack<java.io.Serializable>>();
    // The following exception was thrown during execution in test generation
    try {
    stack.ConcreteStack<java.io.Serializable> concretestack_serializable1 = concretestack_concretestack_serializable0.pop();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

}
