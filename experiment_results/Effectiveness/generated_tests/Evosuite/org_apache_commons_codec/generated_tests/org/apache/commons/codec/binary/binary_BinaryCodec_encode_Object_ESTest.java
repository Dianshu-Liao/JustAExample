/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:14:28 GMT 2025
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.BinaryCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class binary_BinaryCodec_encode_Object_ESTest extends binary_BinaryCodec_encode_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      try { 
        binaryCodec0.encode((Object) binaryCodec0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // argument not a byte array
         //
         verifyException("org.apache.commons.codec.binary.BinaryCodec", e);
      }
  }
}
