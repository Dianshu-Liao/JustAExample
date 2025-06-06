/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:11:32 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ArrayUtils_shuffle_Object_____Random_ESTest extends ArrayUtils_shuffle_Object_____Random_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        ArrayUtils.shuffle(objectArray0, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.ArrayUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      MockRandom mockRandom0 = new MockRandom((-510L));
      ArrayUtils.shuffle((Object[]) arrayUtils0.EMPTY_METHOD_ARRAY, (Random) mockRandom0);
      assertEquals((-1), ArrayUtils.INDEX_NOT_FOUND);
  }
}
