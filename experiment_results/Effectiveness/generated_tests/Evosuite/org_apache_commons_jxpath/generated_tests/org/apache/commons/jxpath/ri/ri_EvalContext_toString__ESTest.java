/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:41:35 GMT 2025
 */

package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_EvalContext_toString__ESTest extends ri_EvalContext_toString__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      assertEquals(0, nodeSetContext0.getPosition());
      
      nodeSetContext0.toString();
      assertEquals(1, nodeSetContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      QName qName0 = new QName("h|_P");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      String string0 = rootContext0.toString();
      assertEquals("Expression context [0] $h|_P:$h|_P", string0);
  }
}
