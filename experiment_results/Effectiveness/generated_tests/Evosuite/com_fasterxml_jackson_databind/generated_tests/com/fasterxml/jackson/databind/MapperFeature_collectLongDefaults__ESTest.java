/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:02:32 GMT 2025
 */

package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.MapperFeature;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class MapperFeature_collectLongDefaults__ESTest extends MapperFeature_collectLongDefaults__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = MapperFeature.collectLongDefaults();
      assertEquals(118117658363L, long0);
  }
}
