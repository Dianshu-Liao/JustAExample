/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 13:24:13 GMT 2025
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import com.fasterxml.jackson.core.StreamWriteFeature;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class TSFBuilder_disable_StreamWriteFeature_StreamWriteFeature_____ESTest extends TSFBuilder_disable_StreamWriteFeature_StreamWriteFeature_____ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonFactoryBuilder jsonFactoryBuilder0 = new JsonFactoryBuilder();
      StreamWriteFeature streamWriteFeature0 = StreamWriteFeature.AUTO_CLOSE_CONTENT;
      StreamWriteFeature[] streamWriteFeatureArray0 = new StreamWriteFeature[1];
      streamWriteFeatureArray0[0] = streamWriteFeature0;
      jsonFactoryBuilder0.disable(streamWriteFeature0, streamWriteFeatureArray0);
      assertEquals(2077, jsonFactoryBuilder0.streamWriteFeatures());
  }
}
