/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:41:58 GMT 2025
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class builder_CompareToBuilder_appendSuper_int_ESTest extends builder_CompareToBuilder_appendSuper_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CompareToBuilder compareToBuilder0 = new CompareToBuilder();
      assertEquals(0, compareToBuilder0.toComparison());
      
      CompareToBuilder compareToBuilder1 = compareToBuilder0.appendSuper(1);
      compareToBuilder1.appendSuper(1);
      assertEquals(1, compareToBuilder0.toComparison());
      assertEquals(1, (int)compareToBuilder0.build());
  }
}
