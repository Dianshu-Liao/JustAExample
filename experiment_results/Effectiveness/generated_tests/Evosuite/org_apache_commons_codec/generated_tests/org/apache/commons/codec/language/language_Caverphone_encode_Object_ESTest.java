/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:51:36 GMT 2025
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.Caverphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class language_Caverphone_encode_Object_ESTest extends language_Caverphone_encode_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Caverphone caverphone0 = new Caverphone();
      try { 
        caverphone0.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Caverphone encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Caverphone", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Caverphone caverphone0 = new Caverphone();
      Object object0 = caverphone0.encode((Object) "H6K7U");
      assertEquals("AKA1111111", object0);
  }
}
