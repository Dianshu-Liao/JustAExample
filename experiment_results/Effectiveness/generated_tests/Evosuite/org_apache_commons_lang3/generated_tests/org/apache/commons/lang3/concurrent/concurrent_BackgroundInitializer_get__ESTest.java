/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:07:47 GMT 2025
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.concurrent.BackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class concurrent_BackgroundInitializer_get__ESTest extends concurrent_BackgroundInitializer_get__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BackgroundInitializer<Object> backgroundInitializer0 = new BackgroundInitializer<Object>();
      // Undeclared exception!
      try { 
        backgroundInitializer0.get();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // start() must be called first!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }
}
