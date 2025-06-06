/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:19:03 GMT 2025
 */

package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class digest_HmacUtils_isAvailable_HmacAlgorithms_ESTest extends digest_HmacUtils_isAvailable_HmacAlgorithms_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      boolean boolean0 = HmacUtils.isAvailable(hmacAlgorithms0);
      assertTrue(boolean0);
  }
}
