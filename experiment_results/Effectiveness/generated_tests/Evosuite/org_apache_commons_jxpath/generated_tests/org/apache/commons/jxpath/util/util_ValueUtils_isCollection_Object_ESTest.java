/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:14:09 GMT 2025
 */

package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.util.ValueUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class util_ValueUtils_isCollection_Object_ESTest extends util_ValueUtils_isCollection_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = ValueUtils.isCollection((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = ValueUtils.isCollection(object0);
      assertFalse(boolean0);
  }
}
