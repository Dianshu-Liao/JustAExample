/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 14:03:17 GMT 2025
 */

package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class util_BufferRecycler_isLinkedWithPool__ESTest extends util_BufferRecycler_isLinkedWithPool__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      boolean boolean0 = bufferRecycler0.isLinkedWithPool();
      assertFalse(boolean0);
  }
}
