/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 15 01:43:51 GMT 2023
 */

package evosuite.listas;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import evosuite.listas.ListaSobreArreglos;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ListaSobreArreglos_ESTest extends ListaSobreArreglos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) null);
      ListaSobreArreglos listaSobreArreglos1 = new ListaSobreArreglos();
      listaSobreArreglos0.eliminar(0);
      boolean boolean0 = listaSobreArreglos0.equals(listaSobreArreglos1);
      assertEquals(0, listaSobreArreglos0.longitud());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      Object object0 = new Object();
      listaSobreArreglos0.insertar(object0);
      listaSobreArreglos0.hashCode();
      assertEquals(1, listaSobreArreglos0.longitud());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      try { 
        listaSobreArreglos0.obtener(1601);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListaSobreArreglos: \u00EDndice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      try { 
        listaSobreArreglos0.eliminar(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListSobreArreglos.eliminar: indice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) null);
      listaSobreArreglos0.eliminar(0);
      boolean boolean0 = listaSobreArreglos0.esVacia();
      assertTrue(listaSobreArreglos0.repOk());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) null);
      Object object0 = new Object();
      listaSobreArreglos0.insertar(object0);
      listaSobreArreglos0.obtener(0);
      assertEquals(2, listaSobreArreglos0.longitud());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      Object object0 = new Object();
      listaSobreArreglos0.insertar(object0);
      int int0 = listaSobreArreglos0.longitud();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) "[]");
      listaSobreArreglos0.eliminar(0);
      int int0 = listaSobreArreglos0.longitud();
      assertTrue(listaSobreArreglos0.repOk());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) listaSobreArreglos0);
      listaSobreArreglos0.obtener(0);
      assertEquals(1, listaSobreArreglos0.longitud());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      Object object0 = new Object();
      listaSobreArreglos0.insertar(0, object0);
      boolean boolean0 = listaSobreArreglos0.repOk();
      assertEquals(1, listaSobreArreglos0.longitud());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      Object object0 = new Object();
      try { 
        listaSobreArreglos0.insertar((-3073), object0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListaSobreArreglos.insertar: \u00EDndice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      int int0 = listaSobreArreglos0.longitud();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) null);
      ListaSobreArreglos listaSobreArreglos1 = new ListaSobreArreglos();
      boolean boolean0 = listaSobreArreglos0.equals(listaSobreArreglos1);
      assertEquals(1, listaSobreArreglos0.longitud());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      ListaSobreArreglos listaSobreArreglos1 = new ListaSobreArreglos();
      Object object0 = new Object();
      listaSobreArreglos0.insertar(object0);
      boolean boolean0 = listaSobreArreglos0.equals(listaSobreArreglos1);
      assertEquals(1, listaSobreArreglos0.longitud());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      ListaSobreArreglos listaSobreArreglos1 = new ListaSobreArreglos();
      boolean boolean0 = listaSobreArreglos0.equals(listaSobreArreglos1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      boolean boolean0 = listaSobreArreglos0.equals(listaSobreArreglos0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      Object object0 = new Object();
      boolean boolean0 = listaSobreArreglos0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      boolean boolean0 = listaSobreArreglos0.repOk();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) listaSobreArreglos0);
      listaSobreArreglos0.eliminar(0);
      boolean boolean0 = listaSobreArreglos0.repOk();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      try { 
        listaSobreArreglos0.obtener(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListaSobreArreglos: \u00EDndice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      try { 
        listaSobreArreglos0.obtener((-3087));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListaSobreArreglos: \u00EDndice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      Object object0 = new Object();
      listaSobreArreglos0.insertar(object0);
      listaSobreArreglos0.insertar(object0);
      listaSobreArreglos0.eliminar(0);
      assertFalse(listaSobreArreglos0.esVacia());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      try { 
        listaSobreArreglos0.eliminar(3043);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListSobreArreglos.eliminar: indice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      try { 
        listaSobreArreglos0.eliminar((-3627));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListSobreArreglos.eliminar: indice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) null);
      // Undeclared exception!
      try { 
        listaSobreArreglos0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) null);
      Object object0 = new Object();
      listaSobreArreglos0.insertar(0, object0);
      assertFalse(listaSobreArreglos0.esVacia());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      try { 
        listaSobreArreglos0.insertar(916, (Object) listaSobreArreglos0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListaSobreArreglos.insertar: \u00EDndice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      boolean boolean0 = listaSobreArreglos0.esVacia();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.insertar((Object) "");
      boolean boolean0 = listaSobreArreglos0.esVacia();
      assertEquals(1, listaSobreArreglos0.longitud());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      String string0 = listaSobreArreglos0.toString();
      assertEquals(0, listaSobreArreglos0.longitud());
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      listaSobreArreglos0.vaciar();
      assertEquals(0, listaSobreArreglos0.longitud());
  }

  //@Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ListaSobreArreglos listaSobreArreglos0 = new ListaSobreArreglos();
      Object object0 = new Object();
      listaSobreArreglos0.insertar(object0);
      listaSobreArreglos0.eliminar(0);
      // Undeclared exception!
      try { 
        listaSobreArreglos0.insertar(object0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ListaSobreArreglos.insertar: \u00EDndice inv\u00E1lido
         //
         verifyException("evosuite.listas.ListaSobreArreglos", e);
      }
  }
}
