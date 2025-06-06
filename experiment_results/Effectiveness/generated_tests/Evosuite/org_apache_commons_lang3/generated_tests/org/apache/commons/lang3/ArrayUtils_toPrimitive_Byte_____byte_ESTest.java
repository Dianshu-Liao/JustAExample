/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:15:40 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_toPrimitive_Byte_____byte_ESTest extends ArrayUtils_toPrimitive_Byte_____byte_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Byte[] byteArray0 = new Byte[1];
      Byte byte0 = new Byte((byte)104);
      byteArray0[0] = byte0;
      byte[] byteArray1 = ArrayUtils.toPrimitive(byteArray0, (byte)0);
      assertArrayEquals(new byte[] {(byte)104}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      byte[] byteArray0 = ArrayUtils.toPrimitive(arrayUtils0.EMPTY_BYTE_OBJECT_ARRAY, (byte) (-1));
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.toPrimitive((Byte[]) null, (byte)0);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Byte[] byteArray0 = new Byte[1];
      byte[] byteArray1 = ArrayUtils.toPrimitive(byteArray0, (byte)0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
      assertNotNull(byteArray1);
  }
}
