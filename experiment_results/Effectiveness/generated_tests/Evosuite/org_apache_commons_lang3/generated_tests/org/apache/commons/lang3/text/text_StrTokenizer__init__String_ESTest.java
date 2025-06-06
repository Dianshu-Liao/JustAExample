/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:19:04 GMT 2025
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.StrTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class text_StrTokenizer__init__String_ESTest extends text_StrTokenizer__init__String_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("5g~gluRt:-JG?63MwJu", 'u', 'i');
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer((String) null, 'p', '\"');
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }
}
