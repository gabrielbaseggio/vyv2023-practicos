package set;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test01"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    boolean b7 = set0.remove((java.lang.Integer)0);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    set.Set set15 = set0.intersect(set14);
    set.Set set16 = new set.Set();
    set.Set set17 = new set.Set();
    boolean b19 = set17.remove((java.lang.Integer)0);
    java.lang.Object obj20 = null;
    boolean b21 = set17.equals(obj20);
    set.Set set22 = set16.intersect(set17);
    boolean b23 = set16.isEmpty();
    boolean b25 = set16.remove((java.lang.Integer)0);
    set16.clear();
    set.Set set27 = set0.union(set16);
    set.Set set28 = new set.Set();
    boolean b30 = set28.remove((java.lang.Integer)0);
    boolean b32 = set28.remove((java.lang.Integer)0);
    int i33 = set28.size();
    boolean b35 = set28.remove((java.lang.Integer)0);
    set.Set set36 = new set.Set();
    set.Set set37 = new set.Set();
    boolean b39 = set37.remove((java.lang.Integer)0);
    java.lang.Object obj40 = null;
    boolean b41 = set37.equals(obj40);
    set.Set set42 = set36.intersect(set37);
    set.Set set43 = set28.intersect(set42);
    set.Set set44 = set27.intersect(set43);
    int i45 = set43.size();
    set43.clear();
    boolean b48 = set43.remove((java.lang.Integer)0);
    java.lang.Object obj49 = null;
    boolean b50 = set43.equals(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test02"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    boolean b15 = set8.isEmpty();
    java.lang.Object obj16 = null;
    boolean b17 = set8.equals(obj16);
    set.Set set18 = set7.union(set8);
    boolean b20 = set7.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array24 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i25 = new java.util.ArrayList<java.lang.Integer>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i25, i_array24);
    set.Set set27 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    set.Set set28 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    set.Set set29 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    boolean b30 = set7.equals((java.lang.Object)set29);
    set.Set set31 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set32 = set7.intersect(set31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    boolean b15 = set8.isEmpty();
    java.lang.Object obj16 = null;
    boolean b17 = set8.equals(obj16);
    set.Set set18 = set7.union(set8);
    boolean b20 = set7.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array24 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i25 = new java.util.ArrayList<java.lang.Integer>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i25, i_array24);
    set.Set set27 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    set.Set set28 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    set.Set set29 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i25);
    boolean b30 = set7.equals((java.lang.Object)set29);
    set.Set set31 = new set.Set();
    set.Set set32 = new set.Set();
    boolean b34 = set32.remove((java.lang.Integer)0);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    set.Set set37 = set31.intersect(set32);
    boolean b38 = set31.isEmpty();
    boolean b40 = set31.remove((java.lang.Integer)0);
    boolean b42 = set31.belongs((java.lang.Integer)0);
    boolean b44 = set31.remove((java.lang.Integer)(-1));
    set.Set set45 = set7.intersect(set31);
    boolean b47 = set31.add((java.lang.Integer)2);
    set.Set set48 = new set.Set();
    set.Set set49 = new set.Set();
    boolean b51 = set49.remove((java.lang.Integer)0);
    java.lang.Object obj52 = null;
    boolean b53 = set49.equals(obj52);
    set.Set set54 = set48.intersect(set49);
    boolean b56 = set48.add((java.lang.Integer)100);
    boolean b58 = set48.remove((java.lang.Integer)10);
    boolean b60 = set48.remove((java.lang.Integer)0);
    boolean b62 = set48.add((java.lang.Integer)0);
    java.lang.Integer[] i_array66 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i67 = new java.util.ArrayList<java.lang.Integer>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i67, i_array66);
    set.Set set69 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i67);
    set.Set set70 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i67);
    boolean b72 = set70.remove((java.lang.Integer)0);
    boolean b73 = set70.isEmpty();
    set.Set set74 = set48.intersect(set70);
    boolean b76 = set70.belongs((java.lang.Integer)(-1));
    boolean b77 = set31.equals((java.lang.Object)set70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b7 = set0.isEmpty();
    boolean b9 = set0.remove((java.lang.Integer)0);
    set0.clear();
    int i11 = set0.size();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i16 = new java.util.ArrayList<java.lang.Integer>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i16, i_array15);
    set.Set set18 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i16);
    boolean b20 = set18.remove((java.lang.Integer)0);
    set.Set set21 = new set.Set();
    set.Set set22 = new set.Set();
    boolean b24 = set22.remove((java.lang.Integer)0);
    java.lang.Object obj25 = null;
    boolean b26 = set22.equals(obj25);
    set.Set set27 = set21.intersect(set22);
    set.Set set28 = new set.Set();
    set.Set set29 = new set.Set();
    boolean b31 = set29.remove((java.lang.Integer)0);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    set.Set set34 = set28.intersect(set29);
    boolean b35 = set21.equals((java.lang.Object)set29);
    set.Set set36 = set18.intersect(set29);
    boolean b37 = set0.equals((java.lang.Object)set18);
    java.lang.Object obj38 = null;
    boolean b39 = set0.equals(obj38);
    boolean b41 = set0.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    boolean b7 = set0.remove((java.lang.Integer)0);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    set.Set set15 = set0.intersect(set14);
    set.Set set16 = new set.Set();
    set.Set set17 = new set.Set();
    boolean b19 = set17.remove((java.lang.Integer)0);
    java.lang.Object obj20 = null;
    boolean b21 = set17.equals(obj20);
    set.Set set22 = set16.intersect(set17);
    boolean b23 = set16.isEmpty();
    boolean b25 = set16.remove((java.lang.Integer)0);
    set16.clear();
    set.Set set27 = set0.union(set16);
    set.Set set28 = new set.Set();
    boolean b30 = set28.remove((java.lang.Integer)0);
    boolean b32 = set28.remove((java.lang.Integer)0);
    int i33 = set28.size();
    boolean b35 = set28.remove((java.lang.Integer)0);
    set.Set set36 = new set.Set();
    set.Set set37 = new set.Set();
    boolean b39 = set37.remove((java.lang.Integer)0);
    java.lang.Object obj40 = null;
    boolean b41 = set37.equals(obj40);
    set.Set set42 = set36.intersect(set37);
    set.Set set43 = set28.intersect(set42);
    set.Set set44 = set27.intersect(set43);
    boolean b45 = set43.isEmpty();
    boolean b47 = set43.belongs((java.lang.Integer)1);
    set.Set set48 = new set.Set();
    set48.clear();
    set.Set set50 = new set.Set();
    boolean b52 = set50.remove((java.lang.Integer)0);
    boolean b54 = set50.remove((java.lang.Integer)0);
    int i55 = set50.size();
    boolean b57 = set50.remove((java.lang.Integer)0);
    set.Set set58 = set48.union(set50);
    int i59 = set58.size();
    set.Set set60 = set43.intersect(set58);
    int i61 = set43.size();
    set43.clear();
    set43.clear();
    set.Set set64 = new set.Set();
    boolean b66 = set64.remove((java.lang.Integer)0);
    boolean b68 = set64.remove((java.lang.Integer)0);
    int i69 = set64.size();
    boolean b71 = set64.remove((java.lang.Integer)0);
    boolean b73 = set64.belongs((java.lang.Integer)100);
    set.Set set74 = new set.Set();
    set74.clear();
    set.Set set76 = new set.Set();
    set.Set set77 = new set.Set();
    boolean b79 = set77.remove((java.lang.Integer)0);
    java.lang.Object obj80 = null;
    boolean b81 = set77.equals(obj80);
    set.Set set82 = set76.intersect(set77);
    boolean b84 = set76.belongs((java.lang.Integer)10);
    int i85 = set76.size();
    set.Set set86 = set74.intersect(set76);
    boolean b87 = set76.isEmpty();
    set.Set set88 = set64.union(set76);
    boolean b90 = set88.add((java.lang.Integer)0);
    set.Set set91 = set43.union(set88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set91);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    boolean b14 = set0.remove((java.lang.Integer)0);
    boolean b16 = set0.remove((java.lang.Integer)0);
    set.Set set17 = new set.Set();
    set.Set set18 = new set.Set();
    boolean b20 = set18.remove((java.lang.Integer)0);
    java.lang.Object obj21 = null;
    boolean b22 = set18.equals(obj21);
    set.Set set23 = set17.intersect(set18);
    boolean b25 = set17.belongs((java.lang.Integer)10);
    set17.clear();
    int i27 = set17.size();
    boolean b28 = set0.equals((java.lang.Object)set17);
    int i29 = set17.size();
    int i30 = set17.size();
    boolean b32 = set17.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set2.belongs((java.lang.Integer)1);
    int i13 = set2.size();
    set2.clear();
    boolean b15 = set2.isEmpty();
    boolean b16 = set2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test08"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    set.Set set6 = new set.Set();
    boolean b8 = set6.remove((java.lang.Integer)1);
    int i9 = set6.size();
    set.Set set10 = new set.Set();
    set.Set set11 = new set.Set();
    boolean b13 = set11.remove((java.lang.Integer)0);
    java.lang.Object obj14 = null;
    boolean b15 = set11.equals(obj14);
    set.Set set16 = set10.intersect(set11);
    boolean b17 = set10.isEmpty();
    java.lang.Object obj18 = null;
    boolean b19 = set10.equals(obj18);
    set.Set set20 = new set.Set();
    set20.clear();
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    boolean b30 = set22.belongs((java.lang.Integer)10);
    int i31 = set22.size();
    set.Set set32 = set20.intersect(set22);
    boolean b34 = set20.remove((java.lang.Integer)0);
    boolean b35 = set20.isEmpty();
    java.lang.Integer[] i_array39 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i40 = new java.util.ArrayList<java.lang.Integer>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i40, i_array39);
    set.Set set42 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i40);
    set.Set set43 = set20.union(set42);
    set.Set set44 = set10.intersect(set20);
    set.Set set45 = set6.union(set44);
    boolean b46 = set0.equals((java.lang.Object)set44);
    boolean b48 = set44.add((java.lang.Integer)1);
    set44.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    boolean b14 = set0.remove((java.lang.Integer)0);
    boolean b16 = set0.add((java.lang.Integer)100);
    boolean b18 = set0.add((java.lang.Integer)(-1));
    set.Set set19 = new set.Set();
    set.Set set20 = new set.Set();
    boolean b22 = set20.remove((java.lang.Integer)0);
    java.lang.Object obj23 = null;
    boolean b24 = set20.equals(obj23);
    set.Set set25 = set19.intersect(set20);
    int i26 = set25.size();
    boolean b28 = set25.add((java.lang.Integer)0);
    set25.clear();
    set.Set set30 = new set.Set();
    boolean b32 = set30.remove((java.lang.Integer)1);
    boolean b34 = set30.add((java.lang.Integer)0);
    set.Set set35 = new set.Set();
    set.Set set36 = new set.Set();
    boolean b38 = set36.remove((java.lang.Integer)0);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    set.Set set41 = set35.intersect(set36);
    boolean b43 = set35.belongs((java.lang.Integer)10);
    set35.clear();
    int i45 = set35.size();
    set.Set set46 = new set.Set();
    set.Set set47 = new set.Set();
    boolean b49 = set47.remove((java.lang.Integer)0);
    java.lang.Object obj50 = null;
    boolean b51 = set47.equals(obj50);
    set.Set set52 = set46.intersect(set47);
    set.Set set53 = new set.Set();
    set.Set set54 = new set.Set();
    boolean b56 = set54.remove((java.lang.Integer)0);
    java.lang.Object obj57 = null;
    boolean b58 = set54.equals(obj57);
    set.Set set59 = set53.intersect(set54);
    boolean b60 = set46.equals((java.lang.Object)set54);
    set.Set set61 = set35.union(set54);
    set.Set set62 = set30.union(set61);
    set.Set set63 = set25.intersect(set30);
    boolean b64 = set0.equals((java.lang.Object)set25);
    boolean b66 = set25.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set.Set set15 = new set.Set();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    set.Set set21 = set15.intersect(set16);
    boolean b22 = set15.isEmpty();
    boolean b24 = set15.remove((java.lang.Integer)0);
    set.Set set25 = set0.intersect(set15);
    boolean b26 = set15.isEmpty();
    set.Set set27 = new set.Set();
    set.Set set28 = new set.Set();
    boolean b30 = set28.remove((java.lang.Integer)0);
    java.lang.Object obj31 = null;
    boolean b32 = set28.equals(obj31);
    set.Set set33 = set27.intersect(set28);
    boolean b35 = set33.add((java.lang.Integer)(-1));
    boolean b37 = set33.belongs((java.lang.Integer)0);
    boolean b39 = set33.add((java.lang.Integer)0);
    boolean b40 = set15.equals((java.lang.Object)0);
    set15.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test11"); }

    set.Set set0 = new set.Set();
    set0.clear();
    boolean b3 = set0.remove((java.lang.Integer)(-1));
    boolean b4 = set0.isEmpty();
    boolean b6 = set0.remove((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test12"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    boolean b7 = set0.remove((java.lang.Integer)0);
    boolean b9 = set0.belongs((java.lang.Integer)100);
    boolean b10 = set0.isEmpty();
    boolean b12 = set0.add((java.lang.Integer)10);
    int i13 = set0.size();
    set.Set set14 = new set.Set();
    boolean b16 = set14.remove((java.lang.Integer)0);
    boolean b18 = set14.remove((java.lang.Integer)0);
    int i19 = set14.size();
    boolean b21 = set14.remove((java.lang.Integer)0);
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    set.Set set29 = set14.intersect(set28);
    set29.clear();
    set.Set set31 = new set.Set();
    set.Set set32 = new set.Set();
    boolean b34 = set32.remove((java.lang.Integer)0);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    set.Set set37 = set31.intersect(set32);
    int i38 = set37.size();
    boolean b40 = set37.belongs((java.lang.Integer)(-1));
    set.Set set41 = new set.Set();
    set.Set set42 = new set.Set();
    boolean b44 = set42.remove((java.lang.Integer)0);
    java.lang.Object obj45 = null;
    boolean b46 = set42.equals(obj45);
    set.Set set47 = set41.intersect(set42);
    set47.clear();
    set.Set set49 = set37.union(set47);
    boolean b50 = set29.equals((java.lang.Object)set47);
    boolean b51 = set29.isEmpty();
    set.Set set52 = set0.intersect(set29);
    boolean b54 = set29.remove((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test13"); }

    set.Set set0 = new set.Set();
    set0.clear();
    boolean b3 = set0.remove((java.lang.Integer)(-1));
    java.lang.Object obj4 = null;
    boolean b5 = set0.equals(obj4);
    boolean b7 = set0.remove((java.lang.Integer)1);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    boolean b16 = set9.belongs((java.lang.Integer)0);
    set.Set set17 = new set.Set();
    set.Set set18 = new set.Set();
    boolean b20 = set18.remove((java.lang.Integer)0);
    java.lang.Object obj21 = null;
    boolean b22 = set18.equals(obj21);
    set.Set set23 = set17.intersect(set18);
    boolean b25 = set17.add((java.lang.Integer)100);
    boolean b27 = set17.remove((java.lang.Integer)10);
    java.lang.Object obj28 = null;
    boolean b29 = set17.equals(obj28);
    set.Set set30 = set9.intersect(set17);
    set.Set set31 = set0.union(set17);
    set31.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test14"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set2.belongs((java.lang.Integer)1);
    int i13 = set2.size();
    set.Set set14 = new set.Set();
    set.Set set15 = new set.Set();
    boolean b17 = set15.remove((java.lang.Integer)0);
    java.lang.Object obj18 = null;
    boolean b19 = set15.equals(obj18);
    set.Set set20 = set14.intersect(set15);
    boolean b22 = set14.add((java.lang.Integer)100);
    boolean b24 = set14.remove((java.lang.Integer)10);
    java.lang.Object obj25 = null;
    boolean b26 = set14.equals(obj25);
    boolean b28 = set14.belongs((java.lang.Integer)1);
    java.lang.Integer[] i_array32 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i33 = new java.util.ArrayList<java.lang.Integer>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i33, i_array32);
    set.Set set35 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i33);
    set.Set set36 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i33);
    set.Set set37 = new set.Set();
    set.Set set38 = new set.Set();
    boolean b40 = set38.remove((java.lang.Integer)0);
    java.lang.Object obj41 = null;
    boolean b42 = set38.equals(obj41);
    set.Set set43 = set37.intersect(set38);
    boolean b44 = set37.isEmpty();
    java.lang.Object obj45 = null;
    boolean b46 = set37.equals(obj45);
    set.Set set47 = set36.union(set37);
    boolean b49 = set36.add((java.lang.Integer)0);
    boolean b51 = set36.add((java.lang.Integer)0);
    boolean b53 = set36.add((java.lang.Integer)0);
    set.Set set54 = set14.intersect(set36);
    boolean b55 = set2.equals((java.lang.Object)set54);
    set54.clear();
    set.Set set57 = new set.Set();
    set.Set set58 = new set.Set();
    boolean b60 = set58.remove((java.lang.Integer)0);
    java.lang.Object obj61 = null;
    boolean b62 = set58.equals(obj61);
    set.Set set63 = set57.intersect(set58);
    set.Set set64 = new set.Set();
    set.Set set65 = new set.Set();
    boolean b67 = set65.remove((java.lang.Integer)0);
    java.lang.Object obj68 = null;
    boolean b69 = set65.equals(obj68);
    set.Set set70 = set64.intersect(set65);
    boolean b71 = set57.equals((java.lang.Object)set65);
    set65.clear();
    set65.clear();
    set.Set set74 = set54.union(set65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set74);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test15"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set10.remove((java.lang.Integer)100);
    set10.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test16"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    set.Set set14 = new set.Set();
    set.Set set15 = new set.Set();
    boolean b17 = set15.remove((java.lang.Integer)0);
    java.lang.Object obj18 = null;
    boolean b19 = set15.equals(obj18);
    set.Set set20 = set14.intersect(set15);
    boolean b21 = set7.equals((java.lang.Object)set15);
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    boolean b29 = set22.isEmpty();
    boolean b31 = set22.remove((java.lang.Integer)0);
    set.Set set32 = set7.intersect(set22);
    boolean b33 = set22.isEmpty();
    set.Set set34 = new set.Set();
    set.Set set35 = new set.Set();
    boolean b37 = set35.remove((java.lang.Integer)0);
    java.lang.Object obj38 = null;
    boolean b39 = set35.equals(obj38);
    set.Set set40 = set34.intersect(set35);
    boolean b42 = set40.add((java.lang.Integer)(-1));
    boolean b44 = set40.belongs((java.lang.Integer)0);
    boolean b46 = set40.add((java.lang.Integer)0);
    boolean b47 = set22.equals((java.lang.Object)0);
    boolean b49 = set22.remove((java.lang.Integer)0);
    boolean b50 = set22.isEmpty();
    boolean b52 = set22.remove((java.lang.Integer)0);
    set.Set set53 = set6.intersect(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test17"); }

    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1, 2, (-1), 0, 0, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i7 = new java.util.ArrayList<java.lang.Integer>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i7, i_array6);
    set.Set set9 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    set.Set set10 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    set.Set set11 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    set.Set set12 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test18"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    boolean b14 = set0.remove((java.lang.Integer)0);
    boolean b16 = set0.remove((java.lang.Integer)0);
    boolean b18 = set0.belongs((java.lang.Integer)100);
    set.Set set19 = new set.Set();
    set.Set set20 = new set.Set();
    boolean b22 = set20.remove((java.lang.Integer)0);
    java.lang.Object obj23 = null;
    boolean b24 = set20.equals(obj23);
    set.Set set25 = set19.intersect(set20);
    set.Set set26 = new set.Set();
    set.Set set27 = new set.Set();
    boolean b29 = set27.remove((java.lang.Integer)0);
    java.lang.Object obj30 = null;
    boolean b31 = set27.equals(obj30);
    set.Set set32 = set26.intersect(set27);
    boolean b33 = set19.equals((java.lang.Object)set27);
    int i34 = set27.size();
    set.Set set35 = new set.Set();
    set.Set set36 = new set.Set();
    boolean b38 = set36.remove((java.lang.Integer)0);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    set.Set set41 = set35.intersect(set36);
    set.Set set42 = set27.intersect(set36);
    boolean b44 = set36.belongs((java.lang.Integer)1);
    set.Set set45 = set0.union(set36);
    set.Set set46 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set47 = set45.intersect(set46);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test19"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    boolean b7 = set0.remove((java.lang.Integer)0);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    set.Set set15 = set0.intersect(set14);
    set15.clear();
    boolean b18 = set15.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test20"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set1.clear();
    boolean b9 = set1.belongs((java.lang.Integer)100);
    boolean b10 = set1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test21"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set8 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b9 = set8.isEmpty();
    boolean b11 = set8.add((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test22"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set10.remove((java.lang.Integer)(-1));
    boolean b14 = set10.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test23"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.belongs((java.lang.Integer)10);
    set0.clear();
    int i10 = set0.size();
    set.Set set11 = new set.Set();
    set.Set set12 = new set.Set();
    boolean b14 = set12.remove((java.lang.Integer)0);
    java.lang.Object obj15 = null;
    boolean b16 = set12.equals(obj15);
    set.Set set17 = set11.intersect(set12);
    set.Set set18 = new set.Set();
    set.Set set19 = new set.Set();
    boolean b21 = set19.remove((java.lang.Integer)0);
    java.lang.Object obj22 = null;
    boolean b23 = set19.equals(obj22);
    set.Set set24 = set18.intersect(set19);
    boolean b25 = set11.equals((java.lang.Object)set19);
    set.Set set26 = set0.union(set19);
    boolean b28 = set26.add((java.lang.Integer)1);
    int i29 = set26.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test24"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set2.belongs((java.lang.Integer)1);
    int i13 = set2.size();
    boolean b15 = set2.add((java.lang.Integer)0);
    int i16 = set2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test25"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set7.clear();
    set.Set set9 = new set.Set();
    set.Set set10 = new set.Set();
    boolean b12 = set10.remove((java.lang.Integer)0);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    set.Set set15 = set9.intersect(set10);
    boolean b17 = set9.belongs((java.lang.Integer)10);
    int i18 = set9.size();
    set.Set set19 = set7.intersect(set9);
    set.Set set20 = set1.union(set7);
    set7.clear();
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    boolean b30 = set22.belongs((java.lang.Integer)10);
    set22.clear();
    set.Set set32 = new set.Set();
    set.Set set33 = new set.Set();
    boolean b35 = set33.remove((java.lang.Integer)0);
    java.lang.Object obj36 = null;
    boolean b37 = set33.equals(obj36);
    set.Set set38 = set32.intersect(set33);
    boolean b40 = set38.add((java.lang.Integer)(-1));
    set.Set set41 = set22.union(set38);
    int i42 = set41.size();
    set.Set set43 = set7.union(set41);
    boolean b44 = set41.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test26"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    int i7 = set1.size();
    java.lang.Object obj8 = null;
    boolean b9 = set1.equals(obj8);
    set.Set set10 = new set.Set();
    boolean b12 = set10.remove((java.lang.Integer)0);
    boolean b14 = set10.remove((java.lang.Integer)0);
    int i15 = set10.size();
    boolean b17 = set10.remove((java.lang.Integer)0);
    set.Set set18 = new set.Set();
    set.Set set19 = new set.Set();
    boolean b21 = set19.remove((java.lang.Integer)0);
    java.lang.Object obj22 = null;
    boolean b23 = set19.equals(obj22);
    set.Set set24 = set18.intersect(set19);
    set.Set set25 = set10.intersect(set24);
    boolean b26 = set1.equals((java.lang.Object)set10);
    set1.clear();
    int i28 = set1.size();
    java.lang.Object obj29 = null;
    boolean b30 = set1.equals(obj29);
    set.Set set31 = new set.Set();
    set.Set set32 = new set.Set();
    boolean b34 = set32.remove((java.lang.Integer)0);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    set.Set set37 = set31.intersect(set32);
    java.lang.Object obj38 = null;
    boolean b39 = set32.equals(obj38);
    boolean b41 = set32.add((java.lang.Integer)0);
    set.Set set42 = new set.Set();
    set.Set set43 = new set.Set();
    boolean b45 = set43.remove((java.lang.Integer)0);
    java.lang.Object obj46 = null;
    boolean b47 = set43.equals(obj46);
    set.Set set48 = set42.intersect(set43);
    java.lang.Object obj49 = null;
    boolean b50 = set43.equals(obj49);
    boolean b52 = set43.add((java.lang.Integer)0);
    set.Set set53 = set32.union(set43);
    boolean b54 = set1.equals((java.lang.Object)set53);
    set53.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test27"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set8.clear();
    set.Set set16 = new set.Set();
    set.Set set17 = new set.Set();
    boolean b19 = set17.remove((java.lang.Integer)0);
    java.lang.Object obj20 = null;
    boolean b21 = set17.equals(obj20);
    set.Set set22 = set16.intersect(set17);
    boolean b24 = set16.belongs((java.lang.Integer)10);
    int i25 = set16.size();
    set.Set set26 = set8.intersect(set16);
    boolean b28 = set8.remove((java.lang.Integer)1);
    boolean b29 = set8.isEmpty();
    boolean b31 = set8.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test28"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.belongs((java.lang.Integer)10);
    set0.clear();
    set.Set set10 = new set.Set();
    set.Set set11 = new set.Set();
    boolean b13 = set11.remove((java.lang.Integer)0);
    java.lang.Object obj14 = null;
    boolean b15 = set11.equals(obj14);
    set.Set set16 = set10.intersect(set11);
    boolean b18 = set16.add((java.lang.Integer)(-1));
    set.Set set19 = set0.union(set16);
    int i20 = set19.size();
    set.Set set21 = new set.Set();
    set.Set set22 = new set.Set();
    boolean b24 = set22.remove((java.lang.Integer)0);
    java.lang.Object obj25 = null;
    boolean b26 = set22.equals(obj25);
    set.Set set27 = set21.intersect(set22);
    boolean b29 = set21.belongs((java.lang.Integer)10);
    set21.clear();
    int i31 = set21.size();
    set.Set set32 = new set.Set();
    set.Set set33 = new set.Set();
    boolean b35 = set33.remove((java.lang.Integer)0);
    java.lang.Object obj36 = null;
    boolean b37 = set33.equals(obj36);
    set.Set set38 = set32.intersect(set33);
    set.Set set39 = new set.Set();
    set.Set set40 = new set.Set();
    boolean b42 = set40.remove((java.lang.Integer)0);
    java.lang.Object obj43 = null;
    boolean b44 = set40.equals(obj43);
    set.Set set45 = set39.intersect(set40);
    boolean b46 = set32.equals((java.lang.Object)set40);
    set.Set set47 = set21.union(set40);
    boolean b49 = set47.add((java.lang.Integer)1);
    set.Set set50 = new set.Set();
    set.Set set51 = new set.Set();
    boolean b53 = set51.remove((java.lang.Integer)0);
    java.lang.Object obj54 = null;
    boolean b55 = set51.equals(obj54);
    set.Set set56 = set50.intersect(set51);
    boolean b57 = set50.isEmpty();
    boolean b59 = set50.add((java.lang.Integer)0);
    boolean b60 = set50.isEmpty();
    int i61 = set50.size();
    boolean b63 = set50.belongs((java.lang.Integer)1);
    boolean b64 = set47.equals((java.lang.Object)b63);
    boolean b65 = set47.isEmpty();
    set47.clear();
    boolean b67 = set19.equals((java.lang.Object)set47);
    set.Set set68 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set69 = set47.intersect(set68);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test29"); }

    java.lang.Integer[] i_array4 = new java.lang.Integer[] { 0, 10, (-1), 10 };
    java.util.ArrayList<java.lang.Integer> arraylist_i5 = new java.util.ArrayList<java.lang.Integer>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i5, i_array4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i5);
    set.Set set8 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i5);
    set.Set set9 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i5);
    set.Set set10 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test30"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    int i7 = set1.size();
    java.lang.Object obj8 = null;
    boolean b9 = set1.equals(obj8);
    set.Set set10 = new set.Set();
    boolean b12 = set10.remove((java.lang.Integer)0);
    boolean b14 = set10.remove((java.lang.Integer)0);
    int i15 = set10.size();
    boolean b17 = set10.remove((java.lang.Integer)0);
    set.Set set18 = new set.Set();
    set.Set set19 = new set.Set();
    boolean b21 = set19.remove((java.lang.Integer)0);
    java.lang.Object obj22 = null;
    boolean b23 = set19.equals(obj22);
    set.Set set24 = set18.intersect(set19);
    set.Set set25 = set10.intersect(set24);
    boolean b26 = set1.equals((java.lang.Object)set10);
    set1.clear();
    int i28 = set1.size();
    java.lang.Object obj29 = null;
    boolean b30 = set1.equals(obj29);
    set.Set set31 = new set.Set();
    set.Set set32 = new set.Set();
    boolean b34 = set32.remove((java.lang.Integer)0);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    set.Set set37 = set31.intersect(set32);
    java.lang.Object obj38 = null;
    boolean b39 = set32.equals(obj38);
    boolean b41 = set32.add((java.lang.Integer)0);
    set.Set set42 = new set.Set();
    set.Set set43 = new set.Set();
    boolean b45 = set43.remove((java.lang.Integer)0);
    java.lang.Object obj46 = null;
    boolean b47 = set43.equals(obj46);
    set.Set set48 = set42.intersect(set43);
    java.lang.Object obj49 = null;
    boolean b50 = set43.equals(obj49);
    boolean b52 = set43.add((java.lang.Integer)0);
    set.Set set53 = set32.union(set43);
    boolean b54 = set1.equals((java.lang.Object)set53);
    boolean b56 = set1.remove((java.lang.Integer)100);
    set.Set set57 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set58 = set1.union(set57);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test31"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    boolean b14 = set0.remove((java.lang.Integer)0);
    boolean b16 = set0.remove((java.lang.Integer)0);
    set.Set set17 = new set.Set();
    set.Set set18 = new set.Set();
    boolean b20 = set18.remove((java.lang.Integer)0);
    java.lang.Object obj21 = null;
    boolean b22 = set18.equals(obj21);
    set.Set set23 = set17.intersect(set18);
    boolean b25 = set17.belongs((java.lang.Integer)10);
    set17.clear();
    int i27 = set17.size();
    boolean b28 = set0.equals((java.lang.Object)set17);
    int i29 = set17.size();
    int i30 = set17.size();
    int i31 = set17.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test32"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set7.clear();
    set.Set set9 = new set.Set();
    set.Set set10 = new set.Set();
    boolean b12 = set10.remove((java.lang.Integer)0);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    set.Set set15 = set9.intersect(set10);
    boolean b17 = set9.belongs((java.lang.Integer)10);
    int i18 = set9.size();
    set.Set set19 = set7.intersect(set9);
    set.Set set20 = set1.union(set7);
    set7.clear();
    boolean b22 = set7.isEmpty();
    set.Set set23 = new set.Set();
    set.Set set24 = new set.Set();
    boolean b26 = set24.remove((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = set24.equals(obj27);
    set.Set set29 = set23.intersect(set24);
    java.lang.Object obj30 = null;
    boolean b31 = set24.equals(obj30);
    boolean b33 = set24.add((java.lang.Integer)0);
    set.Set set34 = new set.Set();
    set.Set set35 = new set.Set();
    boolean b37 = set35.remove((java.lang.Integer)0);
    java.lang.Object obj38 = null;
    boolean b39 = set35.equals(obj38);
    set.Set set40 = set34.intersect(set35);
    set.Set set41 = new set.Set();
    set.Set set42 = new set.Set();
    boolean b44 = set42.remove((java.lang.Integer)0);
    java.lang.Object obj45 = null;
    boolean b46 = set42.equals(obj45);
    set.Set set47 = set41.intersect(set42);
    boolean b48 = set34.equals((java.lang.Object)set42);
    set.Set set49 = new set.Set();
    set.Set set50 = new set.Set();
    boolean b52 = set50.remove((java.lang.Integer)0);
    java.lang.Object obj53 = null;
    boolean b54 = set50.equals(obj53);
    set.Set set55 = set49.intersect(set50);
    boolean b56 = set49.isEmpty();
    boolean b58 = set49.remove((java.lang.Integer)0);
    set.Set set59 = set34.intersect(set49);
    boolean b60 = set49.isEmpty();
    set.Set set61 = new set.Set();
    set.Set set62 = new set.Set();
    boolean b64 = set62.remove((java.lang.Integer)0);
    java.lang.Object obj65 = null;
    boolean b66 = set62.equals(obj65);
    set.Set set67 = set61.intersect(set62);
    boolean b69 = set67.add((java.lang.Integer)(-1));
    boolean b71 = set67.belongs((java.lang.Integer)0);
    boolean b73 = set67.add((java.lang.Integer)0);
    boolean b74 = set49.equals((java.lang.Object)0);
    boolean b76 = set49.belongs((java.lang.Integer)0);
    set.Set set77 = set24.intersect(set49);
    boolean b79 = set49.add((java.lang.Integer)2);
    boolean b80 = set7.equals((java.lang.Object)b79);
    boolean b82 = set7.belongs((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test33"); }

    java.lang.Integer[] i_array1 = new java.lang.Integer[] { 2 };
    java.util.ArrayList<java.lang.Integer> arraylist_i2 = new java.util.ArrayList<java.lang.Integer>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i2, i_array1);
    set.Set set4 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i2);
    set.Set set5 = new set.Set();
    set.Set set6 = new set.Set();
    boolean b8 = set6.remove((java.lang.Integer)0);
    java.lang.Object obj9 = null;
    boolean b10 = set6.equals(obj9);
    set.Set set11 = set5.intersect(set6);
    int i12 = set11.size();
    boolean b14 = set11.add((java.lang.Integer)0);
    set11.clear();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)1);
    boolean b20 = set16.add((java.lang.Integer)0);
    set.Set set21 = new set.Set();
    set.Set set22 = new set.Set();
    boolean b24 = set22.remove((java.lang.Integer)0);
    java.lang.Object obj25 = null;
    boolean b26 = set22.equals(obj25);
    set.Set set27 = set21.intersect(set22);
    boolean b29 = set21.belongs((java.lang.Integer)10);
    set21.clear();
    int i31 = set21.size();
    set.Set set32 = new set.Set();
    set.Set set33 = new set.Set();
    boolean b35 = set33.remove((java.lang.Integer)0);
    java.lang.Object obj36 = null;
    boolean b37 = set33.equals(obj36);
    set.Set set38 = set32.intersect(set33);
    set.Set set39 = new set.Set();
    set.Set set40 = new set.Set();
    boolean b42 = set40.remove((java.lang.Integer)0);
    java.lang.Object obj43 = null;
    boolean b44 = set40.equals(obj43);
    set.Set set45 = set39.intersect(set40);
    boolean b46 = set32.equals((java.lang.Object)set40);
    set.Set set47 = set21.union(set40);
    set.Set set48 = set16.union(set47);
    set.Set set49 = set11.intersect(set16);
    boolean b51 = set49.remove((java.lang.Integer)10);
    boolean b53 = set49.belongs((java.lang.Integer)0);
    boolean b54 = set4.equals((java.lang.Object)b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
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
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test34"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set.Set set15 = new set.Set();
    set15.clear();
    set.Set set17 = new set.Set();
    set.Set set18 = new set.Set();
    boolean b20 = set18.remove((java.lang.Integer)0);
    java.lang.Object obj21 = null;
    boolean b22 = set18.equals(obj21);
    set.Set set23 = set17.intersect(set18);
    boolean b25 = set17.belongs((java.lang.Integer)10);
    int i26 = set17.size();
    set.Set set27 = set15.intersect(set17);
    boolean b29 = set15.remove((java.lang.Integer)0);
    set.Set set30 = set0.union(set15);
    set.Set set31 = new set.Set();
    set.Set set32 = new set.Set();
    boolean b34 = set32.remove((java.lang.Integer)0);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    set.Set set37 = set31.intersect(set32);
    set32.clear();
    set.Set set39 = set30.union(set32);
    set.Set set40 = new set.Set();
    set.Set set41 = new set.Set();
    boolean b43 = set41.remove((java.lang.Integer)0);
    java.lang.Object obj44 = null;
    boolean b45 = set41.equals(obj44);
    set.Set set46 = set40.intersect(set41);
    set.Set set47 = new set.Set();
    set.Set set48 = new set.Set();
    boolean b50 = set48.remove((java.lang.Integer)0);
    java.lang.Object obj51 = null;
    boolean b52 = set48.equals(obj51);
    set.Set set53 = set47.intersect(set48);
    boolean b54 = set40.equals((java.lang.Object)set48);
    set.Set set55 = new set.Set();
    set.Set set56 = new set.Set();
    boolean b58 = set56.remove((java.lang.Integer)0);
    java.lang.Object obj59 = null;
    boolean b60 = set56.equals(obj59);
    set.Set set61 = set55.intersect(set56);
    boolean b62 = set55.isEmpty();
    boolean b64 = set55.remove((java.lang.Integer)0);
    set.Set set65 = set40.intersect(set55);
    int i66 = set40.size();
    set.Set set67 = set32.union(set40);
    boolean b69 = set32.belongs((java.lang.Integer)0);
    boolean b71 = set32.add((java.lang.Integer)0);
    set32.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test35"); }

    set.Set set0 = new set.Set();
    set0.clear();
    boolean b3 = set0.remove((java.lang.Integer)(-1));
    java.lang.Object obj4 = null;
    boolean b5 = set0.equals(obj4);
    boolean b7 = set0.remove((java.lang.Integer)1);
    boolean b9 = set0.add((java.lang.Integer)0);
    boolean b11 = set0.remove((java.lang.Integer)0);
    set.Set set12 = new set.Set();
    set.Set set13 = new set.Set();
    boolean b15 = set13.remove((java.lang.Integer)0);
    java.lang.Object obj16 = null;
    boolean b17 = set13.equals(obj16);
    set.Set set18 = set12.intersect(set13);
    boolean b20 = set12.belongs((java.lang.Integer)10);
    set12.clear();
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    boolean b30 = set28.add((java.lang.Integer)(-1));
    set.Set set31 = set12.union(set28);
    set.Set set32 = new set.Set();
    set.Set set33 = new set.Set();
    boolean b35 = set33.remove((java.lang.Integer)0);
    java.lang.Object obj36 = null;
    boolean b37 = set33.equals(obj36);
    set.Set set38 = set32.intersect(set33);
    set32.clear();
    set.Set set40 = set28.intersect(set32);
    boolean b42 = set40.belongs((java.lang.Integer)(-1));
    boolean b44 = set40.add((java.lang.Integer)0);
    boolean b46 = set40.add((java.lang.Integer)1);
    set.Set set47 = set0.union(set40);
    set40.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test36"); }

    set.Set set0 = new set.Set();
    set0.clear();
    boolean b3 = set0.remove((java.lang.Integer)(-1));
    java.lang.Object obj4 = null;
    boolean b5 = set0.equals(obj4);
    set.Set set6 = new set.Set();
    set6.clear();
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    boolean b16 = set8.belongs((java.lang.Integer)10);
    int i17 = set8.size();
    set.Set set18 = set6.intersect(set8);
    set.Set set19 = set0.intersect(set18);
    boolean b20 = set19.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test37"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set2.belongs((java.lang.Integer)1);
    int i13 = set2.size();
    set.Set set14 = new set.Set();
    set.Set set15 = new set.Set();
    boolean b17 = set15.remove((java.lang.Integer)0);
    java.lang.Object obj18 = null;
    boolean b19 = set15.equals(obj18);
    set.Set set20 = set14.intersect(set15);
    set.Set set21 = new set.Set();
    set21.clear();
    set.Set set23 = new set.Set();
    set.Set set24 = new set.Set();
    boolean b26 = set24.remove((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = set24.equals(obj27);
    set.Set set29 = set23.intersect(set24);
    boolean b31 = set23.belongs((java.lang.Integer)10);
    int i32 = set23.size();
    set.Set set33 = set21.intersect(set23);
    set.Set set34 = set15.union(set21);
    boolean b36 = set34.belongs((java.lang.Integer)0);
    set.Set set37 = set2.intersect(set34);
    set34.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test38"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set7.clear();
    set.Set set9 = new set.Set();
    set.Set set10 = new set.Set();
    boolean b12 = set10.remove((java.lang.Integer)0);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    set.Set set15 = set9.intersect(set10);
    boolean b17 = set9.belongs((java.lang.Integer)10);
    int i18 = set9.size();
    set.Set set19 = set7.intersect(set9);
    set.Set set20 = set1.union(set7);
    boolean b21 = set1.isEmpty();
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    int i29 = set28.size();
    boolean b31 = set28.add((java.lang.Integer)0);
    set28.clear();
    boolean b33 = set28.isEmpty();
    java.lang.Object obj34 = null;
    boolean b35 = set28.equals(obj34);
    set.Set set36 = set1.union(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test39"); }

    set.Set set0 = new set.Set();
    set0.clear();
    boolean b3 = set0.remove((java.lang.Integer)(-1));
    boolean b5 = set0.equals((java.lang.Object)(byte)10);
    set.Set set6 = new set.Set();
    set.Set set7 = new set.Set();
    boolean b9 = set7.remove((java.lang.Integer)0);
    java.lang.Object obj10 = null;
    boolean b11 = set7.equals(obj10);
    set.Set set12 = set6.intersect(set7);
    set.Set set13 = new set.Set();
    set.Set set14 = new set.Set();
    boolean b16 = set14.remove((java.lang.Integer)0);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    set.Set set19 = set13.intersect(set14);
    boolean b20 = set6.equals((java.lang.Object)set14);
    set14.clear();
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    boolean b30 = set22.belongs((java.lang.Integer)10);
    int i31 = set22.size();
    set.Set set32 = set14.intersect(set22);
    boolean b34 = set14.belongs((java.lang.Integer)1);
    set.Set set35 = set0.union(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test40"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.add((java.lang.Integer)100);
    boolean b10 = set0.remove((java.lang.Integer)10);
    boolean b12 = set0.remove((java.lang.Integer)0);
    boolean b14 = set0.add((java.lang.Integer)0);
    boolean b15 = set0.isEmpty();
    boolean b16 = set0.isEmpty();
    set.Set set17 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set18 = set0.intersect(set17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test41"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    boolean b14 = set0.remove((java.lang.Integer)0);
    boolean b16 = set0.remove((java.lang.Integer)0);
    set.Set set17 = new set.Set();
    set.Set set18 = new set.Set();
    boolean b20 = set18.remove((java.lang.Integer)0);
    java.lang.Object obj21 = null;
    boolean b22 = set18.equals(obj21);
    set.Set set23 = set17.intersect(set18);
    boolean b25 = set17.belongs((java.lang.Integer)10);
    set17.clear();
    int i27 = set17.size();
    boolean b28 = set0.equals((java.lang.Object)set17);
    boolean b30 = set0.add((java.lang.Integer)10);
    boolean b32 = set0.add((java.lang.Integer)0);
    int i33 = set0.size();
    set.Set set34 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set35 = set0.union(set34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test42"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set.Set set15 = new set.Set();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    set.Set set21 = set15.intersect(set16);
    boolean b22 = set15.isEmpty();
    boolean b24 = set15.remove((java.lang.Integer)0);
    set.Set set25 = set0.intersect(set15);
    boolean b27 = set0.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test43"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    set.Set set6 = new set.Set();
    boolean b8 = set6.remove((java.lang.Integer)0);
    boolean b10 = set6.remove((java.lang.Integer)0);
    int i11 = set6.size();
    boolean b13 = set6.remove((java.lang.Integer)0);
    set.Set set14 = set0.intersect(set6);
    boolean b16 = set14.remove((java.lang.Integer)3);
    set.Set set17 = new set.Set();
    set.Set set18 = new set.Set();
    boolean b20 = set18.remove((java.lang.Integer)0);
    java.lang.Object obj21 = null;
    boolean b22 = set18.equals(obj21);
    set.Set set23 = set17.intersect(set18);
    boolean b25 = set23.add((java.lang.Integer)(-1));
    boolean b27 = set23.belongs((java.lang.Integer)0);
    boolean b29 = set23.add((java.lang.Integer)(-1));
    set.Set set30 = new set.Set();
    set30.clear();
    set.Set set32 = new set.Set();
    set.Set set33 = new set.Set();
    boolean b35 = set33.remove((java.lang.Integer)0);
    java.lang.Object obj36 = null;
    boolean b37 = set33.equals(obj36);
    set.Set set38 = set32.intersect(set33);
    boolean b40 = set32.belongs((java.lang.Integer)10);
    int i41 = set32.size();
    set.Set set42 = set30.intersect(set32);
    set.Set set43 = new set.Set();
    set.Set set44 = new set.Set();
    boolean b46 = set44.remove((java.lang.Integer)0);
    java.lang.Object obj47 = null;
    boolean b48 = set44.equals(obj47);
    set.Set set49 = set43.intersect(set44);
    set.Set set50 = new set.Set();
    set.Set set51 = new set.Set();
    boolean b53 = set51.remove((java.lang.Integer)0);
    java.lang.Object obj54 = null;
    boolean b55 = set51.equals(obj54);
    set.Set set56 = set50.intersect(set51);
    boolean b57 = set43.equals((java.lang.Object)set51);
    set.Set set58 = new set.Set();
    set.Set set59 = new set.Set();
    boolean b61 = set59.remove((java.lang.Integer)0);
    java.lang.Object obj62 = null;
    boolean b63 = set59.equals(obj62);
    set.Set set64 = set58.intersect(set59);
    boolean b65 = set58.isEmpty();
    boolean b67 = set58.remove((java.lang.Integer)0);
    set.Set set68 = set43.intersect(set58);
    int i69 = set43.size();
    set.Set set70 = set32.union(set43);
    boolean b71 = set43.isEmpty();
    boolean b72 = set43.isEmpty();
    set.Set set73 = set23.union(set43);
    set.Set set74 = set14.intersect(set23);
    boolean b76 = set23.remove((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test44"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    int i11 = set10.size();
    boolean b13 = set10.belongs((java.lang.Integer)3);
    set.Set set14 = new set.Set();
    boolean b16 = set14.remove((java.lang.Integer)0);
    boolean b18 = set14.remove((java.lang.Integer)0);
    int i19 = set14.size();
    boolean b21 = set14.remove((java.lang.Integer)0);
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    set.Set set29 = set14.intersect(set28);
    boolean b30 = set10.equals((java.lang.Object)set29);
    set29.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test45"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    boolean b7 = set0.remove((java.lang.Integer)0);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    set.Set set15 = set0.intersect(set14);
    set.Set set16 = new set.Set();
    set.Set set17 = new set.Set();
    boolean b19 = set17.remove((java.lang.Integer)0);
    java.lang.Object obj20 = null;
    boolean b21 = set17.equals(obj20);
    set.Set set22 = set16.intersect(set17);
    boolean b23 = set16.isEmpty();
    boolean b25 = set16.remove((java.lang.Integer)0);
    set16.clear();
    set.Set set27 = set0.union(set16);
    set.Set set28 = new set.Set();
    boolean b30 = set28.remove((java.lang.Integer)0);
    boolean b32 = set28.remove((java.lang.Integer)0);
    int i33 = set28.size();
    boolean b35 = set28.remove((java.lang.Integer)0);
    set.Set set36 = new set.Set();
    set.Set set37 = new set.Set();
    boolean b39 = set37.remove((java.lang.Integer)0);
    java.lang.Object obj40 = null;
    boolean b41 = set37.equals(obj40);
    set.Set set42 = set36.intersect(set37);
    set.Set set43 = set28.intersect(set42);
    set.Set set44 = set27.intersect(set43);
    set.Set set45 = new set.Set();
    set.Set set46 = new set.Set();
    boolean b48 = set46.remove((java.lang.Integer)0);
    java.lang.Object obj49 = null;
    boolean b50 = set46.equals(obj49);
    set.Set set51 = set45.intersect(set46);
    boolean b52 = set43.equals((java.lang.Object)set46);
    boolean b54 = set46.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test46"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    int i7 = set6.size();
    boolean b9 = set6.add((java.lang.Integer)0);
    set6.clear();
    set.Set set11 = new set.Set();
    boolean b13 = set11.remove((java.lang.Integer)1);
    boolean b15 = set11.add((java.lang.Integer)0);
    set.Set set16 = new set.Set();
    set.Set set17 = new set.Set();
    boolean b19 = set17.remove((java.lang.Integer)0);
    java.lang.Object obj20 = null;
    boolean b21 = set17.equals(obj20);
    set.Set set22 = set16.intersect(set17);
    boolean b24 = set16.belongs((java.lang.Integer)10);
    set16.clear();
    int i26 = set16.size();
    set.Set set27 = new set.Set();
    set.Set set28 = new set.Set();
    boolean b30 = set28.remove((java.lang.Integer)0);
    java.lang.Object obj31 = null;
    boolean b32 = set28.equals(obj31);
    set.Set set33 = set27.intersect(set28);
    set.Set set34 = new set.Set();
    set.Set set35 = new set.Set();
    boolean b37 = set35.remove((java.lang.Integer)0);
    java.lang.Object obj38 = null;
    boolean b39 = set35.equals(obj38);
    set.Set set40 = set34.intersect(set35);
    boolean b41 = set27.equals((java.lang.Object)set35);
    set.Set set42 = set16.union(set35);
    set.Set set43 = set11.union(set42);
    set.Set set44 = set6.intersect(set11);
    set.Set set45 = new set.Set();
    set.Set set46 = new set.Set();
    boolean b48 = set46.remove((java.lang.Integer)0);
    java.lang.Object obj49 = null;
    boolean b50 = set46.equals(obj49);
    set.Set set51 = set45.intersect(set46);
    boolean b53 = set45.belongs((java.lang.Integer)10);
    set45.clear();
    set.Set set55 = new set.Set();
    set.Set set56 = new set.Set();
    boolean b58 = set56.remove((java.lang.Integer)0);
    java.lang.Object obj59 = null;
    boolean b60 = set56.equals(obj59);
    set.Set set61 = set55.intersect(set56);
    boolean b63 = set61.add((java.lang.Integer)(-1));
    set.Set set64 = set45.union(set61);
    int i65 = set61.size();
    boolean b66 = set61.isEmpty();
    set.Set set67 = set6.intersect(set61);
    set.Set set68 = new set.Set();
    set.Set set69 = new set.Set();
    boolean b71 = set69.remove((java.lang.Integer)0);
    java.lang.Object obj72 = null;
    boolean b73 = set69.equals(obj72);
    set.Set set74 = set68.intersect(set69);
    set.Set set75 = new set.Set();
    set.Set set76 = new set.Set();
    boolean b78 = set76.remove((java.lang.Integer)0);
    java.lang.Object obj79 = null;
    boolean b80 = set76.equals(obj79);
    set.Set set81 = set75.intersect(set76);
    boolean b82 = set68.equals((java.lang.Object)set76);
    set.Set set83 = new set.Set();
    set83.clear();
    set.Set set85 = new set.Set();
    set.Set set86 = new set.Set();
    boolean b88 = set86.remove((java.lang.Integer)0);
    java.lang.Object obj89 = null;
    boolean b90 = set86.equals(obj89);
    set.Set set91 = set85.intersect(set86);
    boolean b93 = set85.belongs((java.lang.Integer)10);
    int i94 = set85.size();
    set.Set set95 = set83.intersect(set85);
    boolean b97 = set83.remove((java.lang.Integer)0);
    set.Set set98 = set68.union(set83);
    set.Set set99 = set67.intersect(set68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set99);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test47"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b9 = set7.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array13 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i14 = new java.util.ArrayList<java.lang.Integer>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i14, i_array13);
    set.Set set16 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i14);
    set.Set set17 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i14);
    set.Set set18 = new set.Set();
    set.Set set19 = new set.Set();
    boolean b21 = set19.remove((java.lang.Integer)0);
    java.lang.Object obj22 = null;
    boolean b23 = set19.equals(obj22);
    set.Set set24 = set18.intersect(set19);
    boolean b25 = set18.isEmpty();
    java.lang.Object obj26 = null;
    boolean b27 = set18.equals(obj26);
    set.Set set28 = set17.union(set18);
    boolean b30 = set17.add((java.lang.Integer)0);
    boolean b32 = set17.add((java.lang.Integer)0);
    set.Set set33 = new set.Set();
    set33.clear();
    set.Set set35 = new set.Set();
    set.Set set36 = new set.Set();
    boolean b38 = set36.remove((java.lang.Integer)0);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    set.Set set41 = set35.intersect(set36);
    boolean b43 = set35.belongs((java.lang.Integer)10);
    int i44 = set35.size();
    set.Set set45 = set33.intersect(set35);
    boolean b47 = set33.remove((java.lang.Integer)0);
    boolean b49 = set33.remove((java.lang.Integer)0);
    set.Set set50 = new set.Set();
    set.Set set51 = new set.Set();
    boolean b53 = set51.remove((java.lang.Integer)0);
    java.lang.Object obj54 = null;
    boolean b55 = set51.equals(obj54);
    set.Set set56 = set50.intersect(set51);
    boolean b58 = set50.belongs((java.lang.Integer)10);
    set50.clear();
    int i60 = set50.size();
    boolean b61 = set33.equals((java.lang.Object)set50);
    set.Set set62 = set17.union(set33);
    boolean b64 = set17.belongs((java.lang.Integer)0);
    set.Set set65 = set7.union(set17);
    boolean b66 = set17.isEmpty();
    boolean b68 = set17.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test48"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    boolean b6 = set0.remove((java.lang.Integer)0);
    int i7 = set0.size();
    int i8 = set0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test49"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    boolean b14 = set0.remove((java.lang.Integer)0);
    boolean b16 = set0.add((java.lang.Integer)100);
    boolean b18 = set0.add((java.lang.Integer)(-1));
    set.Set set19 = new set.Set();
    set.Set set20 = new set.Set();
    boolean b22 = set20.remove((java.lang.Integer)0);
    java.lang.Object obj23 = null;
    boolean b24 = set20.equals(obj23);
    set.Set set25 = set19.intersect(set20);
    int i26 = set25.size();
    boolean b28 = set25.add((java.lang.Integer)0);
    set25.clear();
    set.Set set30 = new set.Set();
    boolean b32 = set30.remove((java.lang.Integer)1);
    boolean b34 = set30.add((java.lang.Integer)0);
    set.Set set35 = new set.Set();
    set.Set set36 = new set.Set();
    boolean b38 = set36.remove((java.lang.Integer)0);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    set.Set set41 = set35.intersect(set36);
    boolean b43 = set35.belongs((java.lang.Integer)10);
    set35.clear();
    int i45 = set35.size();
    set.Set set46 = new set.Set();
    set.Set set47 = new set.Set();
    boolean b49 = set47.remove((java.lang.Integer)0);
    java.lang.Object obj50 = null;
    boolean b51 = set47.equals(obj50);
    set.Set set52 = set46.intersect(set47);
    set.Set set53 = new set.Set();
    set.Set set54 = new set.Set();
    boolean b56 = set54.remove((java.lang.Integer)0);
    java.lang.Object obj57 = null;
    boolean b58 = set54.equals(obj57);
    set.Set set59 = set53.intersect(set54);
    boolean b60 = set46.equals((java.lang.Object)set54);
    set.Set set61 = set35.union(set54);
    set.Set set62 = set30.union(set61);
    set.Set set63 = set25.intersect(set30);
    boolean b64 = set0.equals((java.lang.Object)set25);
    boolean b66 = set0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test50"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set2.belongs((java.lang.Integer)1);
    int i13 = set2.size();
    set.Set set14 = new set.Set();
    set.Set set15 = new set.Set();
    boolean b17 = set15.remove((java.lang.Integer)0);
    java.lang.Object obj18 = null;
    boolean b19 = set15.equals(obj18);
    set.Set set20 = set14.intersect(set15);
    boolean b22 = set14.add((java.lang.Integer)100);
    boolean b24 = set14.remove((java.lang.Integer)10);
    java.lang.Object obj25 = null;
    boolean b26 = set14.equals(obj25);
    boolean b28 = set14.belongs((java.lang.Integer)1);
    java.lang.Integer[] i_array32 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i33 = new java.util.ArrayList<java.lang.Integer>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i33, i_array32);
    set.Set set35 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i33);
    set.Set set36 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i33);
    set.Set set37 = new set.Set();
    set.Set set38 = new set.Set();
    boolean b40 = set38.remove((java.lang.Integer)0);
    java.lang.Object obj41 = null;
    boolean b42 = set38.equals(obj41);
    set.Set set43 = set37.intersect(set38);
    boolean b44 = set37.isEmpty();
    java.lang.Object obj45 = null;
    boolean b46 = set37.equals(obj45);
    set.Set set47 = set36.union(set37);
    boolean b49 = set36.add((java.lang.Integer)0);
    boolean b51 = set36.add((java.lang.Integer)0);
    boolean b53 = set36.add((java.lang.Integer)0);
    set.Set set54 = set14.intersect(set36);
    boolean b55 = set2.equals((java.lang.Object)set54);
    boolean b57 = set54.remove((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test51"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.add((java.lang.Integer)100);
    boolean b10 = set0.remove((java.lang.Integer)10);
    boolean b12 = set0.remove((java.lang.Integer)0);
    boolean b14 = set0.add((java.lang.Integer)0);
    java.lang.Integer[] i_array18 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i19 = new java.util.ArrayList<java.lang.Integer>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i19, i_array18);
    set.Set set21 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i19);
    set.Set set22 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i19);
    boolean b24 = set22.remove((java.lang.Integer)0);
    boolean b25 = set22.isEmpty();
    set.Set set26 = set0.intersect(set22);
    set.Set set27 = new set.Set();
    boolean b29 = set27.remove((java.lang.Integer)0);
    boolean b31 = set27.remove((java.lang.Integer)0);
    int i32 = set27.size();
    set.Set set33 = new set.Set();
    boolean b35 = set33.remove((java.lang.Integer)0);
    boolean b37 = set33.remove((java.lang.Integer)0);
    int i38 = set33.size();
    boolean b40 = set33.remove((java.lang.Integer)0);
    set.Set set41 = set27.intersect(set33);
    set.Set set42 = set26.intersect(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test52"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    int i5 = set0.size();
    set.Set set6 = new set.Set();
    set6.clear();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    boolean b12 = set8.remove((java.lang.Integer)0);
    int i13 = set8.size();
    boolean b15 = set8.remove((java.lang.Integer)0);
    set.Set set16 = set6.union(set8);
    boolean b18 = set16.add((java.lang.Integer)0);
    boolean b20 = set16.belongs((java.lang.Integer)100);
    boolean b22 = set16.remove((java.lang.Integer)10);
    set.Set set23 = set0.union(set16);
    boolean b24 = set16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test53"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b7 = set0.isEmpty();
    java.lang.Object obj8 = null;
    boolean b9 = set0.equals(obj8);
    set.Set set10 = new set.Set();
    set10.clear();
    set.Set set12 = new set.Set();
    set.Set set13 = new set.Set();
    boolean b15 = set13.remove((java.lang.Integer)0);
    java.lang.Object obj16 = null;
    boolean b17 = set13.equals(obj16);
    set.Set set18 = set12.intersect(set13);
    boolean b20 = set12.belongs((java.lang.Integer)10);
    int i21 = set12.size();
    set.Set set22 = set10.intersect(set12);
    boolean b24 = set10.remove((java.lang.Integer)0);
    boolean b25 = set10.isEmpty();
    java.lang.Integer[] i_array29 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i30 = new java.util.ArrayList<java.lang.Integer>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i30, i_array29);
    set.Set set32 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i30);
    set.Set set33 = set10.union(set32);
    set.Set set34 = set0.intersect(set10);
    boolean b35 = set10.isEmpty();
    boolean b37 = set10.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test54"); }

    set.Set set0 = new set.Set();
    set0.clear();
    boolean b3 = set0.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test55"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b11 = set10.isEmpty();
    set.Set set12 = new set.Set();
    set.Set set13 = new set.Set();
    boolean b15 = set13.remove((java.lang.Integer)0);
    java.lang.Object obj16 = null;
    boolean b17 = set13.equals(obj16);
    set.Set set18 = set12.intersect(set13);
    boolean b20 = set12.belongs((java.lang.Integer)10);
    set12.clear();
    set.Set set22 = new set.Set();
    set.Set set23 = new set.Set();
    boolean b25 = set23.remove((java.lang.Integer)0);
    java.lang.Object obj26 = null;
    boolean b27 = set23.equals(obj26);
    set.Set set28 = set22.intersect(set23);
    boolean b30 = set28.add((java.lang.Integer)(-1));
    set.Set set31 = set12.union(set28);
    set.Set set32 = set10.intersect(set28);
    boolean b34 = set10.belongs((java.lang.Integer)0);
    boolean b35 = set10.isEmpty();
    java.lang.Integer[] i_array39 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i40 = new java.util.ArrayList<java.lang.Integer>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i40, i_array39);
    set.Set set42 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i40);
    set.Set set43 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i40);
    set.Set set44 = new set.Set();
    set.Set set45 = new set.Set();
    boolean b47 = set45.remove((java.lang.Integer)0);
    java.lang.Object obj48 = null;
    boolean b49 = set45.equals(obj48);
    set.Set set50 = set44.intersect(set45);
    boolean b51 = set44.isEmpty();
    java.lang.Object obj52 = null;
    boolean b53 = set44.equals(obj52);
    set.Set set54 = set43.union(set44);
    boolean b56 = set43.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array60 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i61 = new java.util.ArrayList<java.lang.Integer>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i61, i_array60);
    set.Set set63 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i61);
    set.Set set64 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i61);
    set.Set set65 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i61);
    boolean b66 = set43.equals((java.lang.Object)set65);
    int i67 = set43.size();
    set.Set set68 = set10.union(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set68);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test56"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.belongs((java.lang.Integer)10);
    int i9 = set0.size();
    set.Set set10 = new set.Set();
    boolean b12 = set10.remove((java.lang.Integer)0);
    boolean b14 = set10.remove((java.lang.Integer)0);
    int i15 = set10.size();
    boolean b17 = set10.remove((java.lang.Integer)0);
    set.Set set18 = new set.Set();
    set.Set set19 = new set.Set();
    boolean b21 = set19.remove((java.lang.Integer)0);
    java.lang.Object obj22 = null;
    boolean b23 = set19.equals(obj22);
    set.Set set24 = set18.intersect(set19);
    set.Set set25 = set10.intersect(set24);
    set.Set set26 = new set.Set();
    set.Set set27 = new set.Set();
    boolean b29 = set27.remove((java.lang.Integer)0);
    java.lang.Object obj30 = null;
    boolean b31 = set27.equals(obj30);
    set.Set set32 = set26.intersect(set27);
    boolean b33 = set26.isEmpty();
    boolean b35 = set26.remove((java.lang.Integer)0);
    set26.clear();
    set.Set set37 = set10.union(set26);
    set.Set set38 = new set.Set();
    boolean b40 = set38.remove((java.lang.Integer)0);
    boolean b42 = set38.remove((java.lang.Integer)0);
    int i43 = set38.size();
    boolean b45 = set38.remove((java.lang.Integer)0);
    set.Set set46 = new set.Set();
    set.Set set47 = new set.Set();
    boolean b49 = set47.remove((java.lang.Integer)0);
    java.lang.Object obj50 = null;
    boolean b51 = set47.equals(obj50);
    set.Set set52 = set46.intersect(set47);
    set.Set set53 = set38.intersect(set52);
    set.Set set54 = set37.intersect(set53);
    set.Set set55 = set0.intersect(set54);
    set0.clear();
    boolean b58 = set0.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test57"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set7.clear();
    set.Set set9 = new set.Set();
    set.Set set10 = new set.Set();
    boolean b12 = set10.remove((java.lang.Integer)0);
    java.lang.Object obj13 = null;
    boolean b14 = set10.equals(obj13);
    set.Set set15 = set9.intersect(set10);
    boolean b17 = set9.belongs((java.lang.Integer)10);
    int i18 = set9.size();
    set.Set set19 = set7.intersect(set9);
    boolean b21 = set7.remove((java.lang.Integer)0);
    boolean b23 = set7.remove((java.lang.Integer)0);
    boolean b24 = set6.equals((java.lang.Object)set7);
    boolean b26 = set7.add((java.lang.Integer)1);
    set7.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test58"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set.Set set15 = new set.Set();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    set.Set set21 = set15.intersect(set16);
    boolean b22 = set15.isEmpty();
    boolean b24 = set15.remove((java.lang.Integer)0);
    set.Set set25 = set0.intersect(set15);
    set0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test59"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    java.lang.Object obj3 = null;
    boolean b4 = set0.equals(obj3);
    boolean b6 = set0.remove((java.lang.Integer)2);
    boolean b7 = set0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test60"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    boolean b7 = set0.remove((java.lang.Integer)0);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    set.Set set15 = set0.intersect(set14);
    boolean b17 = set0.add((java.lang.Integer)(-1));
    set.Set set18 = new set.Set();
    set.Set set19 = new set.Set();
    boolean b21 = set19.remove((java.lang.Integer)0);
    java.lang.Object obj22 = null;
    boolean b23 = set19.equals(obj22);
    set.Set set24 = set18.intersect(set19);
    boolean b25 = set18.isEmpty();
    boolean b27 = set18.add((java.lang.Integer)0);
    boolean b28 = set18.isEmpty();
    int i29 = set18.size();
    boolean b31 = set18.belongs((java.lang.Integer)1);
    boolean b32 = set0.equals((java.lang.Object)set18);
    boolean b34 = set0.remove((java.lang.Integer)0);
    set.Set set35 = new set.Set();
    boolean b37 = set35.remove((java.lang.Integer)0);
    boolean b39 = set35.remove((java.lang.Integer)0);
    int i40 = set35.size();
    boolean b42 = set35.remove((java.lang.Integer)0);
    boolean b44 = set35.belongs((java.lang.Integer)100);
    set.Set set45 = new set.Set();
    set45.clear();
    set.Set set47 = new set.Set();
    set.Set set48 = new set.Set();
    boolean b50 = set48.remove((java.lang.Integer)0);
    java.lang.Object obj51 = null;
    boolean b52 = set48.equals(obj51);
    set.Set set53 = set47.intersect(set48);
    boolean b55 = set47.belongs((java.lang.Integer)10);
    int i56 = set47.size();
    set.Set set57 = set45.intersect(set47);
    boolean b58 = set47.isEmpty();
    set.Set set59 = set35.union(set47);
    set.Set set60 = new set.Set();
    set60.clear();
    set.Set set62 = new set.Set();
    boolean b64 = set62.remove((java.lang.Integer)0);
    boolean b66 = set62.remove((java.lang.Integer)0);
    int i67 = set62.size();
    boolean b69 = set62.remove((java.lang.Integer)0);
    set.Set set70 = set60.union(set62);
    boolean b72 = set62.belongs((java.lang.Integer)1);
    int i73 = set62.size();
    set62.clear();
    boolean b76 = set62.belongs((java.lang.Integer)100);
    boolean b78 = set62.add((java.lang.Integer)0);
    set.Set set79 = set59.union(set62);
    boolean b81 = set79.add((java.lang.Integer)100);
    boolean b82 = set0.equals((java.lang.Object)100);
    set.Set set83 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set84 = set0.union(set83);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test61"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set.Set set15 = new set.Set();
    set15.clear();
    set.Set set17 = new set.Set();
    set.Set set18 = new set.Set();
    boolean b20 = set18.remove((java.lang.Integer)0);
    java.lang.Object obj21 = null;
    boolean b22 = set18.equals(obj21);
    set.Set set23 = set17.intersect(set18);
    boolean b25 = set17.belongs((java.lang.Integer)10);
    int i26 = set17.size();
    set.Set set27 = set15.intersect(set17);
    boolean b29 = set15.remove((java.lang.Integer)0);
    set.Set set30 = set0.union(set15);
    boolean b32 = set0.remove((java.lang.Integer)2);
    boolean b33 = set0.isEmpty();
    boolean b34 = set0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test62"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    boolean b14 = set0.remove((java.lang.Integer)0);
    boolean b16 = set0.add((java.lang.Integer)100);
    boolean b17 = set0.isEmpty();
    boolean b18 = set0.isEmpty();
    boolean b20 = set0.add((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test63"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b7 = set0.isEmpty();
    java.lang.Object obj8 = null;
    boolean b9 = set0.equals(obj8);
    set.Set set10 = new set.Set();
    set10.clear();
    boolean b13 = set10.remove((java.lang.Integer)(-1));
    set.Set set14 = set0.intersect(set10);
    int i15 = set10.size();
    int i16 = set10.size();
    set.Set set17 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set18 = set10.union(set17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test64"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    int i7 = set6.size();
    boolean b9 = set6.belongs((java.lang.Integer)(-1));
    set6.clear();
    java.lang.Integer[] i_array14 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i15 = new java.util.ArrayList<java.lang.Integer>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i15, i_array14);
    set.Set set17 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i15);
    set.Set set18 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i15);
    set.Set set19 = new set.Set();
    set.Set set20 = new set.Set();
    boolean b22 = set20.remove((java.lang.Integer)0);
    java.lang.Object obj23 = null;
    boolean b24 = set20.equals(obj23);
    set.Set set25 = set19.intersect(set20);
    boolean b26 = set19.isEmpty();
    java.lang.Object obj27 = null;
    boolean b28 = set19.equals(obj27);
    set.Set set29 = set18.union(set19);
    set.Set set30 = set6.intersect(set18);
    set.Set set31 = new set.Set();
    boolean b33 = set31.remove((java.lang.Integer)1);
    int i34 = set31.size();
    set.Set set35 = new set.Set();
    set.Set set36 = new set.Set();
    boolean b38 = set36.remove((java.lang.Integer)0);
    java.lang.Object obj39 = null;
    boolean b40 = set36.equals(obj39);
    set.Set set41 = set35.intersect(set36);
    java.lang.Object obj42 = null;
    boolean b43 = set36.equals(obj42);
    boolean b45 = set36.add((java.lang.Integer)0);
    set.Set set46 = new set.Set();
    set.Set set47 = new set.Set();
    boolean b49 = set47.remove((java.lang.Integer)0);
    java.lang.Object obj50 = null;
    boolean b51 = set47.equals(obj50);
    set.Set set52 = set46.intersect(set47);
    java.lang.Object obj53 = null;
    boolean b54 = set47.equals(obj53);
    boolean b56 = set47.add((java.lang.Integer)0);
    set.Set set57 = set36.union(set47);
    set.Set set58 = set31.intersect(set36);
    boolean b59 = set6.equals((java.lang.Object)set36);
    int i60 = set6.size();
    java.lang.Object obj61 = null;
    boolean b62 = set6.equals(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test65"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)1);
    int i3 = set0.size();
    set.Set set4 = new set.Set();
    set.Set set5 = new set.Set();
    boolean b7 = set5.remove((java.lang.Integer)0);
    java.lang.Object obj8 = null;
    boolean b9 = set5.equals(obj8);
    set.Set set10 = set4.intersect(set5);
    java.lang.Object obj11 = null;
    boolean b12 = set5.equals(obj11);
    boolean b14 = set5.add((java.lang.Integer)0);
    set.Set set15 = new set.Set();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    set.Set set21 = set15.intersect(set16);
    java.lang.Object obj22 = null;
    boolean b23 = set16.equals(obj22);
    boolean b25 = set16.add((java.lang.Integer)0);
    set.Set set26 = set5.union(set16);
    set.Set set27 = set0.intersect(set5);
    boolean b29 = set5.belongs((java.lang.Integer)0);
    boolean b31 = set5.add((java.lang.Integer)0);
    set.Set set32 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set33 = set5.union(set32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test66"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set1.belongs((java.lang.Integer)0);
    java.lang.Object obj9 = null;
    boolean b10 = set1.equals(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test67"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set6.add((java.lang.Integer)(-1));
    boolean b10 = set6.belongs((java.lang.Integer)0);
    boolean b12 = set6.add((java.lang.Integer)(-1));
    set6.clear();
    java.lang.Object obj14 = null;
    boolean b15 = set6.equals(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test68"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set2.belongs((java.lang.Integer)1);
    int i13 = set2.size();
    set.Set set14 = new set.Set();
    set.Set set15 = new set.Set();
    boolean b17 = set15.remove((java.lang.Integer)0);
    java.lang.Object obj18 = null;
    boolean b19 = set15.equals(obj18);
    set.Set set20 = set14.intersect(set15);
    set.Set set21 = new set.Set();
    set21.clear();
    set.Set set23 = new set.Set();
    set.Set set24 = new set.Set();
    boolean b26 = set24.remove((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = set24.equals(obj27);
    set.Set set29 = set23.intersect(set24);
    boolean b31 = set23.belongs((java.lang.Integer)10);
    int i32 = set23.size();
    set.Set set33 = set21.intersect(set23);
    set.Set set34 = set15.union(set21);
    boolean b36 = set34.belongs((java.lang.Integer)0);
    set.Set set37 = set2.intersect(set34);
    boolean b39 = set37.equals((java.lang.Object)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test69"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    boolean b5 = set1.remove((java.lang.Integer)0);
    int i6 = set1.size();
    set.Set set7 = set0.intersect(set1);
    java.lang.Object obj8 = null;
    boolean b9 = set1.equals(obj8);
    boolean b11 = set1.belongs((java.lang.Integer)0);
    set1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test70"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set2.belongs((java.lang.Integer)1);
    int i13 = set2.size();
    set2.clear();
    boolean b15 = set2.isEmpty();
    java.lang.Object obj16 = null;
    boolean b17 = set2.equals(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test71"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.belongs((java.lang.Integer)10);
    set0.clear();
    set.Set set10 = new set.Set();
    set.Set set11 = new set.Set();
    boolean b13 = set11.remove((java.lang.Integer)0);
    java.lang.Object obj14 = null;
    boolean b15 = set11.equals(obj14);
    set.Set set16 = set10.intersect(set11);
    boolean b18 = set16.add((java.lang.Integer)(-1));
    set.Set set19 = set0.union(set16);
    set.Set set20 = new set.Set();
    set.Set set21 = new set.Set();
    boolean b23 = set21.remove((java.lang.Integer)0);
    java.lang.Object obj24 = null;
    boolean b25 = set21.equals(obj24);
    set.Set set26 = set20.intersect(set21);
    set20.clear();
    set.Set set28 = set16.intersect(set20);
    boolean b30 = set20.remove((java.lang.Integer)100);
    boolean b32 = set20.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test72"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    boolean b4 = set2.remove((java.lang.Integer)0);
    boolean b6 = set2.remove((java.lang.Integer)0);
    int i7 = set2.size();
    boolean b9 = set2.remove((java.lang.Integer)0);
    set.Set set10 = set0.union(set2);
    boolean b12 = set2.belongs((java.lang.Integer)1);
    int i13 = set2.size();
    int i14 = set2.size();
    boolean b16 = set2.belongs((java.lang.Integer)1);
    set.Set set17 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set18 = set2.union(set17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test73"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    boolean b15 = set8.isEmpty();
    java.lang.Object obj16 = null;
    boolean b17 = set8.equals(obj16);
    set.Set set18 = set7.union(set8);
    java.lang.Object obj19 = null;
    boolean b20 = set18.equals(obj19);
    set.Set set21 = new set.Set();
    set21.clear();
    set.Set set23 = new set.Set();
    set.Set set24 = new set.Set();
    boolean b26 = set24.remove((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = set24.equals(obj27);
    set.Set set29 = set23.intersect(set24);
    boolean b31 = set23.belongs((java.lang.Integer)10);
    int i32 = set23.size();
    set.Set set33 = set21.intersect(set23);
    boolean b35 = set21.remove((java.lang.Integer)0);
    boolean b37 = set21.remove((java.lang.Integer)0);
    boolean b38 = set18.equals((java.lang.Object)0);
    set18.clear();
    set.Set set40 = new set.Set();
    boolean b42 = set40.remove((java.lang.Integer)0);
    boolean b44 = set40.remove((java.lang.Integer)0);
    int i45 = set40.size();
    boolean b47 = set40.remove((java.lang.Integer)0);
    set.Set set48 = set18.union(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test74"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)0);
    boolean b4 = set0.remove((java.lang.Integer)0);
    int i5 = set0.size();
    boolean b7 = set0.remove((java.lang.Integer)0);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    set.Set set15 = set0.intersect(set14);
    set.Set set16 = new set.Set();
    set.Set set17 = new set.Set();
    boolean b19 = set17.remove((java.lang.Integer)0);
    java.lang.Object obj20 = null;
    boolean b21 = set17.equals(obj20);
    set.Set set22 = set16.intersect(set17);
    boolean b23 = set16.isEmpty();
    boolean b25 = set16.remove((java.lang.Integer)0);
    set16.clear();
    set.Set set27 = set0.union(set16);
    set.Set set28 = new set.Set();
    boolean b30 = set28.remove((java.lang.Integer)0);
    boolean b32 = set28.remove((java.lang.Integer)0);
    int i33 = set28.size();
    boolean b35 = set28.remove((java.lang.Integer)0);
    set.Set set36 = new set.Set();
    set.Set set37 = new set.Set();
    boolean b39 = set37.remove((java.lang.Integer)0);
    java.lang.Object obj40 = null;
    boolean b41 = set37.equals(obj40);
    set.Set set42 = set36.intersect(set37);
    set.Set set43 = set28.intersect(set42);
    set.Set set44 = set27.intersect(set43);
    set.Set set45 = new set.Set();
    set.Set set46 = new set.Set();
    boolean b48 = set46.remove((java.lang.Integer)0);
    java.lang.Object obj49 = null;
    boolean b50 = set46.equals(obj49);
    set.Set set51 = set45.intersect(set46);
    boolean b52 = set43.equals((java.lang.Object)set46);
    boolean b53 = set43.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test75"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10, 10, 0 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set8 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    int i9 = set8.size();
    set8.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test76"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    boolean b5 = set1.remove((java.lang.Integer)0);
    int i6 = set1.size();
    set.Set set7 = set0.intersect(set1);
    boolean b9 = set0.remove((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test77"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    set.Set set13 = new set.Set();
    set.Set set14 = new set.Set();
    boolean b16 = set14.remove((java.lang.Integer)0);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    set.Set set19 = set13.intersect(set14);
    set.Set set20 = new set.Set();
    set.Set set21 = new set.Set();
    boolean b23 = set21.remove((java.lang.Integer)0);
    java.lang.Object obj24 = null;
    boolean b25 = set21.equals(obj24);
    set.Set set26 = set20.intersect(set21);
    boolean b27 = set13.equals((java.lang.Object)set21);
    set.Set set28 = new set.Set();
    set.Set set29 = new set.Set();
    boolean b31 = set29.remove((java.lang.Integer)0);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    set.Set set34 = set28.intersect(set29);
    boolean b35 = set28.isEmpty();
    boolean b37 = set28.remove((java.lang.Integer)0);
    set.Set set38 = set13.intersect(set28);
    int i39 = set13.size();
    set.Set set40 = set2.union(set13);
    int i41 = set2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test78"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b7 = set0.isEmpty();
    boolean b9 = set0.add((java.lang.Integer)0);
    boolean b10 = set0.isEmpty();
    int i11 = set0.size();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i16 = new java.util.ArrayList<java.lang.Integer>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i16, i_array15);
    set.Set set18 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i16);
    set.Set set19 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i16);
    boolean b21 = set19.add((java.lang.Integer)100);
    set.Set set22 = set0.intersect(set19);
    set0.clear();
    boolean b25 = set0.add((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test79"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set.Set set15 = new set.Set();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    set.Set set21 = set15.intersect(set16);
    boolean b22 = set15.isEmpty();
    boolean b24 = set15.remove((java.lang.Integer)0);
    set.Set set25 = set0.intersect(set15);
    boolean b26 = set15.isEmpty();
    set15.clear();
    boolean b29 = set15.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test80"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set8 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    boolean b9 = set8.isEmpty();
    set.Set set10 = new set.Set();
    set.Set set11 = new set.Set();
    boolean b13 = set11.remove((java.lang.Integer)0);
    java.lang.Object obj14 = null;
    boolean b15 = set11.equals(obj14);
    set.Set set16 = set10.intersect(set11);
    int i17 = set11.size();
    set.Set set18 = set8.union(set11);
    boolean b20 = set8.equals((java.lang.Object)10L);
    boolean b22 = set8.remove((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test81"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set.Set set15 = new set.Set();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    set.Set set21 = set15.intersect(set16);
    boolean b22 = set15.isEmpty();
    boolean b24 = set15.remove((java.lang.Integer)0);
    set.Set set25 = set0.intersect(set15);
    boolean b26 = set15.isEmpty();
    java.lang.Object obj27 = null;
    boolean b28 = set15.equals(obj27);
    boolean b30 = set15.add((java.lang.Integer)3);
    set.Set set31 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set32 = set15.union(set31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test82"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.add((java.lang.Integer)100);
    boolean b10 = set0.remove((java.lang.Integer)10);
    java.lang.Object obj11 = null;
    boolean b12 = set0.equals(obj11);
    boolean b14 = set0.belongs((java.lang.Integer)1);
    set.Set set15 = new set.Set();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    set.Set set21 = set15.intersect(set16);
    boolean b22 = set15.isEmpty();
    boolean b24 = set15.remove((java.lang.Integer)0);
    set15.clear();
    set.Set set26 = new set.Set();
    set.Set set27 = new set.Set();
    boolean b29 = set27.remove((java.lang.Integer)0);
    java.lang.Object obj30 = null;
    boolean b31 = set27.equals(obj30);
    set.Set set32 = set26.intersect(set27);
    int i33 = set32.size();
    boolean b35 = set32.add((java.lang.Integer)0);
    set32.clear();
    boolean b37 = set32.isEmpty();
    java.lang.Object obj38 = null;
    boolean b39 = set32.equals(obj38);
    set.Set set40 = set15.union(set32);
    set.Set set41 = set0.union(set15);
    java.lang.Object obj42 = null;
    boolean b43 = set15.equals(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test83"); }

    set.Set set0 = new set.Set();
    set0.clear();
    set.Set set2 = new set.Set();
    set.Set set3 = new set.Set();
    boolean b5 = set3.remove((java.lang.Integer)0);
    java.lang.Object obj6 = null;
    boolean b7 = set3.equals(obj6);
    set.Set set8 = set2.intersect(set3);
    boolean b10 = set2.belongs((java.lang.Integer)10);
    int i11 = set2.size();
    set.Set set12 = set0.intersect(set2);
    set.Set set13 = new set.Set();
    set.Set set14 = new set.Set();
    boolean b16 = set14.remove((java.lang.Integer)0);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    set.Set set19 = set13.intersect(set14);
    set.Set set20 = new set.Set();
    set.Set set21 = new set.Set();
    boolean b23 = set21.remove((java.lang.Integer)0);
    java.lang.Object obj24 = null;
    boolean b25 = set21.equals(obj24);
    set.Set set26 = set20.intersect(set21);
    boolean b27 = set13.equals((java.lang.Object)set21);
    set.Set set28 = new set.Set();
    set.Set set29 = new set.Set();
    boolean b31 = set29.remove((java.lang.Integer)0);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    set.Set set34 = set28.intersect(set29);
    boolean b35 = set28.isEmpty();
    boolean b37 = set28.remove((java.lang.Integer)0);
    set.Set set38 = set13.intersect(set28);
    int i39 = set13.size();
    set.Set set40 = set2.union(set13);
    set.Set set41 = new set.Set();
    set.Set set42 = new set.Set();
    boolean b44 = set42.remove((java.lang.Integer)0);
    java.lang.Object obj45 = null;
    boolean b46 = set42.equals(obj45);
    set.Set set47 = set41.intersect(set42);
    boolean b49 = set41.add((java.lang.Integer)100);
    boolean b51 = set41.remove((java.lang.Integer)10);
    java.lang.Object obj52 = null;
    boolean b53 = set41.equals(obj52);
    boolean b55 = set41.belongs((java.lang.Integer)1);
    set.Set set56 = set40.union(set41);
    set.Set set57 = new set.Set();
    set57.clear();
    set.Set set59 = new set.Set();
    set.Set set60 = new set.Set();
    boolean b62 = set60.remove((java.lang.Integer)0);
    java.lang.Object obj63 = null;
    boolean b64 = set60.equals(obj63);
    set.Set set65 = set59.intersect(set60);
    boolean b67 = set59.belongs((java.lang.Integer)10);
    int i68 = set59.size();
    set.Set set69 = set57.intersect(set59);
    boolean b71 = set57.remove((java.lang.Integer)0);
    boolean b72 = set57.isEmpty();
    boolean b73 = set57.isEmpty();
    set.Set set74 = set56.union(set57);
    boolean b76 = set57.remove((java.lang.Integer)0);
    int i77 = set57.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test84"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    int i7 = set6.size();
    boolean b9 = set6.add((java.lang.Integer)0);
    set6.clear();
    boolean b11 = set6.isEmpty();
    boolean b13 = set6.remove((java.lang.Integer)0);
    boolean b14 = set6.isEmpty();
    int i15 = set6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test85"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    set.Set set7 = new set.Set();
    set.Set set8 = new set.Set();
    boolean b10 = set8.remove((java.lang.Integer)0);
    java.lang.Object obj11 = null;
    boolean b12 = set8.equals(obj11);
    set.Set set13 = set7.intersect(set8);
    boolean b14 = set0.equals((java.lang.Object)set8);
    set.Set set15 = new set.Set();
    set.Set set16 = new set.Set();
    boolean b18 = set16.remove((java.lang.Integer)0);
    java.lang.Object obj19 = null;
    boolean b20 = set16.equals(obj19);
    set.Set set21 = set15.intersect(set16);
    boolean b22 = set15.isEmpty();
    boolean b24 = set15.remove((java.lang.Integer)0);
    set.Set set25 = set0.intersect(set15);
    boolean b26 = set15.isEmpty();
    set.Set set27 = new set.Set();
    set.Set set28 = new set.Set();
    boolean b30 = set28.remove((java.lang.Integer)0);
    java.lang.Object obj31 = null;
    boolean b32 = set28.equals(obj31);
    set.Set set33 = set27.intersect(set28);
    boolean b35 = set33.add((java.lang.Integer)(-1));
    boolean b37 = set33.belongs((java.lang.Integer)0);
    boolean b39 = set33.add((java.lang.Integer)0);
    boolean b40 = set15.equals((java.lang.Object)0);
    boolean b42 = set15.remove((java.lang.Integer)0);
    set.Set set43 = new set.Set();
    boolean b45 = set43.remove((java.lang.Integer)0);
    boolean b47 = set43.remove((java.lang.Integer)0);
    int i48 = set43.size();
    boolean b50 = set43.remove((java.lang.Integer)0);
    set.Set set51 = new set.Set();
    set.Set set52 = new set.Set();
    boolean b54 = set52.remove((java.lang.Integer)0);
    java.lang.Object obj55 = null;
    boolean b56 = set52.equals(obj55);
    set.Set set57 = set51.intersect(set52);
    set.Set set58 = set43.intersect(set57);
    set58.clear();
    set.Set set60 = new set.Set();
    set.Set set61 = new set.Set();
    boolean b63 = set61.remove((java.lang.Integer)0);
    java.lang.Object obj64 = null;
    boolean b65 = set61.equals(obj64);
    set.Set set66 = set60.intersect(set61);
    int i67 = set66.size();
    boolean b69 = set66.belongs((java.lang.Integer)(-1));
    set.Set set70 = new set.Set();
    set.Set set71 = new set.Set();
    boolean b73 = set71.remove((java.lang.Integer)0);
    java.lang.Object obj74 = null;
    boolean b75 = set71.equals(obj74);
    set.Set set76 = set70.intersect(set71);
    set76.clear();
    set.Set set78 = set66.union(set76);
    boolean b79 = set58.equals((java.lang.Object)set76);
    boolean b80 = set58.isEmpty();
    boolean b81 = set15.equals((java.lang.Object)b80);
    set.Set set82 = new set.Set();
    boolean b84 = set82.remove((java.lang.Integer)0);
    boolean b86 = set82.remove((java.lang.Integer)0);
    int i87 = set82.size();
    set.Set set88 = new set.Set();
    boolean b90 = set88.remove((java.lang.Integer)0);
    boolean b92 = set88.remove((java.lang.Integer)0);
    int i93 = set88.size();
    boolean b95 = set88.remove((java.lang.Integer)0);
    set.Set set96 = set82.intersect(set88);
    boolean b97 = set82.isEmpty();
    boolean b98 = set15.equals((java.lang.Object)set82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == true);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test86"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b7 = set0.isEmpty();
    boolean b9 = set0.remove((java.lang.Integer)0);
    boolean b11 = set0.belongs((java.lang.Integer)0);
    boolean b13 = set0.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array17 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i18 = new java.util.ArrayList<java.lang.Integer>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i18, i_array17);
    set.Set set20 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i18);
    set.Set set21 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i18);
    boolean b23 = set21.remove((java.lang.Integer)0);
    java.lang.Integer[] i_array27 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i28 = new java.util.ArrayList<java.lang.Integer>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i28, i_array27);
    set.Set set30 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i28);
    set.Set set31 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i28);
    set.Set set32 = new set.Set();
    set.Set set33 = new set.Set();
    boolean b35 = set33.remove((java.lang.Integer)0);
    java.lang.Object obj36 = null;
    boolean b37 = set33.equals(obj36);
    set.Set set38 = set32.intersect(set33);
    boolean b39 = set32.isEmpty();
    java.lang.Object obj40 = null;
    boolean b41 = set32.equals(obj40);
    set.Set set42 = set31.union(set32);
    boolean b44 = set31.add((java.lang.Integer)0);
    boolean b46 = set31.add((java.lang.Integer)0);
    set.Set set47 = new set.Set();
    set47.clear();
    set.Set set49 = new set.Set();
    set.Set set50 = new set.Set();
    boolean b52 = set50.remove((java.lang.Integer)0);
    java.lang.Object obj53 = null;
    boolean b54 = set50.equals(obj53);
    set.Set set55 = set49.intersect(set50);
    boolean b57 = set49.belongs((java.lang.Integer)10);
    int i58 = set49.size();
    set.Set set59 = set47.intersect(set49);
    boolean b61 = set47.remove((java.lang.Integer)0);
    boolean b63 = set47.remove((java.lang.Integer)0);
    set.Set set64 = new set.Set();
    set.Set set65 = new set.Set();
    boolean b67 = set65.remove((java.lang.Integer)0);
    java.lang.Object obj68 = null;
    boolean b69 = set65.equals(obj68);
    set.Set set70 = set64.intersect(set65);
    boolean b72 = set64.belongs((java.lang.Integer)10);
    set64.clear();
    int i74 = set64.size();
    boolean b75 = set47.equals((java.lang.Object)set64);
    set.Set set76 = set31.union(set47);
    boolean b78 = set31.belongs((java.lang.Integer)0);
    set.Set set79 = set21.union(set31);
    boolean b80 = set31.isEmpty();
    boolean b81 = set0.equals((java.lang.Object)set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test87"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    int i7 = set1.size();
    java.lang.Object obj8 = null;
    boolean b9 = set1.equals(obj8);
    set.Set set10 = new set.Set();
    boolean b12 = set10.remove((java.lang.Integer)0);
    boolean b14 = set10.remove((java.lang.Integer)0);
    int i15 = set10.size();
    boolean b17 = set10.remove((java.lang.Integer)0);
    set.Set set18 = new set.Set();
    set.Set set19 = new set.Set();
    boolean b21 = set19.remove((java.lang.Integer)0);
    java.lang.Object obj22 = null;
    boolean b23 = set19.equals(obj22);
    set.Set set24 = set18.intersect(set19);
    set.Set set25 = set10.intersect(set24);
    boolean b26 = set1.equals((java.lang.Object)set10);
    set1.clear();
    int i28 = set1.size();
    java.lang.Object obj29 = null;
    boolean b30 = set1.equals(obj29);
    set.Set set31 = new set.Set();
    set.Set set32 = new set.Set();
    boolean b34 = set32.remove((java.lang.Integer)0);
    java.lang.Object obj35 = null;
    boolean b36 = set32.equals(obj35);
    set.Set set37 = set31.intersect(set32);
    java.lang.Object obj38 = null;
    boolean b39 = set32.equals(obj38);
    boolean b41 = set32.add((java.lang.Integer)0);
    set.Set set42 = new set.Set();
    set.Set set43 = new set.Set();
    boolean b45 = set43.remove((java.lang.Integer)0);
    java.lang.Object obj46 = null;
    boolean b47 = set43.equals(obj46);
    set.Set set48 = set42.intersect(set43);
    java.lang.Object obj49 = null;
    boolean b50 = set43.equals(obj49);
    boolean b52 = set43.add((java.lang.Integer)0);
    set.Set set53 = set32.union(set43);
    boolean b54 = set1.equals((java.lang.Object)set53);
    int i55 = set53.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test88"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.belongs((java.lang.Integer)10);
    set0.clear();
    set.Set set10 = new set.Set();
    set.Set set11 = new set.Set();
    boolean b13 = set11.remove((java.lang.Integer)0);
    java.lang.Object obj14 = null;
    boolean b15 = set11.equals(obj14);
    set.Set set16 = set10.intersect(set11);
    boolean b18 = set16.add((java.lang.Integer)(-1));
    set.Set set19 = set0.union(set16);
    set.Set set20 = new set.Set();
    set.Set set21 = new set.Set();
    boolean b23 = set21.remove((java.lang.Integer)0);
    java.lang.Object obj24 = null;
    boolean b25 = set21.equals(obj24);
    set.Set set26 = set20.intersect(set21);
    set20.clear();
    set.Set set28 = set16.intersect(set20);
    boolean b30 = set28.belongs((java.lang.Integer)(-1));
    boolean b32 = set28.add((java.lang.Integer)1);
    boolean b33 = set28.isEmpty();
    set28.clear();
    boolean b36 = set28.remove((java.lang.Integer)0);
    boolean b38 = set28.belongs((java.lang.Integer)0);
    boolean b39 = set28.isEmpty();
    boolean b41 = set28.add((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test89"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b7 = set0.isEmpty();
    boolean b9 = set0.add((java.lang.Integer)0);
    boolean b10 = set0.isEmpty();
    int i11 = set0.size();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i16 = new java.util.ArrayList<java.lang.Integer>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i16, i_array15);
    set.Set set18 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i16);
    set.Set set19 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i16);
    boolean b21 = set19.add((java.lang.Integer)100);
    set.Set set22 = set0.intersect(set19);
    java.lang.Object obj23 = null;
    boolean b24 = set19.equals(obj23);
    boolean b26 = set19.belongs((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test90"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.belongs((java.lang.Integer)10);
    set0.clear();
    set.Set set10 = new set.Set();
    set.Set set11 = new set.Set();
    boolean b13 = set11.remove((java.lang.Integer)0);
    java.lang.Object obj14 = null;
    boolean b15 = set11.equals(obj14);
    set.Set set16 = set10.intersect(set11);
    boolean b18 = set16.add((java.lang.Integer)(-1));
    set.Set set19 = set0.union(set16);
    set.Set set20 = new set.Set();
    set.Set set21 = new set.Set();
    boolean b23 = set21.remove((java.lang.Integer)0);
    java.lang.Object obj24 = null;
    boolean b25 = set21.equals(obj24);
    set.Set set26 = set20.intersect(set21);
    set20.clear();
    set.Set set28 = set16.intersect(set20);
    set.Set set29 = new set.Set();
    set.Set set30 = new set.Set();
    boolean b32 = set30.remove((java.lang.Integer)0);
    java.lang.Object obj33 = null;
    boolean b34 = set30.equals(obj33);
    set.Set set35 = set29.intersect(set30);
    boolean b37 = set29.belongs((java.lang.Integer)10);
    set29.clear();
    int i39 = set29.size();
    set.Set set40 = new set.Set();
    set.Set set41 = new set.Set();
    boolean b43 = set41.remove((java.lang.Integer)0);
    java.lang.Object obj44 = null;
    boolean b45 = set41.equals(obj44);
    set.Set set46 = set40.intersect(set41);
    set.Set set47 = new set.Set();
    set.Set set48 = new set.Set();
    boolean b50 = set48.remove((java.lang.Integer)0);
    java.lang.Object obj51 = null;
    boolean b52 = set48.equals(obj51);
    set.Set set53 = set47.intersect(set48);
    boolean b54 = set40.equals((java.lang.Object)set48);
    set.Set set55 = set29.union(set48);
    set.Set set56 = set28.intersect(set48);
    java.lang.Object obj57 = null;
    boolean b58 = set28.equals(obj57);
    boolean b60 = set28.remove((java.lang.Integer)3);
    boolean b61 = set28.isEmpty();
    boolean b63 = set28.remove((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test91"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b7 = set0.isEmpty();
    boolean b9 = set0.remove((java.lang.Integer)0);
    set0.clear();
    int i11 = set0.size();
    java.lang.Integer[] i_array15 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i16 = new java.util.ArrayList<java.lang.Integer>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i16, i_array15);
    set.Set set18 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i16);
    boolean b20 = set18.remove((java.lang.Integer)0);
    set.Set set21 = new set.Set();
    set.Set set22 = new set.Set();
    boolean b24 = set22.remove((java.lang.Integer)0);
    java.lang.Object obj25 = null;
    boolean b26 = set22.equals(obj25);
    set.Set set27 = set21.intersect(set22);
    set.Set set28 = new set.Set();
    set.Set set29 = new set.Set();
    boolean b31 = set29.remove((java.lang.Integer)0);
    java.lang.Object obj32 = null;
    boolean b33 = set29.equals(obj32);
    set.Set set34 = set28.intersect(set29);
    boolean b35 = set21.equals((java.lang.Object)set29);
    set.Set set36 = set18.intersect(set29);
    boolean b37 = set0.equals((java.lang.Object)set18);
    set.Set set38 = null;
    // The following exception was thrown during execution in test generation
    try {
    set.Set set39 = set18.union(set38);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test92"); }

    set.Set set0 = new set.Set();
    set.Set set1 = new set.Set();
    boolean b3 = set1.remove((java.lang.Integer)0);
    java.lang.Object obj4 = null;
    boolean b5 = set1.equals(obj4);
    set.Set set6 = set0.intersect(set1);
    boolean b8 = set0.add((java.lang.Integer)100);
    boolean b10 = set0.remove((java.lang.Integer)10);
    boolean b12 = set0.remove((java.lang.Integer)0);
    boolean b14 = set0.add((java.lang.Integer)0);
    java.lang.Integer[] i_array18 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i19 = new java.util.ArrayList<java.lang.Integer>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i19, i_array18);
    set.Set set21 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i19);
    set.Set set22 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i19);
    boolean b24 = set22.remove((java.lang.Integer)0);
    boolean b25 = set22.isEmpty();
    set.Set set26 = set0.intersect(set22);
    boolean b28 = set0.remove((java.lang.Integer)0);
    int i29 = set0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test93"); }

    java.lang.Integer[] i_array3 = new java.lang.Integer[] { 1, 10, 1 };
    java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)arraylist_i4, i_array3);
    set.Set set6 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set7 = new set.Set((java.util.Collection<java.lang.Integer>)arraylist_i4);
    set.Set set8 = new set.Set();
    set.Set set9 = new set.Set();
    boolean b11 = set9.remove((java.lang.Integer)0);
    java.lang.Object obj12 = null;
    boolean b13 = set9.equals(obj12);
    set.Set set14 = set8.intersect(set9);
    boolean b15 = set8.isEmpty();
    java.lang.Object obj16 = null;
    boolean b17 = set8.equals(obj16);
    set.Set set18 = set7.union(set8);
    int i19 = set7.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test94"); }

    set.Set set0 = new set.Set();
    boolean b2 = set0.remove((java.lang.Integer)1);
    boolean b4 = set0.add((java.lang.Integer)0);
    set.Set set5 = new set.Set();
    boolean b7 = set5.remove((java.lang.Integer)0);
    boolean b9 = set5.remove((java.lang.Integer)0);
    int i10 = set5.size();
    boolean b12 = set5.remove((java.lang.Integer)0);
    set.Set set13 = new set.Set();
    set.Set set14 = new set.Set();
    boolean b16 = set14.remove((java.lang.Integer)0);
    java.lang.Object obj17 = null;
    boolean b18 = set14.equals(obj17);
    set.Set set19 = set13.intersect(set14);
    set.Set set20 = set5.intersect(set19);
    set.Set set21 = new set.Set();
    set.Set set22 = new set.Set();
    boolean b24 = set22.remove((java.lang.Integer)0);
    java.lang.Object obj25 = null;
    boolean b26 = set22.equals(obj25);
    set.Set set27 = set21.intersect(set22);
    boolean b28 = set21.isEmpty();
    boolean b30 = set21.remove((java.lang.Integer)0);
    set21.clear();
    set.Set set32 = set5.union(set21);
    set.Set set33 = new set.Set();
    boolean b35 = set33.remove((java.lang.Integer)0);
    boolean b37 = set33.remove((java.lang.Integer)0);
    int i38 = set33.size();
    boolean b40 = set33.remove((java.lang.Integer)0);
    set.Set set41 = new set.Set();
    set.Set set42 = new set.Set();
    boolean b44 = set42.remove((java.lang.Integer)0);
    java.lang.Object obj45 = null;
    boolean b46 = set42.equals(obj45);
    set.Set set47 = set41.intersect(set42);
    set.Set set48 = set33.intersect(set47);
    set.Set set49 = set32.intersect(set48);
    boolean b50 = set48.isEmpty();
    boolean b52 = set48.belongs((java.lang.Integer)1);
    set.Set set53 = new set.Set();
    set53.clear();
    set.Set set55 = new set.Set();
    boolean b57 = set55.remove((java.lang.Integer)0);
    boolean b59 = set55.remove((java.lang.Integer)0);
    int i60 = set55.size();
    boolean b62 = set55.remove((java.lang.Integer)0);
    set.Set set63 = set53.union(set55);
    int i64 = set63.size();
    set.Set set65 = set48.intersect(set63);
    set.Set set66 = set0.union(set48);
    set66.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set66);

  }

}
