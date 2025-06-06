/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:42:47 GMT 2025
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_compiler_Path_computeContextDependent__ESTest extends ri_compiler_Path_computeContextDependent__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      Expression[] expressionArray0 = new Expression[6];
      Expression[] expressionArray1 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray1);
      expressionArray0[0] = (Expression) coreOperationOr0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionArray0[0], expressionArray0[0]);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(expressionArray0[0], coreOperationDivide0);
      expressionArray0[1] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationDivide0);
      expressionArray0[2] = (Expression) coreOperationNegate0;
      expressionArray0[3] = (Expression) coreOperationDivide0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationDivide0);
      expressionArray0[4] = (Expression) nameAttributeTest0;
      Step step0 = new Step(1276, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(114, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }
}
