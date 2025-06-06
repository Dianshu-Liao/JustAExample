/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:59:43 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_lastIndexOf_float_____float_int_ESTest extends ArrayUtils_lastIndexOf_float_____float_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[1] = 1470.2513F;
      int int0 = ArrayUtils.lastIndexOf(floatArray0, 1470.2513F, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      float[] floatArray0 = new float[2];
      int int0 = ArrayUtils.lastIndexOf(floatArray0, 1470.2513F, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      float[] floatArray0 = new float[8];
      int int0 = ArrayUtils.lastIndexOf(floatArray0, 800.42F, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      float[] floatArray0 = new float[2];
      int int0 = ArrayUtils.lastIndexOf(floatArray0, 302.59F, 280);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      int int0 = ArrayUtils.lastIndexOf(arrayUtils0.EMPTY_FLOAT_ARRAY, 0.0F, (-1));
      assertEquals((-1), int0);
  }
}
