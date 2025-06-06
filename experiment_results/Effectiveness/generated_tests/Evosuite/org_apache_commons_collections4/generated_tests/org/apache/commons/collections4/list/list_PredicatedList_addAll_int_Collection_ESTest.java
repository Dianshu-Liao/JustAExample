/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:14:53 GMT 2025
 */

package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.list.PredicatedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class list_PredicatedList_addAll_int_Collection_ESTest extends list_PredicatedList_addAll_int_Collection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedList<Object> predicatedList0 = new PredicatedList<Object>(linkedList0, predicate0);
      boolean boolean0 = predicatedList0.addAll(0, (Collection<?>) linkedList0);
      assertFalse(boolean0);
  }
}
