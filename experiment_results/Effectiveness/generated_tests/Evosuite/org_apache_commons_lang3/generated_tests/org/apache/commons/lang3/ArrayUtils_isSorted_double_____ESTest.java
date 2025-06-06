/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:58:16 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_isSorted_double_____ESTest extends ArrayUtils_isSorted_double_____ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 2554.60258907043;
      boolean boolean0 = ArrayUtils.isSorted(doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      boolean boolean0 = ArrayUtils.isSorted(arrayUtils0.EMPTY_DOUBLE_ARRAY);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = ArrayUtils.isSorted(doubleArray0);
      assertTrue(boolean0);
  }
}
