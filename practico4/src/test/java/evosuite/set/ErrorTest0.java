package evosuite.set;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  //@Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }

    java.util.Collection<java.lang.Integer> collection_i0 = null;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    evosuite.set.Set set1 = new evosuite.set.Set(collection_i0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }

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
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set22 and set21.", set22.equals(set21) == set21.equals(set22));

  }

}
