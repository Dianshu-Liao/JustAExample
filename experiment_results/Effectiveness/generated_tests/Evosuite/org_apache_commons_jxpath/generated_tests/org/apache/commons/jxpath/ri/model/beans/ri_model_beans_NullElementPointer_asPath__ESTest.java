/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:11:23 GMT 2025
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_model_beans_NullElementPointer_asPath__ESTest extends ri_model_beans_NullElementPointer_asPath__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, 0);
      String string0 = nullElementPointer1.asPath();
      assertEquals("$null[1]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName("[");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, Integer.MIN_VALUE);
      NullElementPointer nullElementPointer2 = new NullElementPointer(nullElementPointer1, 45);
      String string0 = nullElementPointer2.asPath();
      assertEquals("$[[1]/.[46]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("[");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, 1262);
      String string0 = nullElementPointer1.asPath();
      assertEquals("$[[1]/.[1263]", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      String string0 = nullElementPointer0.asPath();
      assertEquals("[1]", string0);
  }
}
