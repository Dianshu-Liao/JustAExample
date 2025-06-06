/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:26:16 GMT 2025
 */

package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.DigestUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class digest_DigestUtils_getDigest_String_MessageDigest_ESTest extends digest_DigestUtils_getDigest_String_MessageDigest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("SHA-1", (MessageDigest) null);
      assertEquals("SHA-1", messageDigest0.getAlgorithm());
  }
}
