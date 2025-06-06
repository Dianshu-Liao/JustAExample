/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:15:36 GMT 2025
 */

package org.apache.commons.compress.compressors.lzma;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.compressors.lzma.LZMAUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class compressors_lzma_LZMAUtils_matches_byte_____int_ESTest extends compressors_lzma_LZMAUtils_matches_byte_____int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)93;
      boolean boolean0 = LZMAUtils.matches(byteArray0, 3105);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = LZMAUtils.matches(byteArray0, (-560));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = LZMAUtils.matches(byteArray0, 3105);
      assertFalse(boolean0);
  }
}
