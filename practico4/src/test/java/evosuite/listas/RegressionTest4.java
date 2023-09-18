package evosuite.listas;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b7 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.esVacia();
    boolean b9 = listaSobreArreglos0.equals((java.lang.Object)b8);
    boolean b10 = listaSobreArreglos0.repOk();
    boolean b11 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    boolean b13 = listaSobreArreglos12.esVacia();
    boolean b14 = listaSobreArreglos12.esVacia();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos12.equals(obj15);
    boolean b17 = listaSobreArreglos12.esVacia();
    boolean b18 = listaSobreArreglos0.equals((java.lang.Object)b17);
    java.lang.String str19 = listaSobreArreglos0.toString();
    boolean b20 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    java.lang.String str6 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    java.lang.String str13 = listaSobreArreglos9.toString();
    boolean b14 = listaSobreArreglos9.repOk();
    boolean b15 = listaSobreArreglos7.equals((java.lang.Object)b14);
    boolean b16 = listaSobreArreglos7.repOk();
    listaSobreArreglos7.insertar((java.lang.Object)(short)-1);
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    boolean b20 = listaSobreArreglos0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    java.lang.String str8 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b12 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b13);
    int i15 = listaSobreArreglos0.longitud();
    boolean b16 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.vaciar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1.0f);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos8);
    boolean b11 = listaSobreArreglos8.esVacia();
    boolean b12 = listaSobreArreglos8.repOk();
    boolean b13 = listaSobreArreglos8.esVacia();
    listaSobreArreglos8.vaciar();
    java.lang.Object obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos8.insertar(obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    int i7 = listaSobreArreglos0.longitud();
    int i8 = listaSobreArreglos0.longitud();
    java.lang.Object obj9 = null;
    boolean b10 = listaSobreArreglos0.equals(obj9);
    boolean b11 = listaSobreArreglos0.repOk();
    java.lang.String str12 = listaSobreArreglos0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    int i18 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    int i21 = listaSobreArreglos20.longitud();
    boolean b23 = listaSobreArreglos20.equals((java.lang.Object)(-1));
    java.lang.String str24 = listaSobreArreglos20.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos25 = new evosuite.listas.ListaSobreArreglos();
    boolean b26 = listaSobreArreglos25.esVacia();
    boolean b28 = listaSobreArreglos25.equals((java.lang.Object)100.0f);
    boolean b30 = listaSobreArreglos25.equals((java.lang.Object)0.0f);
    int i31 = listaSobreArreglos25.longitud();
    boolean b32 = listaSobreArreglos25.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str34 = listaSobreArreglos33.toString();
    boolean b35 = listaSobreArreglos33.esVacia();
    boolean b36 = listaSobreArreglos25.equals((java.lang.Object)b35);
    listaSobreArreglos20.insertar((java.lang.Object)b36);
    listaSobreArreglos20.eliminar(0);
    boolean b40 = listaSobreArreglos20.repOk();
    boolean b41 = listaSobreArreglos0.equals((java.lang.Object)b40);
    boolean b42 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    int i2 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    int i5 = listaSobreArreglos0.longitud();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.eliminar(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    int i2 = listaSobreArreglos0.longitud();
    java.lang.String str3 = listaSobreArreglos0.toString();
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.esVacia();
    boolean b6 = listaSobreArreglos0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    int i3 = listaSobreArreglos0.longitud();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = listaSobreArreglos0.obtener((int)'#');
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
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos16);
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos0.eliminar(0);
    int i31 = listaSobreArreglos0.longitud();
    int i32 = listaSobreArreglos0.longitud();
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos0.equals(obj33);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos35 = new evosuite.listas.ListaSobreArreglos();
    boolean b36 = listaSobreArreglos35.esVacia();
    boolean b38 = listaSobreArreglos35.equals((java.lang.Object)100.0f);
    java.lang.String str39 = listaSobreArreglos35.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos41 = new evosuite.listas.ListaSobreArreglos();
    boolean b42 = listaSobreArreglos41.esVacia();
    boolean b43 = listaSobreArreglos41.esVacia();
    int i44 = listaSobreArreglos41.longitud();
    listaSobreArreglos35.insertar(0, (java.lang.Object)listaSobreArreglos41);
    java.lang.String str46 = listaSobreArreglos41.toString();
    boolean b47 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos41);
    boolean b48 = listaSobreArreglos0.repOk();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj50 = listaSobreArreglos0.obtener((int)(byte)-1);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]"+ "'", str39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]"+ "'", str46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    int i5 = listaSobreArreglos0.longitud();
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos16.equals((java.lang.Object)100.0f);
    boolean b21 = listaSobreArreglos16.equals((java.lang.Object)0.0f);
    boolean b22 = listaSobreArreglos16.repOk();
    listaSobreArreglos8.insertar(0, (java.lang.Object)b22);
    listaSobreArreglos8.vaciar();
    int i25 = listaSobreArreglos8.longitud();
    java.lang.Object obj26 = null;
    boolean b27 = listaSobreArreglos8.equals(obj26);
    boolean b28 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos8);
    boolean b29 = listaSobreArreglos8.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    boolean b14 = listaSobreArreglos0.repOk();
    java.lang.String str15 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    int i17 = listaSobreArreglos16.longitud();
    boolean b19 = listaSobreArreglos16.equals((java.lang.Object)(-1));
    java.lang.String str20 = listaSobreArreglos16.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    int i27 = listaSobreArreglos21.longitud();
    boolean b28 = listaSobreArreglos21.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos21.equals((java.lang.Object)b31);
    listaSobreArreglos16.insertar((java.lang.Object)b32);
    boolean b34 = listaSobreArreglos0.equals((java.lang.Object)b32);
    int i35 = listaSobreArreglos0.longitud();
    int i36 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.esVacia();
    boolean b40 = listaSobreArreglos37.equals((java.lang.Object)100.0f);
    java.lang.String str41 = listaSobreArreglos37.toString();
    boolean b42 = listaSobreArreglos37.repOk();
    java.lang.Object obj43 = null;
    boolean b44 = listaSobreArreglos37.equals(obj43);
    java.lang.String str45 = listaSobreArreglos37.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos47 = new evosuite.listas.ListaSobreArreglos();
    boolean b48 = listaSobreArreglos47.esVacia();
    boolean b49 = listaSobreArreglos47.esVacia();
    boolean b50 = listaSobreArreglos47.repOk();
    listaSobreArreglos37.insertar(0, (java.lang.Object)b50);
    java.lang.Object obj52 = null;
    boolean b53 = listaSobreArreglos37.equals(obj52);
    java.lang.Object obj55 = listaSobreArreglos37.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos56 = new evosuite.listas.ListaSobreArreglos();
    boolean b57 = listaSobreArreglos56.esVacia();
    boolean b59 = listaSobreArreglos56.equals((java.lang.Object)100.0f);
    boolean b61 = listaSobreArreglos56.equals((java.lang.Object)0.0f);
    int i62 = listaSobreArreglos56.longitud();
    boolean b63 = listaSobreArreglos56.esVacia();
    boolean b64 = listaSobreArreglos56.esVacia();
    int i65 = listaSobreArreglos56.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos67 = new evosuite.listas.ListaSobreArreglos();
    boolean b68 = listaSobreArreglos67.esVacia();
    boolean b69 = listaSobreArreglos67.esVacia();
    boolean b70 = listaSobreArreglos67.repOk();
    java.lang.String str71 = listaSobreArreglos67.toString();
    listaSobreArreglos67.vaciar();
    boolean b73 = listaSobreArreglos67.esVacia();
    listaSobreArreglos56.insertar(0, (java.lang.Object)b73);
    boolean b75 = listaSobreArreglos56.esVacia();
    int i76 = listaSobreArreglos56.longitud();
    listaSobreArreglos37.insertar((java.lang.Object)i76);
    int i78 = listaSobreArreglos37.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)i78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]"+ "'", str41.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]"+ "'", str45.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj55 + "' != '" + true+ "'", obj55.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "[]"+ "'", str71.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 2);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    boolean b8 = listaSobreArreglos0.esVacia();
    int i9 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    boolean b12 = listaSobreArreglos11.esVacia();
    boolean b13 = listaSobreArreglos11.esVacia();
    boolean b14 = listaSobreArreglos11.repOk();
    java.lang.String str15 = listaSobreArreglos11.toString();
    listaSobreArreglos11.vaciar();
    boolean b17 = listaSobreArreglos11.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b17);
    boolean b19 = listaSobreArreglos0.esVacia();
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.eliminar(4);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    boolean b10 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    int i12 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj15 = listaSobreArreglos0.obtener((int)(short)0);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)(byte)-1);
    boolean b6 = listaSobreArreglos0.esVacia();
    boolean b7 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    java.lang.String str8 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b12 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b13);
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos0.equals(obj15);
    listaSobreArreglos0.eliminar(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos16);
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos0.eliminar(0);
    int i31 = listaSobreArreglos0.longitud();
    boolean b32 = listaSobreArreglos0.esVacia();
    java.lang.Object obj34 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.insertar(2, obj34);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos16);
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos22);
    boolean b29 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos31 = new evosuite.listas.ListaSobreArreglos();
    boolean b32 = listaSobreArreglos31.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    boolean b34 = listaSobreArreglos33.esVacia();
    boolean b36 = listaSobreArreglos33.equals((java.lang.Object)100.0f);
    java.lang.String str37 = listaSobreArreglos33.toString();
    boolean b38 = listaSobreArreglos33.repOk();
    boolean b39 = listaSobreArreglos31.equals((java.lang.Object)b38);
    boolean b40 = listaSobreArreglos31.repOk();
    listaSobreArreglos31.insertar((java.lang.Object)(-1));
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    boolean b44 = listaSobreArreglos43.esVacia();
    boolean b45 = listaSobreArreglos43.esVacia();
    boolean b46 = listaSobreArreglos43.repOk();
    boolean b47 = listaSobreArreglos31.equals((java.lang.Object)b46);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos31);
    java.lang.Object obj49 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos31.insertar(obj49);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]"+ "'", str37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj1 = null;
    boolean b2 = listaSobreArreglos0.equals(obj1);
    int i3 = listaSobreArreglos0.longitud();
    java.lang.Object obj4 = null;
    boolean b5 = listaSobreArreglos0.equals(obj4);
    java.lang.String str6 = listaSobreArreglos0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    int i18 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b22 = listaSobreArreglos0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)"[[]]");
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    java.lang.String str13 = listaSobreArreglos9.toString();
    boolean b14 = listaSobreArreglos9.repOk();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos9.equals(obj15);
    java.lang.String str17 = listaSobreArreglos9.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    boolean b20 = listaSobreArreglos19.esVacia();
    boolean b21 = listaSobreArreglos19.esVacia();
    boolean b22 = listaSobreArreglos19.repOk();
    listaSobreArreglos9.insertar(0, (java.lang.Object)b22);
    java.lang.String str24 = listaSobreArreglos9.toString();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos9);
    boolean b26 = listaSobreArreglos9.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b31 = listaSobreArreglos28.equals((java.lang.Object)100.0f);
    boolean b33 = listaSobreArreglos28.equals((java.lang.Object)0.0f);
    boolean b34 = listaSobreArreglos28.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos35 = new evosuite.listas.ListaSobreArreglos();
    boolean b36 = listaSobreArreglos35.esVacia();
    boolean b38 = listaSobreArreglos35.equals((java.lang.Object)100.0f);
    boolean b40 = listaSobreArreglos35.equals((java.lang.Object)0.0f);
    boolean b41 = listaSobreArreglos35.repOk();
    listaSobreArreglos28.insertar((java.lang.Object)b41);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    boolean b44 = listaSobreArreglos43.esVacia();
    boolean b46 = listaSobreArreglos43.equals((java.lang.Object)100.0f);
    listaSobreArreglos43.vaciar();
    boolean b48 = listaSobreArreglos43.esVacia();
    listaSobreArreglos28.insertar((java.lang.Object)b48);
    listaSobreArreglos9.insertar(0, (java.lang.Object)b48);
    java.lang.Object obj52 = listaSobreArreglos9.obtener(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[true]"+ "'", str24.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj52 + "' != '" + true+ "'", obj52.equals(true));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    boolean b11 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos12.vaciar();
    boolean b14 = listaSobreArreglos12.repOk();
    boolean b16 = listaSobreArreglos12.equals((java.lang.Object)1.0f);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos12.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.repOk();
    listaSobreArreglos12.insertar(0, (java.lang.Object)listaSobreArreglos20);
    boolean b23 = listaSobreArreglos20.esVacia();
    boolean b24 = listaSobreArreglos20.esVacia();
    boolean b25 = listaSobreArreglos20.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos20);
    boolean b27 = listaSobreArreglos20.esVacia();
    java.lang.String str28 = listaSobreArreglos20.toString();
    boolean b29 = listaSobreArreglos20.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    boolean b11 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos12.vaciar();
    boolean b14 = listaSobreArreglos12.repOk();
    boolean b16 = listaSobreArreglos12.equals((java.lang.Object)1.0f);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos12.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.repOk();
    listaSobreArreglos12.insertar(0, (java.lang.Object)listaSobreArreglos20);
    boolean b23 = listaSobreArreglos20.esVacia();
    boolean b24 = listaSobreArreglos20.esVacia();
    boolean b25 = listaSobreArreglos20.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos20);
    boolean b27 = listaSobreArreglos20.esVacia();
    listaSobreArreglos20.vaciar();
    java.lang.String str29 = listaSobreArreglos20.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    listaSobreArreglos0.insertar(0, (java.lang.Object)0L);
    int i12 = listaSobreArreglos0.longitud();
    java.lang.String str13 = listaSobreArreglos0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0]"+ "'", str13.equals("[0]"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    java.lang.String str8 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b12 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b13);
    java.lang.String str15 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    boolean b18 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos17.equals((java.lang.Object)100.0f);
    java.lang.String str21 = listaSobreArreglos17.toString();
    boolean b22 = listaSobreArreglos17.repOk();
    boolean b23 = listaSobreArreglos17.repOk();
    java.lang.String str24 = listaSobreArreglos17.toString();
    listaSobreArreglos17.vaciar();
    boolean b26 = listaSobreArreglos17.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b26);
    int i28 = listaSobreArreglos0.longitud();
    boolean b29 = listaSobreArreglos0.repOk();
    java.lang.Object obj31 = listaSobreArreglos0.obtener((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[true]"+ "'", str15.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true+ "'", obj31.equals(true));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar((java.lang.Object)0.0d);
    boolean b8 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b11 = listaSobreArreglos9.esVacia();
    java.lang.Object obj12 = null;
    boolean b13 = listaSobreArreglos9.equals(obj12);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b16 = listaSobreArreglos14.esVacia();
    boolean b17 = listaSobreArreglos14.esVacia();
    boolean b18 = listaSobreArreglos9.equals((java.lang.Object)b17);
    listaSobreArreglos9.vaciar();
    boolean b20 = listaSobreArreglos9.esVacia();
    java.lang.String str21 = listaSobreArreglos9.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str21);
    boolean b23 = listaSobreArreglos0.esVacia();
    java.lang.Object obj25 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.vaciar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d+ "'", obj25.equals(0.0d));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    boolean b8 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    boolean b15 = listaSobreArreglos10.equals((java.lang.Object)0.0f);
    int i16 = listaSobreArreglos10.longitud();
    boolean b17 = listaSobreArreglos10.esVacia();
    boolean b18 = listaSobreArreglos10.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos19.vaciar();
    boolean b21 = listaSobreArreglos19.repOk();
    boolean b22 = listaSobreArreglos19.repOk();
    int i23 = listaSobreArreglos19.longitud();
    boolean b24 = listaSobreArreglos19.repOk();
    listaSobreArreglos10.insertar((java.lang.Object)b24);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    boolean b27 = listaSobreArreglos10.repOk();
    java.lang.String str28 = listaSobreArreglos10.toString();
    listaSobreArreglos10.eliminar(0);
    boolean b31 = listaSobreArreglos10.repOk();
    listaSobreArreglos10.vaciar();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj34 = listaSobreArreglos10.obtener((int)'4');
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[true]"+ "'", str28.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar((java.lang.Object)0.0d);
    boolean b8 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b11 = listaSobreArreglos9.esVacia();
    java.lang.Object obj12 = null;
    boolean b13 = listaSobreArreglos9.equals(obj12);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b16 = listaSobreArreglos14.esVacia();
    boolean b17 = listaSobreArreglos14.esVacia();
    boolean b18 = listaSobreArreglos9.equals((java.lang.Object)b17);
    listaSobreArreglos9.vaciar();
    boolean b20 = listaSobreArreglos9.esVacia();
    java.lang.String str21 = listaSobreArreglos9.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str21);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos24.vaciar();
    int i26 = listaSobreArreglos24.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos24);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    boolean b30 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos29.equals((java.lang.Object)100.0f);
    java.lang.String str33 = listaSobreArreglos29.toString();
    boolean b34 = listaSobreArreglos29.repOk();
    java.lang.Object obj35 = null;
    boolean b36 = listaSobreArreglos29.equals(obj35);
    listaSobreArreglos29.vaciar();
    boolean b38 = listaSobreArreglos29.repOk();
    java.lang.String str39 = listaSobreArreglos29.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos41 = new evosuite.listas.ListaSobreArreglos();
    int i42 = listaSobreArreglos41.longitud();
    listaSobreArreglos41.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos41.vaciar();
    listaSobreArreglos29.insertar(0, (java.lang.Object)listaSobreArreglos41);
    java.lang.Object obj49 = listaSobreArreglos29.obtener(0);
    int i50 = listaSobreArreglos29.longitud();
    listaSobreArreglos29.vaciar();
    boolean b52 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]"+ "'", str33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]"+ "'", str39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)100L);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.equals((java.lang.Object)100.0f);
    java.lang.String str9 = listaSobreArreglos5.toString();
    boolean b10 = listaSobreArreglos5.repOk();
    java.lang.Object obj11 = null;
    boolean b12 = listaSobreArreglos5.equals(obj11);
    java.lang.String str13 = listaSobreArreglos5.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    boolean b16 = listaSobreArreglos15.esVacia();
    boolean b17 = listaSobreArreglos15.esVacia();
    boolean b18 = listaSobreArreglos15.repOk();
    listaSobreArreglos5.insertar(0, (java.lang.Object)b18);
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos5.equals(obj20);
    java.lang.Object obj23 = listaSobreArreglos5.obtener(0);
    java.lang.Object obj25 = listaSobreArreglos5.obtener(0);
    boolean b26 = listaSobreArreglos5.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)b26);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b30 = listaSobreArreglos28.esVacia();
    boolean b31 = listaSobreArreglos28.repOk();
    java.lang.String str32 = listaSobreArreglos28.toString();
    boolean b33 = listaSobreArreglos28.repOk();
    boolean b34 = listaSobreArreglos28.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos28);
    int i36 = listaSobreArreglos0.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + true+ "'", obj23.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true+ "'", obj25.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 2);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    boolean b7 = listaSobreArreglos2.equals((java.lang.Object)0.0f);
    boolean b8 = listaSobreArreglos2.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    java.lang.String str13 = listaSobreArreglos9.toString();
    boolean b14 = listaSobreArreglos9.repOk();
    boolean b15 = listaSobreArreglos2.equals((java.lang.Object)listaSobreArreglos9);
    boolean b16 = listaSobreArreglos2.repOk();
    java.lang.String str17 = listaSobreArreglos2.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str17);
    int i19 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)"[[100]]");
    boolean b22 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar((java.lang.Object)0.0d);
    listaSobreArreglos0.vaciar();
    java.lang.String str9 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    boolean b12 = listaSobreArreglos11.esVacia();
    boolean b13 = listaSobreArreglos11.esVacia();
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos11.equals(obj14);
    java.lang.String str16 = listaSobreArreglos11.toString();
    listaSobreArreglos11.insertar((java.lang.Object)0.0d);
    boolean b19 = listaSobreArreglos11.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b22 = listaSobreArreglos20.esVacia();
    java.lang.Object obj23 = null;
    boolean b24 = listaSobreArreglos20.equals(obj23);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos25 = new evosuite.listas.ListaSobreArreglos();
    boolean b26 = listaSobreArreglos25.esVacia();
    boolean b27 = listaSobreArreglos25.esVacia();
    boolean b28 = listaSobreArreglos25.esVacia();
    boolean b29 = listaSobreArreglos20.equals((java.lang.Object)b28);
    listaSobreArreglos20.vaciar();
    boolean b31 = listaSobreArreglos20.esVacia();
    java.lang.String str32 = listaSobreArreglos20.toString();
    listaSobreArreglos11.insertar((java.lang.Object)str32);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos35 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos35.vaciar();
    int i37 = listaSobreArreglos35.longitud();
    listaSobreArreglos11.insertar(0, (java.lang.Object)listaSobreArreglos35);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos11);
    boolean b40 = listaSobreArreglos11.esVacia();
    java.lang.String str41 = listaSobreArreglos11.toString();
    java.lang.String str42 = listaSobreArreglos11.toString();
    boolean b43 = listaSobreArreglos11.esVacia();
    java.lang.Object obj45 = listaSobreArreglos11.obtener(0);
    boolean b46 = listaSobreArreglos11.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[[],0.0,[]]"+ "'", str41.equals("[[],0.0,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[[],0.0,[]]"+ "'", str42.equals("[[],0.0,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    int i5 = listaSobreArreglos0.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)"[[]]");
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    java.lang.String str13 = listaSobreArreglos9.toString();
    boolean b14 = listaSobreArreglos9.repOk();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos9.equals(obj15);
    java.lang.String str17 = listaSobreArreglos9.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    boolean b20 = listaSobreArreglos19.esVacia();
    boolean b21 = listaSobreArreglos19.esVacia();
    boolean b22 = listaSobreArreglos19.repOk();
    listaSobreArreglos9.insertar(0, (java.lang.Object)b22);
    java.lang.String str24 = listaSobreArreglos9.toString();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos9);
    int i26 = listaSobreArreglos9.longitud();
    int i27 = listaSobreArreglos9.longitud();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj29 = listaSobreArreglos9.obtener((int)(short)10);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[true]"+ "'", str24.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    int i5 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    boolean b12 = listaSobreArreglos7.equals((java.lang.Object)0.0f);
    java.lang.String str13 = listaSobreArreglos7.toString();
    int i14 = listaSobreArreglos7.longitud();
    boolean b15 = listaSobreArreglos7.esVacia();
    int i16 = listaSobreArreglos7.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)i16);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos19.equals(obj20);
    int i22 = listaSobreArreglos19.longitud();
    boolean b23 = listaSobreArreglos19.esVacia();
    boolean b24 = listaSobreArreglos19.repOk();
    listaSobreArreglos19.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos19);
    boolean b27 = listaSobreArreglos0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b7 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.esVacia();
    boolean b9 = listaSobreArreglos0.equals((java.lang.Object)b8);
    boolean b10 = listaSobreArreglos0.repOk();
    boolean b11 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    boolean b13 = listaSobreArreglos12.esVacia();
    boolean b14 = listaSobreArreglos12.esVacia();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos12.equals(obj15);
    boolean b17 = listaSobreArreglos12.esVacia();
    boolean b18 = listaSobreArreglos0.equals((java.lang.Object)b17);
    boolean b19 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    boolean b21 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos16);
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos22);
    boolean b29 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos31 = new evosuite.listas.ListaSobreArreglos();
    boolean b32 = listaSobreArreglos31.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    boolean b34 = listaSobreArreglos33.esVacia();
    boolean b36 = listaSobreArreglos33.equals((java.lang.Object)100.0f);
    java.lang.String str37 = listaSobreArreglos33.toString();
    boolean b38 = listaSobreArreglos33.repOk();
    boolean b39 = listaSobreArreglos31.equals((java.lang.Object)b38);
    boolean b40 = listaSobreArreglos31.repOk();
    listaSobreArreglos31.insertar((java.lang.Object)(-1));
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    boolean b44 = listaSobreArreglos43.esVacia();
    boolean b45 = listaSobreArreglos43.esVacia();
    boolean b46 = listaSobreArreglos43.repOk();
    boolean b47 = listaSobreArreglos31.equals((java.lang.Object)b46);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos31);
    listaSobreArreglos31.vaciar();
    int i50 = listaSobreArreglos31.longitud();
    java.lang.String str51 = listaSobreArreglos31.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]"+ "'", str37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]"+ "'", str51.equals("[]"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    boolean b10 = listaSobreArreglos0.esVacia();
    int i11 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    boolean b13 = listaSobreArreglos12.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b17 = listaSobreArreglos14.equals((java.lang.Object)100.0f);
    java.lang.String str18 = listaSobreArreglos14.toString();
    boolean b19 = listaSobreArreglos14.repOk();
    boolean b20 = listaSobreArreglos12.equals((java.lang.Object)b19);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b25 = listaSobreArreglos22.equals((java.lang.Object)100.0f);
    java.lang.String str26 = listaSobreArreglos22.toString();
    boolean b27 = listaSobreArreglos22.repOk();
    java.lang.Object obj28 = null;
    boolean b29 = listaSobreArreglos22.equals(obj28);
    listaSobreArreglos22.vaciar();
    boolean b31 = listaSobreArreglos22.repOk();
    java.lang.String str32 = listaSobreArreglos22.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    int i35 = listaSobreArreglos34.longitud();
    listaSobreArreglos34.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos34.vaciar();
    listaSobreArreglos22.insertar(0, (java.lang.Object)listaSobreArreglos34);
    java.lang.String str41 = listaSobreArreglos22.toString();
    listaSobreArreglos22.eliminar(0);
    listaSobreArreglos12.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str45 = listaSobreArreglos12.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos47 = new evosuite.listas.ListaSobreArreglos();
    boolean b48 = listaSobreArreglos47.esVacia();
    boolean b50 = listaSobreArreglos47.equals((java.lang.Object)100.0f);
    boolean b52 = listaSobreArreglos47.equals((java.lang.Object)0.0f);
    boolean b53 = listaSobreArreglos47.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos54 = new evosuite.listas.ListaSobreArreglos();
    boolean b55 = listaSobreArreglos54.esVacia();
    boolean b57 = listaSobreArreglos54.equals((java.lang.Object)100.0f);
    java.lang.String str58 = listaSobreArreglos54.toString();
    boolean b59 = listaSobreArreglos54.repOk();
    boolean b60 = listaSobreArreglos47.equals((java.lang.Object)listaSobreArreglos54);
    boolean b61 = listaSobreArreglos47.repOk();
    java.lang.String str62 = listaSobreArreglos47.toString();
    listaSobreArreglos12.insertar(0, (java.lang.Object)str62);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos64 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos64.vaciar();
    listaSobreArreglos64.vaciar();
    java.lang.Object obj67 = null;
    boolean b68 = listaSobreArreglos64.equals(obj67);
    boolean b69 = listaSobreArreglos12.equals((java.lang.Object)listaSobreArreglos64);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos70 = new evosuite.listas.ListaSobreArreglos();
    boolean b71 = listaSobreArreglos70.esVacia();
    boolean b72 = listaSobreArreglos70.esVacia();
    java.lang.Object obj73 = null;
    boolean b74 = listaSobreArreglos70.equals(obj73);
    java.lang.String str75 = listaSobreArreglos70.toString();
    listaSobreArreglos70.insertar((java.lang.Object)0.0d);
    boolean b78 = listaSobreArreglos70.repOk();
    listaSobreArreglos64.insertar((java.lang.Object)listaSobreArreglos70);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos70);
    listaSobreArreglos0.eliminar(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[[]]"+ "'", str41.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[[]]"+ "'", str45.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[]"+ "'", str58.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[]"+ "'", str62.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "[]"+ "'", str75.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b7 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.esVacia();
    boolean b9 = listaSobreArreglos0.equals((java.lang.Object)b8);
    listaSobreArreglos0.vaciar();
    boolean b11 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    boolean b13 = listaSobreArreglos12.esVacia();
    boolean b14 = listaSobreArreglos12.esVacia();
    boolean b15 = listaSobreArreglos12.repOk();
    listaSobreArreglos12.insertar((java.lang.Object)(byte)-1);
    boolean b18 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos12);
    java.lang.Object obj19 = null;
    boolean b20 = listaSobreArreglos12.equals(obj19);
    boolean b21 = listaSobreArreglos12.esVacia();
    listaSobreArreglos12.vaciar();
    boolean b23 = listaSobreArreglos12.repOk();
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos12.eliminar(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    java.lang.String str7 = listaSobreArreglos0.toString();
    java.lang.String str8 = listaSobreArreglos0.toString();
    boolean b9 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    java.lang.String str6 = listaSobreArreglos0.toString();
    int i7 = listaSobreArreglos0.longitud();
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.String str10 = listaSobreArreglos0.toString();
    java.lang.Object obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.insertar((-1), obj12);
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos7.vaciar();
    boolean b9 = listaSobreArreglos7.repOk();
    boolean b11 = listaSobreArreglos7.equals((java.lang.Object)1.0f);
    listaSobreArreglos7.vaciar();
    listaSobreArreglos7.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    boolean b16 = listaSobreArreglos15.repOk();
    listaSobreArreglos7.insertar(0, (java.lang.Object)listaSobreArreglos15);
    boolean b18 = listaSobreArreglos15.esVacia();
    boolean b19 = listaSobreArreglos15.repOk();
    boolean b20 = listaSobreArreglos15.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)b20);
    java.lang.String str22 = listaSobreArreglos0.toString();
    java.lang.String str23 = listaSobreArreglos0.toString();
    java.lang.Object obj24 = null;
    boolean b25 = listaSobreArreglos0.equals(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[true]"+ "'", str22.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[true]"+ "'", str23.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    boolean b14 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.vaciar();
    int i16 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b25 = listaSobreArreglos22.equals((java.lang.Object)100.0f);
    boolean b27 = listaSobreArreglos22.equals((java.lang.Object)0.0f);
    java.lang.String str28 = listaSobreArreglos22.toString();
    int i29 = listaSobreArreglos22.longitud();
    listaSobreArreglos17.insertar((java.lang.Object)i29);
    boolean b31 = listaSobreArreglos17.repOk();
    listaSobreArreglos17.insertar(1, (java.lang.Object)(byte)-1);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos35 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos35.vaciar();
    boolean b37 = listaSobreArreglos35.repOk();
    boolean b38 = listaSobreArreglos35.repOk();
    boolean b39 = listaSobreArreglos35.esVacia();
    java.lang.String str40 = listaSobreArreglos35.toString();
    boolean b41 = listaSobreArreglos17.equals((java.lang.Object)listaSobreArreglos35);
    boolean b42 = listaSobreArreglos35.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos44 = new evosuite.listas.ListaSobreArreglos();
    boolean b45 = listaSobreArreglos44.esVacia();
    int i46 = listaSobreArreglos44.longitud();
    listaSobreArreglos35.insertar(0, (java.lang.Object)listaSobreArreglos44);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos48 = new evosuite.listas.ListaSobreArreglos();
    int i49 = listaSobreArreglos48.longitud();
    boolean b50 = listaSobreArreglos35.equals((java.lang.Object)i49);
    listaSobreArreglos35.eliminar(0);
    java.lang.Object obj53 = null;
    boolean b54 = listaSobreArreglos35.equals(obj53);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos35);
    listaSobreArreglos35.vaciar();
    java.lang.Object obj57 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos35.insertar(obj57);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    java.lang.Object obj18 = null;
    boolean b19 = listaSobreArreglos0.equals(obj18);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b23 = listaSobreArreglos20.equals((java.lang.Object)100.0f);
    java.lang.String str24 = listaSobreArreglos20.toString();
    boolean b25 = listaSobreArreglos20.repOk();
    java.lang.Object obj26 = null;
    boolean b27 = listaSobreArreglos20.equals(obj26);
    listaSobreArreglos20.vaciar();
    boolean b29 = listaSobreArreglos20.repOk();
    java.lang.String str30 = listaSobreArreglos20.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos32 = new evosuite.listas.ListaSobreArreglos();
    int i33 = listaSobreArreglos32.longitud();
    listaSobreArreglos32.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos32.vaciar();
    listaSobreArreglos20.insertar(0, (java.lang.Object)listaSobreArreglos32);
    java.lang.String str39 = listaSobreArreglos20.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos40 = new evosuite.listas.ListaSobreArreglos();
    boolean b41 = listaSobreArreglos40.repOk();
    boolean b42 = listaSobreArreglos20.equals((java.lang.Object)listaSobreArreglos40);
    java.lang.String str43 = listaSobreArreglos40.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos45 = new evosuite.listas.ListaSobreArreglos();
    boolean b46 = listaSobreArreglos45.esVacia();
    boolean b47 = listaSobreArreglos45.esVacia();
    java.lang.Object obj48 = null;
    boolean b49 = listaSobreArreglos45.equals(obj48);
    listaSobreArreglos45.vaciar();
    int i51 = listaSobreArreglos45.longitud();
    listaSobreArreglos40.insertar((int)(short)0, (java.lang.Object)listaSobreArreglos45);
    boolean b53 = listaSobreArreglos40.esVacia();
    boolean b54 = listaSobreArreglos40.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos40);
    listaSobreArreglos0.vaciar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]"+ "'", str30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[[]]"+ "'", str39.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]"+ "'", str43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    boolean b10 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    java.lang.String str12 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    listaSobreArreglos14.insertar(0, (java.lang.Object)10L);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10L);
    boolean b20 = listaSobreArreglos0.esVacia();
    java.lang.Object obj21 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.insertar(obj21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b7 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.esVacia();
    boolean b9 = listaSobreArreglos0.equals((java.lang.Object)b8);
    boolean b10 = listaSobreArreglos0.repOk();
    java.lang.String str11 = listaSobreArreglos0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj13 = listaSobreArreglos0.obtener(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    boolean b14 = listaSobreArreglos0.repOk();
    java.lang.String str15 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos16.equals((java.lang.Object)100.0f);
    boolean b21 = listaSobreArreglos16.equals((java.lang.Object)0.0f);
    boolean b22 = listaSobreArreglos16.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)100.0f);
    boolean b29 = listaSobreArreglos24.equals((java.lang.Object)0.0f);
    boolean b30 = listaSobreArreglos24.repOk();
    listaSobreArreglos16.insertar(0, (java.lang.Object)b30);
    listaSobreArreglos16.vaciar();
    int i33 = listaSobreArreglos16.longitud();
    int i34 = listaSobreArreglos16.longitud();
    listaSobreArreglos16.vaciar();
    listaSobreArreglos16.vaciar();
    listaSobreArreglos16.insertar((java.lang.Object)100L);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos16);
    boolean b40 = listaSobreArreglos16.repOk();
    java.lang.String str41 = listaSobreArreglos16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[100]"+ "'", str41.equals("[100]"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.equals((java.lang.Object)100.0f);
    boolean b10 = listaSobreArreglos5.equals((java.lang.Object)0.0f);
    java.lang.String str11 = listaSobreArreglos5.toString();
    int i12 = listaSobreArreglos5.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)i12);
    boolean b14 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos16.equals((java.lang.Object)100.0f);
    boolean b21 = listaSobreArreglos16.equals((java.lang.Object)0.0f);
    boolean b22 = listaSobreArreglos16.esVacia();
    int i23 = listaSobreArreglos16.longitud();
    listaSobreArreglos16.vaciar();
    java.lang.String str25 = listaSobreArreglos16.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos16);
    boolean b27 = listaSobreArreglos16.repOk();
    java.lang.String str28 = listaSobreArreglos16.toString();
    java.lang.String str29 = listaSobreArreglos16.toString();
    java.lang.Object obj31 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos16.insertar(0, obj31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]"+ "'", str29.equals("[]"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)(byte)-1);
    int i6 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos0.equals(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    java.lang.String str6 = listaSobreArreglos0.toString();
    int i7 = listaSobreArreglos0.longitud();
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos11.vaciar();
    boolean b13 = listaSobreArreglos11.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b17 = listaSobreArreglos14.equals((java.lang.Object)100.0f);
    boolean b19 = listaSobreArreglos14.equals((java.lang.Object)0.0f);
    boolean b20 = listaSobreArreglos14.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b25 = listaSobreArreglos22.equals((java.lang.Object)100.0f);
    boolean b27 = listaSobreArreglos22.equals((java.lang.Object)0.0f);
    boolean b28 = listaSobreArreglos22.repOk();
    listaSobreArreglos14.insertar(0, (java.lang.Object)b28);
    listaSobreArreglos14.vaciar();
    int i31 = listaSobreArreglos14.longitud();
    int i32 = listaSobreArreglos14.longitud();
    listaSobreArreglos11.insertar((java.lang.Object)i32);
    java.lang.String str34 = listaSobreArreglos11.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos35 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str36 = listaSobreArreglos35.toString();
    java.lang.Object obj37 = null;
    boolean b38 = listaSobreArreglos35.equals(obj37);
    listaSobreArreglos35.vaciar();
    int i40 = listaSobreArreglos35.longitud();
    boolean b41 = listaSobreArreglos35.repOk();
    boolean b42 = listaSobreArreglos11.equals((java.lang.Object)b41);
    boolean b43 = listaSobreArreglos0.equals((java.lang.Object)b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[0]"+ "'", str34.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    java.lang.String str19 = listaSobreArreglos0.toString();
    boolean b20 = listaSobreArreglos0.esVacia();
    int i21 = listaSobreArreglos0.longitud();
    int i22 = listaSobreArreglos0.longitud();
    int i23 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    boolean b25 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[]]"+ "'", str19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    java.lang.Object obj18 = null;
    boolean b19 = listaSobreArreglos0.equals(obj18);
    java.lang.String str20 = listaSobreArreglos0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj22 = listaSobreArreglos0.obtener(0);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1.0f);
    listaSobreArreglos0.vaciar();
    java.lang.String str6 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    java.lang.String str12 = listaSobreArreglos8.toString();
    boolean b13 = listaSobreArreglos8.repOk();
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos8.equals(obj14);
    listaSobreArreglos8.vaciar();
    boolean b17 = listaSobreArreglos8.repOk();
    boolean b18 = listaSobreArreglos8.esVacia();
    boolean b20 = listaSobreArreglos8.equals((java.lang.Object)10.0d);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b22 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos23 = new evosuite.listas.ListaSobreArreglos();
    boolean b24 = listaSobreArreglos23.esVacia();
    boolean b26 = listaSobreArreglos23.equals((java.lang.Object)100.0f);
    boolean b28 = listaSobreArreglos23.equals((java.lang.Object)0.0f);
    boolean b29 = listaSobreArreglos23.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos31 = new evosuite.listas.ListaSobreArreglos();
    boolean b32 = listaSobreArreglos31.esVacia();
    boolean b34 = listaSobreArreglos31.equals((java.lang.Object)100.0f);
    boolean b36 = listaSobreArreglos31.equals((java.lang.Object)0.0f);
    boolean b37 = listaSobreArreglos31.repOk();
    listaSobreArreglos23.insertar(0, (java.lang.Object)b37);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos39 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str40 = listaSobreArreglos39.toString();
    boolean b41 = listaSobreArreglos39.esVacia();
    boolean b42 = listaSobreArreglos23.equals((java.lang.Object)listaSobreArreglos39);
    int i43 = listaSobreArreglos23.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos44 = new evosuite.listas.ListaSobreArreglos();
    boolean b45 = listaSobreArreglos44.esVacia();
    boolean b47 = listaSobreArreglos44.equals((java.lang.Object)100.0f);
    boolean b49 = listaSobreArreglos44.equals((java.lang.Object)0.0f);
    boolean b50 = listaSobreArreglos44.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos52 = new evosuite.listas.ListaSobreArreglos();
    int i53 = listaSobreArreglos52.longitud();
    listaSobreArreglos52.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos57 = new evosuite.listas.ListaSobreArreglos();
    boolean b58 = listaSobreArreglos57.esVacia();
    boolean b60 = listaSobreArreglos57.equals((java.lang.Object)100.0f);
    boolean b62 = listaSobreArreglos57.equals((java.lang.Object)0.0f);
    java.lang.String str63 = listaSobreArreglos57.toString();
    int i64 = listaSobreArreglos57.longitud();
    listaSobreArreglos52.insertar((java.lang.Object)i64);
    boolean b66 = listaSobreArreglos52.repOk();
    listaSobreArreglos52.vaciar();
    boolean b68 = listaSobreArreglos52.repOk();
    listaSobreArreglos44.insertar(0, (java.lang.Object)listaSobreArreglos52);
    listaSobreArreglos44.vaciar();
    boolean b71 = listaSobreArreglos44.esVacia();
    boolean b72 = listaSobreArreglos44.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos74 = new evosuite.listas.ListaSobreArreglos();
    boolean b75 = listaSobreArreglos74.esVacia();
    boolean b77 = listaSobreArreglos74.equals((java.lang.Object)100.0f);
    java.lang.String str78 = listaSobreArreglos74.toString();
    boolean b79 = listaSobreArreglos74.repOk();
    java.lang.Object obj80 = null;
    boolean b81 = listaSobreArreglos74.equals(obj80);
    listaSobreArreglos74.vaciar();
    listaSobreArreglos44.insertar(0, (java.lang.Object)listaSobreArreglos74);
    boolean b84 = listaSobreArreglos23.equals((java.lang.Object)listaSobreArreglos74);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[]"+ "'", str63.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "[]"+ "'", str78.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos16);
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    java.lang.Object obj22 = null;
    boolean b23 = listaSobreArreglos0.equals(obj22);
    java.lang.String str24 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    boolean b27 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[true]"+ "'", str24.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)"[[]]");
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    java.lang.String str13 = listaSobreArreglos9.toString();
    boolean b14 = listaSobreArreglos9.repOk();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos9.equals(obj15);
    java.lang.String str17 = listaSobreArreglos9.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    boolean b20 = listaSobreArreglos19.esVacia();
    boolean b21 = listaSobreArreglos19.esVacia();
    boolean b22 = listaSobreArreglos19.repOk();
    listaSobreArreglos9.insertar(0, (java.lang.Object)b22);
    java.lang.String str24 = listaSobreArreglos9.toString();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos9);
    int i26 = listaSobreArreglos9.longitud();
    int i27 = listaSobreArreglos9.longitud();
    java.lang.String str28 = listaSobreArreglos9.toString();
    boolean b29 = listaSobreArreglos9.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[true]"+ "'", str24.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[true]"+ "'", str28.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    java.lang.Object obj11 = null;
    boolean b12 = listaSobreArreglos0.equals(obj11);
    boolean b13 = listaSobreArreglos0.repOk();
    boolean b14 = listaSobreArreglos0.repOk();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos0.equals(obj15);
    listaSobreArreglos0.vaciar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.repOk();
    boolean b7 = listaSobreArreglos0.esVacia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = listaSobreArreglos0.obtener(10);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.equals((java.lang.Object)100.0f);
    boolean b10 = listaSobreArreglos5.equals((java.lang.Object)0.0f);
    java.lang.String str11 = listaSobreArreglos5.toString();
    int i12 = listaSobreArreglos5.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)i12);
    java.lang.String str14 = listaSobreArreglos0.toString();
    boolean b15 = listaSobreArreglos0.esVacia();
    int i16 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    boolean b18 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos17.equals((java.lang.Object)100.0f);
    java.lang.String str21 = listaSobreArreglos17.toString();
    boolean b22 = listaSobreArreglos17.repOk();
    boolean b23 = listaSobreArreglos17.repOk();
    listaSobreArreglos17.vaciar();
    boolean b25 = listaSobreArreglos17.esVacia();
    boolean b26 = listaSobreArreglos17.repOk();
    boolean b27 = listaSobreArreglos17.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos17);
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.eliminar((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[100,0]"+ "'", str14.equals("[100,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    java.lang.String str14 = listaSobreArreglos10.toString();
    boolean b15 = listaSobreArreglos10.repOk();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos10.equals(obj16);
    listaSobreArreglos10.vaciar();
    boolean b19 = listaSobreArreglos10.repOk();
    java.lang.String str20 = listaSobreArreglos10.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str29 = listaSobreArreglos10.toString();
    listaSobreArreglos10.eliminar(0);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos10.eliminar((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[[]]"+ "'", str29.equals("[[]]"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    java.lang.Object obj18 = null;
    boolean b19 = listaSobreArreglos0.equals(obj18);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b23 = listaSobreArreglos20.equals((java.lang.Object)100.0f);
    boolean b24 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos25 = new evosuite.listas.ListaSobreArreglos();
    int i26 = listaSobreArreglos25.longitud();
    listaSobreArreglos25.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos30 = new evosuite.listas.ListaSobreArreglos();
    boolean b31 = listaSobreArreglos30.esVacia();
    boolean b33 = listaSobreArreglos30.equals((java.lang.Object)100.0f);
    boolean b35 = listaSobreArreglos30.equals((java.lang.Object)0.0f);
    java.lang.String str36 = listaSobreArreglos30.toString();
    int i37 = listaSobreArreglos30.longitud();
    listaSobreArreglos25.insertar((java.lang.Object)i37);
    boolean b39 = listaSobreArreglos25.repOk();
    listaSobreArreglos25.insertar(1, (java.lang.Object)(byte)-1);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos43.vaciar();
    boolean b45 = listaSobreArreglos43.repOk();
    boolean b46 = listaSobreArreglos43.repOk();
    boolean b47 = listaSobreArreglos43.esVacia();
    java.lang.String str48 = listaSobreArreglos43.toString();
    boolean b49 = listaSobreArreglos25.equals((java.lang.Object)listaSobreArreglos43);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos25);
    java.lang.Object obj51 = null;
    boolean b52 = listaSobreArreglos25.equals(obj51);
    listaSobreArreglos25.vaciar();
    boolean b54 = listaSobreArreglos25.repOk();
    boolean b55 = listaSobreArreglos25.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    java.lang.String str19 = listaSobreArreglos0.toString();
    boolean b20 = listaSobreArreglos0.esVacia();
    java.lang.Object obj21 = null;
    boolean b22 = listaSobreArreglos0.equals(obj21);
    listaSobreArreglos0.vaciar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[]]"+ "'", str19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos16);
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    java.lang.Object obj22 = null;
    boolean b23 = listaSobreArreglos0.equals(obj22);
    boolean b24 = listaSobreArreglos0.repOk();
    int i25 = listaSobreArreglos0.longitud();
    java.lang.String str26 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[true]"+ "'", str26.equals("[true]"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    int i5 = listaSobreArreglos0.longitud();
    java.lang.String str6 = listaSobreArreglos0.toString();
    int i7 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b10 = listaSobreArreglos8.esVacia();
    java.lang.Object obj11 = null;
    boolean b12 = listaSobreArreglos8.equals(obj11);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b15 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.esVacia();
    boolean b17 = listaSobreArreglos8.equals((java.lang.Object)b16);
    listaSobreArreglos8.vaciar();
    boolean b19 = listaSobreArreglos8.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b22 = listaSobreArreglos20.esVacia();
    boolean b23 = listaSobreArreglos20.repOk();
    listaSobreArreglos20.insertar((java.lang.Object)(byte)-1);
    boolean b26 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos20);
    java.lang.Object obj27 = null;
    boolean b28 = listaSobreArreglos20.equals(obj27);
    boolean b29 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos20);
    listaSobreArreglos20.vaciar();
    int i31 = listaSobreArreglos20.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    listaSobreArreglos19.insertar(0, (java.lang.Object)(short)100);
    int i24 = listaSobreArreglos19.longitud();
    int i25 = listaSobreArreglos19.longitud();
    int i26 = listaSobreArreglos19.longitud();
    listaSobreArreglos12.insertar((java.lang.Object)listaSobreArreglos19);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b31 = listaSobreArreglos28.equals((java.lang.Object)100.0f);
    boolean b33 = listaSobreArreglos28.equals((java.lang.Object)0.0f);
    java.lang.String str34 = listaSobreArreglos28.toString();
    int i35 = listaSobreArreglos28.longitud();
    boolean b36 = listaSobreArreglos28.esVacia();
    int i37 = listaSobreArreglos28.longitud();
    boolean b38 = listaSobreArreglos19.equals((java.lang.Object)i37);
    int i39 = listaSobreArreglos19.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.esVacia();
    int i7 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b10 = listaSobreArreglos0.repOk();
    boolean b11 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1.0f);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos8);
    boolean b11 = listaSobreArreglos8.esVacia();
    boolean b12 = listaSobreArreglos8.esVacia();
    listaSobreArreglos8.vaciar();
    boolean b14 = listaSobreArreglos8.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    int i2 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos6 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos6.vaciar();
    boolean b8 = listaSobreArreglos6.repOk();
    boolean b10 = listaSobreArreglos6.equals((java.lang.Object)1.0f);
    listaSobreArreglos6.vaciar();
    listaSobreArreglos6.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.repOk();
    listaSobreArreglos6.insertar(0, (java.lang.Object)listaSobreArreglos14);
    boolean b17 = listaSobreArreglos14.esVacia();
    int i18 = listaSobreArreglos14.longitud();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)i18);
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    int i5 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    boolean b12 = listaSobreArreglos7.equals((java.lang.Object)0.0f);
    java.lang.String str13 = listaSobreArreglos7.toString();
    int i14 = listaSobreArreglos7.longitud();
    boolean b15 = listaSobreArreglos7.esVacia();
    int i16 = listaSobreArreglos7.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)i16);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj19 = null;
    boolean b20 = listaSobreArreglos0.equals(obj19);
    boolean b21 = listaSobreArreglos0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    boolean b8 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    boolean b15 = listaSobreArreglos10.equals((java.lang.Object)0.0f);
    int i16 = listaSobreArreglos10.longitud();
    boolean b17 = listaSobreArreglos10.esVacia();
    boolean b18 = listaSobreArreglos10.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos19.vaciar();
    boolean b21 = listaSobreArreglos19.repOk();
    boolean b22 = listaSobreArreglos19.repOk();
    int i23 = listaSobreArreglos19.longitud();
    boolean b24 = listaSobreArreglos19.repOk();
    listaSobreArreglos10.insertar((java.lang.Object)b24);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    boolean b27 = listaSobreArreglos10.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    listaSobreArreglos28.insertar((java.lang.Object)100L);
    java.lang.String str32 = listaSobreArreglos28.toString();
    listaSobreArreglos10.insertar((java.lang.Object)listaSobreArreglos28);
    boolean b34 = listaSobreArreglos10.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[100]"+ "'", str32.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar((java.lang.Object)0.0d);
    listaSobreArreglos0.vaciar();
    int i9 = listaSobreArreglos0.longitud();
    int i10 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    boolean b12 = listaSobreArreglos11.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    java.lang.String str17 = listaSobreArreglos13.toString();
    boolean b18 = listaSobreArreglos13.repOk();
    boolean b19 = listaSobreArreglos11.equals((java.lang.Object)b18);
    boolean b20 = listaSobreArreglos11.repOk();
    java.lang.String str21 = listaSobreArreglos11.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    java.lang.Object obj20 = listaSobreArreglos0.obtener(0);
    int i21 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b24 = listaSobreArreglos22.esVacia();
    java.lang.Object obj25 = null;
    boolean b26 = listaSobreArreglos22.equals(obj25);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos27 = new evosuite.listas.ListaSobreArreglos();
    boolean b28 = listaSobreArreglos27.esVacia();
    boolean b29 = listaSobreArreglos27.esVacia();
    boolean b30 = listaSobreArreglos27.esVacia();
    boolean b31 = listaSobreArreglos22.equals((java.lang.Object)b30);
    listaSobreArreglos22.vaciar();
    boolean b33 = listaSobreArreglos22.esVacia();
    java.lang.String str34 = listaSobreArreglos22.toString();
    boolean b35 = listaSobreArreglos0.equals((java.lang.Object)str34);
    java.lang.Object obj37 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.vaciar();
    java.lang.String str39 = listaSobreArreglos0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]"+ "'", str39.equals("[]"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    java.lang.String str19 = listaSobreArreglos0.toString();
    boolean b20 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)100.0f);
    java.lang.String str28 = listaSobreArreglos24.toString();
    boolean b29 = listaSobreArreglos24.repOk();
    boolean b30 = listaSobreArreglos22.equals((java.lang.Object)b29);
    boolean b31 = listaSobreArreglos22.repOk();
    java.lang.String str32 = listaSobreArreglos22.toString();
    boolean b33 = listaSobreArreglos22.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos34.vaciar();
    boolean b36 = listaSobreArreglos34.repOk();
    boolean b37 = listaSobreArreglos34.repOk();
    boolean b38 = listaSobreArreglos22.equals((java.lang.Object)listaSobreArreglos34);
    listaSobreArreglos0.insertar(0, (java.lang.Object)b38);
    listaSobreArreglos0.insertar(0, (java.lang.Object)(byte)10);
    boolean b43 = listaSobreArreglos0.esVacia();
    java.lang.Object obj45 = listaSobreArreglos0.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos46 = new evosuite.listas.ListaSobreArreglos();
    boolean b47 = listaSobreArreglos46.esVacia();
    boolean b49 = listaSobreArreglos46.equals((java.lang.Object)100.0f);
    boolean b51 = listaSobreArreglos46.equals((java.lang.Object)0.0f);
    int i52 = listaSobreArreglos46.longitud();
    boolean b53 = listaSobreArreglos46.esVacia();
    boolean b54 = listaSobreArreglos46.esVacia();
    int i55 = listaSobreArreglos46.longitud();
    boolean b56 = listaSobreArreglos0.equals((java.lang.Object)i55);
    java.lang.String str57 = listaSobreArreglos0.toString();
    java.lang.String str58 = listaSobreArreglos0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[]]"+ "'", str19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte)10+ "'", obj45.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[10,true,[]]"+ "'", str57.equals("[10,true,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[10,true,[]]"+ "'", str58.equals("[10,true,[]]"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.equals((java.lang.Object)100.0f);
    boolean b10 = listaSobreArreglos5.equals((java.lang.Object)0.0f);
    java.lang.String str11 = listaSobreArreglos5.toString();
    int i12 = listaSobreArreglos5.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)i12);
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos0.equals(obj14);
    listaSobreArreglos0.vaciar();
    boolean b17 = listaSobreArreglos0.esVacia();
    boolean b18 = listaSobreArreglos0.repOk();
    boolean b19 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.equals((java.lang.Object)100.0f);
    boolean b10 = listaSobreArreglos5.equals((java.lang.Object)0.0f);
    java.lang.String str11 = listaSobreArreglos5.toString();
    int i12 = listaSobreArreglos5.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)i12);
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos0.equals(obj14);
    int i16 = listaSobreArreglos0.longitud();
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos0.equals(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    int i5 = listaSobreArreglos0.longitud();
    java.lang.String str6 = listaSobreArreglos0.toString();
    int i7 = listaSobreArreglos0.longitud();
    boolean b8 = listaSobreArreglos0.repOk();
    boolean b9 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b3 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.equals((java.lang.Object)100.0f);
    boolean b10 = listaSobreArreglos5.equals((java.lang.Object)0.0f);
    boolean b11 = listaSobreArreglos5.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    boolean b18 = listaSobreArreglos13.equals((java.lang.Object)0.0f);
    boolean b19 = listaSobreArreglos13.repOk();
    listaSobreArreglos5.insertar(0, (java.lang.Object)b19);
    listaSobreArreglos5.vaciar();
    boolean b22 = listaSobreArreglos5.esVacia();
    boolean b23 = listaSobreArreglos5.esVacia();
    int i24 = listaSobreArreglos5.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.String str26 = listaSobreArreglos0.toString();
    boolean b27 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[[]]"+ "'", str26.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.repOk();
    java.lang.String str7 = listaSobreArreglos0.toString();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos0.equals(obj8);
    listaSobreArreglos0.vaciar();
    java.lang.Object obj11 = null;
    boolean b12 = listaSobreArreglos0.equals(obj11);
    int i13 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos16.equals((java.lang.Object)100.0f);
    java.lang.String str20 = listaSobreArreglos16.toString();
    boolean b21 = listaSobreArreglos16.repOk();
    java.lang.Object obj22 = null;
    boolean b23 = listaSobreArreglos16.equals(obj22);
    listaSobreArreglos16.vaciar();
    boolean b25 = listaSobreArreglos16.repOk();
    java.lang.String str26 = listaSobreArreglos16.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    int i29 = listaSobreArreglos28.longitud();
    listaSobreArreglos28.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos28.vaciar();
    listaSobreArreglos16.insertar(0, (java.lang.Object)listaSobreArreglos28);
    java.lang.Object obj36 = listaSobreArreglos16.obtener(0);
    int i37 = listaSobreArreglos16.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos38 = new evosuite.listas.ListaSobreArreglos();
    boolean b39 = listaSobreArreglos38.esVacia();
    boolean b40 = listaSobreArreglos38.esVacia();
    java.lang.Object obj41 = null;
    boolean b42 = listaSobreArreglos38.equals(obj41);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    boolean b44 = listaSobreArreglos43.esVacia();
    boolean b45 = listaSobreArreglos43.esVacia();
    boolean b46 = listaSobreArreglos43.esVacia();
    boolean b47 = listaSobreArreglos38.equals((java.lang.Object)b46);
    listaSobreArreglos38.vaciar();
    boolean b49 = listaSobreArreglos38.esVacia();
    java.lang.String str50 = listaSobreArreglos38.toString();
    boolean b51 = listaSobreArreglos16.equals((java.lang.Object)str50);
    java.lang.Object obj53 = listaSobreArreglos16.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos55 = new evosuite.listas.ListaSobreArreglos();
    boolean b56 = listaSobreArreglos55.esVacia();
    boolean b58 = listaSobreArreglos55.equals((java.lang.Object)100.0f);
    java.lang.String str59 = listaSobreArreglos55.toString();
    boolean b60 = listaSobreArreglos55.repOk();
    java.lang.Object obj61 = null;
    boolean b62 = listaSobreArreglos55.equals(obj61);
    listaSobreArreglos55.vaciar();
    boolean b64 = listaSobreArreglos55.repOk();
    java.lang.String str65 = listaSobreArreglos55.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos67 = new evosuite.listas.ListaSobreArreglos();
    int i68 = listaSobreArreglos67.longitud();
    listaSobreArreglos67.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos67.vaciar();
    listaSobreArreglos55.insertar(0, (java.lang.Object)listaSobreArreglos67);
    java.lang.String str74 = listaSobreArreglos55.toString();
    boolean b75 = listaSobreArreglos55.esVacia();
    listaSobreArreglos55.eliminar(0);
    listaSobreArreglos55.vaciar();
    listaSobreArreglos16.insertar(0, (java.lang.Object)listaSobreArreglos55);
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.insertar((int)(short)1, (java.lang.Object)listaSobreArreglos55);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]"+ "'", str26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[]"+ "'", str59.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "[]"+ "'", str65.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "[[]]"+ "'", str74.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1.0f);
    boolean b5 = listaSobreArreglos0.esVacia();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    boolean b8 = listaSobreArreglos0.esVacia();
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.eliminar((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos16);
    boolean b20 = listaSobreArreglos16.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    java.lang.String str25 = listaSobreArreglos21.toString();
    boolean b26 = listaSobreArreglos21.repOk();
    java.lang.Object obj27 = null;
    boolean b28 = listaSobreArreglos21.equals(obj27);
    listaSobreArreglos21.vaciar();
    boolean b30 = listaSobreArreglos21.repOk();
    java.lang.String str31 = listaSobreArreglos21.toString();
    boolean b32 = listaSobreArreglos16.equals((java.lang.Object)str31);
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos16.equals(obj33);
    boolean b35 = listaSobreArreglos16.repOk();
    listaSobreArreglos16.vaciar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[]"+ "'", str25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]"+ "'", str31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    java.lang.String str14 = listaSobreArreglos10.toString();
    boolean b15 = listaSobreArreglos10.repOk();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos10.equals(obj16);
    listaSobreArreglos10.vaciar();
    boolean b19 = listaSobreArreglos10.repOk();
    java.lang.String str20 = listaSobreArreglos10.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str29 = listaSobreArreglos10.toString();
    listaSobreArreglos10.eliminar(0);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    java.lang.String str33 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos35 = new evosuite.listas.ListaSobreArreglos();
    boolean b36 = listaSobreArreglos35.esVacia();
    boolean b38 = listaSobreArreglos35.equals((java.lang.Object)100.0f);
    boolean b40 = listaSobreArreglos35.equals((java.lang.Object)0.0f);
    boolean b41 = listaSobreArreglos35.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos42 = new evosuite.listas.ListaSobreArreglos();
    boolean b43 = listaSobreArreglos42.esVacia();
    boolean b45 = listaSobreArreglos42.equals((java.lang.Object)100.0f);
    java.lang.String str46 = listaSobreArreglos42.toString();
    boolean b47 = listaSobreArreglos42.repOk();
    boolean b48 = listaSobreArreglos35.equals((java.lang.Object)listaSobreArreglos42);
    boolean b49 = listaSobreArreglos35.repOk();
    java.lang.String str50 = listaSobreArreglos35.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)str50);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos52 = new evosuite.listas.ListaSobreArreglos();
    boolean b53 = listaSobreArreglos52.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos54 = new evosuite.listas.ListaSobreArreglos();
    boolean b55 = listaSobreArreglos54.esVacia();
    boolean b57 = listaSobreArreglos54.equals((java.lang.Object)100.0f);
    java.lang.String str58 = listaSobreArreglos54.toString();
    boolean b59 = listaSobreArreglos54.repOk();
    boolean b60 = listaSobreArreglos52.equals((java.lang.Object)b59);
    listaSobreArreglos52.insertar(0, (java.lang.Object)0L);
    boolean b64 = listaSobreArreglos52.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos65 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos65.vaciar();
    int i67 = listaSobreArreglos65.longitud();
    java.lang.String str68 = listaSobreArreglos65.toString();
    java.lang.String str69 = listaSobreArreglos65.toString();
    boolean b70 = listaSobreArreglos65.esVacia();
    boolean b71 = listaSobreArreglos65.esVacia();
    boolean b72 = listaSobreArreglos52.equals((java.lang.Object)listaSobreArreglos65);
    boolean b73 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos52);
    int i74 = listaSobreArreglos52.longitud();
    java.lang.Object obj75 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos52.insertar(obj75);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[[]]"+ "'", str29.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[[]]"+ "'", str33.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]"+ "'", str46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[]"+ "'", str58.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "[]"+ "'", str68.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]"+ "'", str69.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    java.lang.Object obj18 = null;
    boolean b19 = listaSobreArreglos0.equals(obj18);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b23 = listaSobreArreglos20.equals((java.lang.Object)100.0f);
    boolean b24 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos25 = new evosuite.listas.ListaSobreArreglos();
    int i26 = listaSobreArreglos25.longitud();
    listaSobreArreglos25.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos30 = new evosuite.listas.ListaSobreArreglos();
    boolean b31 = listaSobreArreglos30.esVacia();
    boolean b33 = listaSobreArreglos30.equals((java.lang.Object)100.0f);
    boolean b35 = listaSobreArreglos30.equals((java.lang.Object)0.0f);
    java.lang.String str36 = listaSobreArreglos30.toString();
    int i37 = listaSobreArreglos30.longitud();
    listaSobreArreglos25.insertar((java.lang.Object)i37);
    boolean b39 = listaSobreArreglos25.repOk();
    listaSobreArreglos25.insertar(1, (java.lang.Object)(byte)-1);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos43.vaciar();
    boolean b45 = listaSobreArreglos43.repOk();
    boolean b46 = listaSobreArreglos43.repOk();
    boolean b47 = listaSobreArreglos43.esVacia();
    java.lang.String str48 = listaSobreArreglos43.toString();
    boolean b49 = listaSobreArreglos25.equals((java.lang.Object)listaSobreArreglos43);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos25);
    java.lang.Object obj51 = null;
    boolean b52 = listaSobreArreglos25.equals(obj51);
    listaSobreArreglos25.vaciar();
    boolean b54 = listaSobreArreglos25.repOk();
    int i55 = listaSobreArreglos25.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = listaSobreArreglos0.equals(obj2);
    listaSobreArreglos0.vaciar();
    java.lang.String str5 = listaSobreArreglos0.toString();
    boolean b6 = listaSobreArreglos0.repOk();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = listaSobreArreglos0.obtener(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    int i18 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    int i21 = listaSobreArreglos20.longitud();
    boolean b23 = listaSobreArreglos20.equals((java.lang.Object)(-1));
    java.lang.String str24 = listaSobreArreglos20.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos25 = new evosuite.listas.ListaSobreArreglos();
    boolean b26 = listaSobreArreglos25.esVacia();
    boolean b28 = listaSobreArreglos25.equals((java.lang.Object)100.0f);
    boolean b30 = listaSobreArreglos25.equals((java.lang.Object)0.0f);
    int i31 = listaSobreArreglos25.longitud();
    boolean b32 = listaSobreArreglos25.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str34 = listaSobreArreglos33.toString();
    boolean b35 = listaSobreArreglos33.esVacia();
    boolean b36 = listaSobreArreglos25.equals((java.lang.Object)b35);
    listaSobreArreglos20.insertar((java.lang.Object)b36);
    listaSobreArreglos20.eliminar(0);
    boolean b40 = listaSobreArreglos20.repOk();
    boolean b41 = listaSobreArreglos0.equals((java.lang.Object)b40);
    java.lang.Object obj42 = null;
    boolean b43 = listaSobreArreglos0.equals(obj42);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos44 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str45 = listaSobreArreglos44.toString();
    java.lang.Object obj46 = null;
    boolean b47 = listaSobreArreglos44.equals(obj46);
    listaSobreArreglos44.vaciar();
    int i49 = listaSobreArreglos44.longitud();
    boolean b50 = listaSobreArreglos44.repOk();
    java.lang.String str51 = listaSobreArreglos44.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos52 = new evosuite.listas.ListaSobreArreglos();
    boolean b53 = listaSobreArreglos52.esVacia();
    boolean b55 = listaSobreArreglos52.equals((java.lang.Object)100.0f);
    java.lang.String str56 = listaSobreArreglos52.toString();
    boolean b57 = listaSobreArreglos52.repOk();
    boolean b58 = listaSobreArreglos52.esVacia();
    listaSobreArreglos52.insertar((java.lang.Object)"[[]]");
    evosuite.listas.ListaSobreArreglos listaSobreArreglos61 = new evosuite.listas.ListaSobreArreglos();
    boolean b62 = listaSobreArreglos61.esVacia();
    boolean b63 = listaSobreArreglos61.esVacia();
    boolean b64 = listaSobreArreglos52.equals((java.lang.Object)listaSobreArreglos61);
    boolean b65 = listaSobreArreglos44.equals((java.lang.Object)b64);
    listaSobreArreglos0.insertar((java.lang.Object)b64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]"+ "'", str45.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]"+ "'", str51.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[]"+ "'", str56.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b7 = listaSobreArreglos0.repOk();
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.eliminar((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    boolean b8 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    boolean b15 = listaSobreArreglos10.equals((java.lang.Object)0.0f);
    int i16 = listaSobreArreglos10.longitud();
    boolean b17 = listaSobreArreglos10.esVacia();
    boolean b18 = listaSobreArreglos10.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos19.vaciar();
    boolean b21 = listaSobreArreglos19.repOk();
    boolean b22 = listaSobreArreglos19.repOk();
    int i23 = listaSobreArreglos19.longitud();
    boolean b24 = listaSobreArreglos19.repOk();
    listaSobreArreglos10.insertar((java.lang.Object)b24);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    boolean b27 = listaSobreArreglos10.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b31 = listaSobreArreglos28.equals((java.lang.Object)100.0f);
    java.lang.String str32 = listaSobreArreglos28.toString();
    boolean b33 = listaSobreArreglos28.repOk();
    boolean b34 = listaSobreArreglos28.esVacia();
    listaSobreArreglos28.insertar((java.lang.Object)"[[]]");
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.esVacia();
    boolean b40 = listaSobreArreglos37.equals((java.lang.Object)100.0f);
    java.lang.String str41 = listaSobreArreglos37.toString();
    boolean b42 = listaSobreArreglos37.repOk();
    java.lang.Object obj43 = null;
    boolean b44 = listaSobreArreglos37.equals(obj43);
    java.lang.String str45 = listaSobreArreglos37.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos47 = new evosuite.listas.ListaSobreArreglos();
    boolean b48 = listaSobreArreglos47.esVacia();
    boolean b49 = listaSobreArreglos47.esVacia();
    boolean b50 = listaSobreArreglos47.repOk();
    listaSobreArreglos37.insertar(0, (java.lang.Object)b50);
    java.lang.String str52 = listaSobreArreglos37.toString();
    listaSobreArreglos28.insertar((java.lang.Object)listaSobreArreglos37);
    listaSobreArreglos28.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos55 = new evosuite.listas.ListaSobreArreglos();
    boolean b56 = listaSobreArreglos55.esVacia();
    boolean b57 = listaSobreArreglos55.esVacia();
    java.lang.Object obj58 = null;
    boolean b59 = listaSobreArreglos55.equals(obj58);
    java.lang.String str60 = listaSobreArreglos55.toString();
    listaSobreArreglos55.insertar((java.lang.Object)0.0d);
    java.lang.String str63 = listaSobreArreglos55.toString();
    listaSobreArreglos28.insertar((java.lang.Object)listaSobreArreglos55);
    boolean b65 = listaSobreArreglos10.equals((java.lang.Object)listaSobreArreglos28);
    boolean b66 = listaSobreArreglos28.repOk();
    int i67 = listaSobreArreglos28.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[]"+ "'", str41.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[]"+ "'", str45.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[true]"+ "'", str52.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[]"+ "'", str60.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[0.0]"+ "'", str63.equals("[0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b3 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.esVacia();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
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
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    java.lang.String str14 = listaSobreArreglos10.toString();
    boolean b15 = listaSobreArreglos10.repOk();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos10.equals(obj16);
    listaSobreArreglos10.vaciar();
    boolean b19 = listaSobreArreglos10.repOk();
    java.lang.String str20 = listaSobreArreglos10.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str29 = listaSobreArreglos10.toString();
    listaSobreArreglos10.eliminar(0);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    java.lang.Object obj33 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos10.insertar(obj33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[[]]"+ "'", str29.equals("[[]]"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    boolean b6 = listaSobreArreglos0.esVacia();
    int i7 = listaSobreArreglos0.longitud();
    java.lang.String str8 = listaSobreArreglos0.toString();
    int i9 = listaSobreArreglos0.longitud();
    java.lang.Object obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.insertar(obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    java.lang.String str14 = listaSobreArreglos10.toString();
    boolean b15 = listaSobreArreglos10.repOk();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos10.equals(obj16);
    listaSobreArreglos10.vaciar();
    boolean b19 = listaSobreArreglos10.repOk();
    java.lang.String str20 = listaSobreArreglos10.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str29 = listaSobreArreglos10.toString();
    listaSobreArreglos10.eliminar(0);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    boolean b33 = listaSobreArreglos10.repOk();
    java.lang.String str34 = listaSobreArreglos10.toString();
    listaSobreArreglos10.vaciar();
    int i36 = listaSobreArreglos10.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[[]]"+ "'", str29.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos0.equals(obj8);
    int i10 = listaSobreArreglos0.longitud();
    int i11 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    boolean b16 = listaSobreArreglos15.esVacia();
    boolean b18 = listaSobreArreglos15.equals((java.lang.Object)100.0f);
    java.lang.String str19 = listaSobreArreglos15.toString();
    boolean b20 = listaSobreArreglos15.repOk();
    boolean b21 = listaSobreArreglos13.equals((java.lang.Object)b20);
    boolean b22 = listaSobreArreglos13.repOk();
    java.lang.String str23 = listaSobreArreglos13.toString();
    boolean b24 = listaSobreArreglos13.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos25 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos25.vaciar();
    boolean b27 = listaSobreArreglos25.repOk();
    boolean b29 = listaSobreArreglos25.equals((java.lang.Object)1.0f);
    listaSobreArreglos25.vaciar();
    listaSobreArreglos25.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    boolean b34 = listaSobreArreglos33.repOk();
    listaSobreArreglos25.insertar(0, (java.lang.Object)listaSobreArreglos33);
    boolean b36 = listaSobreArreglos33.esVacia();
    boolean b37 = listaSobreArreglos33.esVacia();
    boolean b38 = listaSobreArreglos33.esVacia();
    listaSobreArreglos13.insertar((java.lang.Object)listaSobreArreglos33);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos40 = new evosuite.listas.ListaSobreArreglos();
    int i41 = listaSobreArreglos40.longitud();
    listaSobreArreglos40.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos45 = new evosuite.listas.ListaSobreArreglos();
    boolean b46 = listaSobreArreglos45.esVacia();
    boolean b48 = listaSobreArreglos45.equals((java.lang.Object)100.0f);
    boolean b50 = listaSobreArreglos45.equals((java.lang.Object)0.0f);
    java.lang.String str51 = listaSobreArreglos45.toString();
    int i52 = listaSobreArreglos45.longitud();
    listaSobreArreglos40.insertar((java.lang.Object)i52);
    boolean b54 = listaSobreArreglos40.repOk();
    listaSobreArreglos40.insertar(1, (java.lang.Object)(byte)-1);
    boolean b58 = listaSobreArreglos40.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos59 = new evosuite.listas.ListaSobreArreglos();
    boolean b60 = listaSobreArreglos59.esVacia();
    boolean b62 = listaSobreArreglos59.equals((java.lang.Object)100.0f);
    java.lang.String str63 = listaSobreArreglos59.toString();
    boolean b64 = listaSobreArreglos59.repOk();
    java.lang.Object obj65 = null;
    boolean b66 = listaSobreArreglos59.equals(obj65);
    java.lang.Object obj67 = null;
    boolean b68 = listaSobreArreglos59.equals(obj67);
    boolean b69 = listaSobreArreglos40.equals(obj67);
    listaSobreArreglos33.insertar((java.lang.Object)b69);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]"+ "'", str19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[]"+ "'", str23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[]"+ "'", str51.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "[]"+ "'", str63.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    boolean b9 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)(-1));
    java.lang.Object obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.insertar(obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos15.vaciar();
    boolean b17 = listaSobreArreglos15.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos18 = new evosuite.listas.ListaSobreArreglos();
    boolean b19 = listaSobreArreglos18.esVacia();
    boolean b21 = listaSobreArreglos18.equals((java.lang.Object)100.0f);
    boolean b23 = listaSobreArreglos18.equals((java.lang.Object)0.0f);
    boolean b24 = listaSobreArreglos18.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos26 = new evosuite.listas.ListaSobreArreglos();
    boolean b27 = listaSobreArreglos26.esVacia();
    boolean b29 = listaSobreArreglos26.equals((java.lang.Object)100.0f);
    boolean b31 = listaSobreArreglos26.equals((java.lang.Object)0.0f);
    boolean b32 = listaSobreArreglos26.repOk();
    listaSobreArreglos18.insertar(0, (java.lang.Object)b32);
    listaSobreArreglos18.vaciar();
    int i35 = listaSobreArreglos18.longitud();
    int i36 = listaSobreArreglos18.longitud();
    listaSobreArreglos15.insertar((java.lang.Object)i36);
    listaSobreArreglos7.insertar(0, (java.lang.Object)listaSobreArreglos15);
    boolean b39 = listaSobreArreglos7.repOk();
    listaSobreArreglos7.vaciar();
    int i41 = listaSobreArreglos7.longitud();
    listaSobreArreglos7.vaciar();
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos7.eliminar((int)(short)1);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos7.equals(obj14);
    boolean b16 = listaSobreArreglos7.repOk();
    listaSobreArreglos7.vaciar();
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos7.eliminar((int)(short)-1);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    java.lang.String str4 = listaSobreArreglos0.toString();
    listaSobreArreglos0.vaciar();
    boolean b6 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    boolean b18 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos17.equals((java.lang.Object)100.0f);
    boolean b22 = listaSobreArreglos17.equals((java.lang.Object)0.0f);
    boolean b23 = listaSobreArreglos17.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos25 = new evosuite.listas.ListaSobreArreglos();
    boolean b26 = listaSobreArreglos25.esVacia();
    boolean b28 = listaSobreArreglos25.equals((java.lang.Object)100.0f);
    boolean b30 = listaSobreArreglos25.equals((java.lang.Object)0.0f);
    boolean b31 = listaSobreArreglos25.repOk();
    listaSobreArreglos17.insertar(0, (java.lang.Object)b31);
    listaSobreArreglos17.vaciar();
    int i34 = listaSobreArreglos17.longitud();
    int i35 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.vaciar();
    boolean b37 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos17);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos38 = new evosuite.listas.ListaSobreArreglos();
    boolean b39 = listaSobreArreglos38.repOk();
    boolean b40 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos38);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos41 = new evosuite.listas.ListaSobreArreglos();
    boolean b42 = listaSobreArreglos41.esVacia();
    boolean b44 = listaSobreArreglos41.equals((java.lang.Object)100.0f);
    boolean b46 = listaSobreArreglos41.equals((java.lang.Object)0.0f);
    boolean b47 = listaSobreArreglos41.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos49 = new evosuite.listas.ListaSobreArreglos();
    boolean b50 = listaSobreArreglos49.esVacia();
    boolean b52 = listaSobreArreglos49.equals((java.lang.Object)100.0f);
    boolean b54 = listaSobreArreglos49.equals((java.lang.Object)0.0f);
    boolean b55 = listaSobreArreglos49.repOk();
    listaSobreArreglos41.insertar(0, (java.lang.Object)b55);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos57 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str58 = listaSobreArreglos57.toString();
    boolean b59 = listaSobreArreglos57.esVacia();
    boolean b60 = listaSobreArreglos41.equals((java.lang.Object)listaSobreArreglos57);
    java.lang.Object obj61 = null;
    boolean b62 = listaSobreArreglos41.equals(obj61);
    java.lang.Object obj63 = null;
    boolean b64 = listaSobreArreglos41.equals(obj63);
    listaSobreArreglos38.insertar((java.lang.Object)b64);
    java.lang.Object obj67 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos38.insertar(10, obj67);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[]"+ "'", str58.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos15.vaciar();
    boolean b17 = listaSobreArreglos15.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos18 = new evosuite.listas.ListaSobreArreglos();
    boolean b19 = listaSobreArreglos18.esVacia();
    boolean b21 = listaSobreArreglos18.equals((java.lang.Object)100.0f);
    boolean b23 = listaSobreArreglos18.equals((java.lang.Object)0.0f);
    boolean b24 = listaSobreArreglos18.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos26 = new evosuite.listas.ListaSobreArreglos();
    boolean b27 = listaSobreArreglos26.esVacia();
    boolean b29 = listaSobreArreglos26.equals((java.lang.Object)100.0f);
    boolean b31 = listaSobreArreglos26.equals((java.lang.Object)0.0f);
    boolean b32 = listaSobreArreglos26.repOk();
    listaSobreArreglos18.insertar(0, (java.lang.Object)b32);
    listaSobreArreglos18.vaciar();
    int i35 = listaSobreArreglos18.longitud();
    int i36 = listaSobreArreglos18.longitud();
    listaSobreArreglos15.insertar((java.lang.Object)i36);
    listaSobreArreglos7.insertar(0, (java.lang.Object)listaSobreArreglos15);
    boolean b39 = listaSobreArreglos7.repOk();
    listaSobreArreglos7.vaciar();
    int i41 = listaSobreArreglos7.longitud();
    listaSobreArreglos7.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    int i44 = listaSobreArreglos43.longitud();
    listaSobreArreglos43.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos48 = new evosuite.listas.ListaSobreArreglos();
    boolean b49 = listaSobreArreglos48.esVacia();
    boolean b51 = listaSobreArreglos48.equals((java.lang.Object)100.0f);
    boolean b53 = listaSobreArreglos48.equals((java.lang.Object)0.0f);
    java.lang.String str54 = listaSobreArreglos48.toString();
    int i55 = listaSobreArreglos48.longitud();
    listaSobreArreglos43.insertar((java.lang.Object)i55);
    java.lang.String str57 = listaSobreArreglos43.toString();
    listaSobreArreglos43.eliminar(0);
    java.lang.String str60 = listaSobreArreglos43.toString();
    boolean b61 = listaSobreArreglos43.esVacia();
    listaSobreArreglos43.vaciar();
    listaSobreArreglos7.insertar((java.lang.Object)listaSobreArreglos43);
    java.lang.Object obj65 = listaSobreArreglos7.obtener(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[]"+ "'", str54.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[100,0]"+ "'", str57.equals("[100,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[]"+ "'", str60.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj65);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    boolean b19 = listaSobreArreglos0.repOk();
    boolean b20 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj24 = listaSobreArreglos0.obtener((int)(byte)0);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj1 = null;
    boolean b2 = listaSobreArreglos0.equals(obj1);
    int i3 = listaSobreArreglos0.longitud();
    boolean b4 = listaSobreArreglos0.esVacia();
    java.lang.String str5 = listaSobreArreglos0.toString();
    boolean b6 = listaSobreArreglos0.repOk();
    java.lang.Object obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos0.insertar(obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.vaciar();
    int i3 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.String str6 = listaSobreArreglos0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    java.lang.String str6 = listaSobreArreglos0.toString();
    int i7 = listaSobreArreglos0.longitud();
    boolean b8 = listaSobreArreglos0.esVacia();
    int i9 = listaSobreArreglos0.longitud();
    int i10 = listaSobreArreglos0.longitud();
    boolean b11 = listaSobreArreglos0.repOk();
    int i12 = listaSobreArreglos0.longitud();
    boolean b13 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b17 = listaSobreArreglos14.equals((java.lang.Object)100.0f);
    boolean b19 = listaSobreArreglos14.equals((java.lang.Object)0.0f);
    boolean b20 = listaSobreArreglos14.esVacia();
    int i21 = listaSobreArreglos14.longitud();
    boolean b22 = listaSobreArreglos14.repOk();
    boolean b23 = listaSobreArreglos0.equals((java.lang.Object)b22);
    boolean b24 = listaSobreArreglos0.esVacia();
    boolean b25 = listaSobreArreglos0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)(-1));
    java.lang.String str4 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.equals((java.lang.Object)100.0f);
    boolean b10 = listaSobreArreglos5.equals((java.lang.Object)0.0f);
    int i11 = listaSobreArreglos5.longitud();
    boolean b12 = listaSobreArreglos5.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str14 = listaSobreArreglos13.toString();
    boolean b15 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos5.equals((java.lang.Object)b15);
    listaSobreArreglos0.insertar((java.lang.Object)b16);
    listaSobreArreglos0.insertar((java.lang.Object)"hi!");
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj23 = listaSobreArreglos0.obtener((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    boolean b9 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj13 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos0.equals(obj14);
    java.lang.Object obj17 = listaSobreArreglos0.obtener(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short)-1+ "'", obj13.equals((short)-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short)-1+ "'", obj17.equals((short)-1));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    java.lang.String str8 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b12 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b13);
    listaSobreArreglos0.eliminar(0);
    int i17 = listaSobreArreglos0.longitud();
    java.lang.String str18 = listaSobreArreglos0.toString();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos21.vaciar();
    boolean b23 = listaSobreArreglos21.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)100.0f);
    boolean b29 = listaSobreArreglos24.equals((java.lang.Object)0.0f);
    boolean b30 = listaSobreArreglos24.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos32 = new evosuite.listas.ListaSobreArreglos();
    boolean b33 = listaSobreArreglos32.esVacia();
    boolean b35 = listaSobreArreglos32.equals((java.lang.Object)100.0f);
    boolean b37 = listaSobreArreglos32.equals((java.lang.Object)0.0f);
    boolean b38 = listaSobreArreglos32.repOk();
    listaSobreArreglos24.insertar(0, (java.lang.Object)b38);
    listaSobreArreglos24.vaciar();
    int i41 = listaSobreArreglos24.longitud();
    int i42 = listaSobreArreglos24.longitud();
    listaSobreArreglos21.insertar((java.lang.Object)i42);
    java.lang.String str44 = listaSobreArreglos21.toString();
    listaSobreArreglos0.insertar((int)(short)0, (java.lang.Object)listaSobreArreglos21);
    int i46 = listaSobreArreglos21.longitud();
    boolean b47 = listaSobreArreglos21.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[0]"+ "'", str44.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    int i5 = listaSobreArreglos0.longitud();
    java.lang.String str6 = listaSobreArreglos0.toString();
    int i7 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b10 = listaSobreArreglos8.esVacia();
    java.lang.Object obj11 = null;
    boolean b12 = listaSobreArreglos8.equals(obj11);
    java.lang.String str13 = listaSobreArreglos8.toString();
    listaSobreArreglos8.insertar((java.lang.Object)0.0d);
    listaSobreArreglos8.vaciar();
    java.lang.String str17 = listaSobreArreglos8.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    boolean b20 = listaSobreArreglos19.esVacia();
    boolean b21 = listaSobreArreglos19.esVacia();
    java.lang.Object obj22 = null;
    boolean b23 = listaSobreArreglos19.equals(obj22);
    java.lang.String str24 = listaSobreArreglos19.toString();
    listaSobreArreglos19.insertar((java.lang.Object)0.0d);
    boolean b27 = listaSobreArreglos19.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b30 = listaSobreArreglos28.esVacia();
    java.lang.Object obj31 = null;
    boolean b32 = listaSobreArreglos28.equals(obj31);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    boolean b34 = listaSobreArreglos33.esVacia();
    boolean b35 = listaSobreArreglos33.esVacia();
    boolean b36 = listaSobreArreglos33.esVacia();
    boolean b37 = listaSobreArreglos28.equals((java.lang.Object)b36);
    listaSobreArreglos28.vaciar();
    boolean b39 = listaSobreArreglos28.esVacia();
    java.lang.String str40 = listaSobreArreglos28.toString();
    listaSobreArreglos19.insertar((java.lang.Object)str40);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos43.vaciar();
    int i45 = listaSobreArreglos43.longitud();
    listaSobreArreglos19.insertar(0, (java.lang.Object)listaSobreArreglos43);
    listaSobreArreglos8.insertar(0, (java.lang.Object)listaSobreArreglos19);
    boolean b48 = listaSobreArreglos19.esVacia();
    java.lang.String str49 = listaSobreArreglos19.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos51 = new evosuite.listas.ListaSobreArreglos();
    boolean b52 = listaSobreArreglos51.esVacia();
    boolean b54 = listaSobreArreglos51.equals((java.lang.Object)100.0f);
    boolean b56 = listaSobreArreglos51.equals((java.lang.Object)0.0f);
    int i57 = listaSobreArreglos51.longitud();
    boolean b58 = listaSobreArreglos51.esVacia();
    boolean b59 = listaSobreArreglos51.esVacia();
    int i60 = listaSobreArreglos51.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos62 = new evosuite.listas.ListaSobreArreglos();
    boolean b63 = listaSobreArreglos62.esVacia();
    boolean b64 = listaSobreArreglos62.esVacia();
    boolean b65 = listaSobreArreglos62.repOk();
    java.lang.String str66 = listaSobreArreglos62.toString();
    listaSobreArreglos62.vaciar();
    boolean b68 = listaSobreArreglos62.esVacia();
    listaSobreArreglos51.insertar(0, (java.lang.Object)b68);
    boolean b70 = listaSobreArreglos51.esVacia();
    java.lang.String str71 = listaSobreArreglos51.toString();
    listaSobreArreglos19.insertar(0, (java.lang.Object)str71);
    boolean b73 = listaSobreArreglos19.esVacia();
    boolean b74 = listaSobreArreglos0.equals((java.lang.Object)b73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]"+ "'", str40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[[],0.0,[]]"+ "'", str49.equals("[[],0.0,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[]"+ "'", str66.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "[true]"+ "'", str71.equals("[true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    java.lang.String str19 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.repOk();
    boolean b22 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos20);
    listaSobreArreglos20.vaciar();
    boolean b24 = listaSobreArreglos20.repOk();
    boolean b25 = listaSobreArreglos20.esVacia();
    int i26 = listaSobreArreglos20.longitud();
    java.lang.String str27 = listaSobreArreglos20.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[]]"+ "'", str19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[]"+ "'", str27.equals("[]"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.repOk();
    java.lang.String str7 = listaSobreArreglos0.toString();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos0.equals(obj8);
    listaSobreArreglos0.vaciar();
    boolean b11 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    boolean b13 = listaSobreArreglos12.esVacia();
    boolean b15 = listaSobreArreglos12.equals((java.lang.Object)100.0f);
    boolean b17 = listaSobreArreglos12.equals((java.lang.Object)0.0f);
    java.lang.String str18 = listaSobreArreglos12.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos20.vaciar();
    int i22 = listaSobreArreglos20.longitud();
    boolean b23 = listaSobreArreglos20.esVacia();
    listaSobreArreglos12.insertar(0, (java.lang.Object)b23);
    int i25 = listaSobreArreglos12.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos27 = new evosuite.listas.ListaSobreArreglos();
    boolean b28 = listaSobreArreglos27.esVacia();
    boolean b29 = listaSobreArreglos27.esVacia();
    java.lang.Object obj30 = null;
    boolean b31 = listaSobreArreglos27.equals(obj30);
    listaSobreArreglos27.vaciar();
    int i33 = listaSobreArreglos27.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos35 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str36 = listaSobreArreglos35.toString();
    listaSobreArreglos27.insertar(0, (java.lang.Object)listaSobreArreglos35);
    java.lang.String str38 = listaSobreArreglos35.toString();
    listaSobreArreglos12.insertar(0, (java.lang.Object)listaSobreArreglos35);
    listaSobreArreglos12.eliminar(0);
    boolean b42 = listaSobreArreglos0.equals((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]"+ "'", str36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]"+ "'", str38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.Object obj10 = null;
    boolean b11 = listaSobreArreglos0.equals(obj10);
    boolean b12 = listaSobreArreglos0.esVacia();
    boolean b13 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b16 = listaSobreArreglos0.repOk();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj18 = listaSobreArreglos0.obtener((int)(short)1);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    java.lang.String str19 = listaSobreArreglos0.toString();
    boolean b20 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)100.0f);
    java.lang.String str28 = listaSobreArreglos24.toString();
    boolean b29 = listaSobreArreglos24.repOk();
    boolean b30 = listaSobreArreglos22.equals((java.lang.Object)b29);
    boolean b31 = listaSobreArreglos22.repOk();
    java.lang.String str32 = listaSobreArreglos22.toString();
    boolean b33 = listaSobreArreglos22.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos34.vaciar();
    boolean b36 = listaSobreArreglos34.repOk();
    boolean b37 = listaSobreArreglos34.repOk();
    boolean b38 = listaSobreArreglos22.equals((java.lang.Object)listaSobreArreglos34);
    listaSobreArreglos0.insertar(0, (java.lang.Object)b38);
    listaSobreArreglos0.insertar(0, (java.lang.Object)(byte)10);
    boolean b43 = listaSobreArreglos0.esVacia();
    java.lang.Object obj45 = listaSobreArreglos0.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos46 = new evosuite.listas.ListaSobreArreglos();
    boolean b47 = listaSobreArreglos46.esVacia();
    boolean b49 = listaSobreArreglos46.equals((java.lang.Object)100.0f);
    boolean b51 = listaSobreArreglos46.equals((java.lang.Object)0.0f);
    int i52 = listaSobreArreglos46.longitud();
    boolean b53 = listaSobreArreglos46.esVacia();
    boolean b54 = listaSobreArreglos46.esVacia();
    int i55 = listaSobreArreglos46.longitud();
    boolean b56 = listaSobreArreglos0.equals((java.lang.Object)i55);
    java.lang.String str57 = listaSobreArreglos0.toString();
    int i58 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos59 = new evosuite.listas.ListaSobreArreglos();
    boolean b60 = listaSobreArreglos59.esVacia();
    boolean b62 = listaSobreArreglos59.equals((java.lang.Object)100.0f);
    boolean b64 = listaSobreArreglos59.equals((java.lang.Object)0.0f);
    boolean b65 = listaSobreArreglos59.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos67 = new evosuite.listas.ListaSobreArreglos();
    boolean b68 = listaSobreArreglos67.esVacia();
    boolean b70 = listaSobreArreglos67.equals((java.lang.Object)100.0f);
    boolean b72 = listaSobreArreglos67.equals((java.lang.Object)0.0f);
    boolean b73 = listaSobreArreglos67.repOk();
    listaSobreArreglos59.insertar(0, (java.lang.Object)b73);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos75 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str76 = listaSobreArreglos75.toString();
    boolean b77 = listaSobreArreglos75.esVacia();
    boolean b78 = listaSobreArreglos59.equals((java.lang.Object)listaSobreArreglos75);
    java.lang.Object obj79 = null;
    boolean b80 = listaSobreArreglos59.equals(obj79);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos81 = new evosuite.listas.ListaSobreArreglos();
    int i82 = listaSobreArreglos81.longitud();
    listaSobreArreglos81.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos81.vaciar();
    listaSobreArreglos59.insertar((java.lang.Object)listaSobreArreglos81);
    boolean b88 = listaSobreArreglos59.esVacia();
    boolean b89 = listaSobreArreglos59.repOk();
    int i90 = listaSobreArreglos59.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)i90);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj93 = listaSobreArreglos0.obtener(4);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[]]"+ "'", str19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte)10+ "'", obj45.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[10,true,[]]"+ "'", str57.equals("[10,true,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "[]"+ "'", str76.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 2);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    java.lang.String str14 = listaSobreArreglos10.toString();
    boolean b15 = listaSobreArreglos10.repOk();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos10.equals(obj16);
    listaSobreArreglos10.vaciar();
    boolean b19 = listaSobreArreglos10.repOk();
    java.lang.String str20 = listaSobreArreglos10.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str29 = listaSobreArreglos10.toString();
    listaSobreArreglos10.eliminar(0);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    boolean b34 = listaSobreArreglos33.esVacia();
    boolean b36 = listaSobreArreglos33.equals((java.lang.Object)100.0f);
    boolean b38 = listaSobreArreglos33.equals((java.lang.Object)0.0f);
    boolean b39 = listaSobreArreglos33.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos40 = new evosuite.listas.ListaSobreArreglos();
    boolean b41 = listaSobreArreglos40.esVacia();
    boolean b43 = listaSobreArreglos40.equals((java.lang.Object)100.0f);
    java.lang.String str44 = listaSobreArreglos40.toString();
    boolean b45 = listaSobreArreglos40.repOk();
    java.lang.Object obj46 = null;
    boolean b47 = listaSobreArreglos40.equals(obj46);
    java.lang.String str48 = listaSobreArreglos40.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos50 = new evosuite.listas.ListaSobreArreglos();
    boolean b51 = listaSobreArreglos50.esVacia();
    boolean b52 = listaSobreArreglos50.esVacia();
    boolean b53 = listaSobreArreglos50.repOk();
    listaSobreArreglos40.insertar(0, (java.lang.Object)b53);
    java.lang.Object obj55 = null;
    boolean b56 = listaSobreArreglos40.equals(obj55);
    boolean b57 = listaSobreArreglos33.equals((java.lang.Object)b56);
    boolean b58 = listaSobreArreglos10.equals((java.lang.Object)listaSobreArreglos33);
    int i59 = listaSobreArreglos10.longitud();
    boolean b60 = listaSobreArreglos10.repOk();
    boolean b61 = listaSobreArreglos10.repOk();
    boolean b62 = listaSobreArreglos10.repOk();
    java.lang.Object obj64 = null;
    // The following exception was thrown during execution in test generation
    try {
    listaSobreArreglos10.insertar(0, obj64);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[[]]"+ "'", str29.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[]"+ "'", str44.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[]"+ "'", str48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    boolean b17 = listaSobreArreglos0.esVacia();
    boolean b18 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos19.vaciar();
    boolean b21 = listaSobreArreglos19.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b25 = listaSobreArreglos22.equals((java.lang.Object)100.0f);
    boolean b27 = listaSobreArreglos22.equals((java.lang.Object)0.0f);
    boolean b28 = listaSobreArreglos22.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos30 = new evosuite.listas.ListaSobreArreglos();
    boolean b31 = listaSobreArreglos30.esVacia();
    boolean b33 = listaSobreArreglos30.equals((java.lang.Object)100.0f);
    boolean b35 = listaSobreArreglos30.equals((java.lang.Object)0.0f);
    boolean b36 = listaSobreArreglos30.repOk();
    listaSobreArreglos22.insertar(0, (java.lang.Object)b36);
    listaSobreArreglos22.vaciar();
    int i39 = listaSobreArreglos22.longitud();
    int i40 = listaSobreArreglos22.longitud();
    listaSobreArreglos19.insertar((java.lang.Object)i40);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos43 = new evosuite.listas.ListaSobreArreglos();
    boolean b44 = listaSobreArreglos43.esVacia();
    boolean b46 = listaSobreArreglos43.equals((java.lang.Object)100.0f);
    java.lang.String str47 = listaSobreArreglos43.toString();
    boolean b48 = listaSobreArreglos43.repOk();
    java.lang.Object obj49 = null;
    boolean b50 = listaSobreArreglos43.equals(obj49);
    listaSobreArreglos43.vaciar();
    boolean b52 = listaSobreArreglos43.repOk();
    java.lang.String str53 = listaSobreArreglos43.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos55 = new evosuite.listas.ListaSobreArreglos();
    int i56 = listaSobreArreglos55.longitud();
    listaSobreArreglos55.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos55.vaciar();
    listaSobreArreglos43.insertar(0, (java.lang.Object)listaSobreArreglos55);
    boolean b62 = listaSobreArreglos43.repOk();
    boolean b63 = listaSobreArreglos43.esVacia();
    java.lang.Object obj65 = listaSobreArreglos43.obtener(0);
    java.lang.Object obj67 = listaSobreArreglos43.obtener(0);
    listaSobreArreglos19.insertar(0, (java.lang.Object)listaSobreArreglos43);
    listaSobreArreglos0.insertar((java.lang.Object)0);
    java.lang.Object obj71 = listaSobreArreglos0.obtener(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]"+ "'", str47.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[]"+ "'", str53.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0+ "'", obj71.equals(0));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos19 = new evosuite.listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    listaSobreArreglos19.insertar(0, (java.lang.Object)(short)100);
    int i24 = listaSobreArreglos19.longitud();
    int i25 = listaSobreArreglos19.longitud();
    int i26 = listaSobreArreglos19.longitud();
    listaSobreArreglos12.insertar((java.lang.Object)listaSobreArreglos19);
    java.lang.String str28 = listaSobreArreglos19.toString();
    boolean b29 = listaSobreArreglos19.repOk();
    java.lang.Object obj30 = null;
    boolean b31 = listaSobreArreglos19.equals(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[100]"+ "'", str28.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)(byte)-1);
    int i6 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    java.lang.String str9 = listaSobreArreglos0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    java.lang.String str19 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos23 = new evosuite.listas.ListaSobreArreglos();
    int i24 = listaSobreArreglos23.longitud();
    listaSobreArreglos23.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b31 = listaSobreArreglos28.equals((java.lang.Object)100.0f);
    boolean b33 = listaSobreArreglos28.equals((java.lang.Object)0.0f);
    java.lang.String str34 = listaSobreArreglos28.toString();
    int i35 = listaSobreArreglos28.longitud();
    listaSobreArreglos23.insertar((java.lang.Object)i35);
    boolean b37 = listaSobreArreglos23.repOk();
    listaSobreArreglos23.insertar(1, (java.lang.Object)(byte)-1);
    boolean b41 = listaSobreArreglos23.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos42 = new evosuite.listas.ListaSobreArreglos();
    boolean b43 = listaSobreArreglos42.esVacia();
    boolean b45 = listaSobreArreglos42.equals((java.lang.Object)100.0f);
    java.lang.String str46 = listaSobreArreglos42.toString();
    boolean b47 = listaSobreArreglos42.repOk();
    java.lang.Object obj48 = null;
    boolean b49 = listaSobreArreglos42.equals(obj48);
    java.lang.Object obj50 = null;
    boolean b51 = listaSobreArreglos42.equals(obj50);
    boolean b52 = listaSobreArreglos23.equals(obj50);
    int i53 = listaSobreArreglos23.longitud();
    boolean b54 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[]]"+ "'", str19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[]"+ "'", str34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]"+ "'", str46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    boolean b14 = listaSobreArreglos0.repOk();
    java.lang.String str15 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos16.equals((java.lang.Object)100.0f);
    boolean b21 = listaSobreArreglos16.equals((java.lang.Object)0.0f);
    boolean b22 = listaSobreArreglos16.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)100.0f);
    boolean b29 = listaSobreArreglos24.equals((java.lang.Object)0.0f);
    boolean b30 = listaSobreArreglos24.repOk();
    listaSobreArreglos16.insertar(0, (java.lang.Object)b30);
    listaSobreArreglos16.vaciar();
    int i33 = listaSobreArreglos16.longitud();
    int i34 = listaSobreArreglos16.longitud();
    listaSobreArreglos16.vaciar();
    listaSobreArreglos16.vaciar();
    listaSobreArreglos16.insertar((java.lang.Object)100L);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos16);
    java.lang.String str40 = listaSobreArreglos0.toString();
    int i41 = listaSobreArreglos0.longitud();
    int i42 = listaSobreArreglos0.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[[100]]"+ "'", str40.equals("[[100]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos8.equals((java.lang.Object)100.0f);
    boolean b13 = listaSobreArreglos8.equals((java.lang.Object)0.0f);
    boolean b14 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b14);
    listaSobreArreglos0.vaciar();
    int i17 = listaSobreArreglos0.longitud();
    int i18 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)100L);
    boolean b23 = listaSobreArreglos0.repOk();
    boolean b24 = listaSobreArreglos0.esVacia();
    boolean b25 = listaSobreArreglos0.repOk();
    boolean b26 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    boolean b6 = listaSobreArreglos0.esVacia();
    int i7 = listaSobreArreglos0.longitud();
    java.lang.String str8 = listaSobreArreglos0.toString();
    boolean b9 = listaSobreArreglos0.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos7);
    listaSobreArreglos7.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    boolean b16 = listaSobreArreglos15.esVacia();
    boolean b17 = listaSobreArreglos7.equals((java.lang.Object)b16);
    int i18 = listaSobreArreglos7.longitud();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj20 = listaSobreArreglos7.obtener(0);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos6 = new evosuite.listas.ListaSobreArreglos();
    boolean b7 = listaSobreArreglos6.esVacia();
    boolean b8 = listaSobreArreglos6.esVacia();
    int i9 = listaSobreArreglos6.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos6);
    int i11 = listaSobreArreglos6.longitud();
    java.lang.String str12 = listaSobreArreglos6.toString();
    java.lang.String str13 = listaSobreArreglos6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1.0f);
    listaSobreArreglos0.vaciar();
    java.lang.String str6 = listaSobreArreglos0.toString();
    java.lang.String str7 = listaSobreArreglos0.toString();
    java.lang.String str8 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str10 = listaSobreArreglos9.toString();
    java.lang.Object obj11 = null;
    boolean b12 = listaSobreArreglos9.equals(obj11);
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos9.equals(obj13);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.esVacia();
    boolean b19 = listaSobreArreglos16.equals((java.lang.Object)100.0f);
    boolean b21 = listaSobreArreglos16.equals((java.lang.Object)0.0f);
    boolean b22 = listaSobreArreglos16.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)100.0f);
    boolean b29 = listaSobreArreglos24.equals((java.lang.Object)0.0f);
    boolean b30 = listaSobreArreglos24.repOk();
    listaSobreArreglos16.insertar(0, (java.lang.Object)b30);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos32 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str33 = listaSobreArreglos32.toString();
    boolean b34 = listaSobreArreglos32.esVacia();
    boolean b35 = listaSobreArreglos16.equals((java.lang.Object)listaSobreArreglos32);
    java.lang.Object obj36 = null;
    boolean b37 = listaSobreArreglos16.equals(obj36);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos38 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj39 = null;
    boolean b40 = listaSobreArreglos38.equals(obj39);
    listaSobreArreglos16.insertar((java.lang.Object)listaSobreArreglos38);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos42 = new evosuite.listas.ListaSobreArreglos();
    int i43 = listaSobreArreglos42.longitud();
    listaSobreArreglos42.insertar(0, (java.lang.Object)(short)100);
    int i47 = listaSobreArreglos42.longitud();
    int i48 = listaSobreArreglos42.longitud();
    int i49 = listaSobreArreglos42.longitud();
    listaSobreArreglos16.insertar((java.lang.Object)i49);
    boolean b51 = listaSobreArreglos16.repOk();
    listaSobreArreglos9.insertar(0, (java.lang.Object)listaSobreArreglos16);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[]"+ "'", str33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar((java.lang.Object)0.0d);
    boolean b8 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b11 = listaSobreArreglos9.esVacia();
    java.lang.Object obj12 = null;
    boolean b13 = listaSobreArreglos9.equals(obj12);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b16 = listaSobreArreglos14.esVacia();
    boolean b17 = listaSobreArreglos14.esVacia();
    boolean b18 = listaSobreArreglos9.equals((java.lang.Object)b17);
    listaSobreArreglos9.vaciar();
    boolean b20 = listaSobreArreglos9.esVacia();
    java.lang.String str21 = listaSobreArreglos9.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str21);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos24.vaciar();
    int i26 = listaSobreArreglos24.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos24);
    int i28 = listaSobreArreglos24.longitud();
    boolean b29 = listaSobreArreglos24.esVacia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    boolean b13 = listaSobreArreglos10.equals((java.lang.Object)100.0f);
    java.lang.String str14 = listaSobreArreglos10.toString();
    boolean b15 = listaSobreArreglos10.repOk();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos10.equals(obj16);
    listaSobreArreglos10.vaciar();
    boolean b19 = listaSobreArreglos10.repOk();
    java.lang.String str20 = listaSobreArreglos10.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str29 = listaSobreArreglos10.toString();
    listaSobreArreglos10.eliminar(0);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos10);
    java.lang.String str33 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos35 = new evosuite.listas.ListaSobreArreglos();
    boolean b36 = listaSobreArreglos35.esVacia();
    boolean b38 = listaSobreArreglos35.equals((java.lang.Object)100.0f);
    boolean b40 = listaSobreArreglos35.equals((java.lang.Object)0.0f);
    boolean b41 = listaSobreArreglos35.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos42 = new evosuite.listas.ListaSobreArreglos();
    boolean b43 = listaSobreArreglos42.esVacia();
    boolean b45 = listaSobreArreglos42.equals((java.lang.Object)100.0f);
    java.lang.String str46 = listaSobreArreglos42.toString();
    boolean b47 = listaSobreArreglos42.repOk();
    boolean b48 = listaSobreArreglos35.equals((java.lang.Object)listaSobreArreglos42);
    boolean b49 = listaSobreArreglos35.repOk();
    java.lang.String str50 = listaSobreArreglos35.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)str50);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos52 = new evosuite.listas.ListaSobreArreglos();
    boolean b53 = listaSobreArreglos52.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos54 = new evosuite.listas.ListaSobreArreglos();
    boolean b55 = listaSobreArreglos54.esVacia();
    boolean b57 = listaSobreArreglos54.equals((java.lang.Object)100.0f);
    java.lang.String str58 = listaSobreArreglos54.toString();
    boolean b59 = listaSobreArreglos54.repOk();
    boolean b60 = listaSobreArreglos52.equals((java.lang.Object)b59);
    listaSobreArreglos52.insertar(0, (java.lang.Object)0L);
    boolean b64 = listaSobreArreglos52.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos65 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos65.vaciar();
    int i67 = listaSobreArreglos65.longitud();
    java.lang.String str68 = listaSobreArreglos65.toString();
    java.lang.String str69 = listaSobreArreglos65.toString();
    boolean b70 = listaSobreArreglos65.esVacia();
    boolean b71 = listaSobreArreglos65.esVacia();
    boolean b72 = listaSobreArreglos52.equals((java.lang.Object)listaSobreArreglos65);
    boolean b73 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos52);
    listaSobreArreglos52.vaciar();
    boolean b75 = listaSobreArreglos52.esVacia();
    listaSobreArreglos52.vaciar();
    boolean b77 = listaSobreArreglos52.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]"+ "'", str20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[[]]"+ "'", str29.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[[]]"+ "'", str33.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[]"+ "'", str46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[]"+ "'", str50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[]"+ "'", str58.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "[]"+ "'", str68.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "[]"+ "'", str69.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b8 = listaSobreArreglos5.equals((java.lang.Object)100.0f);
    boolean b10 = listaSobreArreglos5.equals((java.lang.Object)0.0f);
    java.lang.String str11 = listaSobreArreglos5.toString();
    int i12 = listaSobreArreglos5.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)i12);
    java.lang.String str14 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    java.lang.String str17 = listaSobreArreglos0.toString();
    boolean b18 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    int i20 = listaSobreArreglos0.longitud();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[100,0]"+ "'", str14.equals("[100,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    java.lang.String str10 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos12.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos12);
    java.lang.String str19 = listaSobreArreglos0.toString();
    boolean b20 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)100.0f);
    java.lang.String str28 = listaSobreArreglos24.toString();
    boolean b29 = listaSobreArreglos24.repOk();
    boolean b30 = listaSobreArreglos22.equals((java.lang.Object)b29);
    boolean b31 = listaSobreArreglos22.repOk();
    java.lang.String str32 = listaSobreArreglos22.toString();
    boolean b33 = listaSobreArreglos22.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos34.vaciar();
    boolean b36 = listaSobreArreglos34.repOk();
    boolean b37 = listaSobreArreglos34.repOk();
    boolean b38 = listaSobreArreglos22.equals((java.lang.Object)listaSobreArreglos34);
    listaSobreArreglos0.insertar(0, (java.lang.Object)b38);
    listaSobreArreglos0.insertar(0, (java.lang.Object)(byte)10);
    boolean b43 = listaSobreArreglos0.esVacia();
    java.lang.Object obj45 = listaSobreArreglos0.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos46 = new evosuite.listas.ListaSobreArreglos();
    boolean b47 = listaSobreArreglos46.esVacia();
    boolean b49 = listaSobreArreglos46.equals((java.lang.Object)100.0f);
    boolean b51 = listaSobreArreglos46.equals((java.lang.Object)0.0f);
    int i52 = listaSobreArreglos46.longitud();
    boolean b53 = listaSobreArreglos46.esVacia();
    boolean b54 = listaSobreArreglos46.esVacia();
    int i55 = listaSobreArreglos46.longitud();
    boolean b56 = listaSobreArreglos0.equals((java.lang.Object)i55);
    java.lang.String str57 = listaSobreArreglos0.toString();
    int i58 = listaSobreArreglos0.longitud();
    java.lang.Object obj60 = listaSobreArreglos0.obtener((int)(byte)0);
    boolean b61 = listaSobreArreglos0.repOk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[[]]"+ "'", str19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[]"+ "'", str28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]"+ "'", str32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte)10+ "'", obj45.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[10,true,[]]"+ "'", str57.equals("[10,true,[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (byte)10+ "'", obj60.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

}
