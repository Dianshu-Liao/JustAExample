/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:10:33 GMT 2025
 */

package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class archivers_zip_ZipArchiveEntry_setSize_long_ESTest extends archivers_zip_ZipArchiveEntry_setSize_long_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("nMbAs='eH]dV4bif0(P");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setSize((-1480L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("nMbAs='eH]dV4bif0(P");
      assertEquals((-1L), zipArchiveEntry0.getSize());
      
      zipArchiveEntry0.setSize(1L);
      assertEquals(1L, zipArchiveEntry0.getSize());
  }
}
