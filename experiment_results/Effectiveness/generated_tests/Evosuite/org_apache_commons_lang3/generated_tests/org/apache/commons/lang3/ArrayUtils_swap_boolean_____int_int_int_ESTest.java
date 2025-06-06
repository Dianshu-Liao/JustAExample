/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:13:09 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_swap_boolean_____int_int_int_ESTest extends ArrayUtils_swap_boolean_____int_int_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      ArrayUtils.swap(booleanArray0, 1, 1072, 2);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      ArrayUtils.swap(booleanArray0, 3235, Integer.MAX_VALUE, 962);
      assertTrue(Arrays.equals(new boolean[] {false, false, false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      ArrayUtils.swap(booleanArray0, 0, 0, 441);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      ArrayUtils.swap(arrayUtils0.EMPTY_BOOLEAN_ARRAY, (-1), (-1), (-1));
      assertEquals((-1), ArrayUtils.INDEX_NOT_FOUND);
  }
}
