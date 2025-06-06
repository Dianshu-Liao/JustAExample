/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:38:15 GMT 2025
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.WhileClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class functors_WhileClosure_execute_Object_ESTest extends functors_WhileClosure_execute_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(predicate0).test(any());
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      WhileClosure<Object> whileClosure0 = new WhileClosure<Object>(predicate0, closure0, true);
      Object object0 = new Object();
      whileClosure0.execute(object0);
      assertTrue(whileClosure0.isDoLoop());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate<Integer> predicate0 = (Predicate<Integer>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).test(anyInt());
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      WhileClosure<Integer> whileClosure0 = new WhileClosure<Integer>(predicate0, closure0, false);
      Integer integer0 = new Integer((-3119));
      whileClosure0.execute(integer0);
      assertFalse(whileClosure0.isDoLoop());
  }
}
