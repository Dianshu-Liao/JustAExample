/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:15:38 GMT 2025
 */

package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.util.ValueUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class util_ValueUtils_setValue_Object_int_Object_ESTest extends util_ValueUtils_setValue_Object_int_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      ValueUtils.setValue(object0, 0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ValueUtils.setValue((Object) null, (-19), (Object) null);
  }
}
