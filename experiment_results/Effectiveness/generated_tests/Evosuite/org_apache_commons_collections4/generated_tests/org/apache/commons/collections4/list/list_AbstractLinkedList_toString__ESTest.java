/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:13:30 GMT 2025
 */

package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.list.AbstractLinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class list_AbstractLinkedList_toString__ESTest extends list_AbstractLinkedList_toString__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractLinkedList<Object> abstractLinkedList0 = (AbstractLinkedList<Object>) mock(AbstractLinkedList.class, CALLS_REAL_METHODS);
      AbstractLinkedList.LinkedSubList<Object> abstractLinkedList_LinkedSubList0 = new AbstractLinkedList.LinkedSubList<Object>(abstractLinkedList0, 0, 0);
      AbstractLinkedList<Object> abstractLinkedList1 = abstractLinkedList_LinkedSubList0.parent;
      abstractLinkedList1.size = 3641;
      AbstractLinkedList.Node<Object> abstractLinkedList_Node0 = new AbstractLinkedList.Node<Object>();
      AbstractLinkedList.Node<Object> abstractLinkedList_Node1 = new AbstractLinkedList.Node<Object>(abstractLinkedList_Node0, abstractLinkedList_Node0, abstractLinkedList_Node0);
      abstractLinkedList1.header = abstractLinkedList_Node1;
      abstractLinkedList_Node0.next = abstractLinkedList_Node1;
      abstractLinkedList1.toString();
      assertEquals(3641, abstractLinkedList1.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AbstractLinkedList<Object> abstractLinkedList0 = (AbstractLinkedList<Object>) mock(AbstractLinkedList.class, CALLS_REAL_METHODS);
      AbstractLinkedList.LinkedSubList<Object> abstractLinkedList_LinkedSubList0 = new AbstractLinkedList.LinkedSubList<Object>(abstractLinkedList0, 0, 0);
      AbstractLinkedList<Object> abstractLinkedList1 = abstractLinkedList_LinkedSubList0.parent;
      abstractLinkedList1.size = 3641;
      AbstractLinkedList.Node<Object> abstractLinkedList_Node0 = new AbstractLinkedList.Node<Object>();
      abstractLinkedList_Node0.value = (Object) abstractLinkedList1;
      AbstractLinkedList.Node<Object> abstractLinkedList_Node1 = new AbstractLinkedList.Node<Object>(abstractLinkedList_Node0, abstractLinkedList_Node0, abstractLinkedList_Node0);
      abstractLinkedList1.header = abstractLinkedList_Node1;
      abstractLinkedList1.toString();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractLinkedList<Object> abstractLinkedList0 = (AbstractLinkedList<Object>) mock(AbstractLinkedList.class, CALLS_REAL_METHODS);
      AbstractLinkedList.LinkedSubList<Object> abstractLinkedList_LinkedSubList0 = new AbstractLinkedList.LinkedSubList<Object>(abstractLinkedList0, 0, 0);
      AbstractLinkedList<Object> abstractLinkedList1 = abstractLinkedList_LinkedSubList0.parent;
      assertNotNull(abstractLinkedList1);
      
      String string0 = abstractLinkedList1.toString();
      assertEquals("[]", string0);
      assertTrue(abstractLinkedList1.isEmpty());
  }
}
