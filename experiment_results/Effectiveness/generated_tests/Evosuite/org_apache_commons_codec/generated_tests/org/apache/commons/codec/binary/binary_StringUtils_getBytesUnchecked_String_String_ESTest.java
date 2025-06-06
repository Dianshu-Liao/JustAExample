/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:00:54 GMT 2025
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class binary_StringUtils_getBytesUnchecked_String_String_ESTest extends binary_StringUtils_getBytesUnchecked_String_String_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUnchecked((String) null, (String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("", "LXq\"2");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // LXq\"2: java.io.UnsupportedEncodingException: LXq\"2
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }
}
