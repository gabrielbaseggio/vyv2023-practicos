package listas;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos0.equals(obj8);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    listaSobreArreglos0.eliminar((int)(byte)0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    boolean b8 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    java.lang.Object obj2 = null;
    listaSobreArreglos0.insertar(obj2);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    listaSobreArreglos0.insertar((java.lang.Object)(-1.0d));
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    boolean b7 = listaSobreArreglos3.equals((java.lang.Object)1);
    boolean b8 = listaSobreArreglos3.esVacia();
    boolean b9 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos3);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar((int)(short)0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    java.lang.String str8 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar((int)(short)0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    listaSobreArreglos0.eliminar((int)(byte)0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)10.0f);
    java.lang.Object obj6 = listaSobreArreglos0.obtener((int)(short)0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.String str11 = listaSobreArreglos5.toString();
    boolean b12 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos5", listaSobreArreglos5.repOk());

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.esVacia();
    java.lang.String str4 = listaSobreArreglos0.toString();
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    int i7 = listaSobreArreglos0.longitud();
    java.lang.String str8 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    int i14 = listaSobreArreglos0.longitud();
    java.lang.Object obj16 = null;
    listaSobreArreglos0.insertar(0, obj16);
    java.lang.Object obj19 = null;
    listaSobreArreglos0.insertar((int)(short)1, obj19);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    listaSobreArreglos0.insertar((java.lang.Object)(-1.0d));
    java.lang.Object obj4 = listaSobreArreglos0.obtener(0);
    int i5 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.vaciar();
    java.lang.String str20 = listaSobreArreglos17.toString();
    listas.ListaSobreArreglos listaSobreArreglos21 = new listas.ListaSobreArreglos();
    int i22 = listaSobreArreglos21.longitud();
    listaSobreArreglos21.vaciar();
    java.lang.String str24 = listaSobreArreglos21.toString();
    boolean b25 = listaSobreArreglos17.equals((java.lang.Object)listaSobreArreglos21);
    listaSobreArreglos0.insertar(1, (java.lang.Object)b25);
    java.lang.Object obj28 = listaSobreArreglos0.obtener(0);
    int i29 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listas.ListaSobreArreglos listaSobreArreglos7 = new listas.ListaSobreArreglos();
    java.lang.String str8 = listaSobreArreglos7.toString();
    boolean b9 = listaSobreArreglos7.esVacia();
    listaSobreArreglos7.insertar((java.lang.Object)(short)-1);
    boolean b12 = listaSobreArreglos7.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos13 = new listas.ListaSobreArreglos();
    int i14 = listaSobreArreglos13.longitud();
    boolean b15 = listaSobreArreglos13.esVacia();
    listaSobreArreglos13.insertar((java.lang.Object)10.0f);
    java.lang.Object obj18 = null;
    listaSobreArreglos13.insertar(obj18);
    listaSobreArreglos7.insertar((java.lang.Object)listaSobreArreglos13);
    int i21 = listaSobreArreglos7.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)i21);
    int i23 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)10.0f);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    listaSobreArreglos0.insertar((java.lang.Object)(-1.0d));
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    boolean b7 = listaSobreArreglos3.equals((java.lang.Object)1);
    boolean b8 = listaSobreArreglos3.esVacia();
    boolean b9 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos3);
    int i10 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos9 = new listas.ListaSobreArreglos();
    java.lang.String str10 = listaSobreArreglos9.toString();
    boolean b11 = listaSobreArreglos9.esVacia();
    listaSobreArreglos9.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos9.equals(obj14);
    boolean b16 = listaSobreArreglos9.esVacia();
    listaSobreArreglos9.vaciar();
    boolean b18 = listaSobreArreglos9.esVacia();
    java.lang.Object obj19 = null;
    boolean b20 = listaSobreArreglos9.equals(obj19);
    boolean b21 = listaSobreArreglos0.equals(obj19);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.String str3 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    listaSobreArreglos4.vaciar();
    java.lang.String str7 = listaSobreArreglos4.toString();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos4);
    listas.ListaSobreArreglos listaSobreArreglos9 = new listas.ListaSobreArreglos();
    int i10 = listaSobreArreglos9.longitud();
    boolean b11 = listaSobreArreglos9.esVacia();
    boolean b13 = listaSobreArreglos9.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos14 = new listas.ListaSobreArreglos();
    java.lang.String str15 = listaSobreArreglos14.toString();
    boolean b16 = listaSobreArreglos14.esVacia();
    listaSobreArreglos14.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos9.insertar((java.lang.Object)listaSobreArreglos14);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos14);
    boolean b21 = listaSobreArreglos14.esVacia();
    listaSobreArreglos14.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos14", listaSobreArreglos14.repOk());

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    listaSobreArreglos8.vaciar();
    java.lang.String str11 = listaSobreArreglos8.toString();
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.vaciar();
    java.lang.String str15 = listaSobreArreglos12.toString();
    boolean b16 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos12);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b21 = listaSobreArreglos17.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos22);
    boolean b29 = listaSobreArreglos22.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos22.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos22", listaSobreArreglos22.repOk());

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)10.0f);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    java.lang.String str7 = listaSobreArreglos0.toString();
    int i8 = listaSobreArreglos0.longitud();
    java.lang.String str9 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    int i14 = listaSobreArreglos0.longitud();
    java.lang.Object obj16 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    java.lang.Object obj15 = null;
    listaSobreArreglos0.insertar(0, obj15);
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos0.equals(obj17);
    boolean b19 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.Object obj9 = null;
    listaSobreArreglos0.insertar(obj9);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    java.lang.Object obj8 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj9 = null;
    listaSobreArreglos0.insertar(obj9);
    listas.ListaSobreArreglos listaSobreArreglos11 = new listas.ListaSobreArreglos();
    int i12 = listaSobreArreglos11.longitud();
    boolean b13 = listaSobreArreglos11.esVacia();
    boolean b15 = listaSobreArreglos11.equals((java.lang.Object)1);
    listaSobreArreglos11.insertar(0, (java.lang.Object)10.0d);
    boolean b19 = listaSobreArreglos11.esVacia();
    java.lang.String str20 = listaSobreArreglos11.toString();
    java.lang.Object obj22 = listaSobreArreglos11.obtener(0);
    boolean b23 = listaSobreArreglos11.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos24 = new listas.ListaSobreArreglos();
    int i25 = listaSobreArreglos24.longitud();
    boolean b26 = listaSobreArreglos24.esVacia();
    listaSobreArreglos24.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos29 = new listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    listaSobreArreglos29.insertar((java.lang.Object)(short)-1);
    boolean b34 = listaSobreArreglos29.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos35 = new listas.ListaSobreArreglos();
    int i36 = listaSobreArreglos35.longitud();
    boolean b37 = listaSobreArreglos35.esVacia();
    listaSobreArreglos35.insertar((java.lang.Object)10.0f);
    java.lang.Object obj40 = null;
    listaSobreArreglos35.insertar(obj40);
    listaSobreArreglos29.insertar((java.lang.Object)listaSobreArreglos35);
    int i43 = listaSobreArreglos29.longitud();
    listaSobreArreglos24.insertar((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj45 = null;
    listaSobreArreglos29.insertar(obj45);
    boolean b47 = listaSobreArreglos29.esVacia();
    boolean b48 = listaSobreArreglos11.equals((java.lang.Object)listaSobreArreglos29);
    boolean b49 = listaSobreArreglos0.equals((java.lang.Object)b48);
    java.lang.Object obj51 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj52 = null;
    listaSobreArreglos0.insertar(obj52);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.esVacia();
    java.lang.String str4 = listaSobreArreglos0.toString();
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    java.lang.Object obj2 = null;
    listaSobreArreglos0.insertar(obj2);
    java.lang.String str4 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.String str3 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    listaSobreArreglos4.vaciar();
    java.lang.String str7 = listaSobreArreglos4.toString();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos4);
    listas.ListaSobreArreglos listaSobreArreglos9 = new listas.ListaSobreArreglos();
    int i10 = listaSobreArreglos9.longitud();
    boolean b11 = listaSobreArreglos9.esVacia();
    boolean b13 = listaSobreArreglos9.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos14 = new listas.ListaSobreArreglos();
    java.lang.String str15 = listaSobreArreglos14.toString();
    boolean b16 = listaSobreArreglos14.esVacia();
    listaSobreArreglos14.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos9.insertar((java.lang.Object)listaSobreArreglos14);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos14);
    java.lang.String str21 = listaSobreArreglos0.toString();
    java.lang.Object obj23 = null;
    listaSobreArreglos0.insertar(0, obj23);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj4 = null;
    listaSobreArreglos0.insertar(0, obj4);
    java.lang.Object obj6 = null;
    listaSobreArreglos0.insertar(obj6);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.Object obj11 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listas.ListaSobreArreglos listaSobreArreglos7 = new listas.ListaSobreArreglos();
    int i8 = listaSobreArreglos7.longitud();
    boolean b9 = listaSobreArreglos7.esVacia();
    listaSobreArreglos7.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos7);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.String str3 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    listaSobreArreglos4.vaciar();
    java.lang.String str7 = listaSobreArreglos4.toString();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos4);
    listas.ListaSobreArreglos listaSobreArreglos9 = new listas.ListaSobreArreglos();
    int i10 = listaSobreArreglos9.longitud();
    boolean b11 = listaSobreArreglos9.esVacia();
    boolean b13 = listaSobreArreglos9.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos14 = new listas.ListaSobreArreglos();
    java.lang.String str15 = listaSobreArreglos14.toString();
    boolean b16 = listaSobreArreglos14.esVacia();
    listaSobreArreglos14.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos9.insertar((java.lang.Object)listaSobreArreglos14);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos14);
    listaSobreArreglos0.insertar((java.lang.Object)10L);
    java.lang.Object obj23 = null;
    boolean b24 = listaSobreArreglos0.equals(obj23);
    java.lang.Object obj26 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos3.obtener(0);
    java.lang.String str13 = listaSobreArreglos3.toString();
    listaSobreArreglos3.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos3", listaSobreArreglos3.repOk());

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    java.lang.String str9 = listaSobreArreglos8.toString();
    boolean b10 = listaSobreArreglos8.esVacia();
    java.lang.Object obj12 = null;
    listaSobreArreglos8.insertar(0, obj12);
    listaSobreArreglos8.insertar((java.lang.Object)1.0f);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos8);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    java.lang.String str18 = listaSobreArreglos17.toString();
    java.lang.String str19 = listaSobreArreglos17.toString();
    listas.ListaSobreArreglos listaSobreArreglos20 = new listas.ListaSobreArreglos();
    int i21 = listaSobreArreglos20.longitud();
    boolean b22 = listaSobreArreglos20.esVacia();
    listaSobreArreglos20.insertar((java.lang.Object)10.0f);
    java.lang.Object obj25 = null;
    listaSobreArreglos20.insertar(obj25);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos20);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos20);
    listaSobreArreglos8.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos8", listaSobreArreglos8.repOk());

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    int i14 = listaSobreArreglos0.longitud();
    java.lang.Object obj16 = null;
    listaSobreArreglos0.insertar(0, obj16);
    listaSobreArreglos0.vaciar();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    java.lang.String str20 = listaSobreArreglos19.toString();
    java.lang.String str21 = listaSobreArreglos19.toString();
    listaSobreArreglos19.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos19);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    java.lang.Object obj15 = null;
    listaSobreArreglos6.insertar(0, obj15);
    listaSobreArreglos6.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos6", listaSobreArreglos6.repOk());

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    boolean b10 = listaSobreArreglos5.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos11 = new listas.ListaSobreArreglos();
    int i12 = listaSobreArreglos11.longitud();
    boolean b13 = listaSobreArreglos11.esVacia();
    listaSobreArreglos11.insertar((java.lang.Object)10.0f);
    java.lang.Object obj16 = null;
    listaSobreArreglos11.insertar(obj16);
    listaSobreArreglos5.insertar((java.lang.Object)listaSobreArreglos11);
    int i19 = listaSobreArreglos5.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj22 = listaSobreArreglos5.obtener(0);
    int i23 = listaSobreArreglos5.longitud();
    listaSobreArreglos5.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos5", listaSobreArreglos5.repOk());

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    int i7 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    int i14 = listaSobreArreglos0.longitud();
    listas.ListaSobreArreglos listaSobreArreglos15 = new listas.ListaSobreArreglos();
    boolean b16 = listaSobreArreglos15.esVacia();
    boolean b17 = listaSobreArreglos15.esVacia();
    boolean b18 = listaSobreArreglos15.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    boolean b21 = listaSobreArreglos19.esVacia();
    boolean b23 = listaSobreArreglos19.equals((java.lang.Object)1);
    listaSobreArreglos19.insertar(0, (java.lang.Object)10.0d);
    boolean b27 = listaSobreArreglos19.esVacia();
    java.lang.String str28 = listaSobreArreglos19.toString();
    java.lang.Object obj30 = listaSobreArreglos19.obtener(0);
    listaSobreArreglos15.insertar(obj30);
    boolean b32 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos15);
    listaSobreArreglos15.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos15", listaSobreArreglos15.repOk());

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    listaSobreArreglos0.insertar((java.lang.Object)(-1.0d));
    java.lang.Object obj4 = listaSobreArreglos0.obtener(0);
    int i5 = listaSobreArreglos0.longitud();
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    java.lang.Object obj9 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj12 = listaSobreArreglos5.obtener(0);
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos5.equals(obj13);
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    java.lang.String str18 = listaSobreArreglos16.toString();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    boolean b21 = listaSobreArreglos19.esVacia();
    listaSobreArreglos19.insertar((java.lang.Object)10.0f);
    java.lang.Object obj24 = null;
    listaSobreArreglos19.insertar(obj24);
    listaSobreArreglos16.insertar((java.lang.Object)listaSobreArreglos19);
    java.lang.Object obj28 = listaSobreArreglos16.obtener(0);
    java.lang.Object obj30 = null;
    listaSobreArreglos16.insertar(0, obj30);
    java.lang.String str32 = listaSobreArreglos16.toString();
    listaSobreArreglos5.insertar((int)(byte)1, (java.lang.Object)listaSobreArreglos16);
    listas.ListaSobreArreglos listaSobreArreglos35 = new listas.ListaSobreArreglos();
    listaSobreArreglos35.insertar((java.lang.Object)(-1.0d));
    java.lang.Object obj39 = listaSobreArreglos35.obtener(0);
    listaSobreArreglos35.vaciar();
    listaSobreArreglos5.insertar(0, (java.lang.Object)listaSobreArreglos35);
    listaSobreArreglos5.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos5", listaSobreArreglos5.repOk());

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)10.0f);
    int i5 = listaSobreArreglos0.longitud();
    java.lang.String str6 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)10.0f);
    int i5 = listaSobreArreglos0.longitud();
    int i6 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    boolean b6 = listaSobreArreglos0.esVacia();
    boolean b7 = listaSobreArreglos0.esVacia();
    int i8 = listaSobreArreglos0.longitud();
    boolean b9 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos10 = new listas.ListaSobreArreglos();
    boolean b11 = listaSobreArreglos10.esVacia();
    java.lang.Object obj12 = null;
    listaSobreArreglos10.insertar(obj12);
    listaSobreArreglos10.insertar((java.lang.Object)"");
    boolean b16 = listaSobreArreglos10.esVacia();
    boolean b17 = listaSobreArreglos0.equals((java.lang.Object)b16);
    boolean b18 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    listaSobreArreglos8.vaciar();
    java.lang.String str11 = listaSobreArreglos8.toString();
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.vaciar();
    java.lang.String str15 = listaSobreArreglos12.toString();
    boolean b16 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos12);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b21 = listaSobreArreglos17.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos22);
    boolean b29 = listaSobreArreglos22.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str31 = listaSobreArreglos22.toString();
    java.lang.Object obj32 = null;
    listaSobreArreglos22.insertar(obj32);
    listaSobreArreglos22.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos22", listaSobreArreglos22.repOk());

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.esVacia();
    java.lang.Object obj10 = null;
    boolean b11 = listaSobreArreglos0.equals(obj10);
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    java.lang.String str13 = listaSobreArreglos12.toString();
    boolean b14 = listaSobreArreglos12.esVacia();
    listaSobreArreglos12.insertar((java.lang.Object)(short)-1);
    boolean b17 = listaSobreArreglos12.esVacia();
    boolean b18 = listaSobreArreglos12.esVacia();
    boolean b19 = listaSobreArreglos12.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos20 = new listas.ListaSobreArreglos();
    java.lang.String str21 = listaSobreArreglos20.toString();
    boolean b22 = listaSobreArreglos20.esVacia();
    listaSobreArreglos20.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj25 = null;
    boolean b26 = listaSobreArreglos20.equals(obj25);
    boolean b27 = listaSobreArreglos20.esVacia();
    java.lang.Object obj28 = null;
    boolean b29 = listaSobreArreglos20.equals(obj28);
    listaSobreArreglos12.insertar((java.lang.Object)listaSobreArreglos20);
    boolean b31 = listaSobreArreglos20.esVacia();
    java.lang.Object obj32 = null;
    boolean b33 = listaSobreArreglos20.equals(obj32);
    listaSobreArreglos0.insertar(obj32);
    java.lang.Object obj35 = null;
    listaSobreArreglos0.insertar(obj35);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    boolean b6 = listaSobreArreglos0.esVacia();
    boolean b7 = listaSobreArreglos0.esVacia();
    int i8 = listaSobreArreglos0.longitud();
    java.lang.Object obj10 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    java.lang.Object obj8 = null;
    listaSobreArreglos0.insertar(obj8);
    int i10 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.vaciar();
    java.lang.String str20 = listaSobreArreglos17.toString();
    listas.ListaSobreArreglos listaSobreArreglos21 = new listas.ListaSobreArreglos();
    int i22 = listaSobreArreglos21.longitud();
    listaSobreArreglos21.vaciar();
    java.lang.String str24 = listaSobreArreglos21.toString();
    boolean b25 = listaSobreArreglos17.equals((java.lang.Object)listaSobreArreglos21);
    listaSobreArreglos0.insertar(1, (java.lang.Object)b25);
    boolean b27 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar((int)(short)0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b5 = listaSobreArreglos0.esVacia();
    java.lang.Object obj7 = null;
    listaSobreArreglos0.insertar((int)(short)0, obj7);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    listaSobreArreglos8.vaciar();
    java.lang.String str11 = listaSobreArreglos8.toString();
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.vaciar();
    java.lang.String str15 = listaSobreArreglos12.toString();
    boolean b16 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos12);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b21 = listaSobreArreglos17.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos22);
    boolean b29 = listaSobreArreglos22.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos22);
    boolean b31 = listaSobreArreglos22.esVacia();
    boolean b32 = listaSobreArreglos22.esVacia();
    int i33 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos22", listaSobreArreglos22.repOk());

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    java.lang.Object obj8 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj9 = null;
    listaSobreArreglos0.insertar(obj9);
    listas.ListaSobreArreglos listaSobreArreglos11 = new listas.ListaSobreArreglos();
    int i12 = listaSobreArreglos11.longitud();
    boolean b13 = listaSobreArreglos11.esVacia();
    boolean b15 = listaSobreArreglos11.equals((java.lang.Object)1);
    listaSobreArreglos11.insertar(0, (java.lang.Object)10.0d);
    boolean b19 = listaSobreArreglos11.esVacia();
    java.lang.String str20 = listaSobreArreglos11.toString();
    java.lang.Object obj22 = listaSobreArreglos11.obtener(0);
    boolean b23 = listaSobreArreglos11.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos24 = new listas.ListaSobreArreglos();
    int i25 = listaSobreArreglos24.longitud();
    boolean b26 = listaSobreArreglos24.esVacia();
    listaSobreArreglos24.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos29 = new listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    listaSobreArreglos29.insertar((java.lang.Object)(short)-1);
    boolean b34 = listaSobreArreglos29.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos35 = new listas.ListaSobreArreglos();
    int i36 = listaSobreArreglos35.longitud();
    boolean b37 = listaSobreArreglos35.esVacia();
    listaSobreArreglos35.insertar((java.lang.Object)10.0f);
    java.lang.Object obj40 = null;
    listaSobreArreglos35.insertar(obj40);
    listaSobreArreglos29.insertar((java.lang.Object)listaSobreArreglos35);
    int i43 = listaSobreArreglos29.longitud();
    listaSobreArreglos24.insertar((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj45 = null;
    listaSobreArreglos29.insertar(obj45);
    boolean b47 = listaSobreArreglos29.esVacia();
    boolean b48 = listaSobreArreglos11.equals((java.lang.Object)listaSobreArreglos29);
    boolean b49 = listaSobreArreglos0.equals((java.lang.Object)b48);
    java.lang.Object obj51 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj4 = null;
    boolean b5 = listaSobreArreglos0.equals(obj4);
    boolean b6 = listaSobreArreglos0.esVacia();
    java.lang.Object obj7 = null;
    listaSobreArreglos0.insertar(obj7);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.String str3 = listaSobreArreglos0.toString();
    java.lang.Object obj4 = null;
    boolean b5 = listaSobreArreglos0.equals(obj4);
    listas.ListaSobreArreglos listaSobreArreglos7 = new listas.ListaSobreArreglos();
    java.lang.String str8 = listaSobreArreglos7.toString();
    boolean b9 = listaSobreArreglos7.esVacia();
    listaSobreArreglos7.insertar((java.lang.Object)(short)-1);
    boolean b12 = listaSobreArreglos7.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos13 = new listas.ListaSobreArreglos();
    int i14 = listaSobreArreglos13.longitud();
    boolean b15 = listaSobreArreglos13.esVacia();
    listaSobreArreglos13.insertar((java.lang.Object)10.0f);
    java.lang.Object obj18 = null;
    listaSobreArreglos13.insertar(obj18);
    listaSobreArreglos7.insertar((java.lang.Object)listaSobreArreglos13);
    int i21 = listaSobreArreglos7.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)i21);
    int i23 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.esVacia();
    java.lang.Object obj10 = null;
    boolean b11 = listaSobreArreglos0.equals(obj10);
    java.lang.Object obj12 = null;
    listaSobreArreglos0.insertar(obj12);
    listas.ListaSobreArreglos listaSobreArreglos14 = new listas.ListaSobreArreglos();
    java.lang.String str15 = listaSobreArreglos14.toString();
    boolean b16 = listaSobreArreglos14.esVacia();
    java.lang.Object obj18 = null;
    listaSobreArreglos14.insertar(0, obj18);
    java.lang.Object obj20 = null;
    listaSobreArreglos14.insertar(obj20);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos14);
    int i23 = listaSobreArreglos0.longitud();
    java.lang.Object obj24 = null;
    boolean b25 = listaSobreArreglos0.equals(obj24);
    listas.ListaSobreArreglos listaSobreArreglos26 = new listas.ListaSobreArreglos();
    int i27 = listaSobreArreglos26.longitud();
    listaSobreArreglos26.vaciar();
    java.lang.String str29 = listaSobreArreglos26.toString();
    listas.ListaSobreArreglos listaSobreArreglos30 = new listas.ListaSobreArreglos();
    int i31 = listaSobreArreglos30.longitud();
    listaSobreArreglos30.vaciar();
    java.lang.String str33 = listaSobreArreglos30.toString();
    boolean b34 = listaSobreArreglos26.equals((java.lang.Object)listaSobreArreglos30);
    listaSobreArreglos26.vaciar();
    java.lang.Object obj36 = null;
    listaSobreArreglos26.insertar(obj36);
    listas.ListaSobreArreglos listaSobreArreglos38 = new listas.ListaSobreArreglos();
    int i39 = listaSobreArreglos38.longitud();
    java.lang.Object obj41 = null;
    listaSobreArreglos38.insertar(0, obj41);
    listas.ListaSobreArreglos listaSobreArreglos43 = new listas.ListaSobreArreglos();
    listaSobreArreglos43.insertar((java.lang.Object)(-1.0d));
    java.lang.Object obj47 = listaSobreArreglos43.obtener(0);
    listaSobreArreglos43.vaciar();
    java.lang.String str49 = listaSobreArreglos43.toString();
    boolean b50 = listaSobreArreglos38.equals((java.lang.Object)listaSobreArreglos43);
    listaSobreArreglos26.insertar((java.lang.Object)listaSobreArreglos38);
    boolean b52 = listaSobreArreglos26.esVacia();
    boolean b53 = listaSobreArreglos0.equals((java.lang.Object)b52);
    int i54 = listaSobreArreglos0.longitud();
    java.lang.Object obj55 = null;
    boolean b56 = listaSobreArreglos0.equals(obj55);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.vaciar();
    java.lang.String str20 = listaSobreArreglos17.toString();
    listas.ListaSobreArreglos listaSobreArreglos21 = new listas.ListaSobreArreglos();
    int i22 = listaSobreArreglos21.longitud();
    listaSobreArreglos21.vaciar();
    java.lang.String str24 = listaSobreArreglos21.toString();
    boolean b25 = listaSobreArreglos17.equals((java.lang.Object)listaSobreArreglos21);
    listaSobreArreglos0.insertar(1, (java.lang.Object)b25);
    java.lang.Object obj28 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    boolean b9 = listaSobreArreglos0.equals((java.lang.Object)(byte)100);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    java.lang.Object obj15 = null;
    listaSobreArreglos0.insertar(0, obj15);
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos0.equals(obj17);
    int i19 = listaSobreArreglos0.longitud();
    java.lang.Object obj21 = listaSobreArreglos0.obtener(0);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    int i14 = listaSobreArreglos0.longitud();
    java.lang.Object obj16 = null;
    listaSobreArreglos0.insertar(0, obj16);
    java.lang.Object obj19 = null;
    listaSobreArreglos0.insertar((int)(short)1, obj19);
    boolean b21 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj27 = null;
    boolean b28 = listaSobreArreglos22.equals(obj27);
    boolean b29 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.vaciar();
    boolean b31 = listaSobreArreglos22.esVacia();
    java.lang.Object obj32 = null;
    boolean b33 = listaSobreArreglos22.equals(obj32);
    java.lang.Object obj34 = null;
    listaSobreArreglos22.insertar(obj34);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos22.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos22", listaSobreArreglos22.repOk());

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    java.lang.String str18 = listaSobreArreglos16.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str18);
    java.lang.Object obj20 = null;
    listaSobreArreglos0.insertar(obj20);
    int i22 = listaSobreArreglos0.longitud();
    java.lang.String str23 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.esVacia();
    java.lang.String str4 = listaSobreArreglos0.toString();
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    int i7 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(-1.0d));
    java.lang.Object obj11 = null;
    listaSobreArreglos0.insertar(0, obj11);
    int i13 = listaSobreArreglos0.longitud();
    int i14 = listaSobreArreglos0.longitud();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos0.equals(obj15);
    java.lang.Object obj18 = null;
    listaSobreArreglos0.insertar(3, obj18);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj12 = listaSobreArreglos5.obtener(0);
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos5.equals(obj13);
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    java.lang.String str18 = listaSobreArreglos16.toString();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    boolean b21 = listaSobreArreglos19.esVacia();
    listaSobreArreglos19.insertar((java.lang.Object)10.0f);
    java.lang.Object obj24 = null;
    listaSobreArreglos19.insertar(obj24);
    listaSobreArreglos16.insertar((java.lang.Object)listaSobreArreglos19);
    java.lang.Object obj28 = listaSobreArreglos16.obtener(0);
    java.lang.Object obj30 = null;
    listaSobreArreglos16.insertar(0, obj30);
    java.lang.String str32 = listaSobreArreglos16.toString();
    listaSobreArreglos5.insertar((int)(byte)1, (java.lang.Object)listaSobreArreglos16);
    listaSobreArreglos16.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos16", listaSobreArreglos16.repOk());

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj12 = listaSobreArreglos5.obtener(0);
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos5.equals(obj13);
    listas.ListaSobreArreglos listaSobreArreglos15 = new listas.ListaSobreArreglos();
    int i16 = listaSobreArreglos15.longitud();
    boolean b17 = listaSobreArreglos15.esVacia();
    boolean b19 = listaSobreArreglos15.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos20 = new listas.ListaSobreArreglos();
    java.lang.String str21 = listaSobreArreglos20.toString();
    boolean b22 = listaSobreArreglos20.esVacia();
    listaSobreArreglos20.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos15.insertar((java.lang.Object)listaSobreArreglos20);
    java.lang.Object obj27 = listaSobreArreglos20.obtener(0);
    java.lang.Object obj28 = null;
    boolean b29 = listaSobreArreglos20.equals(obj28);
    listas.ListaSobreArreglos listaSobreArreglos31 = new listas.ListaSobreArreglos();
    java.lang.String str32 = listaSobreArreglos31.toString();
    java.lang.String str33 = listaSobreArreglos31.toString();
    listas.ListaSobreArreglos listaSobreArreglos34 = new listas.ListaSobreArreglos();
    int i35 = listaSobreArreglos34.longitud();
    boolean b36 = listaSobreArreglos34.esVacia();
    listaSobreArreglos34.insertar((java.lang.Object)10.0f);
    java.lang.Object obj39 = null;
    listaSobreArreglos34.insertar(obj39);
    listaSobreArreglos31.insertar((java.lang.Object)listaSobreArreglos34);
    java.lang.Object obj43 = listaSobreArreglos31.obtener(0);
    java.lang.Object obj45 = null;
    listaSobreArreglos31.insertar(0, obj45);
    java.lang.String str47 = listaSobreArreglos31.toString();
    listaSobreArreglos20.insertar((int)(byte)1, (java.lang.Object)listaSobreArreglos31);
    listaSobreArreglos5.insertar((java.lang.Object)listaSobreArreglos20);
    listaSobreArreglos5.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos5", listaSobreArreglos5.repOk());

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj12 = listaSobreArreglos5.obtener(0);
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos5.equals(obj13);
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    java.lang.String str18 = listaSobreArreglos16.toString();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    boolean b21 = listaSobreArreglos19.esVacia();
    listaSobreArreglos19.insertar((java.lang.Object)10.0f);
    java.lang.Object obj24 = null;
    listaSobreArreglos19.insertar(obj24);
    listaSobreArreglos16.insertar((java.lang.Object)listaSobreArreglos19);
    java.lang.Object obj28 = listaSobreArreglos16.obtener(0);
    java.lang.Object obj30 = null;
    listaSobreArreglos16.insertar(0, obj30);
    java.lang.String str32 = listaSobreArreglos16.toString();
    listaSobreArreglos5.insertar((int)(byte)1, (java.lang.Object)listaSobreArreglos16);
    listaSobreArreglos5.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos5", listaSobreArreglos5.repOk());

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.String str3 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    listaSobreArreglos4.vaciar();
    java.lang.String str7 = listaSobreArreglos4.toString();
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    listaSobreArreglos8.vaciar();
    java.lang.String str11 = listaSobreArreglos8.toString();
    boolean b12 = listaSobreArreglos4.equals((java.lang.Object)listaSobreArreglos8);
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos8.equals(obj13);
    listas.ListaSobreArreglos listaSobreArreglos15 = new listas.ListaSobreArreglos();
    int i16 = listaSobreArreglos15.longitud();
    listaSobreArreglos15.vaciar();
    java.lang.String str18 = listaSobreArreglos15.toString();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    listaSobreArreglos19.vaciar();
    java.lang.String str22 = listaSobreArreglos19.toString();
    boolean b23 = listaSobreArreglos15.equals((java.lang.Object)listaSobreArreglos19);
    listas.ListaSobreArreglos listaSobreArreglos24 = new listas.ListaSobreArreglos();
    int i25 = listaSobreArreglos24.longitud();
    boolean b26 = listaSobreArreglos24.esVacia();
    boolean b28 = listaSobreArreglos24.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos29 = new listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    listaSobreArreglos29.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos24.insertar((java.lang.Object)listaSobreArreglos29);
    listaSobreArreglos15.insertar((java.lang.Object)listaSobreArreglos29);
    listaSobreArreglos15.vaciar();
    boolean b37 = listaSobreArreglos15.esVacia();
    listaSobreArreglos15.vaciar();
    boolean b39 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos15);
    boolean b40 = listaSobreArreglos0.equals((java.lang.Object)b39);
    java.lang.Object obj41 = null;
    boolean b42 = listaSobreArreglos0.equals(obj41);
    java.lang.Object obj43 = null;
    listaSobreArreglos0.insertar(obj43);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    listaSobreArreglos6.vaciar();
    listaSobreArreglos6.insertar((java.lang.Object)100L);
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos6.equals(obj17);
    listaSobreArreglos6.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos6", listaSobreArreglos6.repOk());

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.esVacia();
    int i4 = listaSobreArreglos0.longitud();
    int i5 = listaSobreArreglos0.longitud();
    java.lang.Object obj6 = null;
    listaSobreArreglos0.insertar(obj6);
    java.lang.Object obj8 = null;
    listaSobreArreglos0.insertar(obj8);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    boolean b6 = listaSobreArreglos0.esVacia();
    boolean b7 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    listaSobreArreglos8.insertar((java.lang.Object)(-1.0d));
    listas.ListaSobreArreglos listaSobreArreglos11 = new listas.ListaSobreArreglos();
    int i12 = listaSobreArreglos11.longitud();
    boolean b13 = listaSobreArreglos11.esVacia();
    boolean b15 = listaSobreArreglos11.equals((java.lang.Object)1);
    boolean b16 = listaSobreArreglos11.esVacia();
    boolean b17 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos11);
    int i18 = listaSobreArreglos8.longitud();
    boolean b19 = listaSobreArreglos0.equals((java.lang.Object)i18);
    java.lang.String str20 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    listas.ListaSobreArreglos listaSobreArreglos11 = new listas.ListaSobreArreglos();
    java.lang.String str12 = listaSobreArreglos11.toString();
    boolean b13 = listaSobreArreglos11.esVacia();
    listaSobreArreglos11.insertar((java.lang.Object)(short)-1);
    boolean b16 = listaSobreArreglos11.esVacia();
    boolean b17 = listaSobreArreglos11.esVacia();
    boolean b18 = listaSobreArreglos11.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    listaSobreArreglos19.insertar((java.lang.Object)(-1.0d));
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    boolean b24 = listaSobreArreglos22.esVacia();
    boolean b26 = listaSobreArreglos22.equals((java.lang.Object)1);
    boolean b27 = listaSobreArreglos22.esVacia();
    boolean b28 = listaSobreArreglos19.equals((java.lang.Object)listaSobreArreglos22);
    int i29 = listaSobreArreglos19.longitud();
    boolean b30 = listaSobreArreglos11.equals((java.lang.Object)i29);
    listaSobreArreglos3.insertar((java.lang.Object)b30);
    java.lang.String str32 = listaSobreArreglos3.toString();
    int i33 = listaSobreArreglos3.longitud();
    java.lang.String str34 = listaSobreArreglos3.toString();
    java.lang.Object obj36 = null;
    listaSobreArreglos3.insertar(0, obj36);
    listaSobreArreglos3.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos3", listaSobreArreglos3.repOk());

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    java.lang.Object obj15 = null;
    listaSobreArreglos0.insertar(0, obj15);
    int i17 = listaSobreArreglos0.longitud();
    java.lang.Object obj19 = null;
    listaSobreArreglos0.insertar((int)(short)1, obj19);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    int i4 = listaSobreArreglos0.longitud();
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    listaSobreArreglos0.vaciar();
    listas.ListaSobreArreglos listaSobreArreglos9 = new listas.ListaSobreArreglos();
    listaSobreArreglos9.insertar((java.lang.Object)(-1.0d));
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos9);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.esVacia();
    java.lang.Object obj10 = null;
    boolean b11 = listaSobreArreglos0.equals(obj10);
    java.lang.String str12 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos13 = new listas.ListaSobreArreglos();
    int i14 = listaSobreArreglos13.longitud();
    boolean b15 = listaSobreArreglos13.esVacia();
    boolean b17 = listaSobreArreglos13.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos18 = new listas.ListaSobreArreglos();
    java.lang.String str19 = listaSobreArreglos18.toString();
    boolean b20 = listaSobreArreglos18.esVacia();
    listaSobreArreglos18.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos13.insertar((java.lang.Object)listaSobreArreglos18);
    java.lang.Object obj25 = listaSobreArreglos18.obtener(0);
    java.lang.Object obj26 = null;
    listaSobreArreglos18.insertar(obj26);
    boolean b28 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos18);
    int i29 = listaSobreArreglos18.longitud();
    listas.ListaSobreArreglos listaSobreArreglos30 = new listas.ListaSobreArreglos();
    int i31 = listaSobreArreglos30.longitud();
    boolean b32 = listaSobreArreglos30.esVacia();
    boolean b34 = listaSobreArreglos30.equals((java.lang.Object)1);
    listaSobreArreglos30.insertar(0, (java.lang.Object)10.0d);
    boolean b38 = listaSobreArreglos30.esVacia();
    java.lang.String str39 = listaSobreArreglos30.toString();
    java.lang.Object obj41 = listaSobreArreglos30.obtener(0);
    boolean b42 = listaSobreArreglos30.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos43 = new listas.ListaSobreArreglos();
    int i44 = listaSobreArreglos43.longitud();
    boolean b45 = listaSobreArreglos43.esVacia();
    listaSobreArreglos43.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos48 = new listas.ListaSobreArreglos();
    java.lang.String str49 = listaSobreArreglos48.toString();
    boolean b50 = listaSobreArreglos48.esVacia();
    listaSobreArreglos48.insertar((java.lang.Object)(short)-1);
    boolean b53 = listaSobreArreglos48.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos54 = new listas.ListaSobreArreglos();
    int i55 = listaSobreArreglos54.longitud();
    boolean b56 = listaSobreArreglos54.esVacia();
    listaSobreArreglos54.insertar((java.lang.Object)10.0f);
    java.lang.Object obj59 = null;
    listaSobreArreglos54.insertar(obj59);
    listaSobreArreglos48.insertar((java.lang.Object)listaSobreArreglos54);
    int i62 = listaSobreArreglos48.longitud();
    listaSobreArreglos43.insertar((java.lang.Object)listaSobreArreglos48);
    java.lang.Object obj64 = null;
    listaSobreArreglos48.insertar(obj64);
    boolean b66 = listaSobreArreglos48.esVacia();
    boolean b67 = listaSobreArreglos30.equals((java.lang.Object)listaSobreArreglos48);
    java.lang.String str68 = listaSobreArreglos30.toString();
    boolean b69 = listaSobreArreglos18.equals((java.lang.Object)listaSobreArreglos30);
    java.lang.Object obj71 = null;
    listaSobreArreglos18.insertar(0, obj71);
    int i73 = listaSobreArreglos18.longitud();
    listaSobreArreglos18.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos18", listaSobreArreglos18.repOk());

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    boolean b5 = listaSobreArreglos0.esVacia();
    java.lang.String str6 = listaSobreArreglos0.toString();
    listaSobreArreglos0.vaciar();
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    boolean b10 = listaSobreArreglos8.esVacia();
    boolean b12 = listaSobreArreglos8.equals((java.lang.Object)1);
    listaSobreArreglos8.insertar(0, (java.lang.Object)10.0d);
    boolean b16 = listaSobreArreglos8.esVacia();
    java.lang.Object obj17 = null;
    listaSobreArreglos8.insertar(obj17);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos8);
    listaSobreArreglos8.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos8", listaSobreArreglos8.repOk());

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    int i14 = listaSobreArreglos0.longitud();
    listas.ListaSobreArreglos listaSobreArreglos15 = new listas.ListaSobreArreglos();
    boolean b16 = listaSobreArreglos15.esVacia();
    boolean b17 = listaSobreArreglos15.esVacia();
    boolean b18 = listaSobreArreglos15.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    boolean b21 = listaSobreArreglos19.esVacia();
    boolean b23 = listaSobreArreglos19.equals((java.lang.Object)1);
    listaSobreArreglos19.insertar(0, (java.lang.Object)10.0d);
    boolean b27 = listaSobreArreglos19.esVacia();
    java.lang.String str28 = listaSobreArreglos19.toString();
    java.lang.Object obj30 = listaSobreArreglos19.obtener(0);
    listaSobreArreglos15.insertar(obj30);
    boolean b32 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos15);
    java.lang.Object obj33 = null;
    listaSobreArreglos15.insertar(obj33);
    listas.ListaSobreArreglos listaSobreArreglos35 = new listas.ListaSobreArreglos();
    java.lang.String str36 = listaSobreArreglos35.toString();
    boolean b37 = listaSobreArreglos35.esVacia();
    listaSobreArreglos35.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj40 = null;
    boolean b41 = listaSobreArreglos35.equals(obj40);
    boolean b42 = listaSobreArreglos35.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos43 = new listas.ListaSobreArreglos();
    java.lang.String str44 = listaSobreArreglos43.toString();
    boolean b45 = listaSobreArreglos43.esVacia();
    java.lang.Object obj47 = null;
    listaSobreArreglos43.insertar(0, obj47);
    listaSobreArreglos43.insertar((java.lang.Object)1.0f);
    listaSobreArreglos35.insertar((java.lang.Object)listaSobreArreglos43);
    listas.ListaSobreArreglos listaSobreArreglos52 = new listas.ListaSobreArreglos();
    java.lang.String str53 = listaSobreArreglos52.toString();
    java.lang.String str54 = listaSobreArreglos52.toString();
    listas.ListaSobreArreglos listaSobreArreglos55 = new listas.ListaSobreArreglos();
    int i56 = listaSobreArreglos55.longitud();
    boolean b57 = listaSobreArreglos55.esVacia();
    listaSobreArreglos55.insertar((java.lang.Object)10.0f);
    java.lang.Object obj60 = null;
    listaSobreArreglos55.insertar(obj60);
    listaSobreArreglos52.insertar((java.lang.Object)listaSobreArreglos55);
    listaSobreArreglos43.insertar((java.lang.Object)listaSobreArreglos55);
    listaSobreArreglos15.insertar((java.lang.Object)listaSobreArreglos43);
    listaSobreArreglos15.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos15", listaSobreArreglos15.repOk());

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(-1.0d));
    java.lang.Object obj11 = null;
    listaSobreArreglos0.insertar(0, obj11);
    int i13 = listaSobreArreglos0.longitud();
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(obj14);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    boolean b5 = listaSobreArreglos0.esVacia();
    java.lang.String str6 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos7 = new listas.ListaSobreArreglos();
    java.lang.String str8 = listaSobreArreglos7.toString();
    java.lang.String str9 = listaSobreArreglos7.toString();
    listas.ListaSobreArreglos listaSobreArreglos10 = new listas.ListaSobreArreglos();
    int i11 = listaSobreArreglos10.longitud();
    boolean b12 = listaSobreArreglos10.esVacia();
    listaSobreArreglos10.insertar((java.lang.Object)10.0f);
    java.lang.Object obj15 = null;
    listaSobreArreglos10.insertar(obj15);
    listaSobreArreglos7.insertar((java.lang.Object)listaSobreArreglos10);
    boolean b18 = listaSobreArreglos10.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)b18);
    java.lang.Object obj20 = null;
    listaSobreArreglos0.insertar(obj20);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    java.lang.String str18 = listaSobreArreglos16.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str18);
    listas.ListaSobreArreglos listaSobreArreglos20 = new listas.ListaSobreArreglos();
    java.lang.String str21 = listaSobreArreglos20.toString();
    boolean b22 = listaSobreArreglos20.esVacia();
    listaSobreArreglos20.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj25 = null;
    boolean b26 = listaSobreArreglos20.equals(obj25);
    boolean b27 = listaSobreArreglos20.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos28 = new listas.ListaSobreArreglos();
    java.lang.String str29 = listaSobreArreglos28.toString();
    boolean b30 = listaSobreArreglos28.esVacia();
    java.lang.Object obj32 = null;
    listaSobreArreglos28.insertar(0, obj32);
    listaSobreArreglos28.insertar((java.lang.Object)1.0f);
    listaSobreArreglos20.insertar((java.lang.Object)listaSobreArreglos28);
    listas.ListaSobreArreglos listaSobreArreglos38 = new listas.ListaSobreArreglos();
    int i39 = listaSobreArreglos38.longitud();
    boolean b40 = listaSobreArreglos38.esVacia();
    boolean b42 = listaSobreArreglos38.equals((java.lang.Object)1);
    listaSobreArreglos38.insertar(0, (java.lang.Object)10.0d);
    boolean b46 = listaSobreArreglos38.esVacia();
    boolean b47 = listaSobreArreglos38.esVacia();
    java.lang.Object obj49 = null;
    listaSobreArreglos38.insertar(0, obj49);
    boolean b51 = listaSobreArreglos38.esVacia();
    listaSobreArreglos28.insertar(0, (java.lang.Object)listaSobreArreglos38);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos38);
    java.lang.String str54 = listaSobreArreglos0.toString();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    int i3 = listaSobreArreglos0.longitud();
    java.lang.String str4 = listaSobreArreglos0.toString();
    int i5 = listaSobreArreglos0.longitud();
    boolean b6 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj8 = null;
    listaSobreArreglos0.insertar(obj8);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    listaSobreArreglos6.vaciar();
    java.lang.Object obj15 = null;
    listaSobreArreglos6.insertar(obj15);
    listaSobreArreglos6.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos6", listaSobreArreglos6.repOk());

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    listaSobreArreglos8.vaciar();
    java.lang.String str11 = listaSobreArreglos8.toString();
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.vaciar();
    java.lang.String str15 = listaSobreArreglos12.toString();
    boolean b16 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos12);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b21 = listaSobreArreglos17.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos22);
    boolean b29 = listaSobreArreglos22.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos22);
    boolean b31 = listaSobreArreglos22.esVacia();
    boolean b32 = listaSobreArreglos22.esVacia();
    int i33 = listaSobreArreglos22.longitud();
    java.lang.Object obj35 = null;
    listaSobreArreglos22.insertar(0, obj35);
    java.lang.Object obj38 = listaSobreArreglos22.obtener(0);
    listas.ListaSobreArreglos listaSobreArreglos39 = new listas.ListaSobreArreglos();
    int i40 = listaSobreArreglos39.longitud();
    boolean b41 = listaSobreArreglos39.esVacia();
    listaSobreArreglos39.vaciar();
    java.lang.Object obj43 = null;
    listaSobreArreglos39.insertar(obj43);
    boolean b45 = listaSobreArreglos39.esVacia();
    boolean b46 = listaSobreArreglos39.esVacia();
    boolean b47 = listaSobreArreglos22.equals((java.lang.Object)listaSobreArreglos39);
    listaSobreArreglos22.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos22", listaSobreArreglos22.repOk());

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b5 = listaSobreArreglos0.esVacia();
    java.lang.Object obj7 = null;
    listaSobreArreglos0.insertar((int)(short)0, obj7);
    java.lang.Object obj9 = null;
    listaSobreArreglos0.insertar(obj9);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    boolean b8 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos9 = new listas.ListaSobreArreglos();
    int i10 = listaSobreArreglos9.longitud();
    listaSobreArreglos9.vaciar();
    java.lang.String str12 = listaSobreArreglos9.toString();
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos9.equals(obj13);
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    listaSobreArreglos16.insertar((java.lang.Object)(short)-1);
    boolean b21 = listaSobreArreglos16.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)10.0f);
    java.lang.Object obj27 = null;
    listaSobreArreglos22.insertar(obj27);
    listaSobreArreglos16.insertar((java.lang.Object)listaSobreArreglos22);
    int i30 = listaSobreArreglos16.longitud();
    listaSobreArreglos9.insertar(0, (java.lang.Object)i30);
    int i32 = listaSobreArreglos9.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos9);
    int i34 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.String str3 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    listaSobreArreglos4.vaciar();
    java.lang.String str7 = listaSobreArreglos4.toString();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos4);
    listas.ListaSobreArreglos listaSobreArreglos9 = new listas.ListaSobreArreglos();
    int i10 = listaSobreArreglos9.longitud();
    boolean b11 = listaSobreArreglos9.esVacia();
    boolean b13 = listaSobreArreglos9.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos14 = new listas.ListaSobreArreglos();
    java.lang.String str15 = listaSobreArreglos14.toString();
    boolean b16 = listaSobreArreglos14.esVacia();
    listaSobreArreglos14.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos9.insertar((java.lang.Object)listaSobreArreglos14);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos14);
    boolean b21 = listaSobreArreglos14.esVacia();
    java.lang.Object obj22 = null;
    listaSobreArreglos14.insertar(obj22);
    listaSobreArreglos14.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos14", listaSobreArreglos14.repOk());

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    java.lang.String str7 = listaSobreArreglos6.toString();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)(short)-1);
    boolean b11 = listaSobreArreglos6.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    boolean b14 = listaSobreArreglos12.esVacia();
    listaSobreArreglos12.insertar((java.lang.Object)10.0f);
    java.lang.Object obj17 = null;
    listaSobreArreglos12.insertar(obj17);
    listaSobreArreglos6.insertar((java.lang.Object)listaSobreArreglos12);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos12);
    java.lang.Object obj21 = null;
    boolean b22 = listaSobreArreglos0.equals(obj21);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj12 = listaSobreArreglos5.obtener(0);
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos5.equals(obj13);
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    java.lang.String str18 = listaSobreArreglos16.toString();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    boolean b21 = listaSobreArreglos19.esVacia();
    listaSobreArreglos19.insertar((java.lang.Object)10.0f);
    java.lang.Object obj24 = null;
    listaSobreArreglos19.insertar(obj24);
    listaSobreArreglos16.insertar((java.lang.Object)listaSobreArreglos19);
    java.lang.Object obj28 = listaSobreArreglos16.obtener(0);
    java.lang.Object obj30 = null;
    listaSobreArreglos16.insertar(0, obj30);
    java.lang.String str32 = listaSobreArreglos16.toString();
    listaSobreArreglos5.insertar((int)(byte)1, (java.lang.Object)listaSobreArreglos16);
    listaSobreArreglos5.vaciar();
    listas.ListaSobreArreglos listaSobreArreglos36 = new listas.ListaSobreArreglos();
    int i37 = listaSobreArreglos36.longitud();
    listaSobreArreglos36.vaciar();
    java.lang.String str39 = listaSobreArreglos36.toString();
    listas.ListaSobreArreglos listaSobreArreglos40 = new listas.ListaSobreArreglos();
    int i41 = listaSobreArreglos40.longitud();
    listaSobreArreglos40.vaciar();
    java.lang.String str43 = listaSobreArreglos40.toString();
    boolean b44 = listaSobreArreglos36.equals((java.lang.Object)listaSobreArreglos40);
    listaSobreArreglos36.vaciar();
    java.lang.String str46 = listaSobreArreglos36.toString();
    listaSobreArreglos5.insertar(0, (java.lang.Object)str46);
    listaSobreArreglos5.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos5", listaSobreArreglos5.repOk());

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj12 = listaSobreArreglos5.obtener(0);
    listas.ListaSobreArreglos listaSobreArreglos13 = new listas.ListaSobreArreglos();
    int i14 = listaSobreArreglos13.longitud();
    listaSobreArreglos13.vaciar();
    java.lang.String str16 = listaSobreArreglos13.toString();
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.vaciar();
    java.lang.String str20 = listaSobreArreglos17.toString();
    boolean b21 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos17);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    boolean b24 = listaSobreArreglos22.esVacia();
    boolean b26 = listaSobreArreglos22.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos27 = new listas.ListaSobreArreglos();
    java.lang.String str28 = listaSobreArreglos27.toString();
    boolean b29 = listaSobreArreglos27.esVacia();
    listaSobreArreglos27.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos22.insertar((java.lang.Object)listaSobreArreglos27);
    listaSobreArreglos13.insertar((java.lang.Object)listaSobreArreglos27);
    listaSobreArreglos13.insertar((java.lang.Object)10L);
    boolean b36 = listaSobreArreglos5.equals((java.lang.Object)10L);
    listas.ListaSobreArreglos listaSobreArreglos37 = new listas.ListaSobreArreglos();
    java.lang.String str38 = listaSobreArreglos37.toString();
    boolean b39 = listaSobreArreglos37.esVacia();
    listaSobreArreglos37.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj42 = null;
    boolean b43 = listaSobreArreglos37.equals(obj42);
    boolean b44 = listaSobreArreglos37.esVacia();
    listaSobreArreglos37.vaciar();
    boolean b46 = listaSobreArreglos37.esVacia();
    java.lang.Object obj47 = null;
    boolean b48 = listaSobreArreglos37.equals(obj47);
    java.lang.String str49 = listaSobreArreglos37.toString();
    listas.ListaSobreArreglos listaSobreArreglos50 = new listas.ListaSobreArreglos();
    int i51 = listaSobreArreglos50.longitud();
    boolean b52 = listaSobreArreglos50.esVacia();
    boolean b54 = listaSobreArreglos50.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos55 = new listas.ListaSobreArreglos();
    java.lang.String str56 = listaSobreArreglos55.toString();
    boolean b57 = listaSobreArreglos55.esVacia();
    listaSobreArreglos55.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos50.insertar((java.lang.Object)listaSobreArreglos55);
    java.lang.Object obj62 = listaSobreArreglos55.obtener(0);
    java.lang.Object obj63 = null;
    listaSobreArreglos55.insertar(obj63);
    boolean b65 = listaSobreArreglos37.equals((java.lang.Object)listaSobreArreglos55);
    boolean b66 = listaSobreArreglos5.equals((java.lang.Object)listaSobreArreglos55);
    boolean b67 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos5", listaSobreArreglos5.repOk());

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.vaciar();
    java.lang.String str20 = listaSobreArreglos17.toString();
    listas.ListaSobreArreglos listaSobreArreglos21 = new listas.ListaSobreArreglos();
    int i22 = listaSobreArreglos21.longitud();
    listaSobreArreglos21.vaciar();
    java.lang.String str24 = listaSobreArreglos21.toString();
    boolean b25 = listaSobreArreglos17.equals((java.lang.Object)listaSobreArreglos21);
    listaSobreArreglos0.insertar(1, (java.lang.Object)b25);
    boolean b27 = listaSobreArreglos0.esVacia();
    java.lang.Object obj28 = null;
    boolean b29 = listaSobreArreglos0.equals(obj28);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    listaSobreArreglos8.vaciar();
    java.lang.String str11 = listaSobreArreglos8.toString();
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.vaciar();
    java.lang.String str15 = listaSobreArreglos12.toString();
    boolean b16 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos12);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b21 = listaSobreArreglos17.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos22);
    boolean b29 = listaSobreArreglos22.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str31 = listaSobreArreglos22.toString();
    java.lang.Object obj32 = null;
    listaSobreArreglos22.insertar(obj32);
    int i34 = listaSobreArreglos22.longitud();
    listaSobreArreglos22.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos22", listaSobreArreglos22.repOk());

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos3.obtener(0);
    listaSobreArreglos3.vaciar();
    java.lang.Object obj15 = null;
    listaSobreArreglos3.insertar(0, obj15);
    listaSobreArreglos3.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos3", listaSobreArreglos3.repOk());

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    java.lang.String str8 = listaSobreArreglos0.toString();
    java.lang.Object obj10 = null;
    listaSobreArreglos0.insertar((int)(byte)1, obj10);
    boolean b12 = listaSobreArreglos0.esVacia();
    java.lang.Object obj13 = null;
    listaSobreArreglos0.insertar(obj13);
    int i15 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    boolean b6 = listaSobreArreglos4.esVacia();
    boolean b8 = listaSobreArreglos4.equals((java.lang.Object)1);
    listaSobreArreglos4.insertar(0, (java.lang.Object)10.0d);
    boolean b12 = listaSobreArreglos4.esVacia();
    java.lang.String str13 = listaSobreArreglos4.toString();
    java.lang.Object obj15 = listaSobreArreglos4.obtener(0);
    listaSobreArreglos0.insertar(obj15);
    java.lang.String str17 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos18 = new listas.ListaSobreArreglos();
    java.lang.String str19 = listaSobreArreglos18.toString();
    java.lang.String str20 = listaSobreArreglos18.toString();
    listas.ListaSobreArreglos listaSobreArreglos21 = new listas.ListaSobreArreglos();
    int i22 = listaSobreArreglos21.longitud();
    boolean b23 = listaSobreArreglos21.esVacia();
    listaSobreArreglos21.insertar((java.lang.Object)10.0f);
    java.lang.Object obj26 = null;
    listaSobreArreglos21.insertar(obj26);
    listaSobreArreglos18.insertar((java.lang.Object)listaSobreArreglos21);
    java.lang.Object obj30 = listaSobreArreglos18.obtener(0);
    java.lang.Object obj32 = null;
    listaSobreArreglos18.insertar(0, obj32);
    listas.ListaSobreArreglos listaSobreArreglos35 = new listas.ListaSobreArreglos();
    int i36 = listaSobreArreglos35.longitud();
    listaSobreArreglos35.vaciar();
    java.lang.String str38 = listaSobreArreglos35.toString();
    listas.ListaSobreArreglos listaSobreArreglos39 = new listas.ListaSobreArreglos();
    int i40 = listaSobreArreglos39.longitud();
    listaSobreArreglos39.vaciar();
    java.lang.String str42 = listaSobreArreglos39.toString();
    boolean b43 = listaSobreArreglos35.equals((java.lang.Object)listaSobreArreglos39);
    listaSobreArreglos18.insertar(1, (java.lang.Object)b43);
    java.lang.Object obj46 = listaSobreArreglos18.obtener(0);
    java.lang.Object obj48 = null;
    listaSobreArreglos18.insertar(0, obj48);
    java.lang.String str50 = listaSobreArreglos18.toString();
    listaSobreArreglos18.vaciar();
    listas.ListaSobreArreglos listaSobreArreglos52 = new listas.ListaSobreArreglos();
    int i53 = listaSobreArreglos52.longitud();
    listaSobreArreglos52.vaciar();
    java.lang.String str55 = listaSobreArreglos52.toString();
    listaSobreArreglos52.vaciar();
    boolean b57 = listaSobreArreglos18.equals((java.lang.Object)listaSobreArreglos52);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos52);
    java.lang.Object obj59 = null;
    listaSobreArreglos52.insertar(obj59);
    listaSobreArreglos52.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos52", listaSobreArreglos52.repOk());

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listaSobreArreglos0.eliminar((int)(short)0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    java.lang.String str7 = listaSobreArreglos6.toString();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)(short)-1);
    boolean b11 = listaSobreArreglos6.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    boolean b14 = listaSobreArreglos12.esVacia();
    listaSobreArreglos12.insertar((java.lang.Object)10.0f);
    java.lang.Object obj17 = null;
    listaSobreArreglos12.insertar(obj17);
    listaSobreArreglos6.insertar((java.lang.Object)listaSobreArreglos12);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos12);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    java.lang.String str6 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos7 = new listas.ListaSobreArreglos();
    java.lang.String str8 = listaSobreArreglos7.toString();
    java.lang.String str9 = listaSobreArreglos7.toString();
    listas.ListaSobreArreglos listaSobreArreglos10 = new listas.ListaSobreArreglos();
    int i11 = listaSobreArreglos10.longitud();
    boolean b12 = listaSobreArreglos10.esVacia();
    listaSobreArreglos10.insertar((java.lang.Object)10.0f);
    java.lang.Object obj15 = null;
    listaSobreArreglos10.insertar(obj15);
    listaSobreArreglos7.insertar((java.lang.Object)listaSobreArreglos10);
    java.lang.Object obj19 = listaSobreArreglos10.obtener(0);
    java.lang.String str20 = listaSobreArreglos10.toString();
    boolean b21 = listaSobreArreglos10.esVacia();
    int i22 = listaSobreArreglos10.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos10);
    listaSobreArreglos10.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos10", listaSobreArreglos10.repOk());

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    boolean b6 = listaSobreArreglos4.esVacia();
    boolean b8 = listaSobreArreglos4.equals((java.lang.Object)1);
    listaSobreArreglos4.insertar(0, (java.lang.Object)10.0d);
    boolean b12 = listaSobreArreglos4.esVacia();
    java.lang.String str13 = listaSobreArreglos4.toString();
    java.lang.Object obj15 = listaSobreArreglos4.obtener(0);
    listaSobreArreglos0.insertar(obj15);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    java.lang.String str18 = listaSobreArreglos17.toString();
    java.lang.String str19 = listaSobreArreglos17.toString();
    listas.ListaSobreArreglos listaSobreArreglos20 = new listas.ListaSobreArreglos();
    int i21 = listaSobreArreglos20.longitud();
    boolean b22 = listaSobreArreglos20.esVacia();
    listaSobreArreglos20.insertar((java.lang.Object)10.0f);
    java.lang.Object obj25 = null;
    listaSobreArreglos20.insertar(obj25);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos20);
    java.lang.Object obj29 = listaSobreArreglos17.obtener(0);
    java.lang.Object obj31 = null;
    listaSobreArreglos17.insertar(0, obj31);
    java.lang.String str33 = listaSobreArreglos17.toString();
    boolean b34 = listaSobreArreglos0.equals((java.lang.Object)str33);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)10.0f);
    java.lang.Object obj6 = listaSobreArreglos0.obtener((int)(short)0);
    listaSobreArreglos0.insertar((java.lang.Object)3);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos3.obtener(0);
    boolean b13 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos3", listaSobreArreglos3.repOk());

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj4 = null;
    listaSobreArreglos0.insertar(0, obj4);
    java.lang.String str6 = listaSobreArreglos0.toString();
    boolean b7 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    listaSobreArreglos8.vaciar();
    java.lang.Object obj11 = null;
    listaSobreArreglos8.insertar(obj11);
    java.lang.Object obj13 = null;
    listaSobreArreglos8.insertar(obj13);
    listas.ListaSobreArreglos listaSobreArreglos15 = new listas.ListaSobreArreglos();
    java.lang.String str16 = listaSobreArreglos15.toString();
    boolean b17 = listaSobreArreglos15.esVacia();
    listaSobreArreglos15.insertar((java.lang.Object)(short)-1);
    boolean b20 = listaSobreArreglos15.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos21 = new listas.ListaSobreArreglos();
    int i22 = listaSobreArreglos21.longitud();
    boolean b23 = listaSobreArreglos21.esVacia();
    listaSobreArreglos21.insertar((java.lang.Object)10.0f);
    java.lang.Object obj26 = null;
    listaSobreArreglos21.insertar(obj26);
    listaSobreArreglos15.insertar((java.lang.Object)listaSobreArreglos21);
    int i29 = listaSobreArreglos15.longitud();
    listaSobreArreglos8.insertar((java.lang.Object)i29);
    boolean b31 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos8);
    listas.ListaSobreArreglos listaSobreArreglos33 = new listas.ListaSobreArreglos();
    java.lang.String str34 = listaSobreArreglos33.toString();
    boolean b35 = listaSobreArreglos33.esVacia();
    listaSobreArreglos33.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj38 = null;
    boolean b39 = listaSobreArreglos33.equals(obj38);
    boolean b40 = listaSobreArreglos33.esVacia();
    java.lang.String str41 = listaSobreArreglos33.toString();
    java.lang.Object obj43 = null;
    listaSobreArreglos33.insertar((int)(byte)1, obj43);
    listaSobreArreglos8.insertar(0, obj43);
    listaSobreArreglos8.eliminar(2);
    listaSobreArreglos8.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos8", listaSobreArreglos8.repOk());

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.esVacia();
    java.lang.String str4 = listaSobreArreglos0.toString();
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    int i7 = listaSobreArreglos0.longitud();
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    listaSobreArreglos8.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos8);
    boolean b12 = listaSobreArreglos0.esVacia();
    int i13 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    java.lang.Object obj15 = null;
    listaSobreArreglos0.insertar(0, obj15);
    java.lang.Object obj17 = null;
    listaSobreArreglos0.insertar(obj17);
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    java.lang.String str20 = listaSobreArreglos19.toString();
    boolean b21 = listaSobreArreglos19.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)b21);
    java.lang.String str23 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos24 = new listas.ListaSobreArreglos();
    int i25 = listaSobreArreglos24.longitud();
    java.lang.Object obj27 = null;
    listaSobreArreglos24.insertar(0, obj27);
    listaSobreArreglos24.vaciar();
    boolean b30 = listaSobreArreglos24.esVacia();
    boolean b31 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos24);
    java.lang.Object obj32 = null;
    listaSobreArreglos24.insertar(obj32);
    listaSobreArreglos24.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos24", listaSobreArreglos24.repOk());

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.Object obj10 = null;
    listaSobreArreglos0.insertar(obj10);
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    boolean b14 = listaSobreArreglos12.esVacia();
    boolean b16 = listaSobreArreglos12.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    java.lang.String str18 = listaSobreArreglos17.toString();
    boolean b19 = listaSobreArreglos17.esVacia();
    listaSobreArreglos17.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos12.insertar((java.lang.Object)listaSobreArreglos17);
    listaSobreArreglos12.vaciar();
    int i24 = listaSobreArreglos12.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos12);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.vaciar();
    java.lang.String str20 = listaSobreArreglos17.toString();
    listas.ListaSobreArreglos listaSobreArreglos21 = new listas.ListaSobreArreglos();
    int i22 = listaSobreArreglos21.longitud();
    listaSobreArreglos21.vaciar();
    java.lang.String str24 = listaSobreArreglos21.toString();
    boolean b25 = listaSobreArreglos17.equals((java.lang.Object)listaSobreArreglos21);
    listaSobreArreglos0.insertar(1, (java.lang.Object)b25);
    java.lang.Object obj28 = listaSobreArreglos0.obtener(0);
    java.lang.String str29 = listaSobreArreglos0.toString();
    java.lang.Object obj30 = null;
    listaSobreArreglos0.insertar(obj30);
    int i32 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    listaSobreArreglos0.eliminar((int)(short)0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = null;
    listaSobreArreglos0.insertar(0, obj14);
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    java.lang.String str18 = listaSobreArreglos16.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str18);
    listas.ListaSobreArreglos listaSobreArreglos20 = new listas.ListaSobreArreglos();
    java.lang.String str21 = listaSobreArreglos20.toString();
    boolean b22 = listaSobreArreglos20.esVacia();
    listaSobreArreglos20.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj25 = null;
    boolean b26 = listaSobreArreglos20.equals(obj25);
    boolean b27 = listaSobreArreglos20.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos28 = new listas.ListaSobreArreglos();
    java.lang.String str29 = listaSobreArreglos28.toString();
    boolean b30 = listaSobreArreglos28.esVacia();
    java.lang.Object obj32 = null;
    listaSobreArreglos28.insertar(0, obj32);
    listaSobreArreglos28.insertar((java.lang.Object)1.0f);
    listaSobreArreglos20.insertar((java.lang.Object)listaSobreArreglos28);
    listas.ListaSobreArreglos listaSobreArreglos38 = new listas.ListaSobreArreglos();
    int i39 = listaSobreArreglos38.longitud();
    boolean b40 = listaSobreArreglos38.esVacia();
    boolean b42 = listaSobreArreglos38.equals((java.lang.Object)1);
    listaSobreArreglos38.insertar(0, (java.lang.Object)10.0d);
    boolean b46 = listaSobreArreglos38.esVacia();
    boolean b47 = listaSobreArreglos38.esVacia();
    java.lang.Object obj49 = null;
    listaSobreArreglos38.insertar(0, obj49);
    boolean b51 = listaSobreArreglos38.esVacia();
    listaSobreArreglos28.insertar(0, (java.lang.Object)listaSobreArreglos38);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos38);
    java.lang.Object obj54 = null;
    listaSobreArreglos0.insertar(obj54);
    java.lang.Object obj57 = null;
    listaSobreArreglos0.insertar(0, obj57);
    listas.ListaSobreArreglos listaSobreArreglos59 = new listas.ListaSobreArreglos();
    boolean b60 = listaSobreArreglos59.esVacia();
    boolean b61 = listaSobreArreglos59.esVacia();
    boolean b62 = listaSobreArreglos59.esVacia();
    java.lang.String str63 = listaSobreArreglos59.toString();
    java.lang.String str64 = listaSobreArreglos59.toString();
    java.lang.String str65 = listaSobreArreglos59.toString();
    listas.ListaSobreArreglos listaSobreArreglos67 = new listas.ListaSobreArreglos();
    java.lang.String str68 = listaSobreArreglos67.toString();
    java.lang.String str69 = listaSobreArreglos67.toString();
    java.lang.Object obj71 = null;
    listaSobreArreglos67.insertar((int)(byte)0, obj71);
    listaSobreArreglos59.insertar(0, (java.lang.Object)listaSobreArreglos67);
    boolean b74 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos59);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos3 = new listas.ListaSobreArreglos();
    int i4 = listaSobreArreglos3.longitud();
    boolean b5 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.insertar((java.lang.Object)10.0f);
    java.lang.Object obj8 = null;
    listaSobreArreglos3.insertar(obj8);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj12 = listaSobreArreglos3.obtener(0);
    int i13 = listaSobreArreglos3.longitud();
    listas.ListaSobreArreglos listaSobreArreglos14 = new listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    listaSobreArreglos14.vaciar();
    listaSobreArreglos14.vaciar();
    listaSobreArreglos14.vaciar();
    java.lang.Object obj19 = null;
    listaSobreArreglos14.insertar(obj19);
    boolean b21 = listaSobreArreglos14.esVacia();
    java.lang.Object obj22 = null;
    listaSobreArreglos14.insertar(obj22);
    listaSobreArreglos14.vaciar();
    int i25 = listaSobreArreglos14.longitud();
    boolean b26 = listaSobreArreglos3.equals((java.lang.Object)i25);
    boolean b27 = listaSobreArreglos3.esVacia();
    listaSobreArreglos3.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos3", listaSobreArreglos3.repOk());

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.Object obj11 = listaSobreArreglos0.obtener(0);
    boolean b12 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos13 = new listas.ListaSobreArreglos();
    int i14 = listaSobreArreglos13.longitud();
    boolean b15 = listaSobreArreglos13.esVacia();
    listaSobreArreglos13.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos18 = new listas.ListaSobreArreglos();
    java.lang.String str19 = listaSobreArreglos18.toString();
    boolean b20 = listaSobreArreglos18.esVacia();
    listaSobreArreglos18.insertar((java.lang.Object)(short)-1);
    boolean b23 = listaSobreArreglos18.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos24 = new listas.ListaSobreArreglos();
    int i25 = listaSobreArreglos24.longitud();
    boolean b26 = listaSobreArreglos24.esVacia();
    listaSobreArreglos24.insertar((java.lang.Object)10.0f);
    java.lang.Object obj29 = null;
    listaSobreArreglos24.insertar(obj29);
    listaSobreArreglos18.insertar((java.lang.Object)listaSobreArreglos24);
    int i32 = listaSobreArreglos18.longitud();
    listaSobreArreglos13.insertar((java.lang.Object)listaSobreArreglos18);
    java.lang.Object obj34 = null;
    listaSobreArreglos18.insertar(obj34);
    boolean b36 = listaSobreArreglos18.esVacia();
    boolean b37 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos18);
    listas.ListaSobreArreglos listaSobreArreglos39 = new listas.ListaSobreArreglos();
    int i40 = listaSobreArreglos39.longitud();
    boolean b41 = listaSobreArreglos39.esVacia();
    listaSobreArreglos39.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos44 = new listas.ListaSobreArreglos();
    java.lang.String str45 = listaSobreArreglos44.toString();
    boolean b46 = listaSobreArreglos44.esVacia();
    listaSobreArreglos44.insertar((java.lang.Object)(short)-1);
    boolean b49 = listaSobreArreglos44.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos50 = new listas.ListaSobreArreglos();
    int i51 = listaSobreArreglos50.longitud();
    boolean b52 = listaSobreArreglos50.esVacia();
    listaSobreArreglos50.insertar((java.lang.Object)10.0f);
    java.lang.Object obj55 = null;
    listaSobreArreglos50.insertar(obj55);
    listaSobreArreglos44.insertar((java.lang.Object)listaSobreArreglos50);
    int i58 = listaSobreArreglos44.longitud();
    listaSobreArreglos39.insertar((java.lang.Object)listaSobreArreglos44);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos39);
    listas.ListaSobreArreglos listaSobreArreglos61 = new listas.ListaSobreArreglos();
    java.lang.String str62 = listaSobreArreglos61.toString();
    boolean b63 = listaSobreArreglos61.esVacia();
    listaSobreArreglos61.insertar((java.lang.Object)(short)-1);
    boolean b66 = listaSobreArreglos61.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos67 = new listas.ListaSobreArreglos();
    java.lang.String str68 = listaSobreArreglos67.toString();
    java.lang.String str69 = listaSobreArreglos67.toString();
    boolean b70 = listaSobreArreglos61.equals((java.lang.Object)listaSobreArreglos67);
    boolean b71 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos61);
    listaSobreArreglos61.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos61", listaSobreArreglos61.repOk());

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos5 = new listas.ListaSobreArreglos();
    java.lang.String str6 = listaSobreArreglos5.toString();
    boolean b7 = listaSobreArreglos5.esVacia();
    listaSobreArreglos5.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos5);
    java.lang.Object obj12 = listaSobreArreglos5.obtener(0);
    listas.ListaSobreArreglos listaSobreArreglos13 = new listas.ListaSobreArreglos();
    int i14 = listaSobreArreglos13.longitud();
    listaSobreArreglos13.vaciar();
    java.lang.String str16 = listaSobreArreglos13.toString();
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    listaSobreArreglos17.vaciar();
    java.lang.String str20 = listaSobreArreglos17.toString();
    boolean b21 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos17);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    int i23 = listaSobreArreglos22.longitud();
    boolean b24 = listaSobreArreglos22.esVacia();
    boolean b26 = listaSobreArreglos22.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos27 = new listas.ListaSobreArreglos();
    java.lang.String str28 = listaSobreArreglos27.toString();
    boolean b29 = listaSobreArreglos27.esVacia();
    listaSobreArreglos27.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos22.insertar((java.lang.Object)listaSobreArreglos27);
    listaSobreArreglos13.insertar((java.lang.Object)listaSobreArreglos27);
    listaSobreArreglos13.insertar((java.lang.Object)10L);
    boolean b36 = listaSobreArreglos5.equals((java.lang.Object)10L);
    listas.ListaSobreArreglos listaSobreArreglos37 = new listas.ListaSobreArreglos();
    java.lang.String str38 = listaSobreArreglos37.toString();
    boolean b39 = listaSobreArreglos37.esVacia();
    listaSobreArreglos37.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj42 = null;
    boolean b43 = listaSobreArreglos37.equals(obj42);
    boolean b44 = listaSobreArreglos37.esVacia();
    listaSobreArreglos37.vaciar();
    boolean b46 = listaSobreArreglos37.esVacia();
    java.lang.Object obj47 = null;
    boolean b48 = listaSobreArreglos37.equals(obj47);
    java.lang.String str49 = listaSobreArreglos37.toString();
    listas.ListaSobreArreglos listaSobreArreglos50 = new listas.ListaSobreArreglos();
    int i51 = listaSobreArreglos50.longitud();
    boolean b52 = listaSobreArreglos50.esVacia();
    boolean b54 = listaSobreArreglos50.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos55 = new listas.ListaSobreArreglos();
    java.lang.String str56 = listaSobreArreglos55.toString();
    boolean b57 = listaSobreArreglos55.esVacia();
    listaSobreArreglos55.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos50.insertar((java.lang.Object)listaSobreArreglos55);
    java.lang.Object obj62 = listaSobreArreglos55.obtener(0);
    java.lang.Object obj63 = null;
    listaSobreArreglos55.insertar(obj63);
    boolean b65 = listaSobreArreglos37.equals((java.lang.Object)listaSobreArreglos55);
    boolean b66 = listaSobreArreglos5.equals((java.lang.Object)listaSobreArreglos55);
    listaSobreArreglos55.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos55", listaSobreArreglos55.repOk());

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    boolean b5 = listaSobreArreglos0.esVacia();
    java.lang.String str6 = listaSobreArreglos0.toString();
    listaSobreArreglos0.vaciar();
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    boolean b10 = listaSobreArreglos8.esVacia();
    boolean b12 = listaSobreArreglos8.equals((java.lang.Object)1);
    listaSobreArreglos8.insertar(0, (java.lang.Object)10.0d);
    boolean b16 = listaSobreArreglos8.esVacia();
    java.lang.Object obj17 = null;
    listaSobreArreglos8.insertar(obj17);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos8);
    listaSobreArreglos8.eliminar((int)(short)0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos8", listaSobreArreglos8.repOk());

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.String str3 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    listaSobreArreglos4.vaciar();
    java.lang.String str7 = listaSobreArreglos4.toString();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos4);
    listaSobreArreglos0.vaciar();
    java.lang.String str10 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos11 = new listas.ListaSobreArreglos();
    java.lang.String str12 = listaSobreArreglos11.toString();
    boolean b13 = listaSobreArreglos11.esVacia();
    int i14 = listaSobreArreglos11.longitud();
    java.lang.String str15 = listaSobreArreglos11.toString();
    boolean b16 = listaSobreArreglos0.equals((java.lang.Object)str15);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b21 = listaSobreArreglos17.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos17);
    listaSobreArreglos17.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos17", listaSobreArreglos17.repOk());

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.vaciar();
    int i9 = listaSobreArreglos0.longitud();
    java.lang.Object obj10 = null;
    listaSobreArreglos0.insertar(obj10);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.String str3 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    listaSobreArreglos4.vaciar();
    java.lang.String str7 = listaSobreArreglos4.toString();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos4);
    listaSobreArreglos0.vaciar();
    java.lang.Object obj10 = null;
    listaSobreArreglos0.insertar(obj10);
    java.lang.Object obj12 = null;
    listaSobreArreglos0.insertar(obj12);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.esVacia();
    java.lang.String str4 = listaSobreArreglos0.toString();
    java.lang.String str5 = listaSobreArreglos0.toString();
    java.lang.String str6 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    java.lang.String str9 = listaSobreArreglos8.toString();
    java.lang.String str10 = listaSobreArreglos8.toString();
    java.lang.Object obj12 = null;
    listaSobreArreglos8.insertar((int)(byte)0, obj12);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos8);
    listas.ListaSobreArreglos listaSobreArreglos15 = new listas.ListaSobreArreglos();
    boolean b16 = listaSobreArreglos15.esVacia();
    boolean b17 = listaSobreArreglos15.esVacia();
    boolean b18 = listaSobreArreglos15.esVacia();
    java.lang.String str19 = listaSobreArreglos15.toString();
    java.lang.String str20 = listaSobreArreglos15.toString();
    java.lang.String str21 = listaSobreArreglos15.toString();
    listas.ListaSobreArreglos listaSobreArreglos23 = new listas.ListaSobreArreglos();
    java.lang.String str24 = listaSobreArreglos23.toString();
    java.lang.String str25 = listaSobreArreglos23.toString();
    java.lang.Object obj27 = null;
    listaSobreArreglos23.insertar((int)(byte)0, obj27);
    listaSobreArreglos15.insertar(0, (java.lang.Object)listaSobreArreglos23);
    listas.ListaSobreArreglos listaSobreArreglos30 = new listas.ListaSobreArreglos();
    boolean b31 = listaSobreArreglos30.esVacia();
    listaSobreArreglos30.vaciar();
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos30.equals(obj33);
    boolean b35 = listaSobreArreglos23.equals((java.lang.Object)listaSobreArreglos30);
    int i36 = listaSobreArreglos30.longitud();
    listas.ListaSobreArreglos listaSobreArreglos37 = new listas.ListaSobreArreglos();
    int i38 = listaSobreArreglos37.longitud();
    listaSobreArreglos37.vaciar();
    java.lang.String str40 = listaSobreArreglos37.toString();
    listas.ListaSobreArreglos listaSobreArreglos41 = new listas.ListaSobreArreglos();
    int i42 = listaSobreArreglos41.longitud();
    listaSobreArreglos41.vaciar();
    java.lang.String str44 = listaSobreArreglos41.toString();
    boolean b45 = listaSobreArreglos37.equals((java.lang.Object)listaSobreArreglos41);
    listas.ListaSobreArreglos listaSobreArreglos46 = new listas.ListaSobreArreglos();
    java.lang.String str47 = listaSobreArreglos46.toString();
    boolean b48 = listaSobreArreglos46.esVacia();
    listaSobreArreglos46.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj51 = null;
    boolean b52 = listaSobreArreglos46.equals(obj51);
    boolean b53 = listaSobreArreglos46.esVacia();
    listaSobreArreglos46.vaciar();
    boolean b55 = listaSobreArreglos46.esVacia();
    java.lang.Object obj56 = null;
    boolean b57 = listaSobreArreglos46.equals(obj56);
    java.lang.String str58 = listaSobreArreglos46.toString();
    listas.ListaSobreArreglos listaSobreArreglos59 = new listas.ListaSobreArreglos();
    int i60 = listaSobreArreglos59.longitud();
    boolean b61 = listaSobreArreglos59.esVacia();
    boolean b63 = listaSobreArreglos59.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos64 = new listas.ListaSobreArreglos();
    java.lang.String str65 = listaSobreArreglos64.toString();
    boolean b66 = listaSobreArreglos64.esVacia();
    listaSobreArreglos64.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos59.insertar((java.lang.Object)listaSobreArreglos64);
    java.lang.Object obj71 = listaSobreArreglos64.obtener(0);
    java.lang.Object obj72 = null;
    listaSobreArreglos64.insertar(obj72);
    boolean b74 = listaSobreArreglos46.equals((java.lang.Object)listaSobreArreglos64);
    listas.ListaSobreArreglos listaSobreArreglos75 = new listas.ListaSobreArreglos();
    int i76 = listaSobreArreglos75.longitud();
    boolean b77 = listaSobreArreglos75.esVacia();
    int i78 = listaSobreArreglos75.longitud();
    int i79 = listaSobreArreglos75.longitud();
    boolean b81 = listaSobreArreglos75.equals((java.lang.Object)(short)-1);
    listaSobreArreglos64.insertar((java.lang.Object)listaSobreArreglos75);
    listaSobreArreglos41.insertar((java.lang.Object)listaSobreArreglos64);
    listaSobreArreglos30.insertar((java.lang.Object)listaSobreArreglos41);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos41);
    listaSobreArreglos41.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos41", listaSobreArreglos41.repOk());

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.Object obj11 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj13 = listaSobreArreglos0.obtener(0);
    int i14 = listaSobreArreglos0.longitud();
    boolean b15 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos16 = new listas.ListaSobreArreglos();
    java.lang.String str17 = listaSobreArreglos16.toString();
    boolean b18 = listaSobreArreglos16.esVacia();
    listaSobreArreglos16.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj21 = null;
    boolean b22 = listaSobreArreglos16.equals(obj21);
    boolean b23 = listaSobreArreglos16.esVacia();
    listaSobreArreglos16.insertar((java.lang.Object)(-1.0d));
    java.lang.Object obj27 = null;
    listaSobreArreglos16.insertar(0, obj27);
    int i29 = listaSobreArreglos16.longitud();
    boolean b30 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos16);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.Object obj11 = listaSobreArreglos0.obtener(0);
    boolean b12 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos13 = new listas.ListaSobreArreglos();
    int i14 = listaSobreArreglos13.longitud();
    boolean b15 = listaSobreArreglos13.esVacia();
    listaSobreArreglos13.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos18 = new listas.ListaSobreArreglos();
    java.lang.String str19 = listaSobreArreglos18.toString();
    boolean b20 = listaSobreArreglos18.esVacia();
    listaSobreArreglos18.insertar((java.lang.Object)(short)-1);
    boolean b23 = listaSobreArreglos18.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos24 = new listas.ListaSobreArreglos();
    int i25 = listaSobreArreglos24.longitud();
    boolean b26 = listaSobreArreglos24.esVacia();
    listaSobreArreglos24.insertar((java.lang.Object)10.0f);
    java.lang.Object obj29 = null;
    listaSobreArreglos24.insertar(obj29);
    listaSobreArreglos18.insertar((java.lang.Object)listaSobreArreglos24);
    int i32 = listaSobreArreglos18.longitud();
    listaSobreArreglos13.insertar((java.lang.Object)listaSobreArreglos18);
    java.lang.Object obj34 = null;
    listaSobreArreglos18.insertar(obj34);
    boolean b36 = listaSobreArreglos18.esVacia();
    boolean b37 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos18);
    listas.ListaSobreArreglos listaSobreArreglos39 = new listas.ListaSobreArreglos();
    int i40 = listaSobreArreglos39.longitud();
    boolean b41 = listaSobreArreglos39.esVacia();
    listaSobreArreglos39.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos44 = new listas.ListaSobreArreglos();
    java.lang.String str45 = listaSobreArreglos44.toString();
    boolean b46 = listaSobreArreglos44.esVacia();
    listaSobreArreglos44.insertar((java.lang.Object)(short)-1);
    boolean b49 = listaSobreArreglos44.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos50 = new listas.ListaSobreArreglos();
    int i51 = listaSobreArreglos50.longitud();
    boolean b52 = listaSobreArreglos50.esVacia();
    listaSobreArreglos50.insertar((java.lang.Object)10.0f);
    java.lang.Object obj55 = null;
    listaSobreArreglos50.insertar(obj55);
    listaSobreArreglos44.insertar((java.lang.Object)listaSobreArreglos50);
    int i58 = listaSobreArreglos44.longitud();
    listaSobreArreglos39.insertar((java.lang.Object)listaSobreArreglos44);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos39);
    boolean b61 = listaSobreArreglos39.esVacia();
    java.lang.Object obj63 = listaSobreArreglos39.obtener(0);
    java.lang.String str64 = listaSobreArreglos39.toString();
    listaSobreArreglos39.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos39", listaSobreArreglos39.repOk());

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj5 = null;
    boolean b6 = listaSobreArreglos0.equals(obj5);
    boolean b7 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(-1.0d));
    java.lang.Object obj11 = null;
    listaSobreArreglos0.insertar(0, obj11);
    int i13 = listaSobreArreglos0.longitud();
    int i14 = listaSobreArreglos0.longitud();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos0.equals(obj15);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    java.lang.String str2 = listaSobreArreglos0.toString();
    java.lang.Object obj4 = null;
    listaSobreArreglos0.insertar((int)(byte)0, obj4);
    java.lang.Object obj6 = null;
    listaSobreArreglos0.insertar(obj6);
    listas.ListaSobreArreglos listaSobreArreglos9 = new listas.ListaSobreArreglos();
    java.lang.String str10 = listaSobreArreglos9.toString();
    boolean b11 = listaSobreArreglos9.esVacia();
    listaSobreArreglos9.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos9.equals(obj14);
    boolean b16 = listaSobreArreglos9.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    java.lang.String str18 = listaSobreArreglos17.toString();
    boolean b19 = listaSobreArreglos17.esVacia();
    java.lang.Object obj21 = null;
    listaSobreArreglos17.insertar(0, obj21);
    listaSobreArreglos17.insertar((java.lang.Object)1.0f);
    listaSobreArreglos9.insertar((java.lang.Object)listaSobreArreglos17);
    listas.ListaSobreArreglos listaSobreArreglos26 = new listas.ListaSobreArreglos();
    int i27 = listaSobreArreglos26.longitud();
    boolean b28 = listaSobreArreglos26.esVacia();
    boolean b30 = listaSobreArreglos26.equals((java.lang.Object)1);
    listaSobreArreglos26.insertar(0, (java.lang.Object)10.0d);
    listaSobreArreglos17.insertar((java.lang.Object)10.0d);
    listaSobreArreglos0.insertar((int)(short)1, (java.lang.Object)10.0d);
    java.lang.Object obj37 = null;
    listaSobreArreglos0.insertar(0, obj37);
    boolean b39 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)10.0f);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    java.lang.String str7 = listaSobreArreglos0.toString();
    int i8 = listaSobreArreglos0.longitud();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.String str10 = listaSobreArreglos0.toString();
    java.lang.Object obj12 = null;
    listaSobreArreglos0.insertar(0, obj12);
    listas.ListaSobreArreglos listaSobreArreglos14 = new listas.ListaSobreArreglos();
    java.lang.String str15 = listaSobreArreglos14.toString();
    java.lang.String str16 = listaSobreArreglos14.toString();
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    boolean b19 = listaSobreArreglos17.esVacia();
    listaSobreArreglos17.insertar((java.lang.Object)10.0f);
    java.lang.Object obj22 = null;
    listaSobreArreglos17.insertar(obj22);
    listaSobreArreglos14.insertar((java.lang.Object)listaSobreArreglos17);
    listas.ListaSobreArreglos listaSobreArreglos25 = new listas.ListaSobreArreglos();
    int i26 = listaSobreArreglos25.longitud();
    java.lang.Object obj28 = null;
    listaSobreArreglos25.insertar(0, obj28);
    int i30 = listaSobreArreglos25.longitud();
    listaSobreArreglos25.vaciar();
    listaSobreArreglos14.insertar((java.lang.Object)listaSobreArreglos25);
    boolean b33 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos14);
    listaSobreArreglos14.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos14", listaSobreArreglos14.repOk());

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    java.lang.String str3 = listaSobreArreglos0.toString();
    listas.ListaSobreArreglos listaSobreArreglos4 = new listas.ListaSobreArreglos();
    int i5 = listaSobreArreglos4.longitud();
    listaSobreArreglos4.vaciar();
    java.lang.String str7 = listaSobreArreglos4.toString();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos4);
    java.lang.Object obj9 = null;
    boolean b10 = listaSobreArreglos4.equals(obj9);
    listas.ListaSobreArreglos listaSobreArreglos11 = new listas.ListaSobreArreglos();
    int i12 = listaSobreArreglos11.longitud();
    listaSobreArreglos11.vaciar();
    java.lang.String str14 = listaSobreArreglos11.toString();
    listas.ListaSobreArreglos listaSobreArreglos15 = new listas.ListaSobreArreglos();
    int i16 = listaSobreArreglos15.longitud();
    listaSobreArreglos15.vaciar();
    java.lang.String str18 = listaSobreArreglos15.toString();
    boolean b19 = listaSobreArreglos11.equals((java.lang.Object)listaSobreArreglos15);
    listas.ListaSobreArreglos listaSobreArreglos20 = new listas.ListaSobreArreglos();
    int i21 = listaSobreArreglos20.longitud();
    boolean b22 = listaSobreArreglos20.esVacia();
    boolean b24 = listaSobreArreglos20.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos25 = new listas.ListaSobreArreglos();
    java.lang.String str26 = listaSobreArreglos25.toString();
    boolean b27 = listaSobreArreglos25.esVacia();
    listaSobreArreglos25.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos20.insertar((java.lang.Object)listaSobreArreglos25);
    listaSobreArreglos11.insertar((java.lang.Object)listaSobreArreglos25);
    listaSobreArreglos11.vaciar();
    boolean b33 = listaSobreArreglos11.esVacia();
    listaSobreArreglos11.vaciar();
    boolean b35 = listaSobreArreglos4.equals((java.lang.Object)listaSobreArreglos11);
    listaSobreArreglos11.vaciar();
    int i37 = listaSobreArreglos11.longitud();
    listas.ListaSobreArreglos listaSobreArreglos38 = new listas.ListaSobreArreglos();
    java.lang.String str39 = listaSobreArreglos38.toString();
    boolean b40 = listaSobreArreglos38.esVacia();
    listaSobreArreglos38.insertar((java.lang.Object)(short)-1);
    boolean b43 = listaSobreArreglos38.esVacia();
    boolean b44 = listaSobreArreglos38.esVacia();
    boolean b45 = listaSobreArreglos38.esVacia();
    int i46 = listaSobreArreglos38.longitud();
    java.lang.Object obj48 = listaSobreArreglos38.obtener(0);
    listaSobreArreglos11.insertar(obj48);
    listas.ListaSobreArreglos listaSobreArreglos51 = new listas.ListaSobreArreglos();
    boolean b52 = listaSobreArreglos51.esVacia();
    boolean b53 = listaSobreArreglos51.esVacia();
    boolean b54 = listaSobreArreglos51.esVacia();
    int i55 = listaSobreArreglos51.longitud();
    listas.ListaSobreArreglos listaSobreArreglos56 = new listas.ListaSobreArreglos();
    java.lang.String str57 = listaSobreArreglos56.toString();
    boolean b58 = listaSobreArreglos56.esVacia();
    listaSobreArreglos56.insertar((java.lang.Object)(short)-1);
    boolean b61 = listaSobreArreglos56.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos62 = new listas.ListaSobreArreglos();
    int i63 = listaSobreArreglos62.longitud();
    boolean b64 = listaSobreArreglos62.esVacia();
    listaSobreArreglos62.insertar((java.lang.Object)10.0f);
    java.lang.Object obj67 = null;
    listaSobreArreglos62.insertar(obj67);
    listaSobreArreglos56.insertar((java.lang.Object)listaSobreArreglos62);
    listaSobreArreglos51.insertar((java.lang.Object)listaSobreArreglos62);
    int i71 = listaSobreArreglos62.longitud();
    listaSobreArreglos11.insertar((int)(short)0, (java.lang.Object)i71);
    listaSobreArreglos11.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos11", listaSobreArreglos11.repOk());

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1);
    listaSobreArreglos0.insertar(0, (java.lang.Object)10.0d);
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    java.lang.Object obj11 = listaSobreArreglos0.obtener(0);
    boolean b12 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos13 = new listas.ListaSobreArreglos();
    int i14 = listaSobreArreglos13.longitud();
    boolean b15 = listaSobreArreglos13.esVacia();
    listaSobreArreglos13.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos18 = new listas.ListaSobreArreglos();
    java.lang.String str19 = listaSobreArreglos18.toString();
    boolean b20 = listaSobreArreglos18.esVacia();
    listaSobreArreglos18.insertar((java.lang.Object)(short)-1);
    boolean b23 = listaSobreArreglos18.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos24 = new listas.ListaSobreArreglos();
    int i25 = listaSobreArreglos24.longitud();
    boolean b26 = listaSobreArreglos24.esVacia();
    listaSobreArreglos24.insertar((java.lang.Object)10.0f);
    java.lang.Object obj29 = null;
    listaSobreArreglos24.insertar(obj29);
    listaSobreArreglos18.insertar((java.lang.Object)listaSobreArreglos24);
    int i32 = listaSobreArreglos18.longitud();
    listaSobreArreglos13.insertar((java.lang.Object)listaSobreArreglos18);
    java.lang.Object obj34 = null;
    listaSobreArreglos18.insertar(obj34);
    boolean b36 = listaSobreArreglos18.esVacia();
    boolean b37 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos18);
    listas.ListaSobreArreglos listaSobreArreglos39 = new listas.ListaSobreArreglos();
    int i40 = listaSobreArreglos39.longitud();
    boolean b41 = listaSobreArreglos39.esVacia();
    listaSobreArreglos39.insertar((java.lang.Object)10.0f);
    listas.ListaSobreArreglos listaSobreArreglos44 = new listas.ListaSobreArreglos();
    java.lang.String str45 = listaSobreArreglos44.toString();
    boolean b46 = listaSobreArreglos44.esVacia();
    listaSobreArreglos44.insertar((java.lang.Object)(short)-1);
    boolean b49 = listaSobreArreglos44.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos50 = new listas.ListaSobreArreglos();
    int i51 = listaSobreArreglos50.longitud();
    boolean b52 = listaSobreArreglos50.esVacia();
    listaSobreArreglos50.insertar((java.lang.Object)10.0f);
    java.lang.Object obj55 = null;
    listaSobreArreglos50.insertar(obj55);
    listaSobreArreglos44.insertar((java.lang.Object)listaSobreArreglos50);
    int i58 = listaSobreArreglos44.longitud();
    listaSobreArreglos39.insertar((java.lang.Object)listaSobreArreglos44);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos39);
    listaSobreArreglos0.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos0", listaSobreArreglos0.repOk());

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    java.lang.String str1 = listaSobreArreglos0.toString();
    boolean b2 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)(short)-1);
    boolean b5 = listaSobreArreglos0.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos6 = new listas.ListaSobreArreglos();
    int i7 = listaSobreArreglos6.longitud();
    boolean b8 = listaSobreArreglos6.esVacia();
    listaSobreArreglos6.insertar((java.lang.Object)10.0f);
    java.lang.Object obj11 = null;
    listaSobreArreglos6.insertar(obj11);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    int i14 = listaSobreArreglos0.longitud();
    listas.ListaSobreArreglos listaSobreArreglos15 = new listas.ListaSobreArreglos();
    boolean b16 = listaSobreArreglos15.esVacia();
    boolean b17 = listaSobreArreglos15.esVacia();
    boolean b18 = listaSobreArreglos15.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos19 = new listas.ListaSobreArreglos();
    int i20 = listaSobreArreglos19.longitud();
    boolean b21 = listaSobreArreglos19.esVacia();
    boolean b23 = listaSobreArreglos19.equals((java.lang.Object)1);
    listaSobreArreglos19.insertar(0, (java.lang.Object)10.0d);
    boolean b27 = listaSobreArreglos19.esVacia();
    java.lang.String str28 = listaSobreArreglos19.toString();
    java.lang.Object obj30 = listaSobreArreglos19.obtener(0);
    listaSobreArreglos15.insertar(obj30);
    boolean b32 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos15);
    java.lang.Object obj33 = null;
    listaSobreArreglos15.insertar(obj33);
    listas.ListaSobreArreglos listaSobreArreglos35 = new listas.ListaSobreArreglos();
    java.lang.String str36 = listaSobreArreglos35.toString();
    boolean b37 = listaSobreArreglos35.esVacia();
    listaSobreArreglos35.insertar((java.lang.Object)(short)-1);
    java.lang.Object obj40 = null;
    boolean b41 = listaSobreArreglos35.equals(obj40);
    boolean b42 = listaSobreArreglos35.esVacia();
    listas.ListaSobreArreglos listaSobreArreglos43 = new listas.ListaSobreArreglos();
    java.lang.String str44 = listaSobreArreglos43.toString();
    boolean b45 = listaSobreArreglos43.esVacia();
    java.lang.Object obj47 = null;
    listaSobreArreglos43.insertar(0, obj47);
    listaSobreArreglos43.insertar((java.lang.Object)1.0f);
    listaSobreArreglos35.insertar((java.lang.Object)listaSobreArreglos43);
    listas.ListaSobreArreglos listaSobreArreglos52 = new listas.ListaSobreArreglos();
    java.lang.String str53 = listaSobreArreglos52.toString();
    java.lang.String str54 = listaSobreArreglos52.toString();
    listas.ListaSobreArreglos listaSobreArreglos55 = new listas.ListaSobreArreglos();
    int i56 = listaSobreArreglos55.longitud();
    boolean b57 = listaSobreArreglos55.esVacia();
    listaSobreArreglos55.insertar((java.lang.Object)10.0f);
    java.lang.Object obj60 = null;
    listaSobreArreglos55.insertar(obj60);
    listaSobreArreglos52.insertar((java.lang.Object)listaSobreArreglos55);
    listaSobreArreglos43.insertar((java.lang.Object)listaSobreArreglos55);
    listaSobreArreglos15.insertar((java.lang.Object)listaSobreArreglos43);
    int i65 = listaSobreArreglos43.longitud();
    java.lang.Object obj67 = listaSobreArreglos43.obtener((int)(byte)1);
    listaSobreArreglos43.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos43", listaSobreArreglos43.repOk());

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }

    listas.ListaSobreArreglos listaSobreArreglos0 = new listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    java.lang.Object obj3 = null;
    listaSobreArreglos0.insertar(0, obj3);
    java.lang.Object obj5 = null;
    listaSobreArreglos0.insertar(obj5);
    listas.ListaSobreArreglos listaSobreArreglos8 = new listas.ListaSobreArreglos();
    int i9 = listaSobreArreglos8.longitud();
    listaSobreArreglos8.vaciar();
    java.lang.String str11 = listaSobreArreglos8.toString();
    listas.ListaSobreArreglos listaSobreArreglos12 = new listas.ListaSobreArreglos();
    int i13 = listaSobreArreglos12.longitud();
    listaSobreArreglos12.vaciar();
    java.lang.String str15 = listaSobreArreglos12.toString();
    boolean b16 = listaSobreArreglos8.equals((java.lang.Object)listaSobreArreglos12);
    listas.ListaSobreArreglos listaSobreArreglos17 = new listas.ListaSobreArreglos();
    int i18 = listaSobreArreglos17.longitud();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b21 = listaSobreArreglos17.equals((java.lang.Object)1);
    listas.ListaSobreArreglos listaSobreArreglos22 = new listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    listaSobreArreglos22.insertar((java.lang.Object)(short)-1);
    listaSobreArreglos17.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos22);
    boolean b29 = listaSobreArreglos22.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos22);
    java.lang.String str31 = listaSobreArreglos22.toString();
    java.lang.Object obj32 = null;
    listaSobreArreglos22.insertar(obj32);
    java.lang.Object obj34 = null;
    boolean b35 = listaSobreArreglos22.equals(obj34);
    listas.ListaSobreArreglos listaSobreArreglos36 = new listas.ListaSobreArreglos();
    int i37 = listaSobreArreglos36.longitud();
    boolean b38 = listaSobreArreglos36.esVacia();
    listaSobreArreglos36.vaciar();
    listaSobreArreglos36.vaciar();
    boolean b41 = listaSobreArreglos36.esVacia();
    java.lang.Object obj43 = null;
    listaSobreArreglos36.insertar((int)(short)0, obj43);
    java.lang.Object obj45 = null;
    listaSobreArreglos36.insertar(obj45);
    boolean b47 = listaSobreArreglos22.equals((java.lang.Object)listaSobreArreglos36);
    java.lang.String str48 = listaSobreArreglos22.toString();
    listaSobreArreglos22.eliminar(0);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for listaSobreArreglos22", listaSobreArreglos22.repOk());

  }

}
