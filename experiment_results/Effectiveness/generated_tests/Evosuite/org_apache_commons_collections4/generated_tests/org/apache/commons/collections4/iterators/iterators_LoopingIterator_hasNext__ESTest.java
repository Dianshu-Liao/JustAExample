/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:19:43 GMT 2025
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import org.apache.commons.collections4.iterators.LoopingIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class iterators_LoopingIterator_hasNext__ESTest extends iterators_LoopingIterator_hasNext__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LoopingIterator<Object> loopingIterator0 = new LoopingIterator<Object>(linkedList0);
      boolean boolean0 = loopingIterator0.hasNext();
      assertFalse(boolean0);
  }
}
