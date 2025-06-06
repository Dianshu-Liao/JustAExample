/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:08:54 GMT 2025
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.net.PercentCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class net_PercentCodec_insertAlwaysEncodeChar_byte_ESTest extends net_PercentCodec_insertAlwaysEncodeChar_byte_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-78);
      PercentCodec percentCodec0 = null;
      try {
        percentCodec0 = new PercentCodec(byteArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byte must be >= 0
         //
         verifyException("org.apache.commons.codec.net.PercentCodec", e);
      }
  }
}
