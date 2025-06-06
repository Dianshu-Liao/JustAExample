/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:48:49 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.BitSet;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_indexesOf_long_____long_int_ESTest extends ArrayUtils_indexesOf_long_____long_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[1] = (long) (-1);
      BitSet bitSet0 = ArrayUtils.indexesOf(longArray0, (-1L), (-1));
      assertEquals("{1}", bitSet0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      BitSet bitSet0 = ArrayUtils.indexesOf(arrayUtils0.EMPTY_LONG_ARRAY, 0L, 0);
      assertEquals(64, bitSet0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BitSet bitSet0 = ArrayUtils.indexesOf((long[]) null, (long) (-1), (-4536));
      assertEquals("{}", bitSet0.toString());
  }
}
