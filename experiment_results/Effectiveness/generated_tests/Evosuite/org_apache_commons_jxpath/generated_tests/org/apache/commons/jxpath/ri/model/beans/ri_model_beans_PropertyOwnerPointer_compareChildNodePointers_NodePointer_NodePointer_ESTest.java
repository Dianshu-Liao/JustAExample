/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:15:32 GMT 2025
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_model_beans_PropertyOwnerPointer_compareChildNodePointers_NodePointer_NodePointer_ESTest extends ri_model_beans_PropertyOwnerPointer_compareChildNodePointers_NodePointer_NodePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QName qName0 = new QName("Cannot replace the root object");
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      int int0 = nullPointer0.compareChildNodePointers(nullPointer0, nullPointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName("Cannot replace the root object");
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      QName qName1 = new QName("<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(qName1);
      int int0 = nullPointer0.compareChildNodePointers(variablePointer0, nullPointer0);
      assertEquals((-7), int0);
  }
}
