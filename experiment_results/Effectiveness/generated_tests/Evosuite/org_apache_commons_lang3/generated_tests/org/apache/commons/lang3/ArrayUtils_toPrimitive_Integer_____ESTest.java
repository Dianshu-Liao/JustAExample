/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:16:08 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_toPrimitive_Integer_____ESTest extends ArrayUtils_toPrimitive_Integer_____ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer[] integerArray0 = new Integer[6];
      integerArray0[0] = (Integer) (-1);
      integerArray0[1] = (Integer) (-1);
      integerArray0[2] = (Integer) (-1);
      integerArray0[3] = (Integer) (-1);
      integerArray0[4] = (Integer) (-1);
      integerArray0[5] = (Integer) (-1);
      int[] intArray0 = ArrayUtils.toPrimitive(integerArray0);
      assertArrayEquals(new int[] {(-1), (-1), (-1), (-1), (-1), (-1)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = ArrayUtils.toPrimitive((Integer[]) null);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      int[] intArray0 = ArrayUtils.toPrimitive(arrayUtils0.EMPTY_INTEGER_OBJECT_ARRAY);
      assertEquals(0, intArray0.length);
  }
}
