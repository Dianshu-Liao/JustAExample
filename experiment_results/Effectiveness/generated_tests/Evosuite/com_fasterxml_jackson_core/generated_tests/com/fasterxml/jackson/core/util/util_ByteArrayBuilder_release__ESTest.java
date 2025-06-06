/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 14:06:38 GMT 2025
 */

package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class util_ByteArrayBuilder_release__ESTest extends util_ByteArrayBuilder_release__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler(3, 3);
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder(bufferRecycler0);
      byteArrayBuilder0.release();
      byteArrayBuilder0.release();
      assertEquals(0, byteArrayBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
      byteArrayBuilder0.release();
      assertEquals(0, byteArrayBuilder0.size());
  }
}
