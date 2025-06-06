/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:39:16 GMT 2025
 */

package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_EvalContext_getDocumentOrder__ESTest extends ri_EvalContext_getDocumentOrder__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, true, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      int int0 = unionContext0.getDocumentOrder();
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertFalse(nodeSetContext0.isChildOrderingRequired());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      int int0 = unionContext0.getDocumentOrder();
      assertEquals(0, int0);
      assertEquals(0, unionContext0.getPosition());
  }
}
