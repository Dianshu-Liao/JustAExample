/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:57:26 GMT 2025
 */

package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class archivers_zip_UnrecognizedExtraField_getCentralDirectoryData__ESTest extends archivers_zip_UnrecognizedExtraField_getCentralDirectoryData__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = unrecognizedExtraField0.getCentralDirectoryData();
      assertNull(byteArray0);
  }
}
