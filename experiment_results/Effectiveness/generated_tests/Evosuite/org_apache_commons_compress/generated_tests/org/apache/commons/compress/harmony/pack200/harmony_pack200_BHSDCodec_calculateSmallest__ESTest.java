/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:58:06 GMT 2025
 */

package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class harmony_pack200_BHSDCodec_calculateSmallest__ESTest extends harmony_pack200_BHSDCodec_calculateSmallest__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(4, 256);
      assertFalse(bHSDCodec0.isSigned());
      assertFalse(bHSDCodec0.isDelta());
      assertEquals((-2147483648L), bHSDCodec0.smallest());
      assertEquals(4294967293L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(3, 3, 2);
      assertEquals(2486L, bHSDCodec0.largest());
      assertEquals((-829L), bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(4, 4, 0, 1);
      assertFalse(bHSDCodec0.isSigned());
      assertEquals(21675L, bHSDCodec0.largest());
      assertTrue(bHSDCodec0.isDelta());
      assertEquals(0L, bHSDCodec0.smallest());
  }
}
