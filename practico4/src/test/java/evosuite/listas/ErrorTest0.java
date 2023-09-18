package evosuite.listas;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)100L);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str4 = listaSobreArreglos0.toString();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar((java.lang.Object)0.0d);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = listaSobreArreglos0.toString();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos7.equals(obj8);
    java.lang.String str10 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    int i12 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    boolean b18 = listaSobreArreglos13.equals((java.lang.Object)0.0f);
    boolean b19 = listaSobreArreglos13.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    listaSobreArreglos13.insertar(0, (java.lang.Object)b27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos13.equals(obj33);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos13);
    boolean b36 = listaSobreArreglos0.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str37 = listaSobreArreglos0.toString();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos7.equals(obj8);
    java.lang.String str10 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    int i12 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    boolean b18 = listaSobreArreglos13.equals((java.lang.Object)0.0f);
    boolean b19 = listaSobreArreglos13.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    listaSobreArreglos13.insertar(0, (java.lang.Object)b27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos13.equals(obj33);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos13);
    boolean b36 = listaSobreArreglos13.repOk();
    java.lang.Object obj37 = null;
    boolean b38 = listaSobreArreglos13.equals(obj37);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str39 = listaSobreArreglos13.toString();

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    int i7 = listaSobreArreglos0.longitud();
    boolean b8 = listaSobreArreglos0.repOk();
    int i9 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos10.vaciar();
    boolean b12 = listaSobreArreglos10.esVacia();
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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos30 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str31 = listaSobreArreglos30.toString();
    boolean b32 = listaSobreArreglos30.esVacia();
    boolean b33 = listaSobreArreglos14.equals((java.lang.Object)listaSobreArreglos30);
    java.lang.Object obj34 = null;
    boolean b35 = listaSobreArreglos14.equals(obj34);
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos14);
    boolean b37 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str38 = listaSobreArreglos10.toString();

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b15 = listaSobreArreglos13.esVacia();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos13.equals(obj16);
    listaSobreArreglos13.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj21 = null;
    boolean b22 = listaSobreArreglos20.equals(obj21);
    java.lang.String str23 = listaSobreArreglos20.toString();
    listaSobreArreglos13.insertar(0, (java.lang.Object)listaSobreArreglos20);
    int i25 = listaSobreArreglos13.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos26 = new evosuite.listas.ListaSobreArreglos();
    boolean b27 = listaSobreArreglos26.esVacia();
    boolean b29 = listaSobreArreglos26.equals((java.lang.Object)100.0f);
    boolean b31 = listaSobreArreglos26.equals((java.lang.Object)0.0f);
    boolean b32 = listaSobreArreglos26.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    boolean b35 = listaSobreArreglos34.esVacia();
    boolean b37 = listaSobreArreglos34.equals((java.lang.Object)100.0f);
    boolean b39 = listaSobreArreglos34.equals((java.lang.Object)0.0f);
    boolean b40 = listaSobreArreglos34.repOk();
    listaSobreArreglos26.insertar(0, (java.lang.Object)b40);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos42 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str43 = listaSobreArreglos42.toString();
    boolean b44 = listaSobreArreglos42.esVacia();
    boolean b45 = listaSobreArreglos26.equals((java.lang.Object)listaSobreArreglos42);
    java.lang.Object obj46 = null;
    boolean b47 = listaSobreArreglos26.equals(obj46);
    listaSobreArreglos13.insertar((java.lang.Object)listaSobreArreglos26);
    boolean b49 = listaSobreArreglos13.esVacia();
    java.lang.Object obj51 = listaSobreArreglos13.obtener(0);
    boolean b52 = listaSobreArreglos13.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str54 = listaSobreArreglos0.toString();

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    java.lang.String str7 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos8.vaciar();
    boolean b10 = listaSobreArreglos8.repOk();
    boolean b12 = listaSobreArreglos8.equals((java.lang.Object)1.0f);
    listaSobreArreglos8.vaciar();
    listaSobreArreglos8.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.repOk();
    listaSobreArreglos8.insertar(0, (java.lang.Object)listaSobreArreglos16);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str20 = listaSobreArreglos0.toString();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    boolean b12 = listaSobreArreglos11.esVacia();
    boolean b13 = listaSobreArreglos11.esVacia();
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos11.equals(obj14);
    listaSobreArreglos11.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos18 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj19 = null;
    boolean b20 = listaSobreArreglos18.equals(obj19);
    java.lang.String str21 = listaSobreArreglos18.toString();
    listaSobreArreglos11.insertar(0, (java.lang.Object)listaSobreArreglos18);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str24 = listaSobreArreglos0.toString();

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    int i7 = listaSobreArreglos0.longitud();
    boolean b8 = listaSobreArreglos0.repOk();
    int i9 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos10.vaciar();
    boolean b12 = listaSobreArreglos10.esVacia();
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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos30 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str31 = listaSobreArreglos30.toString();
    boolean b32 = listaSobreArreglos30.esVacia();
    boolean b33 = listaSobreArreglos14.equals((java.lang.Object)listaSobreArreglos30);
    java.lang.Object obj34 = null;
    boolean b35 = listaSobreArreglos14.equals(obj34);
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos14);
    boolean b37 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos10);
    boolean b38 = listaSobreArreglos10.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str39 = listaSobreArreglos10.toString();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)100L);
    java.lang.Object obj4 = null;
    boolean b5 = listaSobreArreglos0.equals(obj4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = listaSobreArreglos0.toString();

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    int i5 = listaSobreArreglos0.longitud();
    boolean b6 = listaSobreArreglos0.esVacia();
    java.lang.Object obj8 = listaSobreArreglos0.obtener(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str9 = listaSobreArreglos0.toString();

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos7.equals(obj8);
    java.lang.String str10 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    int i12 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    boolean b18 = listaSobreArreglos13.equals((java.lang.Object)0.0f);
    boolean b19 = listaSobreArreglos13.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    listaSobreArreglos13.insertar(0, (java.lang.Object)b27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos13.equals(obj33);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos13);
    listaSobreArreglos13.insertar(0, (java.lang.Object)0L);
    boolean b39 = listaSobreArreglos13.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str40 = listaSobreArreglos13.toString();

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)'a');
    boolean b8 = listaSobreArreglos0.repOk();
    boolean b9 = listaSobreArreglos0.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = listaSobreArreglos0.toString();

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos7.equals(obj8);
    java.lang.String str10 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    int i12 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    boolean b18 = listaSobreArreglos13.equals((java.lang.Object)0.0f);
    boolean b19 = listaSobreArreglos13.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    listaSobreArreglos13.insertar(0, (java.lang.Object)b27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos13.equals(obj33);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos13);
    java.lang.Object obj36 = null;
    boolean b37 = listaSobreArreglos13.equals(obj36);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos38 = new evosuite.listas.ListaSobreArreglos();
    boolean b39 = listaSobreArreglos38.esVacia();
    boolean b41 = listaSobreArreglos38.equals((java.lang.Object)100.0f);
    boolean b43 = listaSobreArreglos38.equals((java.lang.Object)0.0f);
    int i44 = listaSobreArreglos38.longitud();
    java.lang.String str45 = listaSobreArreglos38.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos46 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos46.vaciar();
    boolean b48 = listaSobreArreglos46.repOk();
    boolean b50 = listaSobreArreglos46.equals((java.lang.Object)1.0f);
    listaSobreArreglos46.vaciar();
    listaSobreArreglos46.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos54 = new evosuite.listas.ListaSobreArreglos();
    boolean b55 = listaSobreArreglos54.repOk();
    listaSobreArreglos46.insertar(0, (java.lang.Object)listaSobreArreglos54);
    listaSobreArreglos38.insertar((java.lang.Object)listaSobreArreglos54);
    boolean b58 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos54);
    int i59 = listaSobreArreglos13.longitud();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str60 = listaSobreArreglos13.toString();

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.repOk();
    boolean b2 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos3 = new evosuite.listas.ListaSobreArreglos();
    boolean b4 = listaSobreArreglos3.esVacia();
    boolean b5 = listaSobreArreglos3.esVacia();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos3.equals(obj6);
    listaSobreArreglos3.vaciar();
    listaSobreArreglos3.vaciar();
    int i10 = listaSobreArreglos3.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str12 = listaSobreArreglos0.toString();

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)(byte)-1);
    boolean b6 = listaSobreArreglos0.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = listaSobreArreglos0.toString();

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.repOk();
    boolean b2 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos3 = new evosuite.listas.ListaSobreArreglos();
    boolean b4 = listaSobreArreglos3.esVacia();
    boolean b5 = listaSobreArreglos3.esVacia();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos3.equals(obj6);
    listaSobreArreglos3.vaciar();
    listaSobreArreglos3.vaciar();
    int i10 = listaSobreArreglos3.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    java.lang.Object obj13 = listaSobreArreglos0.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b17 = listaSobreArreglos14.equals((java.lang.Object)100.0f);
    java.lang.String str18 = listaSobreArreglos14.toString();
    boolean b19 = listaSobreArreglos14.repOk();
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos14.equals(obj20);
    java.lang.String str22 = listaSobreArreglos14.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b26 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.repOk();
    listaSobreArreglos14.insertar(0, (java.lang.Object)b27);
    boolean b29 = listaSobreArreglos14.esVacia();
    boolean b30 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str31 = listaSobreArreglos0.toString();

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

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
    listaSobreArreglos0.insertar((java.lang.Object)1L);
    int i13 = listaSobreArreglos0.longitud();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str14 = listaSobreArreglos0.toString();

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1.0f);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos8);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str11 = listaSobreArreglos0.toString();

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos3 = new evosuite.listas.ListaSobreArreglos();
    boolean b4 = listaSobreArreglos3.esVacia();
    boolean b6 = listaSobreArreglos3.equals((java.lang.Object)100.0f);
    java.lang.String str7 = listaSobreArreglos3.toString();
    boolean b8 = listaSobreArreglos3.repOk();
    java.lang.Object obj9 = null;
    boolean b10 = listaSobreArreglos3.equals(obj9);
    listaSobreArreglos3.vaciar();
    boolean b12 = listaSobreArreglos3.repOk();
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos3.equals(obj13);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    int i16 = listaSobreArreglos3.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos18 = new evosuite.listas.ListaSobreArreglos();
    boolean b19 = listaSobreArreglos18.esVacia();
    listaSobreArreglos18.insertar((java.lang.Object)100L);
    java.lang.Object obj22 = null;
    boolean b23 = listaSobreArreglos18.equals(obj22);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    boolean b25 = listaSobreArreglos24.esVacia();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)100.0f);
    java.lang.String str28 = listaSobreArreglos24.toString();
    boolean b29 = listaSobreArreglos24.repOk();
    boolean b30 = listaSobreArreglos24.esVacia();
    int i31 = listaSobreArreglos24.longitud();
    boolean b32 = listaSobreArreglos18.equals((java.lang.Object)i31);
    listaSobreArreglos3.insertar(0, (java.lang.Object)b32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str34 = listaSobreArreglos3.toString();

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

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
    listaSobreArreglos0.insertar((java.lang.Object)"[]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str16 = listaSobreArreglos0.toString();

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos7.equals(obj8);
    java.lang.String str10 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    int i12 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    boolean b18 = listaSobreArreglos13.equals((java.lang.Object)0.0f);
    boolean b19 = listaSobreArreglos13.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    listaSobreArreglos13.insertar(0, (java.lang.Object)b27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos13.equals(obj33);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos13);
    boolean b36 = listaSobreArreglos0.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str37 = listaSobreArreglos0.toString();

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos0.equals(obj6);
    listaSobreArreglos0.vaciar();
    boolean b9 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    boolean b12 = listaSobreArreglos11.esVacia();
    boolean b13 = listaSobreArreglos11.esVacia();
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos11.equals(obj14);
    listaSobreArreglos11.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos18 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj19 = null;
    boolean b20 = listaSobreArreglos18.equals(obj19);
    java.lang.String str21 = listaSobreArreglos18.toString();
    listaSobreArreglos11.insertar(0, (java.lang.Object)listaSobreArreglos18);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos18);
    java.lang.Object obj25 = listaSobreArreglos0.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos26 = new evosuite.listas.ListaSobreArreglos();
    boolean b27 = listaSobreArreglos26.esVacia();
    boolean b28 = listaSobreArreglos26.esVacia();
    java.lang.Object obj29 = null;
    boolean b30 = listaSobreArreglos26.equals(obj29);
    listaSobreArreglos26.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj34 = null;
    boolean b35 = listaSobreArreglos33.equals(obj34);
    java.lang.String str36 = listaSobreArreglos33.toString();
    listaSobreArreglos26.insertar(0, (java.lang.Object)listaSobreArreglos33);
    int i38 = listaSobreArreglos26.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos39 = new evosuite.listas.ListaSobreArreglos();
    boolean b40 = listaSobreArreglos39.esVacia();
    boolean b42 = listaSobreArreglos39.equals((java.lang.Object)100.0f);
    boolean b44 = listaSobreArreglos39.equals((java.lang.Object)0.0f);
    boolean b45 = listaSobreArreglos39.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos47 = new evosuite.listas.ListaSobreArreglos();
    boolean b48 = listaSobreArreglos47.esVacia();
    boolean b50 = listaSobreArreglos47.equals((java.lang.Object)100.0f);
    boolean b52 = listaSobreArreglos47.equals((java.lang.Object)0.0f);
    boolean b53 = listaSobreArreglos47.repOk();
    listaSobreArreglos39.insertar(0, (java.lang.Object)b53);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos55 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str56 = listaSobreArreglos55.toString();
    boolean b57 = listaSobreArreglos55.esVacia();
    boolean b58 = listaSobreArreglos39.equals((java.lang.Object)listaSobreArreglos55);
    java.lang.Object obj59 = null;
    boolean b60 = listaSobreArreglos39.equals(obj59);
    listaSobreArreglos26.insertar((java.lang.Object)listaSobreArreglos39);
    boolean b62 = listaSobreArreglos39.repOk();
    java.lang.Object obj63 = null;
    boolean b64 = listaSobreArreglos39.equals(obj63);
    boolean b65 = listaSobreArreglos39.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)b65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str67 = listaSobreArreglos0.toString();

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos7.equals(obj8);
    java.lang.String str10 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    int i12 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    boolean b18 = listaSobreArreglos13.equals((java.lang.Object)0.0f);
    boolean b19 = listaSobreArreglos13.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    listaSobreArreglos13.insertar(0, (java.lang.Object)b27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos13.equals(obj33);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos13);
    boolean b36 = listaSobreArreglos13.repOk();
    boolean b37 = listaSobreArreglos13.esVacia();
    java.lang.Object obj38 = null;
    boolean b39 = listaSobreArreglos13.equals(obj38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str40 = listaSobreArreglos13.toString();

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)100L);
    boolean b4 = listaSobreArreglos0.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = listaSobreArreglos0.toString();

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }

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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str17 = listaSobreArreglos0.toString();

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    java.lang.String str6 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b9 = listaSobreArreglos7.esVacia();
    java.lang.Object obj10 = null;
    boolean b11 = listaSobreArreglos7.equals(obj10);
    java.lang.String str12 = listaSobreArreglos7.toString();
    boolean b13 = listaSobreArreglos7.repOk();
    int i14 = listaSobreArreglos7.longitud();
    boolean b15 = listaSobreArreglos7.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str17 = listaSobreArreglos0.toString();

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    listaSobreArreglos0.insertar(0, (java.lang.Object)0L);
    boolean b12 = listaSobreArreglos0.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str13 = listaSobreArreglos0.toString();

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj1 = null;
    boolean b2 = listaSobreArreglos0.equals(obj1);
    java.lang.String str3 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    boolean b7 = listaSobreArreglos5.esVacia();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos5.equals(obj8);
    listaSobreArreglos5.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos12.equals(obj13);
    java.lang.String str15 = listaSobreArreglos12.toString();
    listaSobreArreglos5.insertar(0, (java.lang.Object)listaSobreArreglos12);
    int i17 = listaSobreArreglos5.longitud();
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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str35 = listaSobreArreglos34.toString();
    boolean b36 = listaSobreArreglos34.esVacia();
    boolean b37 = listaSobreArreglos18.equals((java.lang.Object)listaSobreArreglos34);
    java.lang.Object obj38 = null;
    boolean b39 = listaSobreArreglos18.equals(obj38);
    listaSobreArreglos5.insertar((java.lang.Object)listaSobreArreglos18);
    listaSobreArreglos18.eliminar(0);
    listaSobreArreglos0.insertar(0, (java.lang.Object)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str44 = listaSobreArreglos0.toString();

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }

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
    boolean b16 = listaSobreArreglos0.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str17 = listaSobreArreglos0.toString();

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos7.equals(obj8);
    java.lang.String str10 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    int i12 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    boolean b18 = listaSobreArreglos13.equals((java.lang.Object)0.0f);
    boolean b19 = listaSobreArreglos13.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    listaSobreArreglos13.insertar(0, (java.lang.Object)b27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str30 = listaSobreArreglos29.toString();
    boolean b31 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos29);
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos13.equals(obj33);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos13);
    java.lang.Object obj36 = null;
    boolean b37 = listaSobreArreglos13.equals(obj36);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos38 = new evosuite.listas.ListaSobreArreglos();
    boolean b39 = listaSobreArreglos38.esVacia();
    boolean b41 = listaSobreArreglos38.equals((java.lang.Object)100.0f);
    boolean b43 = listaSobreArreglos38.equals((java.lang.Object)0.0f);
    int i44 = listaSobreArreglos38.longitud();
    java.lang.String str45 = listaSobreArreglos38.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos46 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos46.vaciar();
    boolean b48 = listaSobreArreglos46.repOk();
    boolean b50 = listaSobreArreglos46.equals((java.lang.Object)1.0f);
    listaSobreArreglos46.vaciar();
    listaSobreArreglos46.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos54 = new evosuite.listas.ListaSobreArreglos();
    boolean b55 = listaSobreArreglos54.repOk();
    listaSobreArreglos46.insertar(0, (java.lang.Object)listaSobreArreglos54);
    listaSobreArreglos38.insertar((java.lang.Object)listaSobreArreglos54);
    boolean b58 = listaSobreArreglos13.equals((java.lang.Object)listaSobreArreglos54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str59 = listaSobreArreglos13.toString();

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    int i5 = listaSobreArreglos0.longitud();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = listaSobreArreglos0.toString();

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }

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
    listaSobreArreglos0.insertar((java.lang.Object)1L);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str13 = listaSobreArreglos0.toString();

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b7 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b11 = listaSobreArreglos9.esVacia();
    java.lang.Object obj12 = null;
    boolean b13 = listaSobreArreglos9.equals(obj12);
    listaSobreArreglos9.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos16.equals(obj17);
    java.lang.String str19 = listaSobreArreglos16.toString();
    listaSobreArreglos9.insertar(0, (java.lang.Object)listaSobreArreglos16);
    int i21 = listaSobreArreglos9.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)i21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str23 = listaSobreArreglos0.toString();

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    int i7 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos8.vaciar();
    boolean b10 = listaSobreArreglos8.repOk();
    boolean b12 = listaSobreArreglos8.equals((java.lang.Object)1.0f);
    listaSobreArreglos8.vaciar();
    listaSobreArreglos8.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.repOk();
    listaSobreArreglos8.insertar(0, (java.lang.Object)listaSobreArreglos16);
    listaSobreArreglos0.insertar((java.lang.Object)0);
    boolean b20 = listaSobreArreglos0.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str21 = listaSobreArreglos0.toString();

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }

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
    listaSobreArreglos0.insertar((java.lang.Object)"[]");
    java.lang.Object obj17 = listaSobreArreglos0.obtener(0);
    int i18 = listaSobreArreglos0.longitud();
    int i19 = listaSobreArreglos0.longitud();
    java.lang.Object obj20 = null;
    boolean b21 = listaSobreArreglos0.equals(obj20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str22 = listaSobreArreglos0.toString();

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test37"); }

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
    listaSobreArreglos0.insertar((java.lang.Object)1L);
    int i13 = listaSobreArreglos0.longitud();
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos0.equals(obj14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str16 = listaSobreArreglos0.toString();

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test38"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str9 = listaSobreArreglos8.toString();
    boolean b10 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos0.equals((java.lang.Object)b10);
    java.lang.String str12 = listaSobreArreglos0.toString();
    int i13 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str16 = listaSobreArreglos15.toString();
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos15.equals(obj17);
    listaSobreArreglos0.insertar(0, (java.lang.Object)b18);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b22 = listaSobreArreglos20.esVacia();
    java.lang.Object obj23 = null;
    boolean b24 = listaSobreArreglos20.equals(obj23);
    listaSobreArreglos20.vaciar();
    listaSobreArreglos20.vaciar();
    int i27 = listaSobreArreglos20.longitud();
    int i28 = listaSobreArreglos20.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str30 = listaSobreArreglos0.toString();

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test39"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)100L);
    java.lang.Object obj4 = null;
    boolean b5 = listaSobreArreglos0.equals(obj4);
    java.lang.Object obj7 = listaSobreArreglos0.obtener((int)(short)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = listaSobreArreglos0.toString();

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test40"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1.0f);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos8);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos0.equals(obj13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str15 = listaSobreArreglos0.toString();

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test41"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    boolean b14 = listaSobreArreglos9.equals((java.lang.Object)0.0f);
    int i15 = listaSobreArreglos9.longitud();
    boolean b16 = listaSobreArreglos9.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str18 = listaSobreArreglos17.toString();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos9.equals((java.lang.Object)b19);
    java.lang.String str21 = listaSobreArreglos9.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b24 = listaSobreArreglos22.esVacia();
    java.lang.Object obj25 = null;
    boolean b26 = listaSobreArreglos22.equals(obj25);
    boolean b27 = listaSobreArreglos22.esVacia();
    listaSobreArreglos9.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos22);
    java.lang.Object obj32 = listaSobreArreglos0.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos34.vaciar();
    boolean b36 = listaSobreArreglos34.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.esVacia();
    boolean b40 = listaSobreArreglos37.equals((java.lang.Object)100.0f);
    java.lang.String str41 = listaSobreArreglos37.toString();
    boolean b42 = listaSobreArreglos37.repOk();
    java.lang.Object obj43 = null;
    boolean b44 = listaSobreArreglos37.equals(obj43);
    listaSobreArreglos37.vaciar();
    boolean b46 = listaSobreArreglos37.repOk();
    java.lang.Object obj47 = null;
    boolean b48 = listaSobreArreglos37.equals(obj47);
    listaSobreArreglos34.insertar((java.lang.Object)listaSobreArreglos37);
    listaSobreArreglos34.eliminar(0);
    listaSobreArreglos34.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos34);
    boolean b54 = listaSobreArreglos0.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str55 = listaSobreArreglos0.toString();

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test42"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    listaSobreArreglos0.insertar((java.lang.Object)(byte)-1);
    int i6 = listaSobreArreglos0.longitud();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = listaSobreArreglos0.toString();

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test43"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.String str3 = listaSobreArreglos0.toString();
    java.lang.Object obj4 = null;
    boolean b5 = listaSobreArreglos0.equals(obj4);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.repOk();
    java.lang.String str9 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str11 = listaSobreArreglos0.toString();

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test44"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos7.vaciar();
    boolean b9 = listaSobreArreglos7.repOk();
    boolean b10 = listaSobreArreglos7.repOk();
    boolean b11 = listaSobreArreglos7.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str13 = listaSobreArreglos0.toString();

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test45"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos4 = new evosuite.listas.ListaSobreArreglos();
    boolean b5 = listaSobreArreglos4.esVacia();
    boolean b7 = listaSobreArreglos4.equals((java.lang.Object)100.0f);
    boolean b9 = listaSobreArreglos4.equals((java.lang.Object)0.0f);
    boolean b10 = listaSobreArreglos4.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)b10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str12 = listaSobreArreglos0.toString();

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test46"); }

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
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos12 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj13 = null;
    boolean b14 = listaSobreArreglos12.equals(obj13);
    java.lang.String str15 = listaSobreArreglos12.toString();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos12.equals(obj16);
    boolean b18 = listaSobreArreglos12.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str20 = listaSobreArreglos0.toString();

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test47"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b3 = listaSobreArreglos0.esVacia();
    java.lang.String str4 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos5 = new evosuite.listas.ListaSobreArreglos();
    boolean b6 = listaSobreArreglos5.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.equals((java.lang.Object)100.0f);
    java.lang.String str11 = listaSobreArreglos7.toString();
    boolean b12 = listaSobreArreglos7.repOk();
    boolean b13 = listaSobreArreglos5.equals((java.lang.Object)b12);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b17 = listaSobreArreglos14.equals((java.lang.Object)100.0f);
    boolean b19 = listaSobreArreglos14.equals((java.lang.Object)0.0f);
    int i20 = listaSobreArreglos14.longitud();
    boolean b21 = listaSobreArreglos14.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str23 = listaSobreArreglos22.toString();
    boolean b24 = listaSobreArreglos22.esVacia();
    boolean b25 = listaSobreArreglos14.equals((java.lang.Object)b24);
    java.lang.String str26 = listaSobreArreglos14.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos27 = new evosuite.listas.ListaSobreArreglos();
    boolean b28 = listaSobreArreglos27.esVacia();
    boolean b29 = listaSobreArreglos27.esVacia();
    java.lang.Object obj30 = null;
    boolean b31 = listaSobreArreglos27.equals(obj30);
    boolean b32 = listaSobreArreglos27.esVacia();
    listaSobreArreglos14.insertar((java.lang.Object)listaSobreArreglos27);
    listaSobreArreglos27.vaciar();
    listaSobreArreglos5.insertar((java.lang.Object)listaSobreArreglos27);
    boolean b36 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.esVacia();
    boolean b40 = listaSobreArreglos37.equals((java.lang.Object)100.0f);
    boolean b42 = listaSobreArreglos37.equals((java.lang.Object)0.0f);
    boolean b43 = listaSobreArreglos37.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos45 = new evosuite.listas.ListaSobreArreglos();
    boolean b46 = listaSobreArreglos45.esVacia();
    boolean b48 = listaSobreArreglos45.equals((java.lang.Object)100.0f);
    boolean b50 = listaSobreArreglos45.equals((java.lang.Object)0.0f);
    boolean b51 = listaSobreArreglos45.repOk();
    listaSobreArreglos37.insertar(0, (java.lang.Object)b51);
    listaSobreArreglos37.vaciar();
    int i54 = listaSobreArreglos37.longitud();
    int i55 = listaSobreArreglos37.longitud();
    listaSobreArreglos37.vaciar();
    boolean b57 = listaSobreArreglos37.esVacia();
    java.lang.String str58 = listaSobreArreglos37.toString();
    listaSobreArreglos27.insertar((java.lang.Object)listaSobreArreglos37);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str60 = listaSobreArreglos27.toString();

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test48"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    boolean b5 = listaSobreArreglos0.repOk();
    boolean b6 = listaSobreArreglos0.esVacia();
    int i7 = listaSobreArreglos0.longitud();
    boolean b8 = listaSobreArreglos0.esVacia();
    java.lang.String str9 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos10.vaciar();
    boolean b12 = listaSobreArreglos10.repOk();
    boolean b14 = listaSobreArreglos10.equals((java.lang.Object)1.0f);
    listaSobreArreglos10.vaciar();
    listaSobreArreglos10.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos18 = new evosuite.listas.ListaSobreArreglos();
    boolean b19 = listaSobreArreglos18.repOk();
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos18);
    int i21 = listaSobreArreglos10.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b25 = listaSobreArreglos22.equals((java.lang.Object)100.0f);
    java.lang.String str26 = listaSobreArreglos22.toString();
    boolean b27 = listaSobreArreglos22.repOk();
    java.lang.Object obj28 = null;
    boolean b29 = listaSobreArreglos22.equals(obj28);
    boolean b30 = listaSobreArreglos10.equals((java.lang.Object)listaSobreArreglos22);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos31 = new evosuite.listas.ListaSobreArreglos();
    boolean b32 = listaSobreArreglos31.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    boolean b34 = listaSobreArreglos33.esVacia();
    boolean b36 = listaSobreArreglos33.equals((java.lang.Object)100.0f);
    java.lang.String str37 = listaSobreArreglos33.toString();
    boolean b38 = listaSobreArreglos33.repOk();
    boolean b39 = listaSobreArreglos31.equals((java.lang.Object)b38);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos40 = new evosuite.listas.ListaSobreArreglos();
    boolean b41 = listaSobreArreglos40.esVacia();
    boolean b43 = listaSobreArreglos40.equals((java.lang.Object)100.0f);
    boolean b45 = listaSobreArreglos40.equals((java.lang.Object)0.0f);
    boolean b46 = listaSobreArreglos40.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos48 = new evosuite.listas.ListaSobreArreglos();
    boolean b49 = listaSobreArreglos48.esVacia();
    boolean b51 = listaSobreArreglos48.equals((java.lang.Object)100.0f);
    boolean b53 = listaSobreArreglos48.equals((java.lang.Object)0.0f);
    boolean b54 = listaSobreArreglos48.repOk();
    listaSobreArreglos40.insertar(0, (java.lang.Object)b54);
    boolean b56 = listaSobreArreglos31.equals((java.lang.Object)listaSobreArreglos40);
    listaSobreArreglos40.eliminar(0);
    listaSobreArreglos10.insertar((java.lang.Object)listaSobreArreglos40);
    int i60 = listaSobreArreglos10.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str62 = listaSobreArreglos10.toString();

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test49"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar((java.lang.Object)0.0d);
    boolean b8 = listaSobreArreglos0.repOk();
    int i9 = listaSobreArreglos0.longitud();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = listaSobreArreglos0.toString();

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test50"); }

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
    boolean b22 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos24 = new evosuite.listas.ListaSobreArreglos();
    int i25 = listaSobreArreglos24.longitud();
    boolean b27 = listaSobreArreglos24.equals((java.lang.Object)(-1));
    java.lang.String str28 = listaSobreArreglos24.toString();
    listaSobreArreglos24.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str31 = listaSobreArreglos0.toString();

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test51"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    int i5 = listaSobreArreglos0.longitud();
    boolean b6 = listaSobreArreglos0.esVacia();
    java.lang.Object obj8 = listaSobreArreglos0.obtener(0);
    boolean b9 = listaSobreArreglos0.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = listaSobreArreglos0.toString();

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test52"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str9 = listaSobreArreglos8.toString();
    boolean b10 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos0.equals((java.lang.Object)b10);
    java.lang.String str12 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b15 = listaSobreArreglos13.esVacia();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos13.equals(obj16);
    boolean b18 = listaSobreArreglos13.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos13);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos20.vaciar();
    boolean b22 = listaSobreArreglos20.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos23 = new evosuite.listas.ListaSobreArreglos();
    boolean b24 = listaSobreArreglos23.esVacia();
    boolean b26 = listaSobreArreglos23.equals((java.lang.Object)100.0f);
    java.lang.String str27 = listaSobreArreglos23.toString();
    boolean b28 = listaSobreArreglos23.repOk();
    java.lang.Object obj29 = null;
    boolean b30 = listaSobreArreglos23.equals(obj29);
    listaSobreArreglos23.vaciar();
    boolean b32 = listaSobreArreglos23.repOk();
    java.lang.Object obj33 = null;
    boolean b34 = listaSobreArreglos23.equals(obj33);
    listaSobreArreglos20.insertar((java.lang.Object)listaSobreArreglos23);
    listaSobreArreglos20.eliminar(0);
    listaSobreArreglos20.vaciar();
    boolean b39 = listaSobreArreglos20.repOk();
    listaSobreArreglos13.insertar((java.lang.Object)b39);
    boolean b41 = listaSobreArreglos13.repOk();
    boolean b42 = listaSobreArreglos13.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str43 = listaSobreArreglos13.toString();

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test53"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)(-1));
    boolean b4 = listaSobreArreglos0.repOk();
    int i5 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos6 = new evosuite.listas.ListaSobreArreglos();
    boolean b7 = listaSobreArreglos6.esVacia();
    boolean b8 = listaSobreArreglos6.esVacia();
    boolean b9 = listaSobreArreglos6.repOk();
    java.lang.String str10 = listaSobreArreglos6.toString();
    boolean b11 = listaSobreArreglos6.repOk();
    boolean b12 = listaSobreArreglos6.esVacia();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos6);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str14 = listaSobreArreglos0.toString();

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test54"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos3 = new evosuite.listas.ListaSobreArreglos();
    boolean b4 = listaSobreArreglos3.esVacia();
    boolean b5 = listaSobreArreglos3.esVacia();
    java.lang.Object obj6 = null;
    boolean b7 = listaSobreArreglos3.equals(obj6);
    listaSobreArreglos3.vaciar();
    listaSobreArreglos3.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos3);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str11 = listaSobreArreglos0.toString();

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test55"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    boolean b14 = listaSobreArreglos9.equals((java.lang.Object)0.0f);
    int i15 = listaSobreArreglos9.longitud();
    boolean b16 = listaSobreArreglos9.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str18 = listaSobreArreglos17.toString();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos9.equals((java.lang.Object)b19);
    java.lang.String str21 = listaSobreArreglos9.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b24 = listaSobreArreglos22.esVacia();
    java.lang.Object obj25 = null;
    boolean b26 = listaSobreArreglos22.equals(obj25);
    boolean b27 = listaSobreArreglos22.esVacia();
    listaSobreArreglos9.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos22.insertar((java.lang.Object)(-1.0f));
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str33 = listaSobreArreglos22.toString();

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test56"); }

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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos14.vaciar();
    boolean b16 = listaSobreArreglos14.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    boolean b18 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos17.equals((java.lang.Object)100.0f);
    java.lang.String str21 = listaSobreArreglos17.toString();
    boolean b22 = listaSobreArreglos17.repOk();
    java.lang.Object obj23 = null;
    boolean b24 = listaSobreArreglos17.equals(obj23);
    listaSobreArreglos17.vaciar();
    boolean b26 = listaSobreArreglos17.repOk();
    java.lang.Object obj27 = null;
    boolean b28 = listaSobreArreglos17.equals(obj27);
    listaSobreArreglos14.insertar((java.lang.Object)listaSobreArreglos17);
    boolean b30 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos14);
    java.lang.Object obj32 = listaSobreArreglos14.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos33 = new evosuite.listas.ListaSobreArreglos();
    boolean b34 = listaSobreArreglos33.esVacia();
    boolean b35 = listaSobreArreglos33.esVacia();
    java.lang.Object obj36 = null;
    boolean b37 = listaSobreArreglos33.equals(obj36);
    listaSobreArreglos33.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos40 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj41 = null;
    boolean b42 = listaSobreArreglos40.equals(obj41);
    java.lang.String str43 = listaSobreArreglos40.toString();
    listaSobreArreglos33.insertar(0, (java.lang.Object)listaSobreArreglos40);
    int i45 = listaSobreArreglos33.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos46 = new evosuite.listas.ListaSobreArreglos();
    boolean b47 = listaSobreArreglos46.esVacia();
    boolean b49 = listaSobreArreglos46.equals((java.lang.Object)100.0f);
    boolean b51 = listaSobreArreglos46.equals((java.lang.Object)0.0f);
    boolean b52 = listaSobreArreglos46.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos54 = new evosuite.listas.ListaSobreArreglos();
    boolean b55 = listaSobreArreglos54.esVacia();
    boolean b57 = listaSobreArreglos54.equals((java.lang.Object)100.0f);
    boolean b59 = listaSobreArreglos54.equals((java.lang.Object)0.0f);
    boolean b60 = listaSobreArreglos54.repOk();
    listaSobreArreglos46.insertar(0, (java.lang.Object)b60);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos62 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str63 = listaSobreArreglos62.toString();
    boolean b64 = listaSobreArreglos62.esVacia();
    boolean b65 = listaSobreArreglos46.equals((java.lang.Object)listaSobreArreglos62);
    java.lang.Object obj66 = null;
    boolean b67 = listaSobreArreglos46.equals(obj66);
    listaSobreArreglos33.insertar((java.lang.Object)listaSobreArreglos46);
    listaSobreArreglos46.insertar(0, (java.lang.Object)0L);
    boolean b72 = listaSobreArreglos46.esVacia();
    listaSobreArreglos14.insertar((java.lang.Object)b72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str74 = listaSobreArreglos14.toString();

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test57"); }

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
    java.lang.String str14 = listaSobreArreglos10.toString();
    boolean b15 = listaSobreArreglos10.repOk();
    boolean b16 = listaSobreArreglos10.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b16);
    int i18 = listaSobreArreglos0.longitud();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str19 = listaSobreArreglos0.toString();

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test58"); }

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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj21 = null;
    boolean b22 = listaSobreArreglos20.equals(obj21);
    java.lang.String str23 = listaSobreArreglos20.toString();
    boolean b24 = listaSobreArreglos20.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str26 = listaSobreArreglos0.toString();

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test59"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    boolean b8 = listaSobreArreglos0.repOk();
    boolean b9 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    boolean b12 = listaSobreArreglos11.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    java.lang.String str17 = listaSobreArreglos13.toString();
    boolean b18 = listaSobreArreglos13.repOk();
    boolean b19 = listaSobreArreglos11.equals((java.lang.Object)b18);
    listaSobreArreglos11.insertar(0, (java.lang.Object)0L);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos23 = new evosuite.listas.ListaSobreArreglos();
    boolean b24 = listaSobreArreglos23.esVacia();
    boolean b25 = listaSobreArreglos23.esVacia();
    java.lang.Object obj26 = null;
    boolean b27 = listaSobreArreglos23.equals(obj26);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b30 = listaSobreArreglos28.esVacia();
    boolean b31 = listaSobreArreglos28.esVacia();
    boolean b32 = listaSobreArreglos23.equals((java.lang.Object)b31);
    listaSobreArreglos11.insertar((java.lang.Object)listaSobreArreglos23);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos11);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos36 = new evosuite.listas.ListaSobreArreglos();
    boolean b37 = listaSobreArreglos36.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos38 = new evosuite.listas.ListaSobreArreglos();
    boolean b39 = listaSobreArreglos38.esVacia();
    boolean b41 = listaSobreArreglos38.equals((java.lang.Object)100.0f);
    java.lang.String str42 = listaSobreArreglos38.toString();
    boolean b43 = listaSobreArreglos38.repOk();
    boolean b44 = listaSobreArreglos36.equals((java.lang.Object)b43);
    boolean b45 = listaSobreArreglos36.repOk();
    int i46 = listaSobreArreglos36.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos47 = new evosuite.listas.ListaSobreArreglos();
    boolean b48 = listaSobreArreglos47.esVacia();
    boolean b49 = listaSobreArreglos47.esVacia();
    int i50 = listaSobreArreglos47.longitud();
    boolean b51 = listaSobreArreglos47.esVacia();
    boolean b52 = listaSobreArreglos36.equals((java.lang.Object)listaSobreArreglos47);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str54 = listaSobreArreglos0.toString();

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test60"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    int i7 = listaSobreArreglos0.longitud();
    int i8 = listaSobreArreglos0.longitud();
    int i9 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    boolean b12 = listaSobreArreglos11.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    java.lang.String str17 = listaSobreArreglos13.toString();
    boolean b18 = listaSobreArreglos13.repOk();
    boolean b19 = listaSobreArreglos11.equals((java.lang.Object)b18);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b23 = listaSobreArreglos20.equals((java.lang.Object)100.0f);
    boolean b25 = listaSobreArreglos20.equals((java.lang.Object)0.0f);
    boolean b26 = listaSobreArreglos20.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b31 = listaSobreArreglos28.equals((java.lang.Object)100.0f);
    boolean b33 = listaSobreArreglos28.equals((java.lang.Object)0.0f);
    boolean b34 = listaSobreArreglos28.repOk();
    listaSobreArreglos20.insertar(0, (java.lang.Object)b34);
    boolean b36 = listaSobreArreglos11.equals((java.lang.Object)listaSobreArreglos20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.repOk();
    boolean b39 = listaSobreArreglos20.equals((java.lang.Object)b38);
    boolean b40 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str41 = listaSobreArreglos20.toString();

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test61"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b7 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b10 = listaSobreArreglos8.esVacia();
    java.lang.Object obj11 = null;
    boolean b12 = listaSobreArreglos8.equals(obj11);
    listaSobreArreglos8.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos15.equals(obj16);
    java.lang.String str18 = listaSobreArreglos15.toString();
    listaSobreArreglos8.insertar(0, (java.lang.Object)listaSobreArreglos15);
    int i20 = listaSobreArreglos8.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    boolean b30 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos29.equals((java.lang.Object)100.0f);
    boolean b34 = listaSobreArreglos29.equals((java.lang.Object)0.0f);
    boolean b35 = listaSobreArreglos29.repOk();
    listaSobreArreglos21.insertar(0, (java.lang.Object)b35);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str38 = listaSobreArreglos37.toString();
    boolean b39 = listaSobreArreglos37.esVacia();
    boolean b40 = listaSobreArreglos21.equals((java.lang.Object)listaSobreArreglos37);
    java.lang.Object obj41 = null;
    boolean b42 = listaSobreArreglos21.equals(obj41);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos21);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos8);
    boolean b45 = listaSobreArreglos0.repOk();
    boolean b46 = listaSobreArreglos0.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str47 = listaSobreArreglos0.toString();

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test62"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos0.vaciar();
    boolean b2 = listaSobreArreglos0.repOk();
    boolean b4 = listaSobreArreglos0.equals((java.lang.Object)1.0f);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.repOk();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos8);
    java.lang.Object obj12 = listaSobreArreglos0.obtener(0);
    java.lang.Object obj14 = listaSobreArreglos0.obtener(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str15 = listaSobreArreglos0.toString();

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test63"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos2 = new evosuite.listas.ListaSobreArreglos();
    boolean b3 = listaSobreArreglos2.esVacia();
    boolean b5 = listaSobreArreglos2.equals((java.lang.Object)100.0f);
    java.lang.String str6 = listaSobreArreglos2.toString();
    boolean b7 = listaSobreArreglos2.repOk();
    boolean b8 = listaSobreArreglos0.equals((java.lang.Object)b7);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    boolean b14 = listaSobreArreglos9.equals((java.lang.Object)0.0f);
    int i15 = listaSobreArreglos9.longitud();
    boolean b16 = listaSobreArreglos9.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str18 = listaSobreArreglos17.toString();
    boolean b19 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos9.equals((java.lang.Object)b19);
    java.lang.String str21 = listaSobreArreglos9.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos22 = new evosuite.listas.ListaSobreArreglos();
    boolean b23 = listaSobreArreglos22.esVacia();
    boolean b24 = listaSobreArreglos22.esVacia();
    java.lang.Object obj25 = null;
    boolean b26 = listaSobreArreglos22.equals(obj25);
    boolean b27 = listaSobreArreglos22.esVacia();
    listaSobreArreglos9.insertar((java.lang.Object)listaSobreArreglos22);
    listaSobreArreglos22.vaciar();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos22);
    java.lang.Object obj32 = listaSobreArreglos0.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos34.vaciar();
    boolean b36 = listaSobreArreglos34.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.esVacia();
    boolean b40 = listaSobreArreglos37.equals((java.lang.Object)100.0f);
    java.lang.String str41 = listaSobreArreglos37.toString();
    boolean b42 = listaSobreArreglos37.repOk();
    java.lang.Object obj43 = null;
    boolean b44 = listaSobreArreglos37.equals(obj43);
    listaSobreArreglos37.vaciar();
    boolean b46 = listaSobreArreglos37.repOk();
    java.lang.Object obj47 = null;
    boolean b48 = listaSobreArreglos37.equals(obj47);
    listaSobreArreglos34.insertar((java.lang.Object)listaSobreArreglos37);
    listaSobreArreglos34.eliminar(0);
    listaSobreArreglos34.vaciar();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos34);
    boolean b54 = listaSobreArreglos0.esVacia();
    boolean b56 = listaSobreArreglos0.equals((java.lang.Object)(byte)0);
    boolean b57 = listaSobreArreglos0.esVacia();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str58 = listaSobreArreglos0.toString();

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test64"); }

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
    java.lang.String str12 = listaSobreArreglos0.toString();
    int i13 = listaSobreArreglos0.longitud();
    java.lang.String str14 = listaSobreArreglos0.toString();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos17.vaciar();
    boolean b19 = listaSobreArreglos17.repOk();
    boolean b21 = listaSobreArreglos17.equals((java.lang.Object)1.0f);
    int i22 = listaSobreArreglos17.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)i22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str24 = listaSobreArreglos0.toString();

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test65"); }

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
    listaSobreArreglos0.insertar((java.lang.Object)"[]");
    java.lang.Object obj17 = listaSobreArreglos0.obtener(0);
    int i18 = listaSobreArreglos0.longitud();
    int i19 = listaSobreArreglos0.longitud();
    java.lang.Object obj21 = listaSobreArreglos0.obtener(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str22 = listaSobreArreglos0.toString();

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test66"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    java.lang.String str4 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)'a');
    boolean b8 = listaSobreArreglos0.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str9 = listaSobreArreglos0.toString();

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test67"); }

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
    int i16 = listaSobreArreglos0.longitud();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str17 = listaSobreArreglos0.toString();

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test68"); }

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
    boolean b19 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b23 = listaSobreArreglos20.equals((java.lang.Object)100.0f);
    boolean b25 = listaSobreArreglos20.equals((java.lang.Object)0.0f);
    boolean b26 = listaSobreArreglos20.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos27 = new evosuite.listas.ListaSobreArreglos();
    boolean b28 = listaSobreArreglos27.esVacia();
    boolean b30 = listaSobreArreglos27.equals((java.lang.Object)100.0f);
    java.lang.String str31 = listaSobreArreglos27.toString();
    boolean b32 = listaSobreArreglos27.repOk();
    boolean b33 = listaSobreArreglos20.equals((java.lang.Object)listaSobreArreglos27);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos34.vaciar();
    boolean b36 = listaSobreArreglos34.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.esVacia();
    boolean b40 = listaSobreArreglos37.equals((java.lang.Object)100.0f);
    java.lang.String str41 = listaSobreArreglos37.toString();
    boolean b42 = listaSobreArreglos37.repOk();
    java.lang.Object obj43 = null;
    boolean b44 = listaSobreArreglos37.equals(obj43);
    listaSobreArreglos37.vaciar();
    boolean b46 = listaSobreArreglos37.repOk();
    java.lang.Object obj47 = null;
    boolean b48 = listaSobreArreglos37.equals(obj47);
    listaSobreArreglos34.insertar((java.lang.Object)listaSobreArreglos37);
    boolean b50 = listaSobreArreglos20.equals((java.lang.Object)listaSobreArreglos34);
    java.lang.Object obj52 = listaSobreArreglos34.obtener(0);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos53 = new evosuite.listas.ListaSobreArreglos();
    boolean b54 = listaSobreArreglos53.esVacia();
    boolean b55 = listaSobreArreglos53.esVacia();
    java.lang.Object obj56 = null;
    boolean b57 = listaSobreArreglos53.equals(obj56);
    listaSobreArreglos53.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos60 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj61 = null;
    boolean b62 = listaSobreArreglos60.equals(obj61);
    java.lang.String str63 = listaSobreArreglos60.toString();
    listaSobreArreglos53.insertar(0, (java.lang.Object)listaSobreArreglos60);
    int i65 = listaSobreArreglos53.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos66 = new evosuite.listas.ListaSobreArreglos();
    boolean b67 = listaSobreArreglos66.esVacia();
    boolean b69 = listaSobreArreglos66.equals((java.lang.Object)100.0f);
    boolean b71 = listaSobreArreglos66.equals((java.lang.Object)0.0f);
    boolean b72 = listaSobreArreglos66.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos74 = new evosuite.listas.ListaSobreArreglos();
    boolean b75 = listaSobreArreglos74.esVacia();
    boolean b77 = listaSobreArreglos74.equals((java.lang.Object)100.0f);
    boolean b79 = listaSobreArreglos74.equals((java.lang.Object)0.0f);
    boolean b80 = listaSobreArreglos74.repOk();
    listaSobreArreglos66.insertar(0, (java.lang.Object)b80);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos82 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str83 = listaSobreArreglos82.toString();
    boolean b84 = listaSobreArreglos82.esVacia();
    boolean b85 = listaSobreArreglos66.equals((java.lang.Object)listaSobreArreglos82);
    java.lang.Object obj86 = null;
    boolean b87 = listaSobreArreglos66.equals(obj86);
    listaSobreArreglos53.insertar((java.lang.Object)listaSobreArreglos66);
    listaSobreArreglos66.insertar(0, (java.lang.Object)0L);
    boolean b92 = listaSobreArreglos66.esVacia();
    listaSobreArreglos34.insertar((java.lang.Object)b92);
    java.lang.Object obj95 = listaSobreArreglos34.obtener(0);
    boolean b96 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos34);
    java.lang.Object obj98 = listaSobreArreglos34.obtener(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str99 = listaSobreArreglos34.toString();

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test69"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    java.lang.String str6 = listaSobreArreglos0.toString();
    int i7 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    boolean b14 = listaSobreArreglos9.equals((java.lang.Object)0.0f);
    boolean b15 = listaSobreArreglos9.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str17 = listaSobreArreglos0.toString();

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test70"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.insertar(0, (java.lang.Object)(short)100);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    boolean b7 = listaSobreArreglos0.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    boolean b9 = listaSobreArreglos8.esVacia();
    boolean b10 = listaSobreArreglos8.esVacia();
    java.lang.Object obj11 = null;
    boolean b12 = listaSobreArreglos8.equals(obj11);
    listaSobreArreglos8.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj16 = null;
    boolean b17 = listaSobreArreglos15.equals(obj16);
    java.lang.String str18 = listaSobreArreglos15.toString();
    listaSobreArreglos8.insertar(0, (java.lang.Object)listaSobreArreglos15);
    int i20 = listaSobreArreglos8.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b24 = listaSobreArreglos21.equals((java.lang.Object)100.0f);
    boolean b26 = listaSobreArreglos21.equals((java.lang.Object)0.0f);
    boolean b27 = listaSobreArreglos21.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    boolean b30 = listaSobreArreglos29.esVacia();
    boolean b32 = listaSobreArreglos29.equals((java.lang.Object)100.0f);
    boolean b34 = listaSobreArreglos29.equals((java.lang.Object)0.0f);
    boolean b35 = listaSobreArreglos29.repOk();
    listaSobreArreglos21.insertar(0, (java.lang.Object)b35);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str38 = listaSobreArreglos37.toString();
    boolean b39 = listaSobreArreglos37.esVacia();
    boolean b40 = listaSobreArreglos21.equals((java.lang.Object)listaSobreArreglos37);
    java.lang.Object obj41 = null;
    boolean b42 = listaSobreArreglos21.equals(obj41);
    listaSobreArreglos8.insertar((java.lang.Object)listaSobreArreglos21);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos8);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str45 = listaSobreArreglos8.toString();

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test71"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    java.lang.String str7 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos8.vaciar();
    boolean b10 = listaSobreArreglos8.repOk();
    boolean b12 = listaSobreArreglos8.equals((java.lang.Object)1.0f);
    listaSobreArreglos8.vaciar();
    listaSobreArreglos8.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos16 = new evosuite.listas.ListaSobreArreglos();
    boolean b17 = listaSobreArreglos16.repOk();
    listaSobreArreglos8.insertar(0, (java.lang.Object)listaSobreArreglos16);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos16);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos21 = new evosuite.listas.ListaSobreArreglos();
    boolean b22 = listaSobreArreglos21.esVacia();
    boolean b23 = listaSobreArreglos21.esVacia();
    java.lang.Object obj24 = null;
    boolean b25 = listaSobreArreglos21.equals(obj24);
    listaSobreArreglos21.vaciar();
    listaSobreArreglos21.vaciar();
    int i28 = listaSobreArreglos21.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos29 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos29.vaciar();
    boolean b31 = listaSobreArreglos29.repOk();
    boolean b33 = listaSobreArreglos29.equals((java.lang.Object)1.0f);
    listaSobreArreglos29.vaciar();
    listaSobreArreglos29.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.repOk();
    listaSobreArreglos29.insertar(0, (java.lang.Object)listaSobreArreglos37);
    listaSobreArreglos21.insertar((java.lang.Object)0);
    listaSobreArreglos0.insertar(0, (java.lang.Object)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str42 = listaSobreArreglos0.toString();

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test72"); }

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
    java.lang.String str12 = listaSobreArreglos0.toString();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    boolean b15 = listaSobreArreglos14.esVacia();
    boolean b16 = listaSobreArreglos14.esVacia();
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos14.equals(obj17);
    listaSobreArreglos14.vaciar();
    listaSobreArreglos14.vaciar();
    listaSobreArreglos0.insertar((int)(short)0, (java.lang.Object)listaSobreArreglos14);
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
    int i32 = listaSobreArreglos22.longitud();
    boolean b33 = listaSobreArreglos0.equals((java.lang.Object)i32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str34 = listaSobreArreglos0.toString();

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test73"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj8 = null;
    boolean b9 = listaSobreArreglos7.equals(obj8);
    java.lang.String str10 = listaSobreArreglos7.toString();
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos7);
    int i12 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos13.vaciar();
    boolean b15 = listaSobreArreglos13.repOk();
    boolean b17 = listaSobreArreglos13.equals((java.lang.Object)1.0f);
    boolean b18 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos13);
    boolean b19 = listaSobreArreglos0.esVacia();
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
    int i33 = listaSobreArreglos20.longitud();
    java.lang.String str34 = listaSobreArreglos20.toString();
    listaSobreArreglos0.insertar((java.lang.Object)str34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str36 = listaSobreArreglos0.toString();

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test74"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    int i7 = listaSobreArreglos0.longitud();
    int i8 = listaSobreArreglos0.longitud();
    int i9 = listaSobreArreglos0.longitud();
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos11 = new evosuite.listas.ListaSobreArreglos();
    boolean b12 = listaSobreArreglos11.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos13 = new evosuite.listas.ListaSobreArreglos();
    boolean b14 = listaSobreArreglos13.esVacia();
    boolean b16 = listaSobreArreglos13.equals((java.lang.Object)100.0f);
    java.lang.String str17 = listaSobreArreglos13.toString();
    boolean b18 = listaSobreArreglos13.repOk();
    boolean b19 = listaSobreArreglos11.equals((java.lang.Object)b18);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    boolean b21 = listaSobreArreglos20.esVacia();
    boolean b23 = listaSobreArreglos20.equals((java.lang.Object)100.0f);
    boolean b25 = listaSobreArreglos20.equals((java.lang.Object)0.0f);
    boolean b26 = listaSobreArreglos20.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    boolean b29 = listaSobreArreglos28.esVacia();
    boolean b31 = listaSobreArreglos28.equals((java.lang.Object)100.0f);
    boolean b33 = listaSobreArreglos28.equals((java.lang.Object)0.0f);
    boolean b34 = listaSobreArreglos28.repOk();
    listaSobreArreglos20.insertar(0, (java.lang.Object)b34);
    boolean b36 = listaSobreArreglos11.equals((java.lang.Object)listaSobreArreglos20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos37 = new evosuite.listas.ListaSobreArreglos();
    boolean b38 = listaSobreArreglos37.repOk();
    boolean b39 = listaSobreArreglos20.equals((java.lang.Object)b38);
    boolean b40 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos20);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos41 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str42 = listaSobreArreglos41.toString();
    java.lang.Object obj43 = null;
    boolean b44 = listaSobreArreglos41.equals(obj43);
    java.lang.String str45 = listaSobreArreglos41.toString();
    java.lang.String str46 = listaSobreArreglos41.toString();
    listaSobreArreglos41.vaciar();
    java.lang.String str48 = listaSobreArreglos41.toString();
    boolean b49 = listaSobreArreglos20.equals((java.lang.Object)str48);
    java.lang.Object obj51 = listaSobreArreglos20.obtener(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str52 = listaSobreArreglos20.toString();

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test75"); }

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
    boolean b20 = listaSobreArreglos0.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str21 = listaSobreArreglos0.toString();

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test76"); }

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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos14 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos14.vaciar();
    boolean b16 = listaSobreArreglos14.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    boolean b18 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos17.equals((java.lang.Object)100.0f);
    java.lang.String str21 = listaSobreArreglos17.toString();
    boolean b22 = listaSobreArreglos17.repOk();
    java.lang.Object obj23 = null;
    boolean b24 = listaSobreArreglos17.equals(obj23);
    listaSobreArreglos17.vaciar();
    boolean b26 = listaSobreArreglos17.repOk();
    java.lang.Object obj27 = null;
    boolean b28 = listaSobreArreglos17.equals(obj27);
    listaSobreArreglos14.insertar((java.lang.Object)listaSobreArreglos17);
    boolean b30 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos14);
    boolean b31 = listaSobreArreglos14.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos32 = new evosuite.listas.ListaSobreArreglos();
    boolean b33 = listaSobreArreglos32.esVacia();
    boolean b34 = listaSobreArreglos32.esVacia();
    boolean b35 = listaSobreArreglos32.repOk();
    listaSobreArreglos32.insertar((java.lang.Object)(byte)-1);
    boolean b38 = listaSobreArreglos32.repOk();
    listaSobreArreglos14.insertar((java.lang.Object)b38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str40 = listaSobreArreglos14.toString();

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test77"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    listaSobreArreglos0.vaciar();
    listaSobreArreglos0.vaciar();
    int i7 = listaSobreArreglos0.longitud();
    boolean b8 = listaSobreArreglos0.repOk();
    int i9 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos10 = new evosuite.listas.ListaSobreArreglos();
    listaSobreArreglos10.vaciar();
    boolean b12 = listaSobreArreglos10.esVacia();
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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos30 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str31 = listaSobreArreglos30.toString();
    boolean b32 = listaSobreArreglos30.esVacia();
    boolean b33 = listaSobreArreglos14.equals((java.lang.Object)listaSobreArreglos30);
    java.lang.Object obj34 = null;
    boolean b35 = listaSobreArreglos14.equals(obj34);
    listaSobreArreglos10.insertar(0, (java.lang.Object)listaSobreArreglos14);
    boolean b37 = listaSobreArreglos0.equals((java.lang.Object)listaSobreArreglos10);
    boolean b38 = listaSobreArreglos10.repOk();
    boolean b39 = listaSobreArreglos10.repOk();
    boolean b41 = listaSobreArreglos10.equals((java.lang.Object)true);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str42 = listaSobreArreglos10.toString();

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test78"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    int i1 = listaSobreArreglos0.longitud();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)(-1));
    evosuite.listas.ListaSobreArreglos listaSobreArreglos4 = new evosuite.listas.ListaSobreArreglos();
    boolean b5 = listaSobreArreglos4.esVacia();
    boolean b6 = listaSobreArreglos4.esVacia();
    java.lang.Object obj7 = null;
    boolean b8 = listaSobreArreglos4.equals(obj7);
    java.lang.String str9 = listaSobreArreglos4.toString();
    int i10 = listaSobreArreglos4.longitud();
    java.lang.String str11 = listaSobreArreglos4.toString();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos4);
    boolean b13 = listaSobreArreglos0.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str14 = listaSobreArreglos0.toString();

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test79"); }

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
    java.lang.String str12 = listaSobreArreglos0.toString();
    int i13 = listaSobreArreglos0.longitud();
    java.lang.String str14 = listaSobreArreglos0.toString();
    java.lang.String str15 = listaSobreArreglos0.toString();
    boolean b16 = listaSobreArreglos0.esVacia();
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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos36 = new evosuite.listas.ListaSobreArreglos();
    boolean b37 = listaSobreArreglos36.esVacia();
    listaSobreArreglos36.insertar((java.lang.Object)100L);
    listaSobreArreglos36.vaciar();
    java.lang.String str41 = listaSobreArreglos36.toString();
    int i42 = listaSobreArreglos36.longitud();
    boolean b43 = listaSobreArreglos17.equals((java.lang.Object)i42);
    java.lang.String str44 = listaSobreArreglos17.toString();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos17);
    int i46 = listaSobreArreglos0.longitud();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str47 = listaSobreArreglos0.toString();

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test80"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b2 = listaSobreArreglos0.esVacia();
    java.lang.Object obj3 = null;
    boolean b4 = listaSobreArreglos0.equals(obj3);
    java.lang.String str5 = listaSobreArreglos0.toString();
    listaSobreArreglos0.insertar((java.lang.Object)0.0d);
    int i8 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    boolean b14 = listaSobreArreglos9.equals((java.lang.Object)0.0f);
    boolean b15 = listaSobreArreglos9.repOk();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos17 = new evosuite.listas.ListaSobreArreglos();
    boolean b18 = listaSobreArreglos17.esVacia();
    boolean b20 = listaSobreArreglos17.equals((java.lang.Object)100.0f);
    boolean b22 = listaSobreArreglos17.equals((java.lang.Object)0.0f);
    boolean b23 = listaSobreArreglos17.repOk();
    listaSobreArreglos9.insertar(0, (java.lang.Object)b23);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos25 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str26 = listaSobreArreglos25.toString();
    boolean b27 = listaSobreArreglos25.esVacia();
    boolean b28 = listaSobreArreglos9.equals((java.lang.Object)listaSobreArreglos25);
    listaSobreArreglos9.eliminar(0);
    listaSobreArreglos0.insertar((java.lang.Object)0);
    java.lang.Object obj33 = listaSobreArreglos0.obtener(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str34 = listaSobreArreglos0.toString();

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test81"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    boolean b6 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos7 = new evosuite.listas.ListaSobreArreglos();
    boolean b8 = listaSobreArreglos7.esVacia();
    boolean b9 = listaSobreArreglos7.esVacia();
    boolean b10 = listaSobreArreglos7.repOk();
    listaSobreArreglos7.insertar((java.lang.Object)(byte)-1);
    boolean b13 = listaSobreArreglos7.repOk();
    java.lang.Object obj14 = null;
    boolean b15 = listaSobreArreglos7.equals(obj14);
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos7);
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos7.equals(obj17);
    boolean b19 = listaSobreArreglos7.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str20 = listaSobreArreglos7.toString();

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test82"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    boolean b7 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos8 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str9 = listaSobreArreglos8.toString();
    boolean b10 = listaSobreArreglos8.esVacia();
    boolean b11 = listaSobreArreglos0.equals((java.lang.Object)b10);
    java.lang.String str12 = listaSobreArreglos0.toString();
    int i13 = listaSobreArreglos0.longitud();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos15 = new evosuite.listas.ListaSobreArreglos();
    java.lang.String str16 = listaSobreArreglos15.toString();
    java.lang.Object obj17 = null;
    boolean b18 = listaSobreArreglos15.equals(obj17);
    listaSobreArreglos0.insertar(0, (java.lang.Object)b18);
    boolean b20 = listaSobreArreglos0.repOk();
    java.lang.Object obj22 = listaSobreArreglos0.obtener(0);
    boolean b23 = listaSobreArreglos0.repOk();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str24 = listaSobreArreglos0.toString();

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test83"); }

    evosuite.listas.ListaSobreArreglos listaSobreArreglos0 = new evosuite.listas.ListaSobreArreglos();
    boolean b1 = listaSobreArreglos0.esVacia();
    boolean b3 = listaSobreArreglos0.equals((java.lang.Object)100.0f);
    boolean b5 = listaSobreArreglos0.equals((java.lang.Object)0.0f);
    int i6 = listaSobreArreglos0.longitud();
    java.lang.String str7 = listaSobreArreglos0.toString();
    boolean b8 = listaSobreArreglos0.esVacia();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos9 = new evosuite.listas.ListaSobreArreglos();
    boolean b10 = listaSobreArreglos9.esVacia();
    boolean b12 = listaSobreArreglos9.equals((java.lang.Object)100.0f);
    java.lang.String str13 = listaSobreArreglos9.toString();
    boolean b14 = listaSobreArreglos9.repOk();
    java.lang.Object obj15 = null;
    boolean b16 = listaSobreArreglos9.equals(obj15);
    int i17 = listaSobreArreglos9.longitud();
    listaSobreArreglos0.insertar((java.lang.Object)listaSobreArreglos9);
    java.lang.Object obj19 = null;
    boolean b20 = listaSobreArreglos0.equals(obj19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str21 = listaSobreArreglos0.toString();

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test84"); }

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
    evosuite.listas.ListaSobreArreglos listaSobreArreglos20 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj21 = null;
    boolean b22 = listaSobreArreglos20.equals(obj21);
    java.lang.String str23 = listaSobreArreglos20.toString();
    boolean b24 = listaSobreArreglos20.esVacia();
    listaSobreArreglos0.insertar(0, (java.lang.Object)b24);
    listaSobreArreglos0.vaciar();
    evosuite.listas.ListaSobreArreglos listaSobreArreglos28 = new evosuite.listas.ListaSobreArreglos();
    java.lang.Object obj29 = null;
    boolean b30 = listaSobreArreglos28.equals(obj29);
    java.lang.String str31 = listaSobreArreglos28.toString();
    java.lang.Object obj32 = null;
    boolean b33 = listaSobreArreglos28.equals(obj32);
    evosuite.listas.ListaSobreArreglos listaSobreArreglos34 = new evosuite.listas.ListaSobreArreglos();
    boolean b35 = listaSobreArreglos34.esVacia();
    boolean b36 = listaSobreArreglos28.equals((java.lang.Object)listaSobreArreglos34);
    listaSobreArreglos0.insertar(0, (java.lang.Object)listaSobreArreglos34);
    int i38 = listaSobreArreglos0.longitud();
    java.lang.Object obj39 = null;
    boolean b40 = listaSobreArreglos0.equals(obj39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str41 = listaSobreArreglos0.toString();

  }

}
