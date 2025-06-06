/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:11:38 GMT 2025
 */

package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class archivers_zip_ZipEightByteInteger_equals_Object_ESTest extends archivers_zip_ZipEightByteInteger_equals_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1449L);
      ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(0L);
      boolean boolean0 = zipEightByteInteger0.equals(zipEightByteInteger1);
      assertFalse(boolean0);
      assertFalse(zipEightByteInteger1.equals((Object)zipEightByteInteger0));
      assertEquals(1449L, zipEightByteInteger0.getLongValue());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1449L);
      boolean boolean0 = zipEightByteInteger0.equals((Object) null);
      assertEquals(1449L, zipEightByteInteger0.getLongValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      boolean boolean0 = zipEightByteInteger0.equals(zipEightByteInteger0);
      assertTrue(boolean0);
  }
}
