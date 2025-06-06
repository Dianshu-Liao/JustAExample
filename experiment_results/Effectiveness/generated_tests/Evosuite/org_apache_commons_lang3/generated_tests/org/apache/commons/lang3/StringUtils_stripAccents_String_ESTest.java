/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:28:17 GMT 2025
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class StringUtils_stripAccents_String_ESTest extends StringUtils_stripAccents_String_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = StringUtils.stripAccents((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = StringUtils.stripAccents("tq|;Lc!Id7_GFfJ+`7Y");
      assertEquals("tq|;Lc!Id7_GFfJ+`7Y", string0);
  }
}
