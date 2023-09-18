package evosuite.set;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set2 = set0.intersect(set1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    evosuite.set.Set set3 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set4 = set2.intersect(set3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    evosuite.set.Set set3 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set4 = set0.intersect(set3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    evosuite.set.Set set4 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set5 = set0.union(set4);
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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    evosuite.set.Set set13 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set14 = set10.union(set13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    boolean b6 = set0.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set8 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set8.clear();
    evosuite.set.Set set10 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set11 = set8.union(set10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    java.lang.Object obj5 = null;
    boolean b6 = set0.equals(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    java.util.Collection<java.lang.Integer> collection_i0 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set1 = new evosuite.set.Set(collection_i0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set7 = set0.union(set6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set8 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set8.clear();
    boolean b11 = set8.equals((java.lang.Object)(byte)100);
    int i12 = set8.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array6);
    evosuite.set.Set set9 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    boolean b11 = set9.belongs((java.lang.Integer)1);
    evosuite.set.Set set12 = new evosuite.set.Set();
    boolean b13 = set12.repOk();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = set14.intersect(set15);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    evosuite.set.Set set19 = new evosuite.set.Set();
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = set19.intersect(set20);
    evosuite.set.Set set22 = set14.intersect(set21);
    set22.clear();
    evosuite.set.Set set24 = set12.union(set22);
    evosuite.set.Set set25 = set9.union(set12);
    evosuite.set.Set set26 = set0.intersect(set9);
    evosuite.set.Set set27 = new evosuite.set.Set();
    boolean b28 = set27.repOk();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = set34.intersect(set35);
    evosuite.set.Set set37 = set29.intersect(set36);
    set37.clear();
    evosuite.set.Set set39 = set27.union(set37);
    boolean b40 = set26.equals((java.lang.Object)set37);
    evosuite.set.Set set41 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set42 = set26.union(set41);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    java.lang.Object obj50 = null;
    boolean b51 = set21.equals(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array6);
    evosuite.set.Set set9 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    boolean b11 = set9.belongs((java.lang.Integer)1);
    evosuite.set.Set set12 = new evosuite.set.Set();
    boolean b13 = set12.repOk();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = set14.intersect(set15);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    evosuite.set.Set set19 = new evosuite.set.Set();
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = set19.intersect(set20);
    evosuite.set.Set set22 = set14.intersect(set21);
    set22.clear();
    evosuite.set.Set set24 = set12.union(set22);
    evosuite.set.Set set25 = set9.union(set12);
    evosuite.set.Set set26 = set0.intersect(set9);
    evosuite.set.Set set27 = new evosuite.set.Set();
    boolean b28 = set27.repOk();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = set34.intersect(set35);
    evosuite.set.Set set37 = set29.intersect(set36);
    set37.clear();
    evosuite.set.Set set39 = set27.union(set37);
    boolean b40 = set26.equals((java.lang.Object)set37);
    set26.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)100);
    boolean b15 = set8.belongs((java.lang.Integer)0);
    evosuite.set.Set set16 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set17 = set8.union(set16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    evosuite.set.Set set6 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set7 = set5.union(set6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100, 10, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set8 = set6.intersect(set7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b8 = set7.repOk();
    boolean b9 = set7.repOk();
    boolean b10 = set7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    boolean b7 = set0.belongs((java.lang.Integer)0);
    int i8 = set0.size();
    evosuite.set.Set set9 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set10 = set0.intersect(set9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    boolean b7 = set0.belongs((java.lang.Integer)0);
    int i8 = set0.size();
    boolean b9 = set0.isEmpty();
    java.lang.Object obj10 = null;
    boolean b11 = set0.equals(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    int i6 = set5.size();
    java.lang.Object obj7 = null;
    boolean b8 = set5.equals(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b16 = set0.add((java.lang.Integer)1);
    boolean b18 = set0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    set0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    int i50 = set22.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i23 = new java.util.ArrayList<java.lang.Integer>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i23, i_array22);
    evosuite.set.Set set25 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i23);
    int i26 = set25.size();
    evosuite.set.Set set27 = set0.intersect(set25);
    boolean b28 = set0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100, 10, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b9 = set7.add((java.lang.Integer)0);
    evosuite.set.Set set10 = new evosuite.set.Set();
    boolean b11 = set10.repOk();
    evosuite.set.Set set12 = new evosuite.set.Set();
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = set12.intersect(set13);
    java.lang.Object obj15 = null;
    boolean b16 = set12.equals(obj15);
    evosuite.set.Set set17 = new evosuite.set.Set();
    evosuite.set.Set set18 = new evosuite.set.Set();
    evosuite.set.Set set19 = set17.intersect(set18);
    evosuite.set.Set set20 = set12.intersect(set19);
    set20.clear();
    evosuite.set.Set set22 = set10.union(set20);
    boolean b23 = set10.isEmpty();
    int i24 = set10.size();
    boolean b25 = set10.repOk();
    evosuite.set.Set set26 = set7.union(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    boolean b50 = set49.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    set8.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set12.isEmpty();
    int i14 = set12.size();
    boolean b15 = set12.isEmpty();
    evosuite.set.Set set16 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set17 = set12.intersect(set16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b15 = set0.repOk();
    int i16 = set0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    int i9 = set8.size();
    int i10 = set8.size();
    boolean b12 = set8.add((java.lang.Integer)100);
    boolean b13 = set8.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b15 = set0.isEmpty();
    boolean b16 = set0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    boolean b22 = set5.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b8 = set7.repOk();
    int i9 = set7.size();
    boolean b10 = set7.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array21 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i22 = new java.util.ArrayList<java.lang.Integer>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i22, i_array21);
    evosuite.set.Set set24 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i22);
    boolean b26 = set24.belongs((java.lang.Integer)1);
    evosuite.set.Set set27 = new evosuite.set.Set();
    boolean b28 = set27.repOk();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = set34.intersect(set35);
    evosuite.set.Set set37 = set29.intersect(set36);
    set37.clear();
    evosuite.set.Set set39 = set27.union(set37);
    evosuite.set.Set set40 = set24.union(set27);
    set40.clear();
    evosuite.set.Set set42 = set16.union(set40);
    int i43 = set40.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b16 = set0.remove((java.lang.Integer)0);
    set0.clear();
    set0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    evosuite.set.Set set11 = set6.union(set10);
    boolean b13 = set6.remove((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    set0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set1.equals((java.lang.Object)10.0f);
    set1.clear();
    java.lang.Integer[] i_array8 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i9 = new java.util.ArrayList<java.lang.Integer>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i9, i_array8);
    evosuite.set.Set set11 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i9);
    boolean b13 = set11.belongs((java.lang.Integer)1);
    evosuite.set.Set set14 = new evosuite.set.Set();
    boolean b15 = set14.repOk();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = new evosuite.set.Set();
    evosuite.set.Set set18 = set16.intersect(set17);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    evosuite.set.Set set21 = new evosuite.set.Set();
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = set21.intersect(set22);
    evosuite.set.Set set24 = set16.intersect(set23);
    set24.clear();
    evosuite.set.Set set26 = set14.union(set24);
    evosuite.set.Set set27 = set11.union(set14);
    set27.clear();
    evosuite.set.Set set29 = set1.union(set27);
    boolean b31 = set1.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    boolean b23 = set5.add((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    java.lang.Object obj22 = null;
    boolean b23 = set5.equals(obj22);
    boolean b25 = set5.add((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    boolean b23 = set8.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    boolean b14 = set0.isEmpty();
    boolean b16 = set0.remove((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set7.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i23 = new java.util.ArrayList<java.lang.Integer>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i23, i_array22);
    evosuite.set.Set set25 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i23);
    int i26 = set25.size();
    evosuite.set.Set set27 = set0.intersect(set25);
    boolean b29 = set0.add((java.lang.Integer)2);
    boolean b31 = set0.add((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set6.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    set0.clear();
    boolean b7 = set0.add((java.lang.Integer)100);
    boolean b9 = set0.belongs((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.isEmpty();
    java.lang.Integer[] i_array5 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i6 = new java.util.ArrayList<java.lang.Integer>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i6, i_array5);
    evosuite.set.Set set8 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i6);
    boolean b9 = set8.repOk();
    java.lang.Integer[] i_array12 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i13 = new java.util.ArrayList<java.lang.Integer>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i13, i_array12);
    evosuite.set.Set set15 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i13);
    boolean b17 = set15.belongs((java.lang.Integer)1);
    evosuite.set.Set set18 = set8.union(set15);
    evosuite.set.Set set19 = set0.union(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set12.isEmpty();
    int i14 = set12.size();
    boolean b15 = set12.isEmpty();
    boolean b17 = set12.belongs((java.lang.Integer)2);
    boolean b19 = set12.belongs((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)100);
    set8.clear();
    evosuite.set.Set set15 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set16 = set8.intersect(set15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    int i6 = set5.size();
    boolean b8 = set5.remove((java.lang.Integer)0);
    boolean b10 = set5.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    boolean b50 = set22.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100, 10, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b9 = set7.add((java.lang.Integer)0);
    boolean b11 = set7.belongs((java.lang.Integer)0);
    evosuite.set.Set set12 = new evosuite.set.Set();
    boolean b13 = set12.repOk();
    boolean b15 = set12.belongs((java.lang.Integer)0);
    boolean b17 = set12.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set18 = new evosuite.set.Set();
    boolean b19 = set18.repOk();
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = new evosuite.set.Set();
    evosuite.set.Set set22 = set20.intersect(set21);
    java.lang.Object obj23 = null;
    boolean b24 = set20.equals(obj23);
    evosuite.set.Set set25 = new evosuite.set.Set();
    evosuite.set.Set set26 = new evosuite.set.Set();
    evosuite.set.Set set27 = set25.intersect(set26);
    evosuite.set.Set set28 = set20.intersect(set27);
    set28.clear();
    evosuite.set.Set set30 = set18.union(set28);
    boolean b31 = set12.equals((java.lang.Object)set30);
    evosuite.set.Set set32 = set7.union(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    java.lang.Integer[] i_array4 = new java.lang.Integer[] { (-1), 2, 3, 100 };
    java.util.ArrayList<java.lang.Integer> arraylist_i5 = new java.util.ArrayList<java.lang.Integer>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i5, i_array4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i5);
    evosuite.set.Set set8 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    set1.clear();
    boolean b4 = set1.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    boolean b9 = set6.add((java.lang.Integer)10);
    boolean b11 = set6.remove((java.lang.Integer)1);
    set6.clear();
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    boolean b16 = set13.repOk();
    boolean b17 = set13.repOk();
    boolean b19 = set13.belongs((java.lang.Integer)10);
    boolean b20 = set13.isEmpty();
    boolean b22 = set13.remove((java.lang.Integer)10);
    evosuite.set.Set set23 = set6.intersect(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.isEmpty();
    boolean b3 = set0.belongs((java.lang.Integer)2);
    evosuite.set.Set set4 = new evosuite.set.Set();
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = set4.intersect(set5);
    boolean b8 = set5.add((java.lang.Integer)0);
    evosuite.set.Set set9 = set0.union(set5);
    boolean b10 = set9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b14 = set0.add((java.lang.Integer)10);
    java.lang.Object obj15 = null;
    boolean b16 = set0.equals(obj15);
    boolean b18 = set0.belongs((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array6);
    evosuite.set.Set set9 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    boolean b11 = set9.belongs((java.lang.Integer)1);
    evosuite.set.Set set12 = new evosuite.set.Set();
    boolean b13 = set12.repOk();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = set14.intersect(set15);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    evosuite.set.Set set19 = new evosuite.set.Set();
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = set19.intersect(set20);
    evosuite.set.Set set22 = set14.intersect(set21);
    set22.clear();
    evosuite.set.Set set24 = set12.union(set22);
    evosuite.set.Set set25 = set9.union(set12);
    evosuite.set.Set set26 = set0.intersect(set9);
    boolean b28 = set26.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100, 10, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b9 = set7.add((java.lang.Integer)0);
    boolean b11 = set7.belongs((java.lang.Integer)0);
    evosuite.set.Set set12 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set13 = set7.intersect(set12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i23 = new java.util.ArrayList<java.lang.Integer>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i23, i_array22);
    evosuite.set.Set set25 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i23);
    int i26 = set25.size();
    evosuite.set.Set set27 = set0.intersect(set25);
    boolean b29 = set25.equals((java.lang.Object)1.0f);
    boolean b30 = set25.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    boolean b23 = set21.belongs((java.lang.Integer)0);
    boolean b24 = set21.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    int i22 = set5.size();
    boolean b24 = set5.remove((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set2.belongs((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array21 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i22 = new java.util.ArrayList<java.lang.Integer>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i22, i_array21);
    evosuite.set.Set set24 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i22);
    boolean b26 = set24.belongs((java.lang.Integer)1);
    evosuite.set.Set set27 = new evosuite.set.Set();
    boolean b28 = set27.repOk();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = set34.intersect(set35);
    evosuite.set.Set set37 = set29.intersect(set36);
    set37.clear();
    evosuite.set.Set set39 = set27.union(set37);
    evosuite.set.Set set40 = set24.union(set27);
    set40.clear();
    evosuite.set.Set set42 = set16.union(set40);
    boolean b43 = set40.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    set0.clear();
    boolean b7 = set0.add((java.lang.Integer)100);
    java.lang.Object obj8 = null;
    boolean b9 = set0.equals(obj8);
    int i10 = set0.size();
    boolean b12 = set0.belongs((java.lang.Integer)0);
    boolean b14 = set0.add((java.lang.Integer)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b17 = set16.isEmpty();
    boolean b19 = set16.remove((java.lang.Integer)0);
    evosuite.set.Set set20 = new evosuite.set.Set();
    boolean b21 = set20.repOk();
    boolean b23 = set20.belongs((java.lang.Integer)0);
    boolean b25 = set20.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set26 = new evosuite.set.Set();
    boolean b27 = set26.repOk();
    evosuite.set.Set set28 = new evosuite.set.Set();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = set28.intersect(set29);
    java.lang.Object obj31 = null;
    boolean b32 = set28.equals(obj31);
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = set33.intersect(set34);
    evosuite.set.Set set36 = set28.intersect(set35);
    set36.clear();
    evosuite.set.Set set38 = set26.union(set36);
    boolean b39 = set20.equals((java.lang.Object)set38);
    java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i43 = new java.util.ArrayList<java.lang.Integer>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i43, i_array42);
    evosuite.set.Set set45 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i43);
    int i46 = set45.size();
    evosuite.set.Set set47 = set20.intersect(set45);
    evosuite.set.Set set48 = set16.union(set45);
    evosuite.set.Set set49 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set50 = set45.intersect(set49);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    int i50 = set49.size();
    boolean b52 = set49.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set12.isEmpty();
    int i14 = set12.size();
    boolean b15 = set12.repOk();
    boolean b16 = set12.repOk();
    boolean b17 = set12.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set12.isEmpty();
    int i14 = set12.size();
    boolean b15 = set12.repOk();
    boolean b17 = set12.remove((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    evosuite.set.Set set20 = new evosuite.set.Set();
    boolean b21 = set20.repOk();
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    java.lang.Object obj25 = null;
    boolean b26 = set22.equals(obj25);
    evosuite.set.Set set27 = new evosuite.set.Set();
    evosuite.set.Set set28 = new evosuite.set.Set();
    evosuite.set.Set set29 = set27.intersect(set28);
    evosuite.set.Set set30 = set22.intersect(set29);
    set30.clear();
    evosuite.set.Set set32 = set20.union(set30);
    boolean b33 = set32.isEmpty();
    int i34 = set32.size();
    boolean b35 = set32.isEmpty();
    boolean b36 = set0.equals((java.lang.Object)set32);
    int i37 = set32.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b14 = set0.add((java.lang.Integer)10);
    java.lang.Object obj15 = null;
    boolean b16 = set0.equals(obj15);
    int i17 = set0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b14 = set0.belongs((java.lang.Integer)0);
    boolean b16 = set0.add((java.lang.Integer)1);
    java.lang.Integer[] i_array20 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i21 = new java.util.ArrayList<java.lang.Integer>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i21, i_array20);
    evosuite.set.Set set23 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i21);
    boolean b24 = set23.repOk();
    evosuite.set.Set set25 = new evosuite.set.Set();
    evosuite.set.Set set26 = new evosuite.set.Set();
    evosuite.set.Set set27 = set25.intersect(set26);
    evosuite.set.Set set28 = set23.union(set27);
    boolean b29 = set28.repOk();
    boolean b31 = set28.remove((java.lang.Integer)2);
    evosuite.set.Set set32 = new evosuite.set.Set();
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = set32.intersect(set33);
    boolean b35 = set32.repOk();
    boolean b36 = set32.repOk();
    boolean b38 = set32.belongs((java.lang.Integer)10);
    boolean b39 = set32.isEmpty();
    evosuite.set.Set set40 = set28.intersect(set32);
    java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i44 = new java.util.ArrayList<java.lang.Integer>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i44, i_array43);
    evosuite.set.Set set46 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i44);
    boolean b48 = set46.belongs((java.lang.Integer)1);
    evosuite.set.Set set49 = set32.union(set46);
    evosuite.set.Set set50 = set0.union(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set50);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    evosuite.set.Set set11 = set6.union(set10);
    boolean b12 = set11.repOk();
    evosuite.set.Set set13 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set14 = set11.intersect(set13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    boolean b51 = set22.belongs((java.lang.Integer)0);
    boolean b53 = set22.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b8 = set7.repOk();
    int i9 = set7.size();
    evosuite.set.Set set10 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set11 = set7.union(set10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 5, 100, 3 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    set0.clear();
    boolean b7 = set0.add((java.lang.Integer)100);
    java.lang.Object obj8 = null;
    boolean b9 = set0.equals(obj8);
    int i10 = set0.size();
    boolean b11 = set0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set12.isEmpty();
    int i14 = set12.size();
    int i15 = set12.size();
    boolean b17 = set12.add((java.lang.Integer)0);
    evosuite.set.Set set18 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set19 = set12.union(set18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    set0.clear();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    evosuite.set.Set set4 = new evosuite.set.Set();
    boolean b5 = set4.repOk();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = set6.intersect(set7);
    java.lang.Object obj9 = null;
    boolean b10 = set6.equals(obj9);
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = new evosuite.set.Set();
    evosuite.set.Set set13 = set11.intersect(set12);
    evosuite.set.Set set14 = set6.intersect(set13);
    set14.clear();
    evosuite.set.Set set16 = set4.union(set14);
    boolean b17 = set4.isEmpty();
    int i18 = set4.size();
    boolean b20 = set4.remove((java.lang.Integer)0);
    boolean b21 = set0.equals((java.lang.Object)set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    java.lang.Object obj22 = null;
    boolean b23 = set5.equals(obj22);
    int i24 = set5.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b15 = set0.isEmpty();
    int i16 = set0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    evosuite.set.Set set20 = new evosuite.set.Set();
    boolean b21 = set20.repOk();
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    java.lang.Object obj25 = null;
    boolean b26 = set22.equals(obj25);
    evosuite.set.Set set27 = new evosuite.set.Set();
    evosuite.set.Set set28 = new evosuite.set.Set();
    evosuite.set.Set set29 = set27.intersect(set28);
    evosuite.set.Set set30 = set22.intersect(set29);
    set30.clear();
    evosuite.set.Set set32 = set20.union(set30);
    boolean b33 = set32.isEmpty();
    int i34 = set32.size();
    boolean b35 = set32.isEmpty();
    boolean b36 = set0.equals((java.lang.Object)set32);
    evosuite.set.Set set37 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set38 = set32.intersect(set37);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set2.add((java.lang.Integer)100);
    boolean b6 = set2.belongs((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b17 = set16.isEmpty();
    boolean b19 = set16.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set1.add((java.lang.Integer)0);
    boolean b6 = set1.add((java.lang.Integer)3);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    boolean b10 = set7.repOk();
    boolean b11 = set7.repOk();
    set7.clear();
    boolean b14 = set7.add((java.lang.Integer)100);
    java.lang.Object obj15 = null;
    boolean b16 = set7.equals(obj15);
    int i17 = set7.size();
    boolean b19 = set7.belongs((java.lang.Integer)0);
    boolean b21 = set7.equals((java.lang.Object)(short)10);
    set7.clear();
    evosuite.set.Set set23 = set1.union(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    boolean b51 = set22.belongs((java.lang.Integer)0);
    boolean b53 = set22.remove((java.lang.Integer)(-1));
    boolean b54 = set22.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    boolean b10 = set7.belongs((java.lang.Integer)(-1));
    evosuite.set.Set set11 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set12 = set7.union(set11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b14 = set0.add((java.lang.Integer)3);
    int i15 = set0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Object obj8 = null;
    boolean b9 = set6.equals(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    int i9 = set8.size();
    int i10 = set8.size();
    boolean b12 = set8.add((java.lang.Integer)100);
    set8.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set1.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    boolean b6 = set0.belongs((java.lang.Integer)10);
    boolean b7 = set0.isEmpty();
    boolean b9 = set0.remove((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)100);
    set8.clear();
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    boolean b18 = set15.repOk();
    boolean b19 = set15.repOk();
    boolean b21 = set15.belongs((java.lang.Integer)10);
    boolean b22 = set8.equals((java.lang.Object)b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    set0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    set0.clear();
    boolean b7 = set0.add((java.lang.Integer)100);
    java.lang.Object obj8 = null;
    boolean b9 = set0.equals(obj8);
    int i10 = set0.size();
    boolean b12 = set0.belongs((java.lang.Integer)0);
    boolean b14 = set0.equals((java.lang.Object)(short)10);
    set0.clear();
    boolean b16 = set0.repOk();
    java.lang.Integer[] i_array20 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i21 = new java.util.ArrayList<java.lang.Integer>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i21, i_array20);
    evosuite.set.Set set23 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i21);
    boolean b24 = set23.repOk();
    java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i28 = new java.util.ArrayList<java.lang.Integer>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i28, i_array27);
    evosuite.set.Set set30 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i28);
    boolean b32 = set30.belongs((java.lang.Integer)1);
    evosuite.set.Set set33 = set23.union(set30);
    boolean b34 = set33.isEmpty();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = set35.intersect(set36);
    boolean b38 = set35.repOk();
    java.lang.Integer[] i_array41 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i42 = new java.util.ArrayList<java.lang.Integer>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i42, i_array41);
    evosuite.set.Set set44 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i42);
    boolean b46 = set44.belongs((java.lang.Integer)1);
    evosuite.set.Set set47 = new evosuite.set.Set();
    boolean b48 = set47.repOk();
    evosuite.set.Set set49 = new evosuite.set.Set();
    evosuite.set.Set set50 = new evosuite.set.Set();
    evosuite.set.Set set51 = set49.intersect(set50);
    java.lang.Object obj52 = null;
    boolean b53 = set49.equals(obj52);
    evosuite.set.Set set54 = new evosuite.set.Set();
    evosuite.set.Set set55 = new evosuite.set.Set();
    evosuite.set.Set set56 = set54.intersect(set55);
    evosuite.set.Set set57 = set49.intersect(set56);
    set57.clear();
    evosuite.set.Set set59 = set47.union(set57);
    evosuite.set.Set set60 = set44.union(set47);
    evosuite.set.Set set61 = set35.intersect(set44);
    evosuite.set.Set set62 = set33.union(set61);
    evosuite.set.Set set63 = set0.union(set61);
    boolean b64 = set63.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b9 = set7.remove((java.lang.Integer)0);
    int i10 = set7.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    boolean b21 = set0.belongs((java.lang.Integer)0);
    boolean b22 = set0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b14 = set12.add((java.lang.Integer)0);
    boolean b16 = set12.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array21 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i22 = new java.util.ArrayList<java.lang.Integer>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i22, i_array21);
    evosuite.set.Set set24 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i22);
    boolean b26 = set24.belongs((java.lang.Integer)1);
    evosuite.set.Set set27 = new evosuite.set.Set();
    boolean b28 = set27.repOk();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = set34.intersect(set35);
    evosuite.set.Set set37 = set29.intersect(set36);
    set37.clear();
    evosuite.set.Set set39 = set27.union(set37);
    evosuite.set.Set set40 = set24.union(set27);
    set40.clear();
    evosuite.set.Set set42 = set16.union(set40);
    boolean b44 = set42.belongs((java.lang.Integer)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    int i5 = set0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    set5.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)100);
    boolean b15 = set8.belongs((java.lang.Integer)0);
    set8.clear();
    boolean b18 = set8.remove((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    java.lang.Object obj8 = null;
    boolean b9 = set7.equals(obj8);
    boolean b11 = set7.remove((java.lang.Integer)(-1));
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i16 = new java.util.ArrayList<java.lang.Integer>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i16, i_array15);
    evosuite.set.Set set18 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i16);
    evosuite.set.Set set19 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i16);
    boolean b20 = set19.repOk();
    evosuite.set.Set set21 = set7.union(set19);
    boolean b22 = set21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b14 = set0.belongs((java.lang.Integer)0);
    boolean b16 = set0.add((java.lang.Integer)1);
    java.lang.Object obj17 = null;
    boolean b18 = set0.equals(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    boolean b9 = set7.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b14 = set12.add((java.lang.Integer)0);
    evosuite.set.Set set15 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set16 = set12.intersect(set15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    boolean b7 = set0.add((java.lang.Integer)5);
    
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
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set2.isEmpty();
    boolean b5 = set2.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)100);
    set8.clear();
    int i15 = set8.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    boolean b21 = set0.belongs((java.lang.Integer)0);
    int i22 = set0.size();
    boolean b24 = set0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i23 = new java.util.ArrayList<java.lang.Integer>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i23, i_array22);
    evosuite.set.Set set25 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i23);
    int i26 = set25.size();
    evosuite.set.Set set27 = set0.intersect(set25);
    boolean b29 = set25.equals((java.lang.Object)1.0f);
    int i30 = set25.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    boolean b7 = set0.belongs((java.lang.Integer)0);
    int i8 = set0.size();
    boolean b9 = set0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    set21.clear();
    int i23 = set21.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = new evosuite.set.Set();
    evosuite.set.Set set22 = set20.intersect(set21);
    boolean b23 = set20.repOk();
    boolean b24 = set20.repOk();
    set20.clear();
    boolean b27 = set20.belongs((java.lang.Integer)100);
    boolean b29 = set20.remove((java.lang.Integer)0);
    evosuite.set.Set set30 = set18.intersect(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)100);
    set8.clear();
    java.lang.Object obj15 = null;
    boolean b16 = set8.equals(obj15);
    evosuite.set.Set set17 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set18 = set8.intersect(set17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    boolean b7 = set0.belongs((java.lang.Integer)0);
    int i8 = set0.size();
    boolean b9 = set0.isEmpty();
    int i10 = set0.size();
    boolean b12 = set0.add((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    boolean b9 = set8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    set0.clear();
    boolean b7 = set0.belongs((java.lang.Integer)100);
    set0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    boolean b7 = set0.belongs((java.lang.Integer)0);
    boolean b8 = set0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b15 = set0.repOk();
    boolean b17 = set0.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array21 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i22 = new java.util.ArrayList<java.lang.Integer>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i22, i_array21);
    evosuite.set.Set set24 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i22);
    boolean b26 = set24.belongs((java.lang.Integer)1);
    evosuite.set.Set set27 = new evosuite.set.Set();
    boolean b28 = set27.repOk();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = set34.intersect(set35);
    evosuite.set.Set set37 = set29.intersect(set36);
    set37.clear();
    evosuite.set.Set set39 = set27.union(set37);
    evosuite.set.Set set40 = set24.union(set27);
    set40.clear();
    evosuite.set.Set set42 = set16.union(set40);
    boolean b44 = set40.remove((java.lang.Integer)0);
    boolean b46 = set40.belongs((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    int i7 = set6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b8 = set7.repOk();
    int i9 = set7.size();
    boolean b11 = set7.belongs((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.isEmpty();
    boolean b3 = set0.belongs((java.lang.Integer)2);
    evosuite.set.Set set4 = new evosuite.set.Set();
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = set4.intersect(set5);
    boolean b8 = set5.add((java.lang.Integer)0);
    evosuite.set.Set set9 = set0.union(set5);
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    boolean b13 = set10.repOk();
    java.lang.Integer[] i_array16 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i17 = new java.util.ArrayList<java.lang.Integer>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i17, i_array16);
    evosuite.set.Set set19 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i17);
    boolean b21 = set19.belongs((java.lang.Integer)1);
    evosuite.set.Set set22 = new evosuite.set.Set();
    boolean b23 = set22.repOk();
    evosuite.set.Set set24 = new evosuite.set.Set();
    evosuite.set.Set set25 = new evosuite.set.Set();
    evosuite.set.Set set26 = set24.intersect(set25);
    java.lang.Object obj27 = null;
    boolean b28 = set24.equals(obj27);
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    evosuite.set.Set set32 = set24.intersect(set31);
    set32.clear();
    evosuite.set.Set set34 = set22.union(set32);
    evosuite.set.Set set35 = set19.union(set22);
    evosuite.set.Set set36 = set10.intersect(set19);
    evosuite.set.Set set37 = new evosuite.set.Set();
    boolean b38 = set37.repOk();
    evosuite.set.Set set39 = new evosuite.set.Set();
    evosuite.set.Set set40 = new evosuite.set.Set();
    evosuite.set.Set set41 = set39.intersect(set40);
    java.lang.Object obj42 = null;
    boolean b43 = set39.equals(obj42);
    evosuite.set.Set set44 = new evosuite.set.Set();
    evosuite.set.Set set45 = new evosuite.set.Set();
    evosuite.set.Set set46 = set44.intersect(set45);
    evosuite.set.Set set47 = set39.intersect(set46);
    set47.clear();
    evosuite.set.Set set49 = set37.union(set47);
    boolean b50 = set36.equals((java.lang.Object)set47);
    boolean b52 = set36.belongs((java.lang.Integer)100);
    evosuite.set.Set set53 = set0.intersect(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    evosuite.set.Set set11 = set6.union(set10);
    boolean b12 = set11.repOk();
    boolean b14 = set11.remove((java.lang.Integer)2);
    boolean b16 = set11.remove((java.lang.Integer)(-1));
    java.lang.Object obj17 = null;
    boolean b18 = set11.equals(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    java.lang.Object obj8 = null;
    boolean b9 = set7.equals(obj8);
    boolean b11 = set7.remove((java.lang.Integer)(-1));
    evosuite.set.Set set12 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set13 = set7.intersect(set12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    int i6 = set5.size();
    boolean b8 = set5.remove((java.lang.Integer)0);
    int i9 = set5.size();
    int i10 = set5.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b18 = set6.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)100);
    boolean b15 = set8.belongs((java.lang.Integer)0);
    java.lang.Object obj16 = null;
    boolean b17 = set8.equals(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    java.lang.Integer[] i_array4 = new java.lang.Integer[] { (-1), 2, 3, 100 };
    java.util.ArrayList<java.lang.Integer> arraylist_i5 = new java.util.ArrayList<java.lang.Integer>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i5, i_array4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i5);
    // The following exception was thrown during execution in test generation
    try {
    set7.clear();
      org.junit.Assert.fail("Expected exception of type java.util.ConcurrentModificationException");
    } catch (java.util.ConcurrentModificationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set2.isEmpty();
    boolean b5 = set2.belongs((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    boolean b7 = set0.belongs((java.lang.Integer)0);
    evosuite.set.Set set8 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set9 = set0.union(set8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    set0.clear();
    boolean b7 = set0.add((java.lang.Integer)100);
    java.lang.Object obj8 = null;
    boolean b9 = set0.equals(obj8);
    int i10 = set0.size();
    boolean b12 = set0.belongs((java.lang.Integer)0);
    boolean b14 = set0.equals((java.lang.Object)(short)10);
    set0.clear();
    boolean b17 = set0.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    boolean b21 = set0.belongs((java.lang.Integer)0);
    int i22 = set0.size();
    boolean b23 = set0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b17 = set16.isEmpty();
    boolean b19 = set16.remove((java.lang.Integer)0);
    evosuite.set.Set set20 = new evosuite.set.Set();
    boolean b21 = set20.repOk();
    boolean b23 = set20.belongs((java.lang.Integer)0);
    boolean b25 = set20.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set26 = new evosuite.set.Set();
    boolean b27 = set26.repOk();
    evosuite.set.Set set28 = new evosuite.set.Set();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = set28.intersect(set29);
    java.lang.Object obj31 = null;
    boolean b32 = set28.equals(obj31);
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = set33.intersect(set34);
    evosuite.set.Set set36 = set28.intersect(set35);
    set36.clear();
    evosuite.set.Set set38 = set26.union(set36);
    boolean b39 = set20.equals((java.lang.Object)set38);
    java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i43 = new java.util.ArrayList<java.lang.Integer>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i43, i_array42);
    evosuite.set.Set set45 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i43);
    int i46 = set45.size();
    evosuite.set.Set set47 = set20.intersect(set45);
    evosuite.set.Set set48 = set16.union(set45);
    boolean b49 = set45.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array6);
    evosuite.set.Set set9 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    boolean b11 = set9.belongs((java.lang.Integer)1);
    evosuite.set.Set set12 = new evosuite.set.Set();
    boolean b13 = set12.repOk();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = set14.intersect(set15);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    evosuite.set.Set set19 = new evosuite.set.Set();
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = set19.intersect(set20);
    evosuite.set.Set set22 = set14.intersect(set21);
    set22.clear();
    evosuite.set.Set set24 = set12.union(set22);
    evosuite.set.Set set25 = set9.union(set12);
    evosuite.set.Set set26 = set0.intersect(set9);
    evosuite.set.Set set27 = new evosuite.set.Set();
    boolean b28 = set27.repOk();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = set34.intersect(set35);
    evosuite.set.Set set37 = set29.intersect(set36);
    set37.clear();
    evosuite.set.Set set39 = set27.union(set37);
    boolean b40 = set26.equals((java.lang.Object)set37);
    set37.clear();
    int i42 = set37.size();
    int i43 = set37.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    set0.clear();
    boolean b7 = set0.add((java.lang.Integer)100);
    boolean b8 = set0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    boolean b9 = set6.add((java.lang.Integer)10);
    boolean b11 = set6.remove((java.lang.Integer)1);
    evosuite.set.Set set12 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set13 = set6.union(set12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    boolean b23 = set21.belongs((java.lang.Integer)0);
    boolean b25 = set21.remove((java.lang.Integer)3);
    evosuite.set.Set set26 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set27 = set21.intersect(set26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    java.lang.Object obj8 = null;
    boolean b9 = set7.equals(obj8);
    boolean b10 = set7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b15 = set0.isEmpty();
    java.lang.Integer[] i_array18 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i19 = new java.util.ArrayList<java.lang.Integer>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i19, i_array18);
    evosuite.set.Set set21 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i19);
    boolean b23 = set21.belongs((java.lang.Integer)1);
    evosuite.set.Set set24 = new evosuite.set.Set();
    boolean b25 = set24.repOk();
    evosuite.set.Set set26 = new evosuite.set.Set();
    evosuite.set.Set set27 = new evosuite.set.Set();
    evosuite.set.Set set28 = set26.intersect(set27);
    java.lang.Object obj29 = null;
    boolean b30 = set26.equals(obj29);
    evosuite.set.Set set31 = new evosuite.set.Set();
    evosuite.set.Set set32 = new evosuite.set.Set();
    evosuite.set.Set set33 = set31.intersect(set32);
    evosuite.set.Set set34 = set26.intersect(set33);
    set34.clear();
    evosuite.set.Set set36 = set24.union(set34);
    evosuite.set.Set set37 = set21.union(set24);
    evosuite.set.Set set38 = new evosuite.set.Set();
    evosuite.set.Set set39 = new evosuite.set.Set();
    evosuite.set.Set set40 = set38.intersect(set39);
    boolean b41 = set38.repOk();
    java.lang.Integer[] i_array44 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i45 = new java.util.ArrayList<java.lang.Integer>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i45, i_array44);
    evosuite.set.Set set47 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i45);
    boolean b49 = set47.belongs((java.lang.Integer)1);
    evosuite.set.Set set50 = new evosuite.set.Set();
    boolean b51 = set50.repOk();
    evosuite.set.Set set52 = new evosuite.set.Set();
    evosuite.set.Set set53 = new evosuite.set.Set();
    evosuite.set.Set set54 = set52.intersect(set53);
    java.lang.Object obj55 = null;
    boolean b56 = set52.equals(obj55);
    evosuite.set.Set set57 = new evosuite.set.Set();
    evosuite.set.Set set58 = new evosuite.set.Set();
    evosuite.set.Set set59 = set57.intersect(set58);
    evosuite.set.Set set60 = set52.intersect(set59);
    set60.clear();
    evosuite.set.Set set62 = set50.union(set60);
    evosuite.set.Set set63 = set47.union(set50);
    evosuite.set.Set set64 = set38.intersect(set47);
    evosuite.set.Set set65 = set37.intersect(set38);
    int i66 = set65.size();
    int i67 = set65.size();
    boolean b68 = set0.equals((java.lang.Object)i67);
    boolean b69 = set0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    boolean b11 = set8.belongs((java.lang.Integer)0);
    boolean b13 = set8.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set14 = new evosuite.set.Set();
    boolean b15 = set14.repOk();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = new evosuite.set.Set();
    evosuite.set.Set set18 = set16.intersect(set17);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    evosuite.set.Set set21 = new evosuite.set.Set();
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = set21.intersect(set22);
    evosuite.set.Set set24 = set16.intersect(set23);
    set24.clear();
    evosuite.set.Set set26 = set14.union(set24);
    boolean b27 = set8.equals((java.lang.Object)set26);
    evosuite.set.Set set28 = set7.union(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set2.belongs((java.lang.Integer)100);
    boolean b6 = set2.remove((java.lang.Integer)10);
    evosuite.set.Set set7 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set8 = set2.intersect(set7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    boolean b9 = set6.add((java.lang.Integer)10);
    boolean b11 = set6.equals((java.lang.Object)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set1.add((java.lang.Integer)0);
    boolean b6 = set1.add((java.lang.Integer)3);
    set1.clear();
    boolean b8 = set1.repOk();
    boolean b10 = set1.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    evosuite.set.Set set11 = set6.union(set10);
    boolean b12 = set6.repOk();
    int i13 = set6.size();
    java.lang.Integer[] i_array17 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i18 = new java.util.ArrayList<java.lang.Integer>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i18, i_array17);
    evosuite.set.Set set20 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i18);
    evosuite.set.Set set21 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i18);
    evosuite.set.Set set22 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i18);
    set22.clear();
    boolean b25 = set22.add((java.lang.Integer)0);
    boolean b27 = set22.remove((java.lang.Integer)0);
    boolean b28 = set6.equals((java.lang.Object)set22);
    boolean b30 = set6.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 5, 100, 3 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set8 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.isEmpty();
    boolean b3 = set0.belongs((java.lang.Integer)2);
    evosuite.set.Set set4 = new evosuite.set.Set();
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = set4.intersect(set5);
    boolean b8 = set5.add((java.lang.Integer)0);
    evosuite.set.Set set9 = set0.union(set5);
    java.lang.Integer[] i_array13 = new java.lang.Integer[] { 100, 10, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i14 = new java.util.ArrayList<java.lang.Integer>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i14, i_array13);
    evosuite.set.Set set16 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i14);
    evosuite.set.Set set17 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i14);
    boolean b19 = set17.add((java.lang.Integer)0);
    boolean b21 = set17.belongs((java.lang.Integer)0);
    boolean b23 = set17.remove((java.lang.Integer)0);
    boolean b25 = set17.belongs((java.lang.Integer)5);
    boolean b26 = set5.equals((java.lang.Object)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set12.isEmpty();
    int i14 = set12.size();
    boolean b15 = set12.repOk();
    set12.clear();
    boolean b17 = set12.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.belongs((java.lang.Integer)100);
    java.lang.Object obj14 = null;
    boolean b15 = set8.equals(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b17 = set16.isEmpty();
    evosuite.set.Set set18 = new evosuite.set.Set();
    evosuite.set.Set set19 = new evosuite.set.Set();
    evosuite.set.Set set20 = set18.intersect(set19);
    boolean b21 = set18.repOk();
    java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i25 = new java.util.ArrayList<java.lang.Integer>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i25, i_array24);
    evosuite.set.Set set27 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    boolean b29 = set27.belongs((java.lang.Integer)1);
    evosuite.set.Set set30 = new evosuite.set.Set();
    boolean b31 = set30.repOk();
    evosuite.set.Set set32 = new evosuite.set.Set();
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = set32.intersect(set33);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = new evosuite.set.Set();
    evosuite.set.Set set39 = set37.intersect(set38);
    evosuite.set.Set set40 = set32.intersect(set39);
    set40.clear();
    evosuite.set.Set set42 = set30.union(set40);
    evosuite.set.Set set43 = set27.union(set30);
    evosuite.set.Set set44 = set18.intersect(set27);
    evosuite.set.Set set45 = set16.union(set44);
    set44.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = set9.intersect(set10);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = set14.intersect(set15);
    evosuite.set.Set set17 = set9.intersect(set16);
    set17.clear();
    evosuite.set.Set set19 = set0.intersect(set17);
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = new evosuite.set.Set();
    evosuite.set.Set set22 = set20.intersect(set21);
    boolean b23 = set20.repOk();
    boolean b24 = set20.repOk();
    boolean b26 = set20.belongs((java.lang.Integer)10);
    set20.clear();
    boolean b28 = set0.equals((java.lang.Object)set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    evosuite.set.Set set7 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b9 = set7.remove((java.lang.Integer)0);
    evosuite.set.Set set10 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set11 = set7.union(set10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    boolean b20 = set18.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    boolean b23 = set21.remove((java.lang.Integer)2);
    evosuite.set.Set set24 = new evosuite.set.Set();
    evosuite.set.Set set25 = set21.intersect(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b4 = set0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    int i9 = set8.size();
    int i10 = set8.size();
    boolean b12 = set8.belongs((java.lang.Integer)0);
    boolean b13 = set8.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    boolean b4 = set0.repOk();
    boolean b6 = set0.belongs((java.lang.Integer)10);
    boolean b7 = set0.isEmpty();
    boolean b9 = set0.remove((java.lang.Integer)10);
    boolean b11 = set0.add((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    java.lang.Object obj22 = null;
    boolean b23 = set5.equals(obj22);
    boolean b24 = set5.repOk();
    set5.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b15 = set0.isEmpty();
    boolean b17 = set0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b3 = set0.repOk();
    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array6);
    evosuite.set.Set set9 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    boolean b11 = set9.belongs((java.lang.Integer)1);
    evosuite.set.Set set12 = new evosuite.set.Set();
    boolean b13 = set12.repOk();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = set14.intersect(set15);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    evosuite.set.Set set19 = new evosuite.set.Set();
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = set19.intersect(set20);
    evosuite.set.Set set22 = set14.intersect(set21);
    set22.clear();
    evosuite.set.Set set24 = set12.union(set22);
    evosuite.set.Set set25 = set9.union(set12);
    evosuite.set.Set set26 = set0.intersect(set9);
    boolean b28 = set9.add((java.lang.Integer)10);
    boolean b29 = set9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    boolean b9 = set6.add((java.lang.Integer)10);
    boolean b11 = set6.remove((java.lang.Integer)1);
    set6.clear();
    boolean b13 = set6.isEmpty();
    boolean b14 = set6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b16 = set0.add((java.lang.Integer)1);
    boolean b17 = set0.isEmpty();
    set0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    set8.clear();
    boolean b11 = set8.remove((java.lang.Integer)1);
    boolean b13 = set8.add((java.lang.Integer)3);
    boolean b15 = set8.belongs((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b17 = set16.isEmpty();
    boolean b19 = set16.remove((java.lang.Integer)0);
    evosuite.set.Set set20 = new evosuite.set.Set();
    boolean b21 = set20.repOk();
    boolean b23 = set20.belongs((java.lang.Integer)0);
    boolean b25 = set20.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set26 = new evosuite.set.Set();
    boolean b27 = set26.repOk();
    evosuite.set.Set set28 = new evosuite.set.Set();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = set28.intersect(set29);
    java.lang.Object obj31 = null;
    boolean b32 = set28.equals(obj31);
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = set33.intersect(set34);
    evosuite.set.Set set36 = set28.intersect(set35);
    set36.clear();
    evosuite.set.Set set38 = set26.union(set36);
    boolean b39 = set20.equals((java.lang.Object)set38);
    java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i43 = new java.util.ArrayList<java.lang.Integer>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i43, i_array42);
    evosuite.set.Set set45 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i43);
    int i46 = set45.size();
    evosuite.set.Set set47 = set20.intersect(set45);
    evosuite.set.Set set48 = set16.union(set45);
    int i49 = set48.size();
    boolean b51 = set48.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    boolean b3 = set0.belongs((java.lang.Integer)0);
    boolean b5 = set0.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set6 = new evosuite.set.Set();
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    evosuite.set.Set set13 = new evosuite.set.Set();
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = set13.intersect(set14);
    evosuite.set.Set set16 = set8.intersect(set15);
    set16.clear();
    evosuite.set.Set set18 = set6.union(set16);
    boolean b19 = set0.equals((java.lang.Object)set18);
    java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i23 = new java.util.ArrayList<java.lang.Integer>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i23, i_array22);
    evosuite.set.Set set25 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i23);
    int i26 = set25.size();
    evosuite.set.Set set27 = set0.intersect(set25);
    evosuite.set.Set set28 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set29 = set27.intersect(set28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    int i50 = set49.size();
    boolean b51 = set49.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b17 = set16.isEmpty();
    boolean b19 = set16.remove((java.lang.Integer)0);
    evosuite.set.Set set20 = new evosuite.set.Set();
    boolean b21 = set20.repOk();
    boolean b23 = set20.belongs((java.lang.Integer)0);
    boolean b25 = set20.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set26 = new evosuite.set.Set();
    boolean b27 = set26.repOk();
    evosuite.set.Set set28 = new evosuite.set.Set();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = set28.intersect(set29);
    java.lang.Object obj31 = null;
    boolean b32 = set28.equals(obj31);
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = set33.intersect(set34);
    evosuite.set.Set set36 = set28.intersect(set35);
    set36.clear();
    evosuite.set.Set set38 = set26.union(set36);
    boolean b39 = set20.equals((java.lang.Object)set38);
    java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i43 = new java.util.ArrayList<java.lang.Integer>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i43, i_array42);
    evosuite.set.Set set45 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i43);
    int i46 = set45.size();
    evosuite.set.Set set47 = set20.intersect(set45);
    evosuite.set.Set set48 = set16.union(set45);
    int i49 = set48.size();
    java.lang.Integer[] i_array53 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i54 = new java.util.ArrayList<java.lang.Integer>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i54, i_array53);
    evosuite.set.Set set56 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i54);
    boolean b57 = set56.repOk();
    java.lang.Integer[] i_array60 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i61 = new java.util.ArrayList<java.lang.Integer>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i61, i_array60);
    evosuite.set.Set set63 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i61);
    boolean b65 = set63.belongs((java.lang.Integer)1);
    evosuite.set.Set set66 = set56.union(set63);
    boolean b67 = set66.isEmpty();
    boolean b69 = set66.remove((java.lang.Integer)0);
    evosuite.set.Set set70 = new evosuite.set.Set();
    boolean b71 = set70.repOk();
    boolean b73 = set70.belongs((java.lang.Integer)0);
    boolean b75 = set70.equals((java.lang.Object)(byte)0);
    evosuite.set.Set set76 = new evosuite.set.Set();
    boolean b77 = set76.repOk();
    evosuite.set.Set set78 = new evosuite.set.Set();
    evosuite.set.Set set79 = new evosuite.set.Set();
    evosuite.set.Set set80 = set78.intersect(set79);
    java.lang.Object obj81 = null;
    boolean b82 = set78.equals(obj81);
    evosuite.set.Set set83 = new evosuite.set.Set();
    evosuite.set.Set set84 = new evosuite.set.Set();
    evosuite.set.Set set85 = set83.intersect(set84);
    evosuite.set.Set set86 = set78.intersect(set85);
    set86.clear();
    evosuite.set.Set set88 = set76.union(set86);
    boolean b89 = set70.equals((java.lang.Object)set88);
    java.lang.Integer[] i_array92 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i93 = new java.util.ArrayList<java.lang.Integer>();
    boolean b94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i93, i_array92);
    evosuite.set.Set set95 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i93);
    int i96 = set95.size();
    evosuite.set.Set set97 = set70.intersect(set95);
    evosuite.set.Set set98 = set66.union(set95);
    evosuite.set.Set set99 = set48.intersect(set95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set99);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b14 = set12.add((java.lang.Integer)0);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    boolean b18 = set15.repOk();
    java.lang.Integer[] i_array21 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i22 = new java.util.ArrayList<java.lang.Integer>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i22, i_array21);
    evosuite.set.Set set24 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i22);
    boolean b26 = set24.belongs((java.lang.Integer)1);
    evosuite.set.Set set27 = new evosuite.set.Set();
    boolean b28 = set27.repOk();
    evosuite.set.Set set29 = new evosuite.set.Set();
    evosuite.set.Set set30 = new evosuite.set.Set();
    evosuite.set.Set set31 = set29.intersect(set30);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    evosuite.set.Set set34 = new evosuite.set.Set();
    evosuite.set.Set set35 = new evosuite.set.Set();
    evosuite.set.Set set36 = set34.intersect(set35);
    evosuite.set.Set set37 = set29.intersect(set36);
    set37.clear();
    evosuite.set.Set set39 = set27.union(set37);
    evosuite.set.Set set40 = set24.union(set27);
    evosuite.set.Set set41 = set15.intersect(set24);
    evosuite.set.Set set42 = set12.union(set24);
    boolean b43 = set24.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b16 = set0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    int i14 = set0.size();
    boolean b16 = set0.remove((java.lang.Integer)0);
    set0.clear();
    evosuite.set.Set set18 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set19 = set0.intersect(set18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b17 = set16.isEmpty();
    evosuite.set.Set set18 = new evosuite.set.Set();
    evosuite.set.Set set19 = new evosuite.set.Set();
    evosuite.set.Set set20 = set18.intersect(set19);
    boolean b21 = set18.repOk();
    java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i25 = new java.util.ArrayList<java.lang.Integer>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i25, i_array24);
    evosuite.set.Set set27 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    boolean b29 = set27.belongs((java.lang.Integer)1);
    evosuite.set.Set set30 = new evosuite.set.Set();
    boolean b31 = set30.repOk();
    evosuite.set.Set set32 = new evosuite.set.Set();
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = set32.intersect(set33);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = new evosuite.set.Set();
    evosuite.set.Set set39 = set37.intersect(set38);
    evosuite.set.Set set40 = set32.intersect(set39);
    set40.clear();
    evosuite.set.Set set42 = set30.union(set40);
    evosuite.set.Set set43 = set27.union(set30);
    evosuite.set.Set set44 = set18.intersect(set27);
    evosuite.set.Set set45 = set16.union(set44);
    boolean b47 = set16.belongs((java.lang.Integer)0);
    int i48 = set16.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    boolean b9 = set6.add((java.lang.Integer)10);
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    boolean b14 = set11.add((java.lang.Integer)0);
    boolean b16 = set11.add((java.lang.Integer)3);
    set11.clear();
    evosuite.set.Set set18 = set6.intersect(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i11, i_array10);
    evosuite.set.Set set13 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i11);
    boolean b15 = set13.belongs((java.lang.Integer)1);
    evosuite.set.Set set16 = set6.union(set13);
    boolean b17 = set16.isEmpty();
    evosuite.set.Set set18 = new evosuite.set.Set();
    evosuite.set.Set set19 = new evosuite.set.Set();
    evosuite.set.Set set20 = set18.intersect(set19);
    boolean b21 = set18.repOk();
    java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i25 = new java.util.ArrayList<java.lang.Integer>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i25, i_array24);
    evosuite.set.Set set27 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    boolean b29 = set27.belongs((java.lang.Integer)1);
    evosuite.set.Set set30 = new evosuite.set.Set();
    boolean b31 = set30.repOk();
    evosuite.set.Set set32 = new evosuite.set.Set();
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = set32.intersect(set33);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = new evosuite.set.Set();
    evosuite.set.Set set39 = set37.intersect(set38);
    evosuite.set.Set set40 = set32.intersect(set39);
    set40.clear();
    evosuite.set.Set set42 = set30.union(set40);
    evosuite.set.Set set43 = set27.union(set30);
    evosuite.set.Set set44 = set18.intersect(set27);
    evosuite.set.Set set45 = set16.union(set44);
    boolean b47 = set16.belongs((java.lang.Integer)0);
    boolean b49 = set16.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set2.belongs((java.lang.Integer)100);
    boolean b6 = set2.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    boolean b9 = set6.add((java.lang.Integer)10);
    boolean b11 = set6.remove((java.lang.Integer)1);
    boolean b12 = set6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    evosuite.set.Set set6 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b7 = set6.repOk();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = set8.intersect(set9);
    evosuite.set.Set set11 = set6.union(set10);
    boolean b12 = set6.repOk();
    int i13 = set6.size();
    java.lang.Integer[] i_array17 = new java.lang.Integer[] { 10, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i18 = new java.util.ArrayList<java.lang.Integer>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i18, i_array17);
    evosuite.set.Set set20 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i18);
    evosuite.set.Set set21 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i18);
    evosuite.set.Set set22 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i18);
    set22.clear();
    boolean b25 = set22.add((java.lang.Integer)0);
    boolean b27 = set22.remove((java.lang.Integer)0);
    boolean b28 = set6.equals((java.lang.Object)set22);
    boolean b30 = set22.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    boolean b4 = set1.add((java.lang.Integer)0);
    boolean b6 = set1.add((java.lang.Integer)3);
    boolean b7 = set1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i3, i_array2);
    evosuite.set.Set set5 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i3);
    boolean b7 = set5.belongs((java.lang.Integer)1);
    evosuite.set.Set set8 = new evosuite.set.Set();
    boolean b9 = set8.repOk();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = new evosuite.set.Set();
    evosuite.set.Set set12 = set10.intersect(set11);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = new evosuite.set.Set();
    evosuite.set.Set set17 = set15.intersect(set16);
    evosuite.set.Set set18 = set10.intersect(set17);
    set18.clear();
    evosuite.set.Set set20 = set8.union(set18);
    evosuite.set.Set set21 = set5.union(set8);
    evosuite.set.Set set22 = new evosuite.set.Set();
    evosuite.set.Set set23 = new evosuite.set.Set();
    evosuite.set.Set set24 = set22.intersect(set23);
    boolean b25 = set22.repOk();
    java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100, (-1) };
    java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i29, i_array28);
    evosuite.set.Set set31 = new evosuite.set.Set((java.util.Collection<java.lang.Integer>)arraylist_i29);
    boolean b33 = set31.belongs((java.lang.Integer)1);
    evosuite.set.Set set34 = new evosuite.set.Set();
    boolean b35 = set34.repOk();
    evosuite.set.Set set36 = new evosuite.set.Set();
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = set36.intersect(set37);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    evosuite.set.Set set44 = set36.intersect(set43);
    set44.clear();
    evosuite.set.Set set46 = set34.union(set44);
    evosuite.set.Set set47 = set31.union(set34);
    evosuite.set.Set set48 = set22.intersect(set31);
    evosuite.set.Set set49 = set21.intersect(set22);
    boolean b51 = set22.belongs((java.lang.Integer)0);
    boolean b53 = set22.remove((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set0.isEmpty();
    boolean b14 = set0.isEmpty();
    boolean b16 = set0.belongs((java.lang.Integer)2);
    boolean b18 = set0.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set12.isEmpty();
    boolean b14 = set12.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    boolean b1 = set0.repOk();
    evosuite.set.Set set2 = new evosuite.set.Set();
    evosuite.set.Set set3 = new evosuite.set.Set();
    evosuite.set.Set set4 = set2.intersect(set3);
    java.lang.Object obj5 = null;
    boolean b6 = set2.equals(obj5);
    evosuite.set.Set set7 = new evosuite.set.Set();
    evosuite.set.Set set8 = new evosuite.set.Set();
    evosuite.set.Set set9 = set7.intersect(set8);
    evosuite.set.Set set10 = set2.intersect(set9);
    set10.clear();
    evosuite.set.Set set12 = set0.union(set10);
    boolean b13 = set12.isEmpty();
    int i14 = set12.size();
    boolean b15 = set12.repOk();
    set12.clear();
    set12.clear();
    boolean b19 = set12.belongs((java.lang.Integer)3);
    evosuite.set.Set set20 = null;
    // The following exception was thrown during execution in test generation
    try {
    evosuite.set.Set set21 = set12.intersect(set20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    evosuite.set.Set set0 = new evosuite.set.Set();
    evosuite.set.Set set1 = new evosuite.set.Set();
    evosuite.set.Set set2 = set0.intersect(set1);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    evosuite.set.Set set5 = new evosuite.set.Set();
    evosuite.set.Set set6 = new evosuite.set.Set();
    evosuite.set.Set set7 = set5.intersect(set6);
    evosuite.set.Set set8 = set0.intersect(set7);
    evosuite.set.Set set9 = new evosuite.set.Set();
    evosuite.set.Set set10 = new evosuite.set.Set();
    evosuite.set.Set set11 = set9.intersect(set10);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    evosuite.set.Set set14 = new evosuite.set.Set();
    evosuite.set.Set set15 = new evosuite.set.Set();
    evosuite.set.Set set16 = set14.intersect(set15);
    evosuite.set.Set set17 = set9.intersect(set16);
    set17.clear();
    evosuite.set.Set set19 = set0.intersect(set17);
    evosuite.set.Set set20 = new evosuite.set.Set();
    evosuite.set.Set set21 = new evosuite.set.Set();
    evosuite.set.Set set22 = set20.intersect(set21);
    java.lang.Object obj23 = null;
    boolean b24 = set20.equals(obj23);
    evosuite.set.Set set25 = new evosuite.set.Set();
    evosuite.set.Set set26 = new evosuite.set.Set();
    evosuite.set.Set set27 = set25.intersect(set26);
    evosuite.set.Set set28 = set20.intersect(set27);
    set28.clear();
    boolean b31 = set28.remove((java.lang.Integer)1);
    evosuite.set.Set set32 = new evosuite.set.Set();
    evosuite.set.Set set33 = new evosuite.set.Set();
    evosuite.set.Set set34 = set32.intersect(set33);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    evosuite.set.Set set37 = new evosuite.set.Set();
    evosuite.set.Set set38 = new evosuite.set.Set();
    evosuite.set.Set set39 = set37.intersect(set38);
    evosuite.set.Set set40 = set32.intersect(set39);
    evosuite.set.Set set41 = new evosuite.set.Set();
    evosuite.set.Set set42 = new evosuite.set.Set();
    evosuite.set.Set set43 = set41.intersect(set42);
    java.lang.Object obj44 = null;
    boolean b45 = set41.equals(obj44);
    evosuite.set.Set set46 = new evosuite.set.Set();
    evosuite.set.Set set47 = new evosuite.set.Set();
    evosuite.set.Set set48 = set46.intersect(set47);
    evosuite.set.Set set49 = set41.intersect(set48);
    set49.clear();
    evosuite.set.Set set51 = set32.intersect(set49);
    boolean b52 = set28.equals((java.lang.Object)set49);
    evosuite.set.Set set53 = set0.union(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);

  }

}
