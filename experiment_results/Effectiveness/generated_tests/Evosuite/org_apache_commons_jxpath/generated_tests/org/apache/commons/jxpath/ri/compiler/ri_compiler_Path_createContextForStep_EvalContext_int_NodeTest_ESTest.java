/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:44:05 GMT 2025
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_compiler_Path_createContextForStep_EvalContext_int_NodeTest_ESTest extends ri_compiler_Path_createContextForStep_EvalContext_int_NodeTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      QName qName0 = new QName("d");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "d");
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 0, nodeNameTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("h^OMy");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 13, processingInstructionTest0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(parentContext0, 11, processingInstructionTest0);
      //  // Unstable assertion: assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(parentContext0, 9, processingInstructionTest0);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 8, processingInstructionTest0);
      assertNotNull(evalContext0);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-205));
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 7, nodeTypeTest0);
      assertNotNull(evalContext0);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(6);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Q*%!");
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(descendantContext0, processingInstructionTest0, false);
      EvalContext evalContext0 = locationPath0.createContextForStep(precedingOrFollowingContext0, 6, nodeTypeTest0);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("hO^OMy");
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 5, processingInstructionTest0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      QName qName0 = new QName("d");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "d");
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 4, nodeNameTest0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("hO^OMy");
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 3, processingInstructionTest0);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("int");
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 2, processingInstructionTest0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("h");
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 1, processingInstructionTest0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      QName qName0 = new QName("hO^OMy", "hO^OMy");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        locationPath0.createContextForStep((EvalContext) null, 873, nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 12, nodeNameTest0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(parentContext0, 10, processingInstructionTest0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }
}
