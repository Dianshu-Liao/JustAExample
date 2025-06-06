/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:52:23 GMT 2025
 */

package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class archivers_zip_Zip64ExtendedInformationExtraField_parseFromCentralDirectoryData_byte_____int_int_ESTest extends archivers_zip_Zip64ExtendedInformationExtraField_parseFromCentralDirectoryData_byte_____int_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 4, 4);
      assertEquals(14, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[29];
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 1, 8);
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[29];
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 1, 28);
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[29];
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 1, 24);
      assertEquals(29, byteArray0.length);
  }
}
