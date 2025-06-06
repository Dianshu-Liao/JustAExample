/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 14:04:27 GMT 2025
 */

package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class util_JacksonFeatureSet_isEnabled_JacksonFeature_ESTest extends util_JacksonFeatureSet_isEnabled_JacksonFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JacksonFeatureSet<JsonFactory.Feature> jacksonFeatureSet0 = new JacksonFeatureSet<JsonFactory.Feature>(3535);
      JsonFactory.Feature jsonFactory_Feature0 = JsonFactory.Feature.INTERN_FIELD_NAMES;
      boolean boolean0 = jacksonFeatureSet0.isEnabled(jsonFactory_Feature0);
      assertEquals(3535, jacksonFeatureSet0.asBitmask());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JacksonFeatureSet<JsonFactory.Feature> jacksonFeatureSet0 = new JacksonFeatureSet<JsonFactory.Feature>(0);
      JsonFactory.Feature jsonFactory_Feature0 = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
      boolean boolean0 = jacksonFeatureSet0.isEnabled(jsonFactory_Feature0);
      assertFalse(boolean0);
      assertEquals(0, jacksonFeatureSet0.asBitmask());
  }
}
