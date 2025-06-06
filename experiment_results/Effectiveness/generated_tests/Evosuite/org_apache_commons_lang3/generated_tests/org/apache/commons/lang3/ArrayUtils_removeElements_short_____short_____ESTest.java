/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:06:17 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_removeElements_short_____short_____ESTest extends ArrayUtils_removeElements_short_____short_____ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      short[] shortArray0 = new short[2];
      shortArray0[1] = (short) (-330);
      short[] shortArray1 = new short[2];
      short[] shortArray2 = ArrayUtils.removeElements(shortArray0, shortArray1);
      assertArrayEquals(new short[] {(short) (-330)}, shortArray2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short[] shortArray1 = ArrayUtils.removeElements(shortArray0, shortArray0);
      assertEquals(0, shortArray1.length);
      assertNotNull(shortArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      short[] shortArray0 = new short[0];
      short[] shortArray1 = ArrayUtils.removeElements(shortArray0, shortArray0);
      short[] shortArray2 = new short[3];
      short[] shortArray3 = ArrayUtils.removeElements(shortArray2, shortArray1);
      assertEquals(3, shortArray3.length);
      assertNotNull(shortArray3);
  }
}
