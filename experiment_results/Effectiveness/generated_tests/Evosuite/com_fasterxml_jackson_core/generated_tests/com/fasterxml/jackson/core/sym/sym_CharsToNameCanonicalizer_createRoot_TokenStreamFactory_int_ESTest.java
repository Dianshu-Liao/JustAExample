/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 13:47:38 GMT 2025
 */

package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class sym_CharsToNameCanonicalizer_createRoot_TokenStreamFactory_int_ESTest extends sym_CharsToNameCanonicalizer_createRoot_TokenStreamFactory_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonFactory jsonFactory0 = new JsonFactory();
      assertTrue(jsonFactory0.canUseCharArrays());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot((TokenStreamFactory) null, 3109);
      assertEquals(3109, charsToNameCanonicalizer0.hashSeed());
      assertEquals(0, charsToNameCanonicalizer0.size());
      assertEquals(0, charsToNameCanonicalizer0.maxCollisionLength());
      assertTrue(charsToNameCanonicalizer0.maybeDirty());
  }
}
