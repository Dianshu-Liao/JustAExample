/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:40:14 GMT 2025
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_compiler_Expression_isContextDependent__ESTest extends ri_compiler_Expression_isContextDependent__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-826), expressionArray0);
      coreFunction0.isContextDependent();
      boolean boolean0 = coreFunction0.isContextDependent();
      assertFalse(boolean0);
  }
}
