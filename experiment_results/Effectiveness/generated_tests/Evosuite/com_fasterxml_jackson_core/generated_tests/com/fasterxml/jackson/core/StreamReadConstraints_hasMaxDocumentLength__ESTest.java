/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 13:17:33 GMT 2025
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.StreamReadConstraints;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class StreamReadConstraints_hasMaxDocumentLength__ESTest extends StreamReadConstraints_hasMaxDocumentLength__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = new StreamReadConstraints(1052, 1052, 1052, 0, (-1), 0L);
      boolean boolean0 = streamReadConstraints0.hasMaxDocumentLength();
      assertTrue(boolean0);
      assertEquals(1052, streamReadConstraints0.getMaxNumberLength());
      assertEquals(1052, streamReadConstraints0.getMaxNestingDepth());
      assertEquals(0L, streamReadConstraints0.getMaxTokenCount());
      assertEquals(0, streamReadConstraints0.getMaxStringLength());
      assertEquals((-1), streamReadConstraints0.getMaxNameLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = new StreamReadConstraints(0, 0, 0, (-1), (-1), (-1));
      boolean boolean0 = streamReadConstraints0.hasMaxDocumentLength();
      assertEquals(0L, streamReadConstraints0.getMaxDocumentLength());
      assertEquals(0, streamReadConstraints0.getMaxNumberLength());
      assertEquals((-1L), streamReadConstraints0.getMaxTokenCount());
      assertFalse(boolean0);
      assertEquals((-1), streamReadConstraints0.getMaxNameLength());
      assertEquals((-1), streamReadConstraints0.getMaxStringLength());
      assertEquals(0, streamReadConstraints0.getMaxNestingDepth());
  }
}
