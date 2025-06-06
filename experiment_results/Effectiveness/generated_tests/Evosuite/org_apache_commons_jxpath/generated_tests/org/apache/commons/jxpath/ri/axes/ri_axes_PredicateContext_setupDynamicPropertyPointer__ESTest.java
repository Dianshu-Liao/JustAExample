/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:43:44 GMT 2025
 */

package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_axes_PredicateContext_setupDynamicPropertyPointer__ESTest extends ri_axes_PredicateContext_setupDynamicPropertyPointer__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant constant0 = new Constant("org.apac4e.commons.jxpath.ri.axes.PredcateContext");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      QName qName0 = new QName("org.apac4e.commons.jxpath.ri.axes.PredcateContext", "org.apac4e.commons.jxpath.ri.axes.PredcateContext");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(parentContext0, nameAttributeTest0);
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ParentContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant constant0 = new Constant("");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      QName qName0 = new QName("lirv.PH/&q|d");
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, nullPointer0.WHOLE_COLLECTION, nullPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, nameAttributeTest0);
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }
}
