/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:10:08 GMT 2025
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.concurrent.LazyInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class concurrent_LazyInitializer_isInitialized__ESTest extends concurrent_LazyInitializer_isInitialized__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LazyInitializer<Object> lazyInitializer0 = new LazyInitializer<Object>();
      boolean boolean0 = lazyInitializer0.isInitialized();
      assertFalse(boolean0);
  }
}
