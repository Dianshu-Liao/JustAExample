/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:50:55 GMT 2025
 */

package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class archivers_zip_X7875_NewUnix_parseFromLocalFileData_byte_____int_int_ESTest extends archivers_zip_X7875_NewUnix_parseFromLocalFileData_byte_____int_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)1;
      try { 
        x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)1, 3);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X7875_NewUnix invalid: gidSize 1 doesn't fit into 3 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)117;
      try { 
        x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, (byte)117);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X7875_NewUnix invalid: uidSize 117 doesn't fit into 117 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[4];
      try { 
        x7875_NewUnix0.parseFromLocalFileData(byteArray0, 608, (byte)0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X7875_NewUnix length is too short, only 0 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[4];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)1, 4);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }
}
