/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:15:06 GMT 2025
 */

package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.LinkedList;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.list.PredicatedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class list_PredicatedList_equals_Object_ESTest extends list_PredicatedList_equals_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedList<Object> predicatedList0 = new PredicatedList<Object>(linkedList0, predicate0);
      Object object0 = new Object();
      boolean boolean0 = predicatedList0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedList<Object> predicatedList0 = new PredicatedList<Object>(linkedList0, predicate0);
      Predicate<Object> predicate1 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedList<Object> predicatedList1 = new PredicatedList<Object>(predicatedList0, predicate1);
      boolean boolean0 = predicatedList1.equals(predicatedList0);
      assertTrue(boolean0);
  }
}
