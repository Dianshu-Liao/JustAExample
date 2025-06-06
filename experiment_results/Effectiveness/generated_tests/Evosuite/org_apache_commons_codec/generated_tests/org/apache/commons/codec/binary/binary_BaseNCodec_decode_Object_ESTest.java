/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:05:38 GMT 2025
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.Base32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class binary_BaseNCodec_decode_Object_ESTest extends binary_BaseNCodec_decode_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Base32 base32_0 = new Base32();
      try { 
        base32_0.decode((Object) base32_0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N decode is not a byte[] or a String
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }
}
