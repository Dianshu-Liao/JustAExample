/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:14:08 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_swap_int_____int_int_int_ESTest extends ArrayUtils_swap_int_____int_int_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[1];
      ArrayUtils.swap(intArray0, (-1), 0, 992);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      ArrayUtils.swap(intArray0, Integer.MAX_VALUE, 0, (-337));
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      ArrayUtils.swap(intArray0, 2, 1050, 2043);
      assertEquals(8, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      ArrayUtils.swap(arrayUtils0.EMPTY_INT_ARRAY, (-1), 1853, (-1));
      assertEquals((-1), ArrayUtils.INDEX_NOT_FOUND);
  }
}
