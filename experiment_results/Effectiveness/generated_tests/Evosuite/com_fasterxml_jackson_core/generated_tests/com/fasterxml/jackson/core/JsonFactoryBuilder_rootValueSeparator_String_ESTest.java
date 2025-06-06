/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 13:33:53 GMT 2025
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class JsonFactoryBuilder_rootValueSeparator_String_ESTest extends JsonFactoryBuilder_rootValueSeparator_String_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonFactoryBuilder jsonFactoryBuilder0 = new JsonFactoryBuilder();
      JsonFactoryBuilder jsonFactoryBuilder1 = jsonFactoryBuilder0.rootValueSeparator((String) null);
      assertEquals(0, jsonFactoryBuilder1.highestNonEscapedChar());
      assertEquals('\"', jsonFactoryBuilder1.quoteChar());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JsonFactoryBuilder jsonFactoryBuilder0 = new JsonFactoryBuilder();
      JsonFactoryBuilder jsonFactoryBuilder1 = jsonFactoryBuilder0.rootValueSeparator("+6+OgyuV,W");
      assertEquals('\"', jsonFactoryBuilder1.quoteChar());
      assertEquals(0, jsonFactoryBuilder1.highestNonEscapedChar());
  }
}
